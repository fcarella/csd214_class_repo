package csd214.textbook.bookcode_bjeo_7.ch20.sec01_03;

import javax.swing.JFrame;

/**
   This program shows a frame that is filled with two components.
*/
public class FilledFrameViewer2
{
   public static void main(String[] args)
   {
      JFrame frame = new FilledFrame();
      frame.setTitle("A frame with two components");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
