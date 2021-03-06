package com.huawei.l00379880.algs4.chapter2sort;

/************************************************************************
 * @Description : 数组实现的无序有限队列,体现在每次delMax的是都都找一下最大值
 * @author      : 梁山广
 * @date        : 2018/1/3 9:59
 * @email       : liangshanguang2@gmail.com
 ***********************************************************************/
public class P197UnOrderedArrayMaxPQ<Key extends Comparable<Key>> {
    /**
     * 优先队列里(Priority Queue)的元素
     */
    private Key[] pq;
    /**
     * 优先队列的实时大小
     */
    private int n;

    public P197UnOrderedArrayMaxPQ(int capacity) {
        // 不能直接新建泛型数组.编译前就会报错
        this.pq = (Key[]) new Comparable[capacity];
        this.n = n;
    }

    /**
     * 队列是否为空
     */
    public boolean isEmpty() {
        return n == 0;
    }

    /**
     * 返回队列大小
     */
    public int size() {
        return n;
    }

    /**
     * 插入元素
     */
    public void insert(Key key) {
        pq[n++] = key;
    }

    /**
     * 删除最大元素
     */
    public Key delMax() {
        // 初始化最大元素的下标
        int max = 0;
        // 寻找最大元素
        for (int i = 1; i < n; i++) {
            // 若果临时最大元素小于当前元素,就更新最大元素当前元素
            if (P153CommenFuns.less(pq[max], pq[i])) {
                max = i;
            }
        }
        // 把最大元素交换到数组头
        P153CommenFuns.exchange(pq, max, n - 1);
        // 返回最大元素,数组长度减1.删掉体现为会被新来的元素覆盖掉
        return pq[--n];
    }
}
