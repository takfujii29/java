package aivick;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;


public class ListUtilTest {

	//evensofメソッド
	@Test
	void 空のリストが渡された場合() throws Exception {
		List<Integer> actual = ListUtil.evensof(List.of());
		assertEquals(actual, List.of());
	}

	@Test
	void リストに偶数が入力されたとき偶数を返す() throws Exception {
		var actual = ListUtil.evensof(List.of(2, 4, 6));
		assertEquals(actual, List.of(2, 4, 6));
	}

	@Test
	void 整数を入力したとき偶数だけを返す() throws Exception {
		var actual = ListUtil.evensof(List.of(1, 2, 3, 4, 5, 6));
		assertEquals(actual, List.of(2, 4, 6));
	}

	//replicateメソッド
	@Test
	void 第一引数に大きさ第二引数にvalueを入れリストを返す() throws Exception {
		var actual = ListUtil.replicate(3, "hoge");
		assertEquals(actual, List.of("hoge", "hoge", "hoge"));
	}
}
