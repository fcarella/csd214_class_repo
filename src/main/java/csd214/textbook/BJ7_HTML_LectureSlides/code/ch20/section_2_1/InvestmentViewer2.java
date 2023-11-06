package csd214.textbook.BJ7_HTML_LectureSlides.code.ch20.section_2_1;

import javax.swing.JFrame;

/**
   This program displays the growth of an investment with variable interest.
*/
public class InvestmentViewer2
{  
   public static void main(String[] args)
   {  
      JFrame frame = new InvestmentFrame2();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
