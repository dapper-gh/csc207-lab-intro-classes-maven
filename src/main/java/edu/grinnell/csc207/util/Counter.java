package edu.grinnell.csc207.util;

/**
 * Simple counters.
 *
 *David and Moses
 */
public class Counter { 
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
int i; 
  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
public Counter () {
  this.i = 0;

}
public Counter (int n) {
  this.i = n; 
}
  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+
public int get (){
  return this.i;
}

public void increment (){
  i = this.i+1;
}
public String toString (){
  return "" + i;
}
} // class Counter
