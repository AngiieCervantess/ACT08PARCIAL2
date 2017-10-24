/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bintree;

/**
 *
 * @author Familia Andrade
 */
public class BinTree {

    nodeTree root;
    int heigth;
    int Leaf;
    int leaves;

    public BinTree() {
        this.root = null;
        this.heigth = -1;
        this.Leaf = 0;
        this.leaves= 0;
    }

    public boolean isEmpty() {
        return this.root == null;
    }
    
 void insert(int d, Leaf root){
        if(!isEmpty()){
        if(d < root.getData()){
        if(root.left != null){
            root.left = new Leaf(d);
            leaves++;
        } else {
        insert(d , root.left);  }
            } else {
        if(root.right != null){
        root.right = new Leaf(d);
        leaves++;
        } else{
        insert(d , root.right); }
        }
        } else {
        root = new Leaf(d);
        leaves = 1;
        }
    }

  
     int Heigth(Leaf root){
        if(isEmpty()){  return 0;
        } else {
            int a , b;
        if(root.right!=null && root.left!=null){
            return 1;
        } else {
            a = Heigth(root.left);
            b = Heigth(root.right);
        if(a>b) return a+1;
            else return b+1; }
        }
    }    
}