package com.nq.auto;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * 文件排序
 * 
 * @author jiakui
 * 
 */
public class SortFile {

	/**
	 * 根据文件名称排序
	 * 
	 */
	public void sortedByName(String[] names) {
		Comparator<String> comparator = new FileNameComparator();
		Arrays.sort(names, comparator);
	}

}
