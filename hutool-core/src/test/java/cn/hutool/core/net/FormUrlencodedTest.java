package cn.hutool.core.net;

import cn.hutool.core.util.CharsetUtil;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FormUrlencodedTest {

	@Test
	public void encodeParamTest(){
		String encode = FormUrlencoded.ALL.encode("a+b", CharsetUtil.CHARSET_UTF_8);
		assertEquals("a%2Bb", encode);

		encode = FormUrlencoded.ALL.encode("a b", CharsetUtil.CHARSET_UTF_8);
		assertEquals("a+b", encode);
	}
}
