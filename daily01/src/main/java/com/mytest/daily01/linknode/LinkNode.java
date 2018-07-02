package com.mytest.daily01.linknode;

/**
 * 单向链表
 * @author lenovo
 *
 */
public class LinkNode {

	public int data;
	public LinkNode next;
	
	public LinkNode(int data) {
		this.data = data;
		this.next = null;
		System.out.println(data);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println("创建节点");
		LinkNode node1 = new LinkNode(1);
		node1.next = new LinkNode(2);


		System.out.println("插入节点");
		LinkNode node3 = new LinkNode(3);
		node3.next = node1.next;
		node1.next = node3;
		

		System.out.println("删除节点");
		node3.next=null;
		node1.next=null;
	}

}
