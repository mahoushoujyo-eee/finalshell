package com.apple.eawt;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;

public abstract class CocoaComponent extends Canvas {
   /** @deprecated */
   public abstract int createNSView();

   @Override
   public void update(Graphics graphics) {
   }

   @Override
   public void paint(Graphics graphics) {
   }

   public long createNSViewLong() {
      return 0L;
   }

   public final void sendMessage(int i, Object o) {
   }

   @Override
   public abstract Dimension getMaximumSize();

   @Override
   public abstract Dimension getMinimumSize();

   @Override
   public abstract Dimension getPreferredSize();
}





