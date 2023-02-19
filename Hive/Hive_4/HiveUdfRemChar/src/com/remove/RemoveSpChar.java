package com.remove;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.commons.lang.StringUtils;

public class RemoveSpChar extends UDF 
{
	Text t = new Text();
	public Text evaluate(Text str, String spChar)
	{
		if(str==null)
		{
			return str;
		}
		t.set(StringUtils.strip(str.toString(), spChar));
		return t;
	}
}
