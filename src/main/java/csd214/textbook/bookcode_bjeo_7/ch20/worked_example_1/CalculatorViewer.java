package csd214.textbook.bookcode_bjeo_7.ch20.worked_example_1;

import javax.swing.JFrame;

public class CalculatorViewer
{  
   public static void main(String[] args)
   {  
      JFrame frame = new CalculatorFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("Calculator");
      frame.setVisible(true);
   }
}

