/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.pkgclass;

/**
 *
 * @author saref
 */
public class MyList<T> {

    public int size;
    public int capacity;
    public Object[] array;

    public MyList() {
        this.capacity = 10;
        this.array = new Object[this.capacity];
        this.size = 0;
    }

    public MyList(int newCapacity) {
        this.array = new Object[this.capacity];
        this.capacity = newCapacity;
        this.size = 0;
    }

    public void add(T x) {
        
        if (this.size == this.capacity) {
            Object[] tempArray = new Object[this.capacity];
         
                    
            for (int i = 0; i < this.size; i++) {
                tempArray[i] = this.array[i];
            }
           
            this.capacity *= 2;
            this.array=new Object[this.capacity];

            for (int i = 0; i < this.size; i++) {
                this.array[i] = tempArray[i];
            }
        }
        this.array[this.size] = x;
        this.size++;
        
    }
    
    public int getCapacity(){return this.capacity;}
    
    
    public int getSize(){return this.size;}


    
}
