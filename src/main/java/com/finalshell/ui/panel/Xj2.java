package com.finalshell.ui.panel;

import com.finalshell.core.D2;
import com.finalshell.core.KV;
import com.finalshell.core.Lt4;
import com.finalshell.core.UI3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.listener.Kh2;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Xj2 extends JLabel implements D2 {
   Stroke x;
   Stroke k;
   int r;
   KV w;
   GradientPaint H;
   UI3 A;
   UI3 a;
   String z;
   Lt4 Z;
   BufferedImage e;
   Dimension o;
   Stroke R;
   Color Q;
   Color W;
   Color X;
   Color p;
   Color J;
   public static long[] b;
   public static Integer[] c;
   public static long d;

   Xj2() {
      BasicStroke var10001 = new BasicStroke(1.0F, 0, 2, 0.0F, new float[]{1.0F, 3.0F}, 0.0F);
      long var3 = 203693946467375876L;
      BasicStroke var2 = var10001;
      Ref.s(203693946467375876L, var2, var3);
      BasicStroke var10002 = new BasicStroke();
      long var5 = 555042596625211364L;
      BasicStroke var4 = var10002;
      Ref.s(555042596625211364L, var4, var5);
      Registry.lookupField(265748865419816880L).setInt(this, a(6062, 2113519868337587071L));
      UI3 var10003 = new UI3();
      long var7 = 182979044728031135L;
      UI3 var6 = var10003;
      Ref.s(182979044728031135L, var6, var7);
      Lt4 var10004 = new Lt4(this, this);
      long var9 = 191654938268693494L;
      Lt4 var8 = var10004;
      Ref.s(191654938268693494L, var8, var9);
      GradientPaint var10005 = new GradientPaint(
         0.0F,
         0.0F,
         new Color(a(31275, 4922603460944064251L), a(7690, 4320372905290042066L), a(4200, 4988147908339696815L), 0),
         0.0F,
         (float)this.getHeight(),
         new Color(a(1653, 1586914350257738408L), a(3099, 4556190178524010697L), a(28690, 6163745976245282007L), a(28319, 1387109219823778373L))
      );
      long var11 = 462515155902943522L;
      GradientPaint var10 = var10005;
      Ref.s(462515155902943522L, var10, var11);
      long var13 = 635597926172577928L;
      Object var12 = null;
      Ref.s(635597926172577928L, var12, var13);
      Dimension var10007 = new Dimension();
      long var15 = 164654065625191329L;
      Dimension var14 = var10007;
      Ref.s(164654065625191329L, var14, var15);
      BasicStroke var10008 = new BasicStroke(2.001F, 0, 2, 0.0F, new float[]{1.0F, 0.0F}, 0.0F);
      long var17 = 210987156779356239L;
      BasicStroke var16 = var10008;
      Ref.s(210987156779356239L, var16, var17);
      Color var10009 = new Color(a(23694, 6509328846656325708L), a(918, 7646675054754994002L), a(918, 7646675054754994002L), a(918, 7646675054754994002L));
      long var19 = 455449822049263553L;
      Color var18 = var10009;
      Ref.s(455449822049263553L, var18, var19);
      Color var10010 = new Color(a(973, 2965697177489577752L), a(5805, 6840397145967952505L), a(9780, 4365790283899548415L), a(23398, 2704152277954351033L));
      long var21 = 220727372260161709L;
      Color var20 = var10010;
      Ref.s(220727372260161709L, var20, var21);
      Color var10011 = new Color(a(32426, 5962152936759945849L), a(918, 7646675054754994002L), a(5805, 6840397145967952505L), a(32385, 4868675356346378823L));
      long var23 = 219664831517494633L;
      Color var22 = var10011;
      Ref.s(219664831517494633L, var22, var23);
      Color var10012 = new Color(0, 0, 0, a(16218, 1550401298067434372L));
      long var25 = 139815103490214858L;
      Color var24 = var10012;
      Ref.s(139815103490214858L, var24, var25);
      Color var10013 = new Color(a(23398, 2704152277954351033L), a(13392, 289604341909692561L), a(918, 7646675054754994002L), a(5805, 6840397145967952505L));
      long var27 = 194498005745921357L;
      Color var26 = var10013;
      Ref.s(194498005745921357L, var26, var27);
      Cursor var1 = new Cursor(a(23165, 7396942444530650814L));
      this.setCursor(var1);
      this.addMouseListener(new Kh2(this));
   }

   public void p(KV var1, UI3 var2, String var3) {
      long var5 = 445558421278779817L;
      Ref.s(445558421278779817L, var1, var5);
      long var7 = 362540202329407130L;
      Ref.s(362540202329407130L, var3, var7);
      long var9 = 452535993975552787L;
      Ref.s(452535993975552787L, var2, var9);
      this.repaint();
   }

   @Override
   public void paint(Graphics var1) {
      label29: {
         String[] var2 = KV.b$arrString();
         if (var2 == null) {
            if (!Registry.lookupField(413132319533195410L).getBoolean(null)) {
               break label29;
            }

            Object var3 = 191654938268693494L;
            Ref.g(191654938268693494L, var3);
            Object[] var10002 = Registry.packArgs(var1);
            long var6 = 478374544918577864L;
            Object[] var5 = var10002;
            Ref.h(478374544918577864L, var5, var6);

            try {
               ;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }
         }

         if (var2 == null) {
            return;
         }
      }

      Object[] var10001 = Registry.packArgs(var1);
      long var8 = 385580207220951289L;
      Object[] var7 = var10001;
      Ref.h(385580207220951289L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   @Override
   public void h(Graphics var1) {
      Object var3 = (int)((float)this.getHeight() / 3.0F);
      String[] var10000 = KV.b$arrString();
      int var4 = a(25240, 2436569347552998993L);
      String[] var2 = var10000;
      Graphics2D var5 = (Graphics2D)var1;
      Object var23 = 462515155902943522L;
      this.setPaint((GradientPaint)Ref.g(462515155902943522L, var23));
      var5.fillRect(0, 0, this.getWidth(), this.getHeight());
      if (var2 == null) {
         Object var25 = 445558421278779817L;
         if ((KV)Ref.g(445558421278779817L, var25) == null) {
            return;
         }
      }

      Object var27 = 452535993975552787L;
      UI3 var6 = (UI3)Ref.g(452535993975552787L, var27);
      if (var2 == null && var6 == null) {
         Object var29 = 182979044728031135L;
         UI3 var10003 = (UI3)Ref.g(182979044728031135L, var29);
      }

      long var7 = d;
      int var9 = 0;
      ArrayList var69 = (ArrayList)(Registry.emptyArgs());
      long var32 = 612241643327702351L;
      Object[] var31 = var69;
      var69 = Ref.h(612241643327702351L, var31, var32);

      try {
         var69 = (ArrayList)var69;
      } catch (InvocationTargetException var57) {
         throw var57.getTargetException();
      }

      ArrayList var10 = var69;
      int var11 = 0;

      while (true) {
         if (var11 < var10.size()) {
      long var72;
            var72 = var11;
            if (var2 != null) {
               break;
            }

            label186:
            if (var11 <= (this.getWidth() - var4) / Registry.lookupField(265748865419816880L).getInt(this) || var2 != null) {
               label203: {
                  long var12 = (Long)var10.get(var10.size() - var11 - 1);
                  long var80;
                  int var73 = (var80 = var12 - var7) == 0L ? 0 : (var80 < 0L ? -1 : 1);
                  if (var2 == null) {
                     if (var73 > 0) {
                        var7 = var12;
                     }

                     var9++;
                     if (var2 != null) {
                        break label203;
                     }

                     var73 = var9;
                  }

                  if (var73 > (this.getWidth() - var4) / Registry.lookupField(265748865419816880L).getInt(this) && var2 == null) {
                     break label186;
                  }

                  var11++;
               }

               if (var2 == null) {
                  continue;
               }
            }
         }

         var72 = 0;
         break;
      }

      var9 = var72;
      ArrayList var10004 = (ArrayList)(Registry.emptyArgs());
      long var34 = 413348846341046535L;
      Object[] var33 = var10004;
      var10004 = Ref.h(413348846341046535L, var33, var34);

      try {
         var10004 = (ArrayList)var10004;
      } catch (InvocationTargetException var56) {
         throw var56.getTargetException();
      }

      ArrayList var59 = var10004;
      int var60 = 0;

      Object var10005;
      while (true) {
         if (var60 < var59.size()) {
      int var76;
            var76 = var60;
            var10005 = (this.getWidth() - var4) / Registry.lookupField(265748865419816880L).getInt(this);
            if (var2 != null) {
               break;
            }

            label162:
            if (!(var60 > var10005) || var2 != null) {
               label206: {
                  long var13 = (Long)var59.get(var59.size() - var60 - 1);
                  long var81;
                  int var77 = (var81 = var13 - var7) == 0L ? 0 : (var81 < 0L ? -1 : 1);
                  if (var2 == null) {
                     if (var77 > 0) {
                        var7 = var13;
                     }

                     var9++;
                     if (var2 != null) {
                        break label206;
                     }

                     var77 = var9;
                  }

                  if (var77 > (this.getWidth() - var4) / Registry.lookupField(265748865419816880L).getInt(this) && var2 == null) {
                     break label162;
                  }

                  var60++;
               }

               if (var2 == null) {
                  continue;
               }
            }
         }

         var76 = this.getHeight();
         var10005 = var3;
         break;
      }

      Object var61 = var76 - var10005;
      Object var35 = 203693946467375876L;
      this.setStroke((Stroke)Ref.g(203693946467375876L, var35));

      while (true) {
         Object var37 = 455449822049263553L;
         this.setColor((Color)Ref.g(455449822049263553L, var37));
         var5.drawLine(this.getWidth(), (int)var61, var4 - 5, (int)var61);
         var5.setFont((Font)Registry.lookupField(593752358540399204L).get(null));
         var5.setColor(Color.white);
         var61 -= var3;
         Object var10006;
         if (var61 > 0) {
            var10006 = var61;
            if (var2 == null) {
               if (var61 <= 3) {
                  var61 = 1;
               }

               var10006 = var61;
            }
         } else {
            var10006 = var61;
         }

         while (var10006 < 0) {
            if (var2 == null) {
               int var63 = 0;
               int var14 = var10.size() - 1;
               int var15 = this.getWidth();
               Object var39 = 210987156779356239L;
               this.setStroke((Stroke)Ref.g(210987156779356239L, var39));

               int var10008;
               String[] var10009;
               while (true) {
                  if (var14 > -1) {
                     var10008 = var10.size() - 1;
                     var10009 = var2;
                     if (var2 != null) {
                        break;
                     }

                     var10009 = var2;
                     if (var2 != null) {
                        break;
                     }

                     label125:
                     if (var14 <= var10008) {
                        long var16 = (Long)var10.get(var14);
                        long var18 = (Long)var59.get(var14);
                        byte var20 = 1;
                        var15 = this.getWidth() - var63 * Registry.lookupField(265748865419816880L).getInt(this) - 2;
                        int var21 = (int)((float)this.getHeight() * ((float)var18 / (float)var7));
                        int var22 = this.getHeight() - var21;
                        Object var41 = 219664831517494633L;
                        this.setColor((Color)Ref.g(219664831517494633L, var41));
                        var5.drawLine(var15, this.getHeight() - var20, var15, var22 - var20);
                        var21 = (int)((float)this.getHeight() * ((float)var16 / (float)var7));
                        var22 = this.getHeight() - var21;
                        Object var43 = 220727372260161709L;
                        this.setColor((Color)Ref.g(220727372260161709L, var43));
                        var5.drawLine(var15, this.getHeight() - var20, var15, var22 - var20);
                        if (var2 == null) {
                           if (var15 < var4 && var2 == null) {
                              break label125;
                           }

                           var63++;
                           var14--;
                        }

                        if (var2 == null) {
                           continue;
                        }
                     }
                  }

                  Object var45 = 555042596625211364L;
                  this.setStroke((Stroke)Ref.g(555042596625211364L, var45));
                  var10008 = this.getHeight();
                  var10009 = (String[])var3;
                  break;
               }

               Object var62 = var10008 - var10009;
               var5.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);

               do {
                  int var65 = this.getHeight() - var62;
                  int var17 = (int)((float)var65 * ((float)var7 / (float)this.getHeight()));
                  var5.setFont((Font)Registry.lookupField(593752358540399204L).get(null));
                  var5.setColor(
                     new Color(a(16507, 4264158472167838899L), a(3099, 4556190178524010697L), a(3099, 4556190178524010697L), a(2062, 6319721500193692889L))
                  );
                  Registry.e((long)var17);
                  long var47 = 148259110884974759L;
                  var10009 = (String[])Ref.h2(148259110884974759L, var47);

                  try {
                     var10009 = (String)var10009;
                  } catch (InvocationTargetException var55) {
                     throw var55.getTargetException();
                  }

                  String var66 = var10009;
                  Object var49 = 139815103490214858L;
                  this.setColor((Color)Ref.g(139815103490214858L, var49));
                  var5.drawString(var66, 3, var62 + a(9028, 4038164815051995032L));
                  var62 -= var3;
                  if (var62 <= a(6596, 212298015292099844L)) {
                     if (var2 != null) {
                        continue;
                     }

                     var62 += 2;
                  }

                  if (var62 < 0 && var2 == null) {
                     break;
                  }
               } while (var2 == null);

               Object var51 = 555042596625211364L;
               this.setStroke((Stroke)Ref.g(555042596625211364L, var51));
               Object var53 = 194498005745921357L;
               this.setColor((Color)Ref.g(194498005745921357L, var53));
               var5.drawLine(0, this.getHeight() - 1, this.getWidth() - 1, this.getHeight() - 1);
               var5.setColor(new Color(a(27039, 9185965785020595526L), a(21561, 4895245156347363554L), a(32717, 7114266256672353051L)));
               var5.drawLine(this.getWidth() - 1, 0, this.getWidth() - 1, this.getHeight() - 1);
               return;
            }

            var10006 = var61;
         }
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5329;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }

   public static void __vfClinit__() {
      long var2 = 7486166598590862314L;
      long[] var8 = new long[27];
      int var5 = 0;
      String var6 = "<;1\u009d÷\u0099\u0010\u0097Ø\u0000ZUåÊýÜ@ÅákrGùi\u0099FØ¸Fk\u000bÜ\u0001û\u0090\u0095\u0011Â\u0004æ\u0003Ñ-½þc\u0011÷Ç\u0088\u0099\u0098<\u0016\u008fWµF°ô\fçø\u0017\tG\f³éln~\u008eù¯´ûn\u0019Í¹T?á>îSéu¤\u0088KÞ$éé\u008d\u0005$+>r\u0001£NVP¿·À¤u\u0097\u0006U\u0095Ìo\\\u0015F\u0012°¹\u0080ú8\u0088ª&\u0081\u0087ò\u00973ù\u0007\rÔ¬*f\u009eäX\u001eHµÈ%]X\u0083\u0099õ\u0004¹@[0ìÂ1üQ°÷Ç\u001c\u009fàCiä\u0004.\u0085.:Ú\u0085Õ\u0017°\u000e?´ÂSÞyÕ^\u0006B\u0018Ùçe\u0098";
      int var7 = "<;1\u009d÷\u0099\u0010\u0097Ø\u0000ZUåÊýÜ@ÅákrGùi\u0099FØ¸Fk\u000bÜ\u0001û\u0090\u0095\u0011Â\u0004æ\u0003Ñ-½þc\u0011÷Ç\u0088\u0099\u0098<\u0016\u008fWµF°ô\fçø\u0017\tG\f³éln~\u008eù¯´ûn\u0019Í¹T?á>îSéu¤\u0088KÞ$éé\u008d\u0005$+>r\u0001£NVP¿·À¤u\u0097\u0006U\u0095Ìo\\\u0015F\u0012°¹\u0080ú8\u0088ª&\u0081\u0087ò\u00973ù\u0007\rÔ¬*f\u009eäX\u001eHµÈ%]X\u0083\u0099õ\u0004¹@[0ìÂ1üQ°÷Ç\u001c\u009fàCiä\u0004.\u0085.:Ú\u0085Õ\u0017°\u000e?´ÂSÞyÕ^\u0006B\u0018Ùçe\u0098"
         .length();
      byte var4 = 0;

      label20:
      while (true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var10000 = var8;
         var10001 = var5++;
         long var10002 = ((long)var9[0] & 255L) << 56
            | ((long)var9[1] & 255L) << 48
            | ((long)var9[2] & 255L) << 40
            | ((long)var9[3] & 255L) << 32
            | ((long)var9[4] & 255L) << 24
            | ((long)var9[5] & 255L) << 16
            | ((long)var9[6] & 255L) << 8
            | (long)var9[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var17 = var10002 ^ var2;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var17;
                  if (var4 >= var7) {
                     b = var8;
                     c = new Integer[27];
                     long var0 = 2403478032287123105L;
                     var10002 = 2403478032287123115L ^ var0;
                     byte var13 = -1;
                     d = var10002;
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var17;
                  if (var4 < var7) {
                     continue label20;
                  }

                  var6 = "\u0018¹\u0019V\u0011îG¦ø\u001d[;}È!\u0001";
                  var7 = "\u0018¹\u0019V\u0011îG¦ø\u001d[;}È!\u0001".length();
                  var4 = 0;
            }

            byte var12 = var4;
            var4 += 8;
            var9 = var6.substring(var12, var4).getBytes("ISO-8859-1");
            var10000 = var8;
            var10001 = var5++;
            var10002 = ((long)var9[0] & 255L) << 56
               | ((long)var9[1] & 255L) << 48
               | ((long)var9[2] & 255L) << 40
               | ((long)var9[3] & 255L) << 32
               | ((long)var9[4] & 255L) << 24
               | ((long)var9[5] & 255L) << 16
               | ((long)var9[6] & 255L) << 8
               | (long)var9[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





