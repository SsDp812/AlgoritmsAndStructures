package org.example.MyCollections;

public class MyBinaryTree <T extends Comparable<T>> {
    Node root;
    class Node{
        Node left;
        Node right;
        Node parent;
        T value;
        private Node(){
            value = null;
            left = null;
            right = null;
            parent = null;
        }
        private Node(T v){
            value = v;
            left = null;
            right = null;
            parent = null;
        }
        private Node (T v, Node parent){
            value = v;
            left = null;
            right = null;
            this.parent = parent;
        }

        private void insert(T v){
            if(v.compareTo(value) >= 0){
                if(right != null){
                    right.insert(v);
                }else{
                    right = new Node(v,this);
                }
            }
            else{
                if(left != null){
                    left.insert(v);
                }else{
                    left = new Node(v,this);
                }
            }
        }
        private void delete(T v){
            if(this.value.compareTo(v) != 0){
                if(right != null && v.compareTo(this.value) >= 0){
                    right.delete(v);
                }
               else{
                   if(left != null) {
                       left.delete(v);
                   }
                }
            }
            else{
                if(right == null && left == null){
                     if(parent.value.compareTo(value) <= 0){
                         parent.right = null;
                     }else if(parent.value.compareTo(value) > 0){
                         parent.left = null;
                     }
                }
                else if(right != null && left == null){
                    if(parent.value.compareTo(right.value) <= 0){
                        parent.right = right;
                        right.parent = parent;
                    }else{
                        parent.left = right;
                        right.parent = parent;
                    }
                }
                else if(right == null && left != null){
                    if(parent.value.compareTo(left.value) <= 0){
                        parent.right = left;
                        left.parent = parent;
                    }else{
                        parent.left = left;
                        left.parent = parent;
                    }
                }
                else if(right != null && left != null){
                    Node min = this;
                    while(min.left != null){
                        min = min.left;
                    }
                    min.parent.left = null;
                    min.parent = parent;
                    min.left = this.left;
                    min.right = this.right;
                    if(parent.value.compareTo(min.value) <= 0){
                        parent.right = min;
                    }else{
                        parent.left = min;
                    }
                }
            }
        }

        public void sortOrder(){
            if(left != null){
                left.sortOrder();
            }
            System.out.println(value);
            if(right != null){
                right.sortOrder();
            }
        }
    }

    public MyBinaryTree(T v){
        root = new Node(v);
    }
    public void insert(T v){
        root.insert(v);
    }
    public void delete(T v){
        root.delete(v);
    }
    public void printSortedTree(){
        root.sortOrder();
    }

}
