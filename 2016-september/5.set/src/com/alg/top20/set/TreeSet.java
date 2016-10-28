package com.alg.top20.set;

import java.util.List;
import java.util.TreeMap;


//Implementing Set using BST
public class TreeSet implements ISortedSet {
	private BSTNode root;
	private int size;

	//O(h)
	@Override
	public boolean add(Integer e) {
		BSTNode current = root, parent = null;
		int tmp = 0;
		while (current != null) {
			parent = current;
			tmp = e.compareTo(current.data);
			if (tmp == 0)
				return false;
			if (tmp < 0)
				current = current.left;
			else
				current = current.right;
		}
		BSTNode node = new BSTNode(e);
		if (root != null) {
			if (tmp < 0)
				parent.left = node;
			else
				parent.right = node;
		} else {
			root = node;
		}
		++size;
		return true;
	}

	// O(h)
	@Override
	public boolean contains(Integer e) {
		BSTNode current = root;
		while (current != null) {
			int tmp = e.compareTo(current.data);
			if (tmp == 0)
				return true;
			if (tmp < 0)
				current = current.left;
			else
				current = current.right;
		}
		return false;
	}

	@Override
	public boolean remove(Integer e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	private void auxDisplay(BSTNode root) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			System.out.println(root.data);
			return;
		}
		auxDisplay(root.left);
		System.out.println(root.data);
		auxDisplay(root.right);
	}

	@Override
	public void display() {
		auxDisplay(root);
	}

	//O(h)
	@Override
	public int findMin() {
		BSTNode current = root;
		while(current.left != null)
			current = current.left;
		
		return current.data;
	}

	@Override
	public int select(int k) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Integer> findRange(Integer s, Integer e) {
		// TODO Auto-generated method stub
		return null;
	}

}
