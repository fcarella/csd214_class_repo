package csd214.textbook.bookcode_bjeo_7.ch20.sec04;

import javax.swing.JFrame;

/**
   This program uses a menu to display font effects.
*/
public class FontViewer2
{  
   public static void main(String[] args)
   {  
      JFrame frame = new FontFrame2();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("FontViewer");
      frame.setVisible(true);      
   }
}

