/***********************************************************
 * @Description : LeetCode387号问题
 * https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1
 * 案例:
 *
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/1/5 17:28
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package Chapter14HashTable.Section1HashTableBasic;

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            // 对应字符的频率+1
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
