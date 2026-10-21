package com.finalshell.ui.listener;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public abstract class WG3 implements ComponentListener, WindowListener {
   @Override
   public void componentResized(ComponentEvent var1) {
   }

   @Override
   public void componentMoved(ComponentEvent var1) {
   }

   @Override
   public void componentShown(ComponentEvent var1) {
   }

   @Override
   public void componentHidden(ComponentEvent var1) {
      this.g();
   }

   @Override
   public void windowOpened(WindowEvent var1) {
   }

   @Override
   public void windowClosing(WindowEvent var1) {
   }

   @Override
   public void windowClosed(WindowEvent var1) {
      this.g();
   }

   @Override
   public void windowIconified(WindowEvent var1) {
   }

   @Override
   public void windowDeiconified(WindowEvent var1) {
   }

   @Override
   public void windowActivated(WindowEvent var1) {
   }

   @Override
   public void windowDeactivated(WindowEvent var1) {
   }

   public abstract void g();
}





