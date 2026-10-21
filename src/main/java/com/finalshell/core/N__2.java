package com.finalshell.core;

import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.font.TextHitInfo;
import java.awt.im.InputMethodRequests;
import java.text.AttributedCharacterIterator;
import java.text.AttributedCharacterIterator.Attribute;
import org.jetbrains.annotations.Nullable;

public class N__2 implements InputMethodRequests {
   final SetBackgroundImagePanel C;

   public N__2(SetBackgroundImagePanel var1) {
      this.C = var1;
   }

   @Override
   public Rectangle getTextLocation(TextHitInfo var1) {
      Rectangle var2 = new Rectangle(
         SetBackgroundImagePanel.D(this.C).Q() * this.C.c4.width + this.C.p$int(), (SetBackgroundImagePanel.D(this.C).O() + 1) * this.C.c4.height, 0, 0
      );
      Point var3 = this.C.getLocationOnScreen();
      var2.translate(var3.x, var3.y);
      return var2;
   }

   @Nullable
   @Override
   public TextHitInfo getLocationOffset(int var1, int var2) {
      return null;
   }

   @Override
   public int getInsertPositionOffset() {
      return 0;
   }

   @Override
   public AttributedCharacterIterator getCommittedText(int var1, int var2, Attribute[] var3) {
      return null;
   }

   @Override
   public int getCommittedTextLength() {
      return 0;
   }

   @Nullable
   @Override
   public AttributedCharacterIterator cancelLatestCommittedText(Attribute[] var1) {
      return null;
   }

   @Nullable
   @Override
   public AttributedCharacterIterator getSelectedText(Attribute[] var1) {
      return null;
   }

   N__2(SetBackgroundImagePanel var1, com.finalshell.ui.listener.Hb2 var2) {
      this(var1);
   }
}





