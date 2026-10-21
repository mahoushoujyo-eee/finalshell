package com.finalshell.ui.panel;

import com.finalshell.core.AL;
import com.finalshell.core.C;
import com.finalshell.core.DP;
import com.finalshell.core.Jc2;
import com.finalshell.core.NY;
import com.finalshell.core.T32;
import com.finalshell.core.TH3;
import com.finalshell.core.Y9;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.DK;
import com.finalshell.task.GE;
import com.finalshell.ui.listener.Ft4;
import com.finalshell.ui.listener.TW;
import com.finalshell.ui.listener.Uz2;
import com.finalshell.ui.listener.Vv2;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class AM extends JPanel {
   public AM v;
   public Ge2 W;
   public static TH3 g;
   public static DP t;
   public JScrollPane F;
   public Bq2 i;
   public ArrayList c;
   public int a;
   public T32 E;
   public JPanel h;
   public ArrayList M;
   public int X;
   public int I;
   public FlowLayout p;
   public NY V;
   public Thread q;
   public boolean Y;
   public boolean k;
   public boolean b;
   public boolean G;
   public boolean S;
   public boolean R;
   public boolean l;
   public int K;
   public boolean f;
   public JComponent m;
   public JComponent n;
   public HashMap A;
   public static Jc2 T;
   public int y;
   public com.finalshell.ui.frame.MainFrame j;
   public boolean s;
   public CommandListPanel B;
   public boolean U;
   public boolean C;
   public boolean O;
   public boolean P;
   public Color u;
   public Color Q;
   public static String[] N;
   public static long[] d;
   public static Integer[] e;

   public AM() {
      this(false);
   }

   public AM(boolean var1) {
   super();
   HashMap var11;
   long var20;
   Ge2 var27;
   Color var36;
   DP var37;
   ArrayList var7;
   ArrayList var9;
      JFrame var3;
      label48: {
         long var6 = 199288150985905138L;
         Object var5 = null;
         Ref.s(199288150985905138L, var5, var6);
         ArrayList var10002 = new ArrayList();
         long var8 = 417119238929760524L;
         var7 = var10002;
         Ref.s(417119238929760524L, var7, var8);
         ArrayList var10003 = new ArrayList();
         long var10 = 502036721265141438L;
         var9 = var10003;
         Ref.s(502036721265141438L, var9, var10);
         Registry.lookupField(374786476283896993L).setInt(this, a(4109, 216013914738614013L));
         s$arrString();
         Registry.lookupField(627149169115132345L).setInt(this, a(488, 4670093833738407706L));
         Registry.lookupField(579186049990057769L).setBoolean(this, false);
         Registry.lookupField(578351821085462234L).setBoolean(this, false);
         Registry.lookupField(501692309218203508L).setBoolean(this, false);
         Registry.lookupField(366002109126035603L).setBoolean(this, true);
         Registry.lookupField(225352561188908423L).setBoolean(this, true);
         Registry.lookupField(394476637101936438L).setBoolean(this, true);
         Registry.lookupField(423830768464519912L).setBoolean(this, false);
         Registry.lookupField(388202870823471257L).setInt(this, a(31172, 2406642350534604587L));
         Registry.lookupField(185183789069073378L).setBoolean(this, true);
         HashMap var10005 = new HashMap();
         long var12 = 533669572411198848L;
         var11 = var10005;
         Ref.s(533669572411198848L, var11, var12);
         Registry.lookupField(421709291189789904L).setInt(this, -1);
         Registry.lookupField(210447995261764859L).setBoolean(this, false);
         Registry.lookupField(631781646741322975L).setBoolean(this, false);
         Registry.lookupField(291528700222910706L).setBoolean(this, false);
         Registry.lookupField(196077290577414286L).setBoolean(this, true);
         Registry.lookupField(342832808241187441L).setBoolean(this, false);
         var36 = new Color(a(25872, 7805825191738321899L), a(440, 2468831384235626309L), a(440, 2468831384235626309L));
         long var14 = 586874291471114490L;
         Color var13 = var36;
         Ref.s(586874291471114490L, var13, var14);
         Color var10006 = new Color(a(9271, 5417176631180782275L), a(5293, 5772053881979132507L), a(5293, 5772053881979132507L), a(6180, 8806695532090414792L));
         long var16 = 576105615503981375L;
         Color var15 = var10006;
         Ref.s(576105615503981375L, var15, var16);
         Registry.lookupField(631781646741322975L).setBoolean(this, var1);
         long var18 = 142536030060271800L;
         Ref.s(142536030060271800L, this, var18);
         var3 = (JFrame)SwingUtilities.getWindowAncestor(this);
         TH3 var10007 = (TH3)Registry.lookupField(277670051994433027L).get(null);
         if (this == null) {
            if (var10007 != null) {
               break label48;
            }

            var10007 = new TH3(var3);
         }

         Registry.lookupField(277670051994433027L).set(null, var10007);
      }

      label42: {
         var37 = (DP)Registry.lookupField(349091698802351406L).get(null);
         if (this == null) {
            if (var37 != null) {
               break label42;
            }

            var37 = new DP(var3);
         }

         Registry.lookupField(349091698802351406L).set(null, var37);
      }

      this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      FlowLayout var10008 = new FlowLayout(0);
      var20 = 158219876422589484L;
      FlowLayout var19 = var10008;
      Ref.s(158219876422589484L, var19, var20);
      Object var21 = 158219876422589484L;
      ((FlowLayout)Ref.g(158219876422589484L, var21)).setVgap(Registry.lookupField(374786476283896993L).getInt(this));
      Object var23 = 158219876422589484L;
      ((FlowLayout)Ref.g(158219876422589484L, var23)).setHgap(Registry.lookupField(627149169115132345L).getInt(this));
      Object var25 = 158219876422589484L;
      this.setLayout((FlowLayout)Ref.g(158219876422589484L, var25));
      Ge2 var10012 = new Ge2();
      long var28 = 426406158494779427L;
      var27 = var10012;
      Ref.s(426406158494779427L, var27, var28);
      this.addComponentListener(new Vv2(this));
      if (this == null) {
         if ((Jc2)Registry.lookupField(609684993151237253L).get(null) == null) {
            Registry.lookupField(609684993151237253L).set(null, new Jc2());
         }

         this.addMouseListener(new Ft4(this));
      }

      if (var1) {
         Registry.packArgs("\uf067");
         long var29 = 378399160856121064L;
         Object var10013 = Ref.h2(378399160856121064L, var29);

         try {
            var10013 = (C)var10013;
         } catch (InvocationTargetException var35) {
            throw var35.getTargetException();
         }

         C var4 = (C)var10013;
         var4.setFont((Font)Registry.lookupField(334953030171430953L).get(null));
         var4.setMargin(new Insets(0, 2, 1, a(1068, 4921128532049382098L)));
         long var32 = 533332121992851488L;
         Ref.s(533332121992851488L, var4, var32);
         Object var33 = 533332121992851488L;
         this.add((JComponent)Ref.g(533332121992851488L, var33));
         var4.addActionListener(new TW(this));
         var4.addMouseListener(new Uz2(this, var4));
      }

      if (Ky4.F$arrString() != null) {
         F(new String[5]);
      }
   }

   public void y() {
      long var9;
      s$arrString();
      Object var4 = 533669572411198848L;
      Iterator var2 = ((HashMap)Ref.g(533669572411198848L, var4)).keySet().iterator();
      AM var1 = this;

      while (true) {
         if (var2.hasNext()) {
            Object var6 = 533669572411198848L;
            T32 var3 = (T32)((HashMap)Ref.g(533669572411198848L, var6)).get(var2.next());
            Object[] var10003 = Registry.emptyArgs();
            var9 = 414457989140731651L;
            Object[] var8 = var10003;
            Ref.h(414457989140731651L, var8, var9);

            try {
               ;
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }

            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         Object var10 = 533669572411198848L;
         ((HashMap)Ref.g(533669572411198848L, var10)).clear();
         Registry.packArgs(this);
         long var12 = 242617331513341262L;
         Ref.h2(242617331513341262L, var12);

         try {
            ;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         Object[] var10004 = Registry.emptyArgs();
         long var15 = 335828355375361477L;
         Object[] var14 = var10004;
         Ref.h(335828355375361477L, var14, var15);

         try {
            break;
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }
      }
   }

   public T32 x(int var1) {
      Object var2 = 417119238929760524L;
      if (this <= ((ArrayList)Ref.g(417119238929760524L, var2)).size()) {
         Object var4 = 417119238929760524L;
         return (T32)((ArrayList)Ref.g(417119238929760524L, var4)).get(var1 - 1);
      } else {
         return null;
      }
   }

   @Override
   public void paintComponent(Graphics var1) {
      int var20;
      String[] var2;
      AM var10001;
      label40: {
         super.paintComponent(var1);
         String[] var10000 = s$arrString();
         Graphics2D var3 = (Graphics2D)var1;
         var2 = var10000;
         Object var6 = 586874291471114490L;
         Color var4 = (Color)Ref.g(586874291471114490L, var6);
         if (var2 == null) {
            var10001 = this;
            Object var8 = 142536030060271800L;
            if ((AM)Ref.g(142536030060271800L, var8) != null) {
               Object var10 = 142536030060271800L;
               Ref.g(142536030060271800L, var10);
               ArrayList var10004 = Registry.emptyArgs();
               long var13 = 230171768324088030L;
               Object var12 = var10004;
               var10004 = Ref.h(230171768324088030L, var12, var13);

               try {
                  var10004 = (ArrayList)var10004;
               } catch (InvocationTargetException var16) {
                  throw var16.getTargetException();
               }

               var20 = var10004.size();
               if (var2 != null) {
                  break label40;
               }

               if (var20 > 0) {
                  Object var14 = 576105615503981375L;
                  var4 = (Color)Ref.g(576105615503981375L, var14);
               }
            }

            var1.setColor(var4);
         }

         var10001 = true;
      }

      AM var5 = var10001;
      boolean var17 = Registry.lookupField(579186049990057769L).getBoolean(this);
      if (var2 == null) {
         if (var17) {
            var5 = false;
         }

         var17 = Registry.lookupField(196077290577414286L).getBoolean(this);
      }

      if (var17) {
         var1.drawLine(0, this.getHeight() - var5, this.getWidth(), this.getHeight() - var5);
      }
   }

   public JComponent o() {
      Object var1 = 490595310560876529L;
      return (JComponent)Ref.g(490595310560876529L, var1);
   }

   public void q(JComponent var1) {
      long var3 = 490595310560876529L;
      Ref.s(490595310560876529L, var1, var3);
      this.add(var1, 0);
   }

   public void i() {
      long var11;
      long var7;
      s$arrString();
      Object var10001 = Registry.lookupField(277670051994433027L).get(null);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 163672173046701219L;
      Object[] var4 = var10002;
      Ref.h(163672173046701219L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      Object var1 = var10001;
      Registry.lookupField(349091698802351406L).get(null);
      var10002 = Registry.emptyArgs();
      var7 = 259007488175563915L;
      Object[] var6 = var10002;
      Ref.h(259007488175563915L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      Object var8 = 417119238929760524L;
      Iterator var2 = ((ArrayList)Ref.g(417119238929760524L, var8)).iterator();

      while (true) {
         if (var2.hasNext()) {
            T32 var3 = (T32)var2.next();
            Object[] var10004 = Registry.emptyArgs();
            var11 = 139482980886447442L;
            Object[] var10 = var10004;
            Ref.h(139482980886447442L, var10, var11);

            try {
               ;
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }

            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         Registry.emptyArgs();
         long var12 = 270389152141252877L;
         Ref.h2(270389152141252877L, var12);
         Object[] var10006 = Registry.emptyArgs();
         long var15 = 399585344452154517L;
         Object[] var14 = var10006;
         Ref.h(399585344452154517L, var14, var15);
         Object[] var10007 = Registry.emptyArgs();
         long var17 = 149968465491171480L;
         Object[] var16 = var10007;
         var10007 = Ref.h(149968465491171480L, var16, var17);
         long var19 = 497629741148939873L;
         Object var18 = var10007;
         Ref.s(497629741148939873L, var18, var19);
         this.repaint();
         break;
      }
   }

   public void P(Graphics var1) {
      long var11;
      Object[] var9;
      Object var5 = 497629741148939873L;
      if ((NY)Ref.g(497629741148939873L, var5) != null) {
         Graphics2D var2 = (Graphics2D)var1;
         Object var7 = 497629741148939873L;
         Ref.g(497629741148939873L, var7);
         Color var10003 = (Color)(Registry.emptyArgs());
         long var10 = 345089686683358688L;
         var9 = var10003;
         var10003 = Ref.h(345089686683358688L, var9, var10);

         try {
            var10003 = (Color)var10003;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }

         Color var4 = var10003;
         Registry.packArgs(var4);
         var11 = 430829682188014939L;
         Ref.h2(430829682188014939L, var11);

         try {
            ;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         Color var10008 = new Color(a(7991, 5906071494280139200L), a(29038, 9053128655859859351L), a(29038, 9053128655859859351L));
         Object var10010 = (float)(this.getHeight() * 5);
         Object var13 = 497629741148939873L;
         Object var10012 = Ref.g(497629741148939873L, var13);
         Color var10013 = (Color)(Registry.emptyArgs());
         long var16 = 345089686683358688L;
         Object var15 = var10013;
         var10013 = Ref.h(345089686683358688L, var15, var16);

         try {
            var10013 = (Color)var10013;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

0.0F = new AM((float)var10008, 0.0F, (Color)var10010, (float)this, (float)var10012, var10013);
         Object var3 = 0.0F;
         var2.setPaint((Paint)var3);
         var2.fillRect(0, 0, this.getWidth(), this.getHeight());
      }
   }

   public void h(Y9 var1) {
      long var11;
      long var9;
      s$arrString();
      Object var6 = 502036721265141438L;
      Iterator var3 = ((ArrayList)Ref.g(502036721265141438L, var6)).iterator();
      AM var2 = this;

      while (var3.hasNext()) {
         AL var4 = (AL)var3.next();
         Object var10002 = Registry.emptyArgs();
         var9 = 147296966455368819L;
         Object var8 = var10002;
         var10002 = Ref.h(147296966455368819L, var8, var9);

         try {
            var27 = (Integer)var10002;
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }

         label108: {
            int var5 = var27;
            int var28 = var5;
            int var10003 = Registry.lookupField(307190072297206240L).getInt(null);
            if (var2 == null) {
               if (var5 == var10003) {
                  Object[] var29 = Registry.packArgs(var1);
                  var11 = 212968630715837381L;
                  Object[] var10 = var29;
                  Ref.h(212968630715837381L, var10, var11);

                  try {
                     ;
                  } catch (InvocationTargetException var24) {
                     throw var24.getTargetException();
                  }

                  if (var2 == null) {
                     break label108;
                  }
               }

               var28 = var5;
               var10003 = Registry.lookupField(534616084670407665L).getInt(null);
            }

            if (var2 == null) {
               if (var28 == var10003) {
                  Object[] var30 = Registry.packArgs(var1);
                  long var13 = 422255114587411686L;
                  Object[] var12 = var30;
                  Ref.h(422255114587411686L, var12, var13);

                  try {
                     ;
                  } catch (InvocationTargetException var23) {
                     throw var23.getTargetException();
                  }

                  if (var2 == null) {
                     break label108;
                  }
               }

               var28 = var5;
               var10003 = Registry.lookupField(141500763651848578L).getInt(null);
            }

            if (var2 == null) {
               if (var28 == var10003) {
                  Object[] var31 = Registry.packArgs(var1);
                  long var15 = 411995691252881560L;
                  Object[] var14 = var31;
                  Ref.h(411995691252881560L, var14, var15);

                  try {
                     ;
                  } catch (InvocationTargetException var22) {
                     throw var22.getTargetException();
                  }

                  if (var2 == null) {
                     break label108;
                  }
               }

               var28 = var5;
               var10003 = Registry.lookupField(454291477903395804L).getInt(null);
            }

            if (var2 == null) {
               if (var28 == var10003) {
                  Object[] var32 = Registry.packArgs(var1);
                  long var17 = 194573996531258606L;
                  Object[] var16 = var32;
                  Ref.h(194573996531258606L, var16, var17);

                  try {
                     ;
                  } catch (InvocationTargetException var21) {
                     throw var21.getTargetException();
                  }

                  if (var2 == null) {
                     break label108;
                  }
               }

               var28 = var5;
               var10003 = Registry.lookupField(527075857672909373L).getInt(null);
            }

            if (var28 == var10003) {
               Object[] var33 = Registry.packArgs(var1);
               long var19 = 433835034885219625L;
               Object[] var18 = var33;
               Ref.h(433835034885219625L, var18, var19);

               try {
                  ;
               } catch (InvocationTargetException var20) {
                  throw var20.getTargetException();
               }
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void c(AL var1) {
      Object var2 = 502036721265141438L;
      ((ArrayList)Ref.g(502036721265141438L, var2)).add(var1);
   }

   public void n(T32 var1) {
      long var11;
      long var9;
      Object var6 = 417119238929760524L;
      ArrayList var3 = (ArrayList)((ArrayList)Ref.g(417119238929760524L, var6)).clone();
      String[] var10001 = s$arrString();
      Iterator var4 = var3.iterator();
      String[] var2 = var10001;

      while (var4.hasNext()) {
         label37: {
            T32 var5 = (T32)var4.next();
            T32 var16 = var5.equals(var1);
            if (var2 == null) {
               if (var16 == null) {
                  break label37;
               }

               var16 = var5;
               Object[] var10002 = Registry.emptyArgs();
               var9 = 584096728105558414L;
               Object[] var8 = var10002;
               Ref.h(584096728105558414L, var8, var9);
               Object[] var10003 = Registry.emptyArgs();
               var11 = 589411218730404657L;
               Object[] var10 = var10003;
               var10003 = Ref.h(589411218730404657L, var10, var11);

               try {
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }
            }

            if (var16 == null) {
               Object[] var17 = Registry.packArgs(var5);
               long var13 = 267026473738179692L;
               Object[] var12 = var17;
               Ref.h(267026473738179692L, var12, var13);

               try {
                  ;
               } catch (InvocationTargetException var14) {
                  throw var14.getTargetException();
               }
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void n(boolean var1) {
      Object[] var11;
      boolean var20;
      String[] var10000 = s$arrString();
      byte var3 = 0;
      String[] var2 = var10000;
      if (Registry.lookupField(631781646741322975L).getBoolean(this)) {
      }

      do {
         Object var5 = 417119238929760524L;
         if (((ArrayList)Ref.g(417119238929760524L, var5)).size() <= var3) {
            break;
         }

         Object var7 = 417119238929760524L;
         ArrayList var10002 = (ArrayList)Ref.g(417119238929760524L, var7);
         Object var9 = 417119238929760524L;
         T32 var4 = (T32)this.get(((ArrayList)Ref.g(417119238929760524L, var9)).size() - 1 - var3);
         Object[] var10004 = Registry.emptyArgs();
         long var12 = 584096728105558414L;
         var11 = var10004;
         Ref.h(584096728105558414L, var11, var12);
         Object var10005 = Registry.emptyArgs();
         long var14 = 589411218730404657L;
         Object var13 = var10005;
         var10005 = Ref.h(589411218730404657L, var13, var14);

         try {
            var20 = (Boolean)var10005;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         if (var20) {
            boolean var10008 = var1;
            if (var2 == null) {
               var10008 = !var1;
            }

            Object[] var10006 = Registry.packArgs(var4, false, var10008);
            long var16 = 456507190647444792L;
            Object[] var15 = var10006;
            Ref.h(456507190647444792L, var15, var16);

            try {
               ;
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }
         }
      } while (var2 == null);
   }

   public void j$void() {
      Object[] var10001 = Registry.packArgs(false);
      long var2 = 328322194154687590L;
      Object[] var1 = var10001;
      Ref.h(328322194154687590L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void a(T32 var1) {
      Object[] var10001 = Registry.packArgs(var1, false, false, false);
      long var3 = 379470519563754551L;
      Object[] var2 = var10001;
      Ref.h(379470519563754551L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void r(T32 var1) {
      Object[] var10001 = Registry.packArgs(var1, false, false);
      long var3 = 456507190647444792L;
      Object[] var2 = var10001;
      Ref.h(456507190647444792L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void l$void() {
      Object var1 = 417119238929760524L;
      Object[] var10002 = Registry.packArgs(((ArrayList)Ref.g(417119238929760524L, var1)).size() - 1);
      long var4 = 451518351793196330L;
      Object[] var3 = var10002;
      Ref.h(451518351793196330L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void v(T32 var1, boolean var2) {
      Object[] var10001 = Registry.packArgs(var1, false, var2);
      long var4 = 456507190647444792L;
      Object[] var3 = var10001;
      Ref.h(456507190647444792L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void N(T32 var1) {
      long var7;
      long var9;
      s$arrString();
      Object var10002 = Registry.packArgs(var1);
      long var5 = 267026473738179692L;
      Object var4 = var10002;
      Ref.h(267026473738179692L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var10002 = Registry.emptyArgs();
      var7 = 559745286191336380L;
      Object var6 = var10002;
      var10002 = Ref.h(559745286191336380L, var6, var7);

      try {
         var10002 = (Boolean)var10002;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      if (this != null) {
         T32 var3 = var10002;
         SwingUtilities.invokeLater(new com.finalshell.task.Kf4(this, (int)var3));
      } else if (var10002 != null) {
         var10002 = var1;
         Object[] var10003 = Registry.emptyArgs();
         var9 = 328118709254946779L;
         Object[] var8 = var10003;
         var10003 = Ref.h(328118709254946779L, var8, var9);

         label24:
         try {
            break label24;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }
      }
   }

   public void X(T32 var1, boolean var2, boolean var3) {
      Object[] var10001 = Registry.packArgs(var1, var2, var3, true);
      long var5 = 379470519563754551L;
      Object[] var4 = var10001;
      Ref.h(379470519563754551L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void n(T32 var1, boolean var2, boolean var3, boolean var4) {
      Y9 var11;
      long var37;
      Object[] var42;
      long var43;
      Object[] var48;
      Object[] var64;
      Object var7;
      Y9 var9;
      Integer var96;
      String[] var10000 = s$arrString();
      T32 var6 = null;
      var7 = -1;
      String[] var5 = var10000;
      if (var5 != null || var1 != null) {
         Integer var10001 = (Integer)(Registry.emptyArgs());
         long var13 = 328118709254946779L;
         Object var12 = var10001;
         var10001 = Ref.h(328118709254946779L, var12, var13);

         try {
            var10001 = (Integer)var10001;
         } catch (InvocationTargetException var82) {
            throw var82.getTargetException();
         }

         Object var8 = var10001;
         Boolean var10002 = (Boolean)(Registry.emptyArgs());
         long var15 = 258040024224799506L;
         Object var14 = var10002;
         var10002 = Ref.h(258040024224799506L, var14, var15);

         try {
            var10002 = (Boolean)var10002;
         } catch (InvocationTargetException var81) {
            throw var81.getTargetException();
         }

         label188:
         if (var5 == null) {
            if (var10002 == null) {
               var10002 = this;
               Object var16 = 417119238929760524L;
               int var10003 = ((ArrayList)Ref.g(417119238929760524L, var16)).size();
               if (var5 != null) {
                  break label188;
               }

               label184:
               if (var10003 > 1) {
                  if (var5 == null) {
                     Object var18 = 417119238929760524L;
                     if (this == ((ArrayList)Ref.g(417119238929760524L, var18)).size() - 1) {
                        var7 = var8 - 1;
                        if (var5 == null) {
                           break label184;
                        }
                     }
                  }

                  var7 = var8;
               }
            }

            var10002 = this;
            Object var20 = 417119238929760524L;
            ((ArrayList)Ref.g(417119238929760524L, var20)).remove(var1);
            Bq2 var10005 = (Bq2)(Registry.emptyArgs());
            long var23 = 584096728105558414L;
            Object var22 = var10005;
            var10005 = Ref.h(584096728105558414L, var22, var23);

            try {
               var10005 = (Bq2)var10005;
            } catch (InvocationTargetException var80) {
               throw var80.getTargetException();
            }

            var1.remove(var10005);
            var10005 = Registry.emptyArgs();
            long var25 = 258040024224799506L;
            Object var24 = var10005;
            var10005 = Ref.h(258040024224799506L, var24, var25);

            try {
            } catch (InvocationTargetException var79) {
               throw var79.getTargetException();
            }
         }

         if (var5 == null) {
            if (var10002 == null) {
               Object var26 = 426406158494779427L;
               Ref.g(426406158494779427L, var26);
               Object[] var10004 = Registry.emptyArgs();
               long var29 = 207074520377939911L;
               Object[] var28 = var10004;
               Ref.h(207074520377939911L, var28, var29);

               try {
                  ;
               } catch (InvocationTargetException var78) {
                  throw var78.getTargetException();
               }
            }

            var10002 = (Object[])var7;
         }

         if (var10002 > -1) {
            Object var30 = 417119238929760524L;
            var6 = (T32)((ArrayList)Ref.g(417119238929760524L, var30)).get((int)var7);
            Object[] var88 = Registry.packArgs(true);
            long var33 = 330506269608966297L;
            Object[] var32 = var88;
            Ref.h(330506269608966297L, var32, var33);

            try {
               ;
            } catch (InvocationTargetException var77) {
               throw var77.getTargetException();
            }

            Object[] var93 = Registry.emptyArgs();
            long var35 = 176235325809488947L;
            Object[] var34 = var93;
            Ref.h(176235325809488947L, var34, var35);

            try {
               ;
            } catch (InvocationTargetException var76) {
               throw var76.getTargetException();
            }

            var37 = 425434110105144335L;
            Ref.s(425434110105144335L, var6, var37);
            Object var38 = 426406158494779427L;
            Ref.g(426406158494779427L, var38);
            Object[] var10009 = Registry.emptyArgs();
            long var41 = 424156930953488367L;
            Object[] var40 = var10009;
            var10009 = Registry.packArgs(Ref.h(424156930953488367L, var40, var41));
            var43 = 597359146714455209L;
            var42 = var10009;
            Ref.h(597359146714455209L, var42, var43);

            try {
               ;
            } catch (InvocationTargetException var75) {
               throw var75.getTargetException();
            }
         }

         Object var44 = 533669572411198848L;
         HashMap var87 = (HashMap)Ref.g(533669572411198848L, var44);
         Object var94 = Registry.emptyArgs();
         long var47 = 229192454276026216L;
         Object var46 = var94;
         var94 = Ref.h(229192454276026216L, var46, var47);

         try {
            var96 = (Integer)var94;
         } catch (InvocationTargetException var74) {
            throw var74.getTargetException();
         }

         var1.remove(var96);
         var94 = Registry.emptyArgs();
         long var49 = 246765627653456113L;
         var48 = var94;
         Ref.h(246765627653456113L, var48, var49);

         try {
            ;
         } catch (InvocationTargetException var73) {
            throw var73.getTargetException();
         }

         Object[] var10006 = Registry.emptyArgs();
         long var51 = 487819805049017899L;
         Object[] var50 = var10006;
         Ref.h(487819805049017899L, var50, var51);

         try {
            ;
         } catch (InvocationTargetException var72) {
            throw var72.getTargetException();
         }

         var9 = new Y9(var1, Registry.lookupField(534616084670407665L).getInt(null));
         Object[] var10007 = Registry.packArgs(var2);
         long var53 = 152866268449868611L;
         Object[] var52 = var10007;
         Ref.h(152866268449868611L, var52, var53);

         try {
            ;
         } catch (InvocationTargetException var71) {
            throw var71.getTargetException();
         }

         if (var5 == null) {
            if (var4) {
               Object[] var10008 = Registry.packArgs(var9);
               long var55 = 484591085759846041L;
               Object[] var54 = var10008;
               Ref.h(484591085759846041L, var54, var55);

               try {
                  ;
               } catch (InvocationTargetException var70) {
                  throw var70.getTargetException();
               }
            }

            Object var56 = 417119238929760524L;
            ((ArrayList)Ref.g(417119238929760524L, var56)).size();
         }

         if (var6 != null && !var3) {
            Object[] var98 = Registry.packArgs(var6);
            long var59 = 397047287828875528L;
            Object[] var58 = var98;
            Ref.h(397047287828875528L, var58, var59);

            try {
               ;
            } catch (InvocationTargetException var69) {
               throw var69.getTargetException();
            }

            var11 = new Y9(var6, Registry.lookupField(141500763651848578L).getInt(null));
            Object[] var100 = Registry.packArgs(true);
            long var61 = 582387900151160398L;
            Object[] var60 = var100;
            Ref.h(582387900151160398L, var60, var61);

            try {
               ;
            } catch (InvocationTargetException var68) {
               throw var68.getTargetException();
            }

            Object[] var10010 = Registry.packArgs(var2);
            long var63 = 152866268449868611L;
            Object[] var62 = var10010;
            Ref.h(152866268449868611L, var62, var63);

            try {
               ;
            } catch (InvocationTargetException var67) {
               throw var67.getTargetException();
            }

            Object[] var10011 = Registry.packArgs(var11);
            long var65 = 484591085759846041L;
            var64 = var10011;
            Ref.h(484591085759846041L, var64, var65);

            try {
               ;
            } catch (InvocationTargetException var66) {
               throw var66.getTargetException();
            }
         }
      }
   }

   public T32 U(T32 var1, int var2) {
      Object var10001 = Registry.packArgs(var1, var2, true);
      long var4 = 302051953273770611L;
      Object var3 = var10001;
      var10001 = Ref.h(302051953273770611L, var3, var4);

      try {
         return (T32)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public T32 L(T32 var1, int var2, boolean var3) {
      Object var10001 = Registry.packArgs(var1, null, null, var2, false, var3);
      long var5 = 574784922018541486L;
      Object var4 = var10001;
      var10001 = Ref.h(574784922018541486L, var4, var5);

      try {
         return (T32)var10001;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public T32 l(F8 var1, String var2, int var3, boolean var4, boolean var5) {
      long var7;
      Object var10001 = Registry.packArgs(null, var1, var2, var3, var4, var5);
      var7 = 574784922018541486L;
      Object var6 = var10001;
      var10001 = Ref.h(574784922018541486L, var6, var7);

      try {
         return (T32)var10001;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public T32 P(T32 var1, F8 var2, String var3, int var4, boolean var5, boolean var6) {
      Y9 var11;
      Boolean var110;
      Object[] var20;
      long var27;
      Object[] var36;
      long var37;
      long var45;
      Object[] var48;
      String[] var7;
      T32 var8;
      label223: {
         String[] var10000 = s$arrString();
         Registry.lookupField(133320001629591502L).setInt(this, var4);
         var7 = var10000;
         var8 = new T32(var3);
         if (var7 == null && var1 != null) {
            Object[] var10002 = Registry.emptyArgs();
            long var13 = 532019896893594989L;
            Object[] var12 = var10002;
            var10002 = Registry.packArgs(Ref.h(532019896893594989L, var12, var13));
            long var15 = 519460332647460288L;
            Object[] var14 = var10002;
            Ref.h(519460332647460288L, var14, var15);

            try {
               ;
            } catch (InvocationTargetException var100) {
               throw var100.getTargetException();
            }

            Object[] var10004 = Registry.emptyArgs();
            long var17 = 160719341149611325L;
            Object[] var16 = var10004;
            var10004 = Registry.packArgs(Ref.h(160719341149611325L, var16, var17));
            long var19 = 331953291291636753L;
            Object[] var18 = var10004;
            Ref.h(331953291291636753L, var18, var19);

            try {
               ;
            } catch (InvocationTargetException var99) {
               throw var99.getTargetException();
            }

            Object[] var10006 = Registry.emptyArgs();
            long var21 = 424156930953488367L;
            var20 = var10006;
            var10006 = Registry.packArgs(Ref.h(424156930953488367L, var20, var21));
            long var23 = 394686213359187078L;
            Object[] var22 = var10006;
            Ref.h(394686213359187078L, var22, var23);

            try {
               ;
            } catch (InvocationTargetException var98) {
               throw var98.getTargetException();
            }

            Object[] var10007 = Registry.emptyArgs();
            long var25 = 584096728105558414L;
            Object[] var24 = var10007;
            Ref.h(584096728105558414L, var24, var25);
            Object var10008 = Registry.emptyArgs();
            var27 = 247202017205943608L;
            Object var26 = var10008;
            var10008 = Ref.h(247202017205943608L, var26, var27);

            try {
               var110 = (Boolean)var10008;
            } catch (InvocationTargetException var97) {
               throw var97.getTargetException();
            }

            var5 = var110;
            if (var7 == null) {
               break label223;
            }
         }

         Object[] var10001 = Registry.packArgs(var2);
         long var29 = 394686213359187078L;
         Object[] var28 = var10001;
         Ref.h(394686213359187078L, var28, var29);

         try {
            ;
         } catch (InvocationTargetException var96) {
            throw var96.getTargetException();
         }
      }

      Object[] var102 = Registry.packArgs(this);
      long var31 = 629272671697070338L;
      Object[] var30 = var102;
      Ref.h(629272671697070338L, var30, var31);

      try {
         ;
      } catch (InvocationTargetException var95) {
         throw var95.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var33 = 424156930953488367L;
      Object[] var32 = var10003;
      Ref.h(424156930953488367L, var32, var33);

      try {
         ;
      } catch (InvocationTargetException var94) {
         throw var94.getTargetException();
      }

      Object[] var104 = Registry.packArgs(var8);
      long var35 = 552175363050732967L;
      Object[] var34 = var104;
      Ref.h(552175363050732967L, var34, var35);

      try {
         ;
      } catch (InvocationTargetException var93) {
         throw var93.getTargetException();
      }

      Object[] var10005 = Registry.packArgs(this);
      var37 = 416612758253976707L;
      var36 = var10005;
      Ref.h(416612758253976707L, var36, var37);

      try {
         ;
      } catch (InvocationTargetException var92) {
         throw var92.getTargetException();
      }

      Bq2 var106 = (Bq2)(Registry.packArgs(var8, this, var5, var6));
      long var39 = 566591783561533654L;
      Object var38 = var106;
      var106 = Ref.h(566591783561533654L, var38, var39);

      try {
         var106 = (Bq2)var106;
      } catch (InvocationTargetException var91) {
         throw var91.getTargetException();
      }

      Bq2 var9 = var106;
      Object var40 = 417119238929760524L;
      ((ArrayList)Ref.g(417119238929760524L, var40)).add(var4, var8);
      if (var7 == null) {
         Object var42 = 490595310560876529L;
         if ((JComponent)Ref.g(490595310560876529L, var42) != null) {
            var4++;
         }
      }

      Object var111 = Registry.emptyArgs();
      var45 = 496057640532296914L;
      Object var44 = var111;
      var111 = Ref.h(496057640532296914L, var44, var45);

      try {
         var113 = (Integer)var111;
      } catch (InvocationTargetException var90) {
         throw var90.getTargetException();
      }

      int var10 = var113;
      Object[] var10009 = Registry.packArgs(true);
      long var47 = 330506269608966297L;
      Object[] var46 = var10009;
      Ref.h(330506269608966297L, var46, var47);

      try {
         ;
      } catch (InvocationTargetException var89) {
         throw var89.getTargetException();
      }

      Object[] var10010 = Registry.packArgs(var4);
      long var49 = 599989240986758347L;
      var48 = var10010;
      Ref.h(599989240986758347L, var48, var49);

      try {
         ;
      } catch (InvocationTargetException var88) {
         throw var88.getTargetException();
      }

      Object[] var10011 = Registry.packArgs(var4);
      long var51 = 243679155515376706L;
      Object[] var50 = var10011;
      Ref.h(243679155515376706L, var50, var51);

      try {
         ;
      } catch (InvocationTargetException var87) {
         throw var87.getTargetException();
      }

      Object var52 = 533669572411198848L;
      ((HashMap)Ref.g(533669572411198848L, var52)).put(var10, var8);
      long var55 = 425434110105144335L;
      Ref.s(425434110105144335L, var8, var55);
      Object[] var10014 = Registry.packArgs(var9);
      long var57 = 334753124708650117L;
      Object[] var56 = var10014;
      Ref.h(334753124708650117L, var56, var57);

      try {
         ;
      } catch (InvocationTargetException var86) {
         throw var86.getTargetException();
      }

      this.add(var9, var4);
      Object[] var10015 = Registry.packArgs(var8);
      long var59 = 379860037679905473L;
      Object[] var58 = var10015;
      Ref.h(379860037679905473L, var58, var59);

      try {
         ;
      } catch (InvocationTargetException var85) {
         throw var85.getTargetException();
      }

      Object[] var10016 = Registry.packArgs(var8);
      long var61 = 397047287828875528L;
      Object[] var60 = var10016;
      Ref.h(397047287828875528L, var60, var61);

      try {
         ;
      } catch (InvocationTargetException var84) {
         throw var84.getTargetException();
      }

      Object[] var10017 = Registry.emptyArgs();
      long var63 = 176235325809488947L;
      Object[] var62 = var10017;
      Ref.h(176235325809488947L, var62, var63);

      try {
         ;
      } catch (InvocationTargetException var83) {
         throw var83.getTargetException();
      }

      Object var64 = 426406158494779427L;
      Ref.g(426406158494779427L, var64);
      Object[] var10020 = Registry.emptyArgs();
      long var67 = 424156930953488367L;
      Object[] var66 = var10020;
      var10020 = Registry.packArgs(Ref.h(424156930953488367L, var66, var67));
      long var69 = 597359146714455209L;
      Object[] var68 = var10020;
      Ref.h(597359146714455209L, var68, var69);

      try {
         ;
      } catch (InvocationTargetException var82) {
         throw var82.getTargetException();
      }

      this.doLayout();
      this.repaint();
      Object[] var10021 = Registry.emptyArgs();
      long var71 = 487819805049017899L;
      Object[] var70 = var10021;
      Ref.h(487819805049017899L, var70, var71);

      try {
         ;
      } catch (InvocationTargetException var81) {
         throw var81.getTargetException();
      }

      Object[] var10022 = Registry.emptyArgs();
      long var73 = 246765627653456113L;
      Object[] var72 = var10022;
      Ref.h(246765627653456113L, var72, var73);

      try {
         ;
      } catch (InvocationTargetException var80) {
         throw var80.getTargetException();
      }

      var11 = new Y9(var8, Registry.lookupField(141500763651848578L).getInt(null));
      Object[] var10023 = Registry.packArgs(true);
      long var75 = 439556559655959651L;
      Object[] var74 = var10023;
      Ref.h(439556559655959651L, var74, var75);

      try {
         ;
      } catch (InvocationTargetException var79) {
         throw var79.getTargetException();
      }

      Object[] var10024 = Registry.packArgs(var11);
      long var77 = 484591085759846041L;
      Object[] var76 = var10024;
      Ref.h(484591085759846041L, var76, var77);

      try {
         return var8;
      } catch (InvocationTargetException var78) {
         throw var78.getTargetException();
      }
   }

   public int N() {
      String[] var10000 = s$arrString();
      Object var2 = false;
      Object var3 = 1;
      Object var4 = var3;
      String[] var1 = var10000;

      while (true) {
         label26:
         if (var4 < a(6883, 8562121222573937677L)) {
            var7 = this;
            Object var5 = 533669572411198848L;
            Object var10001 = ((HashMap)Ref.g(533669572411198848L, var5)).containsKey(Integer.valueOf((int)var4));
            if (var1 != null) {
               break;
            }

            label23: {
               if (var1 == null) {
                  if (var10001 == null) {
                     break label23;
                  }

                  var10001 = var4;
               }

               var2 = var10001;
               if (var1 == null) {
                  break label26;
               }
            }

            var4++;
            if (var1 == null) {
      Iterator var7;
               continue;
            }
         }

         var7 = var2;
         break;
      }

      return (int)var7;
   }

   public void N(JComponent var1) {
      Object var2 = 426406158494779427L;
      Ref.g(426406158494779427L, var2);
      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 597359146714455209L;
      Object[] var4 = var10002;
      Ref.h(597359146714455209L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      this.doLayout();
      this.repaint();
   }

   public T32 T(F8 var1, String var2, boolean var3, boolean var4) {
      long var9;
      Object var6 = 417119238929760524L;
      int var5 = ((ArrayList)Ref.g(417119238929760524L, var6)).size();
      Object var10002 = Registry.packArgs(var1, var2, var5, var3, var4);
      var9 = 451133235546109527L;
      Object var8 = var10002;
      var10002 = Ref.h(451133235546109527L, var8, var9);

      try {
         return (T32)var10002;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   public T32 m(F8 var1, String var2) {
      long var7;
      Object var4 = 417119238929760524L;
      int var3 = ((ArrayList)Ref.g(417119238929760524L, var4)).size();
      Object var10002 = Registry.packArgs(var1, var2, var3, false, Registry.lookupField(394476637101936438L).getBoolean(this));
      var7 = 451133235546109527L;
      Object var6 = var10002;
      var10002 = Ref.h(451133235546109527L, var6, var7);

      try {
         return (T32)var10002;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   public T32 N(F8 var1, String var2) {
      Object var10001 = Registry.packArgs(var1, var2, false, true);
      long var4 = 200546729325125412L;
      Object var3 = var10001;
      var10001 = Ref.h(200546729325125412L, var3, var4);

      try {
         return (T32)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public T32 w(String var1) {
      long var11;
      CT var7;
      s$arrString();
      T32 var3 = null;
      Object var8 = 417119238929760524L;
      Iterator var4 = ((ArrayList)Ref.g(417119238929760524L, var8)).iterator();
      AM var2 = this;

      while (var4.hasNext()) {
         T32 var5 = (T32)var4.next();
         Object var10002 = Registry.emptyArgs();
         var11 = 424156930953488367L;
         Object var10 = var10002;
         var10002 = Ref.h(424156930953488367L, var10, var11);

         try {
            var10002 = (F8)var10002;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         F8 var6 = var10002;
         F8 var21 = var6;
         if (var2 == null) {
            if (!var6.getClass().equals(CT.class)) {
               continue;
            }

            var21 = var6;
         }

         var7 = (CT)var21;
         Object var10003 = Registry.emptyArgs();
         long var13 = 119416120528652269L;
         Object var12 = var10003;
         var10003 = Ref.h(119416120528652269L, var12, var13);

         try {
            var10003 = (Boolean)var10003;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         if (var2 == null) {
            if (var10003 == null) {
               continue;
            }

            var10003 = var7;
            String var10004 = Registry.emptyArgs();
            long var15 = 134780214066966408L;
            Object var14 = var10004;
            var10004 = Ref.h(134780214066966408L, var14, var15);

            try {
               var10004 = (String)var10004;
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }

            var10004.equals(var1);
         }

         if (var10003 == null) {
            var3 = var5;
            break;
         }
      }

      return var3;
   }

   public T32 B(String var1) {
      long var11;
      Refresh var7;
      String[] var10000 = s$arrString();
      T32 var3 = null;
      String[] var2 = var10000;
      Object var8 = 417119238929760524L;

      for (T32 var5 : (ArrayList)Ref.g(417119238929760524L, var8)) {
         Object var10002 = Registry.emptyArgs();
         var11 = 424156930953488367L;
         Object var10 = var10002;
         var10002 = Ref.h(424156930953488367L, var10, var11);

         try {
            var10002 = (F8)var10002;
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }

         F8 var6 = var10002;
         F8 var18 = var6;
         if (var2 == null) {
            if (!var6.getClass().equals(Refresh.class)) {
               continue;
            }

            var18 = var6;
         }

         var7 = (Refresh)var18;
         Object var10003 = Registry.emptyArgs();
         long var13 = 493034572907583781L;
         Object var12 = var10003;
         var10003 = Ref.h(493034572907583781L, var12, var13);

         try {
            var10003 = (String)var10003;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         if (var10003.equals(var1)) {
            var3 = var5;
            break;
         }
      }

      return var3;
   }

   public T32 q(String var1) {
      long var11;
      CE var7;
      T32 var3 = null;
      s$arrString();
      Object var8 = 417119238929760524L;
      Iterator var4 = ((ArrayList)Ref.g(417119238929760524L, var8)).iterator();
      AM var2 = this;

      while (var4.hasNext()) {
         T32 var5 = (T32)var4.next();
         Object var10002 = Registry.emptyArgs();
         var11 = 424156930953488367L;
         Object var10 = var10002;
         var10002 = Ref.h(424156930953488367L, var10, var11);

         try {
            var10002 = (F8)var10002;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         F8 var6 = var10002;
         F8 var21 = var6;
         if (var2 == null) {
            if (!var6.getClass().equals(CE.class)) {
               continue;
            }

            var21 = var6;
         }

         var7 = (CE)var21;
         Object var10003 = Registry.emptyArgs();
         long var13 = 243557514454506006L;
         Object var12 = var10003;
         var10003 = Ref.h(243557514454506006L, var12, var13);

         try {
            var10003 = (Boolean)var10003;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         if (var2 == null) {
            if (var10003 == null) {
               continue;
            }

            var10003 = var7;
            String var10004 = Registry.emptyArgs();
            long var15 = 504379882782984288L;
            Object var14 = var10004;
            var10004 = Ref.h(504379882782984288L, var14, var15);

            try {
               var10004 = (String)var10004;
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }

            var10004.equals(var1);
         }

         if (var10003 == null) {
            var3 = var5;
            break;
         }
      }

      return var3;
   }

   public T32 l(String var1) {
      long var11;
      F5 var7;
      T32 var3 = null;
      s$arrString();
      Object var8 = 417119238929760524L;
      Iterator var4 = ((ArrayList)Ref.g(417119238929760524L, var8)).iterator();
      AM var2 = this;

      while (var4.hasNext()) {
         T32 var5 = (T32)var4.next();
         Object var10002 = Registry.emptyArgs();
         var11 = 424156930953488367L;
         Object var10 = var10002;
         var10002 = Ref.h(424156930953488367L, var10, var11);

         try {
            var10002 = (F8)var10002;
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }

         F8 var6 = var10002;
         F8 var18 = var6;
         if (var2 == null) {
            if (!var6.getClass().equals(F5.class)) {
               continue;
            }

            var18 = var6;
         }

         var7 = (F5)var18;
         Object var10003 = Registry.emptyArgs();
         long var13 = 394153669787250679L;
         Object var12 = var10003;
         var10003 = Ref.h(394153669787250679L, var12, var13);

         try {
            var10003 = (String)var10003;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         if (var10003.equals(var1)) {
            var3 = var5;
            break;
         }
      }

      return var3;
   }

   public T32 Y(JComponent var1) {
      long var9;
      T32 var2 = null;
      Object var6 = 417119238929760524L;

      for (T32 var4 : (ArrayList)Ref.g(417119238929760524L, var6)) {
         Object var10002 = Registry.emptyArgs();
         var9 = 424156930953488367L;
         Object var8 = var10002;
         var10002 = Ref.h(424156930953488367L, var8, var9);

         try {
            var10002 = (F8)var10002;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         F8 var5 = var10002;
         if (var5.equals(var1)) {
            var2 = var4;
            break;
         }
      }

      return var2;
   }

   public void m$void() {
      Object[] var9;
      String[] var1 = s$arrString();
      Object var3 = 417119238929760524L;
      int var10001 = ((ArrayList)Ref.g(417119238929760524L, var3)).size();
      byte var10002 = 1;
      if (var1 == null) {
         if (var10001 <= 1) {
            return;
         }

         var10001 = Registry.lookupField(133320001629591502L).getInt(this);
         var10002 = 1;
      }

      int var2 = var10001 - var10002;
      if (var1 == null) {
         if (var2 < 0) {
            Object var5 = 417119238929760524L;
            var2 = ((ArrayList)Ref.g(417119238929760524L, var5)).size() - 1;
         }

         Object var7 = 417119238929760524L;
         Object[] var10003 = Registry.packArgs((T32)((ArrayList)Ref.g(417119238929760524L, var7)).get(var2));
         long var10 = 176011466134249595L;
         var9 = var10003;
         Ref.h(176011466134249595L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }
      }
   }

   public void s$void() {
      Object[] var9;
      String[] var1 = s$arrString();
      Object var3 = 417119238929760524L;
      int var10001 = ((ArrayList)Ref.g(417119238929760524L, var3)).size();
      byte var10002 = 1;
      if (var1 == null) {
         if (var10001 <= 1) {
            return;
         }

         var10001 = Registry.lookupField(133320001629591502L).getInt(this);
         var10002 = 1;
      }

      int var2 = var10001 + var10002;
      if (var1 == null) {
         Object var5 = 417119238929760524L;
         if (this > ((ArrayList)Ref.g(417119238929760524L, var5)).size() - 1) {
            var2 = 0;
         }

         Object var7 = 417119238929760524L;
         Object[] var10004 = Registry.packArgs((T32)((ArrayList)Ref.g(417119238929760524L, var7)).get(var2));
         long var10 = 176011466134249595L;
         var9 = var10004;
         Ref.h(176011466134249595L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }
      }
   }

   public void l(int var1) {
      Object[] var9;
      label31: {
         int var10001;
         label34: {
            String[] var2 = s$arrString();
            Object var3 = 417119238929760524L;
            var10001 = ((ArrayList)Ref.g(417119238929760524L, var3)).size();
            AM var10002 = 1;
            if (var2 == null) {
               if (var10001 <= 1) {
                  return;
               }

               var10001 = var1;
               if (var2 != null) {
                  break label34;
               }

               var10002 = this;
               Object var5 = 417119238929760524L;
               int var10003 = ((ArrayList)Ref.g(417119238929760524L, var5)).size() - 1;
            }

            if (!(var10001 > var10002)) {
               break label31;
            }

            var10001 = 0;
         }

         var1 = var10001;
      }

      Object var7 = 417119238929760524L;
      Object[] var12 = Registry.packArgs((T32)((ArrayList)Ref.g(417119238929760524L, var7)).get(var1));
      long var10 = 176011466134249595L;
      var9 = var12;
      Ref.h(176011466134249595L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   public void X(T32 var1) {
      long var11;
      Object[] var27;
      long var9;
      String[] var2 = s$arrString();
      Object var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return;
         }

         var10000 = this;
         Object var4 = 425434110105144335L;
         T32 var10001 = (T32)Ref.g(425434110105144335L, var4);
      }

      if (var2 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = this;
         Object var6 = 425434110105144335L;
         T32 var26 = (T32)Ref.g(425434110105144335L, var6);
      }

      var10000 = var10000.equals(var1);
      if (var2 != null) {
         T32 var3 = (T32)var10000;
         if (var3 == Registry.lookupField(133320001629591502L).getInt(this)) {
         }

         Registry.lookupField(133320001629591502L).setInt(this, (int)var3);
         Object[] var29 = Registry.packArgs(true);
         var11 = 330506269608966297L;
         Object[] var10 = var29;
         Ref.h(330506269608966297L, var10, var11);

         try {
            ;
         } catch (InvocationTargetException var23) {
            throw var23.getTargetException();
         }

         Object[] var10002 = Registry.emptyArgs();
         long var13 = 176235325809488947L;
         Object[] var12 = var10002;
         Ref.h(176235325809488947L, var12, var13);

         try {
            ;
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }

         long var15 = 425434110105144335L;
         Ref.s(425434110105144335L, var1, var15);
         Object[] var10004 = Registry.packArgs(var1);
         long var17 = 397047287828875528L;
         Object[] var16 = var10004;
         Ref.h(397047287828875528L, var16, var17);

         try {
            ;
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         this.validate();
         this.repaint();
         Object[] var10005 = Registry.packArgs(var1);
         long var19 = 372107610519867932L;
         Object[] var18 = var10005;
         Ref.h(372107610519867932L, var18, var19);

         try {
            ;
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }
      } else if (var10000 == null) {
         Registry.lookupField(501692309218203508L).setBoolean(this, true);
         var10000 = var1;
         var27 = Registry.emptyArgs();
         var9 = 328118709254946779L;
         Object[] var8 = var27;
         var27 = Ref.h(328118709254946779L, var8, var9);

         label53:
         try {
            break label53;
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }
      }
   }

   public void T(T32 var1) {
      Y9 var2 = new Y9(var1, Registry.lookupField(141500763651848578L).getInt(null));
      Object[] var10001 = Registry.packArgs(var2);
      long var4 = 484591085759846041L;
      Object[] var3 = var10001;
      Ref.h(484591085759846041L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void h(T32 var1) {
      Object[] var11;
      Object[] var7;
      Object[] var9;
      s$arrString();
      Object var5 = 417119238929760524L;
      Iterator var3 = ((ArrayList)Ref.g(417119238929760524L, var5)).iterator();
      AM var2 = this;

      while (var3.hasNext()) {
         label77: {
            T32 var4 = (T32)var3.next();
            if (var2 == null) {
               if (!var4.equals(var1)) {
                  Object[] var10002 = Registry.packArgs(false);
                  long var8 = 330506269608966297L;
                  var7 = var10002;
                  Ref.h(330506269608966297L, var7, var8);

                  try {
                     ;
                  } catch (InvocationTargetException var29) {
                     throw var29.getTargetException();
                  }

                  Object[] var10003 = Registry.emptyArgs();
                  long var10 = 584096728105558414L;
                  var9 = var10003;
                  Ref.h(584096728105558414L, var9, var10);
                  Object[] var10004 = Registry.emptyArgs();
                  long var12 = 467250021884313480L;
                  var11 = var10004;
                  Ref.h(467250021884313480L, var11, var12);

                  try {
                     ;
                  } catch (InvocationTargetException var28) {
                     throw var28.getTargetException();
                  }

                  if (var2 == null) {
                     break label77;
                  }
               }

               Object[] var30 = Registry.packArgs(true);
               long var14 = 330506269608966297L;
               Object[] var13 = var30;
               Ref.h(330506269608966297L, var13, var14);

               try {
                  ;
               } catch (InvocationTargetException var27) {
                  throw var27.getTargetException();
               }
            }

            Object[] var31 = Registry.emptyArgs();
            long var16 = 584096728105558414L;
            Object[] var15 = var31;
            Ref.h(584096728105558414L, var15, var16);
            Object[] var32 = Registry.emptyArgs();
            long var18 = 467250021884313480L;
            Object[] var17 = var32;
            Ref.h(467250021884313480L, var17, var18);

            try {
               ;
            } catch (InvocationTargetException var26) {
               throw var26.getTargetException();
            }

            Object var19 = 426406158494779427L;
            Ref.g(426406158494779427L, var19);
            Object[] var10006 = Registry.emptyArgs();
            long var22 = 424156930953488367L;
            Object[] var21 = var10006;
            var10006 = Registry.packArgs(Ref.h(424156930953488367L, var21, var22));
            long var24 = 597359146714455209L;
            Object[] var23 = var10006;
            Ref.h(597359146714455209L, var23, var24);

            try {
               ;
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void u$void() {
      long var11;
      long var7;
      long var9;
      s$arrString();
      Object var4 = 417119238929760524L;
      Iterator var2 = ((ArrayList)Ref.g(417119238929760524L, var4)).iterator();
      AM var1 = this;

      while (var2.hasNext()) {
         T32 var3 = (T32)var2.next();
         Object[] var10002 = Registry.packArgs(false);
         var7 = 330506269608966297L;
         Object[] var6 = var10002;
         Ref.h(330506269608966297L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }

         Object[] var10003 = Registry.emptyArgs();
         var9 = 584096728105558414L;
         Object[] var8 = var10003;
         Ref.h(584096728105558414L, var8, var9);
         Object[] var10004 = Registry.emptyArgs();
         var11 = 467250021884313480L;
         Object[] var10 = var10004;
         Ref.h(467250021884313480L, var10, var11);

         try {
            ;
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }

         Object[] var10005 = Registry.emptyArgs();
         long var13 = 176235325809488947L;
         Object[] var12 = var10005;
         Ref.h(176235325809488947L, var12, var13);

         try {
            ;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public void e(T32 var1, int var2, int var3) {
      Object[] var11;
      long var20;
      long var36;
      Object[] var37;
      long var42;
      Object[] var43;
      Object[] var45;
      Integer var64;
      s$arrString();
      Object[] var10003 = Registry.emptyArgs();
      long var12 = 584096728105558414L;
      var11 = var10003;
      var10003 = Ref.h(584096728105558414L, var11, var12);
      long var14 = 199288150985905138L;
      Object var13 = var10003;
      Ref.s(199288150985905138L, var13, var14);
      Object var15 = 199288150985905138L;
      this.add((Bq2)Ref.g(199288150985905138L, var15), (int)var3);
      AM var4 = this;
      Object var17 = 199288150985905138L;
      Ref.g(199288150985905138L, var17);
      Object[] var10005 = Registry.emptyArgs();
      var20 = 168016210297284127L;
      Object[] var19 = var10005;
      Ref.h(168016210297284127L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var55) {
         throw var55.getTargetException();
      }

      Component[] var5 = this.getComponents();
      Component[] var6 = var5;
      int var7 = var5.length;
      int var8 = 0;

      while (true) {
         if (var8 < var7) {
            Component var9 = var6[var8];
            if (var4 == null) {
               var10005 = var9;
               Object var21 = 199288150985905138L;
               boolean var10006 = this.equals((Bq2)Ref.g(199288150985905138L, var21));
               if (var4 != null) {
                  break;
               }

               label109:
               if (!var10006) {
                  Component var60 = var9;
                  if (var4 == null) {
                     if (!var9.getClass().equals(Bq2.class)) {
                        break label109;
                     }

                     var60 = var9;
                  }

                  Bq2 var10 = (Bq2)var60;
                  Object[] var10007 = Registry.emptyArgs();
                  long var24 = 467250021884313480L;
                  Object[] var23 = var10007;
                  Ref.h(467250021884313480L, var23, var24);

                  try {
                     ;
                  } catch (InvocationTargetException var54) {
                     throw var54.getTargetException();
                  }
               }

               var8++;
            }

            if (var4 == null) {
               continue;
            }
         }

         var10005 = (Object[])var3;
         break;
      }

      Component var56 = var10005;
      Object var25 = 490595310560876529L;
      JComponent var61 = (JComponent)Ref.g(490595310560876529L, var25);
      if (var4 == null) {
         if (var61 != null) {
            var56--;
         }

         Object var27 = 417119238929760524L;
         ArrayList var62 = (ArrayList)Ref.g(417119238929760524L, var27);
         Object var10009 = Registry.emptyArgs();
         long var30 = 328118709254946779L;
         Object var29 = var10009;
         var10009 = Ref.h(328118709254946779L, var29, var30);

         try {
            var64 = (Integer)var10009;
         } catch (InvocationTargetException var53) {
            throw var53.getTargetException();
         }

         var1.remove(var64);
      }

      Object var31 = 417119238929760524L;
      ((ArrayList)Ref.g(417119238929760524L, var31)).add((int)var56, var1);
      Registry.lookupField(133320001629591502L).setInt(this, (int)var56);
      long var34 = 425434110105144335L;
      Ref.s(425434110105144335L, var1, var34);
      Object[] var65 = Registry.emptyArgs();
      var36 = 246765627653456113L;
      Object[] var35 = var65;
      Ref.h(246765627653456113L, var35, var36);

      try {
         ;
      } catch (InvocationTargetException var52) {
         throw var52.getTargetException();
      }

      Object[] var10010 = Registry.emptyArgs();
      long var38 = 487819805049017899L;
      var37 = var10010;
      Ref.h(487819805049017899L, var37, var38);

      try {
         ;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      Y9 var57 = new Y9(var1, Registry.lookupField(527075857672909373L).getInt(null));
      Object[] var10011 = Registry.packArgs(var2);
      long var40 = 572246038895817982L;
      Object[] var39 = var10011;
      Ref.h(572246038895817982L, var39, var40);

      try {
         ;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      Object[] var10012 = Registry.packArgs((int)var3);
      var42 = 400022735440161010L;
      Object[] var41 = var10012;
      Ref.h(400022735440161010L, var41, var42);

      try {
         ;
      } catch (InvocationTargetException var49) {
         throw var49.getTargetException();
      }

      Object[] var10013 = Registry.packArgs((int)var56);
      long var44 = 456834232298630458L;
      var43 = var10013;
      Ref.h(456834232298630458L, var43, var44);

      try {
         ;
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      Object[] var10014 = Registry.packArgs(var57);
      long var46 = 484591085759846041L;
      var45 = var10014;
      Ref.h(484591085759846041L, var45, var46);

      try {
         ;
      } catch (InvocationTargetException var47) {
         throw var47.getTargetException();
      }
   }

   public void B() {
      this.doLayout();
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new GE(this));
      long var2 = 434592463220957006L;
      Object[] var1 = var10001;
      Ref.h(434592463220957006L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void U() {
      Object[] var7;
      Object[] var9;
      String[] var10000 = s$arrString();
      int var2 = 0;
      String[] var1 = var10000;

      do {
         Object var3 = 417119238929760524L;
         if (!(this < ((ArrayList)Ref.g(417119238929760524L, var3)).size())) {
            break;
         }

         Object var5 = 417119238929760524L;
         T32 var10002 = (T32)((ArrayList)Ref.g(417119238929760524L, var5)).get(var2);
         Object[] var10003 = Registry.emptyArgs();
         long var8 = 584096728105558414L;
         var7 = var10003;
         Ref.h(584096728105558414L, var7, var8);
         Object[] var10004 = Registry.emptyArgs();
         long var10 = 467250021884313480L;
         var9 = var10004;
         Ref.h(467250021884313480L, var9, var10);

         try {
            ;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         var2++;
      } while (var1 == null);
   }

   public void R() {
      long var11;
      long var9;
      String[] var10000 = s$arrString();
      int var2 = 0;
      String[] var1 = var10000;

      do {
         Object var4 = 417119238929760524L;
         if (!(this < ((ArrayList)Ref.g(417119238929760524L, var4)).size())) {
            break;
         }

         Object var6 = 417119238929760524L;
         T32 var3 = (T32)((ArrayList)Ref.g(417119238929760524L, var6)).get(var2);
         Object[] var10003 = Registry.packArgs(var2);
         var9 = 599989240986758347L;
         Object[] var8 = var10003;
         Ref.h(599989240986758347L, var8, var9);

         try {
            ;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         Object[] var10004 = Registry.packArgs(var2 + 1);
         var11 = 243679155515376706L;
         Object[] var10 = var10004;
         Ref.h(243679155515376706L, var10, var11);

         try {
            ;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         Object[] var10005 = Registry.emptyArgs();
         long var13 = 584096728105558414L;
         Object[] var12 = var10005;
         Ref.h(584096728105558414L, var12, var13);
         Object[] var10006 = Registry.packArgs(var3);
         long var15 = 379860037679905473L;
         Object[] var14 = var10006;
         Ref.h(379860037679905473L, var14, var15);

         try {
            ;
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }

         var2++;
      } while (var1 == null);
   }

   public int X(Component var1) {
      int var7;
      int var9;
      int var3 = 0;
      Component[] var4 = this.getComponents();
      String[] var10000 = s$arrString();
      Component[] var5 = var4;
      String[] var2 = var10000;
      int var6 = var4.length;
      var7 = 0;

      while (true) {
         label24:
         if (var7 < var6) {
            Component var8 = var5[var7];
            if (var2 == null) {
               var9 = var8.equals(var1);
               if (var2 != null) {
                  break;
               }

               if (var9 != 0 && var2 == null) {
                  break label24;
               }

               var3++;
               var7++;
            }

            if (var2 == null) {
               continue;
            }
         }

         var9 = var3;
         break;
      }

      return var9;
   }

   public void K(T32 var1) {
      Object var10002 = Registry.emptyArgs();
      long var3 = 584096728105558414L;
      Object var2 = var10002;
      var10002 = Ref.h(584096728105558414L, var2, var3);

      try {
         var10002 = (Bq2)var10002;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var1.remove(var10002);
      this.doLayout();
      this.repaint();
   }

   public void Q(T32 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var3 = 584096728105558414L;
      Object[] var2 = var10001;
      Ref.h(584096728105558414L, var2, var3);
      Object[] var10002 = Registry.packArgs(var1);
      long var5 = 379860037679905473L;
      Object[] var4 = var10002;
      Ref.h(379860037679905473L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      this.doLayout();
      this.repaint();
   }

   public static void P(Bq2 var0, Point var1, AM var2) {
      boolean var11;
      Object[] var7;
      String[] var10000 = s$arrString();
      new Point();
      SwingUtilities.convertPointFromScreen(var1, var2);
      String[] var3 = var10000;
      boolean var5 = true;
      Registry.lookupField(609684993151237253L).get(null);
      Object var10001 = Registry.emptyArgs();
      long var8 = 400084338690857485L;
      var7 = var10001;
      var10001 = Ref.h(400084338690857485L, var7, var8);

      try {
         var11 = (Boolean)var10001;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      label21: {
         if (var3 == null) {
            if (!var11) {
               break label21;
            }

            var11 = true;
         }

         var5 = var11;
      }

      Point var6 = MouseInfo.getPointerInfo().getLocation();
      var6.x = var6.x + a(19303, 7176326699541038488L);
      var6.y = var6.y + a(19303, 7176326699541038488L);
      ((DP)Registry.lookupField(349091698802351406L).get(null)).setLocation(var6);
      ((DP)Registry.lookupField(349091698802351406L).get(null)).setVisible(var5);
      ((TH3)Registry.lookupField(277670051994433027L).get(null)).setVisible(false);
   }

   public static int X(Bq2 var0, Point var1, AM var2, boolean var3) {
      Object[] var20;
      boolean var36;
      boolean var37;
      int var42;
      Integer var45;
      Integer var48;
      int var7;
      int var9;
      s$arrString();
      Point var5 = new Point();
      SwingUtilities.convertPointFromScreen(var1, var2);
      Component var6 = var2.getComponentAt(var1);
      Object var10002 = Registry.packArgs(var0);
      long var17 = 339397787032745950L;
      Object var16 = var10002;
      var10002 = Ref.h(339397787032745950L, var16, var17);

      try {
         var45 = (Integer)var10002;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      AM var4;
      byte var8;
      int var10;
      boolean var12;
      Component var10001;
      var7 = var45;
      var4 = var2;
      var8 = 4;
      var9 = 1;
      var10 = -1;
      Object var11 = null;
      var12 = false;
      var10001 = var6;
      label263:
      if (var2 == null) {
         if (var6 != null) {
            var10001 = var6;
            if (var2 != null) {
               break label263;
            }

            if (!var6.getClass().equals(Bq2.class)) {
               Point var13 = new Point();
               var13.y = (int)var1.getY();
               var13.x = (int)var1.getX();
               Component var14 = var6;

               label268: {
                  while (var13.getX() > 0.0) {
                     var36 = var14.getClass().equals(Bq2.class);
                     if (var4 != null || var4 != null) {
                        break label268;
                     }

                     if (var36) {
                        break;
                     }

                     var13.x--;
                     var14 = var2.getComponentAt(var13);
                     if (var4 != null) {
                        break;
                     }
                  }

                  var10001 = var14;
                  if (var4 != null) {
                     break label263;
                  }

                  var36 = var14.getClass().equals(Bq2.class);
               }

               if (var36) {
                  var12 = true;
                  var6 = var14;
               }
            }
         }

         var10001 = var6;
      }

      label238: {
         label270: {
            if (var4 == null) {
               if (var10001 == null) {
                  break label270;
               }

               var10001 = var6;
            }

            var37 = var10001.getClass().equals(Bq2.class);
            if (var4 != null) {
               break label238;
            }

            label231:
            if (!var37) {
               Point var29 = new Point();
               var29.y = (int)var1.getY();
               var29.x = (int)var1.getX();
               Component var33 = var6;

               label228: {
                  while (var29.getX() < (double)var2.getWidth()) {
                     var10001 = var33;
                     if (var4 != null) {
                        break label228;
                     }

                     var37 = var33.getClass().equals(Bq2.class);
                     if (var4 != null) {
                        break label238;
                     }

                     if (var37) {
                        break;
                     }

                     var29.x++;
                     var33 = var2.getComponentAt(var29);
                     if (var4 != null) {
                        break;
                     }
                  }

                  var10001 = var33;
               }

               if (var4 == null) {
                  if (var10001 == null) {
                     break label231;
                  }

                  var10001 = var33;
               }

               var37 = var10001.getClass().equals(Bq2.class);
               if (var4 != null) {
                  break label238;
               }

               if (var37) {
                  var12 = true;
                  var6 = var33;
               }
            }
         }

         var37 = var12;
      }

      if (!var37) {
      }

      label204: {
         label273: {
            var10001 = var6;
            if (var4 == null) {
               if (var6 == null) {
                  break label273;
               }

               var10001 = var6;
            }

            label274: {
               boolean var40 = var10001.getClass().equals(Bq2.class);
               if (var4 == null) {
                  if (var40) {
                     Bq2 var31 = (Bq2)var6;
                     var11 = SwingUtilities.convertPoint(var2, var1, var31);
                     var5.y = var31.getLocationOnScreen().y;
                     var5.x = var31.getLocationOnScreen().x;
                     var10002 = Registry.packArgs(var31);
                     long var19 = 339397787032745950L;
                     Object var18 = var10002;
                     var10002 = Ref.h(339397787032745950L, var18, var19);

                     try {
                        var48 = (Integer)var10002;
                     } catch (InvocationTargetException var26) {
                        throw var26.getTargetException();
                     }

                     label184: {
                        var10 = var48;
                        Point var49 = (Point)var11;
                        if (var4 == null) {
                           if (((Point)var11).x > var31.getWidth() / 2) {
                              var5.x = var5.x + var31.getWidth() + var8 / 2;
                              var10++;
                              if (var4 == null) {
                                 break label184;
                              }
                           }

                           var49 = var5;
                        }

                        var49.x -= var8 / 2;
                     }

                     var5.x--;
                     if (var7 == var10) {
                     }

                     int var50 = var7 + 1;
                     if (var4 == null) {
                        if (var50 != var10) {
                           break label204;
                        }

                        var50 = 0;
                     }

                     var9 = var50;
                     break label204;
                  }

                  var10001 = var6;
                  if (var4 != null) {
                     break label274;
                  }

                  var40 = var6.getClass().equals(AM.class);
               }

               if (!var40) {
                  break label204;
               }

               var10001 = var6;
            }

            AM var30 = (AM)var10001;
            var9 = 0;
            if (var4 == null) {
               break label204;
            }
         }

         var9 = 0;
      }

      label171: {
         label277: {
            if (var4 == null) {
               var10002 = Registry.emptyArgs();
               long var21 = 493414787501530871L;
               var20 = var10002;
               var10002 = Ref.h(493414787501530871L, var20, var21);

               try {
                  var10002 = (JScrollPane)var10002;
               } catch (InvocationTargetException var25) {
                  throw var25.getTargetException();
               }

               if (var10002 == null) {
                  break label277;
               }
            }

            Rectangle var32 = var2.getBounds();
            var42 = var1.y;
            if (var4 == null) {
               Object var10003 = Registry.emptyArgs();
               long var23 = 493414787501530871L;
               Object var22 = var10003;
               var10003 = Ref.h(493414787501530871L, var22, var23);

               try {
                  var10003 = (JScrollPane)var10003;
               } catch (InvocationTargetException var24) {
                  throw var24.getTargetException();
               }

               if (var2 > var10003.getHeight()) {
                  Rectangle var34 = new Rectangle(0, (int)var1.getY(), var2.getWidth(), 5);
                  var2.scrollRectToVisible(var34);
               }

               double var57;
               int var54 = (var57 = var32.getY() - 0.0) == 0.0 ? 0 : (var57 < 0.0 ? -1 : 1);
            }

            if (var4 != null) {
               break label171;
            }

            if (var1.y < 0) {
               int var35 = var32.y + var1.y;
               var42 = var35;
               if (var4 != null) {
                  break label171;
               }

               if (var35 < 0) {
                  Rectangle var15 = new Rectangle(var32.x, var1.y - 5, var2.getWidth(), 5);
                  var2.scrollRectToVisible(var15);
               }
            }
         }

         var42 = var9;
      }

      if (var42 != 0) {
      }

      label155: {
         label280: {
            var43 = var9;
            if (var4 == null) {
               if (var9 == 0) {
                  var10 = -1;
                  if (var4 == null) {
                     break label280;
                  }
               }

               var43 = var10 - var7;
            }

            if (var4 != null) {
               break label155;
            }

            if (var43 > 1) {
               var10--;
            }
         }

         double var58;
         var43 = (var58 = var5.getX() - 0.0) == 0.0 ? 0 : (var58 < 0.0 ? -1 : 1);
      }

      label144:
      if (var4 == null) {
         if (var43 > 0) {
            double var59;
            var43 = (var59 = var5.getY() - 0.0) == 0.0 ? 0 : (var59 < 0.0 ? -1 : 1);
            if (var4 != null) {
               break label144;
            }

            if (var43 > 0) {
               ((TH3)Registry.lookupField(277670051994433027L).get(null)).setLocation(var5);
               ((TH3)Registry.lookupField(277670051994433027L).get(null))
                  .setSize(((TH3)Registry.lookupField(277670051994433027L).get(null)).getWidth(), Registry.lookupField(388202870823471257L).getInt(var2) - 2);
            }
         }

         var43 = var3;
      }

      if (var4 == null) {
         if (var43 != 0) {
            ((TH3)Registry.lookupField(277670051994433027L).get(null)).setVisible(true);
         }

         ((DP)Registry.lookupField(349091698802351406L).get(null)).setVisible(false);
         var43 = var10;
      }

      return var43;
   }

   public Bq2 y(T32 var1, AM var2, boolean var3, boolean var4) {
      return new Bq2(
         var1,
         var2,
         Registry.lookupField(579186049990057769L).getBoolean(this),
         Registry.lookupField(578351821085462234L).getBoolean(this),
         var3,
         Registry.lookupField(388202870823471257L).getInt(this),
         var4
      );
   }

   public TH3 L$tH_3() {
      return (TH3)Registry.lookupField(277670051994433027L).get(null);
   }

   public void W(TH3 var1) {
      Registry.lookupField(277670051994433027L).set(null, var1);
   }

   public JScrollPane O$JScrollPane() {
      Object var1 = 450702155502063918L;
      return (JScrollPane)Ref.g(450702155502063918L, var1);
   }

   public void x(JScrollPane var1) {
      long var3 = 450702155502063918L;
      Ref.s(450702155502063918L, var1, var3);
   }

   public Bq2 a$Bq_2() {
      Object var1 = 199288150985905138L;
      return (Bq2)Ref.g(199288150985905138L, var1);
   }

   public void J(Bq2 var1) {
      long var3 = 199288150985905138L;
      Ref.s(199288150985905138L, var1, var3);
   }

   public Ge2 v() {
      Object var1 = 426406158494779427L;
      return (Ge2)Ref.g(426406158494779427L, var1);
   }

   public void a(Ge2 var1) {
      long var3 = 426406158494779427L;
      Ref.s(426406158494779427L, var1, var3);
   }

   public ArrayList g() {
      Object var1 = 417119238929760524L;
      return (ArrayList)Ref.g(417119238929760524L, var1);
   }

   public void e(ArrayList var1) {
      long var3 = 417119238929760524L;
      Ref.s(417119238929760524L, var1, var3);
   }

   public Thread W() {
      Object var1 = 354167307306446936L;
      return (Thread)Ref.g(354167307306446936L, var1);
   }

   public void M(Thread var1) {
      long var3 = 354167307306446936L;
      Ref.s(354167307306446936L, var1, var3);
   }

   public boolean J() {
      return Registry.lookupField(579186049990057769L).getBoolean(this);
   }

   public void N(boolean var1) {
      label23: {
         String[] var2 = s$arrString();
         AM var10000 = this;
         int var10001 = var1;
         if (var2 == null) {
            Registry.lookupField(579186049990057769L).setBoolean(this, (boolean)var1);
            if (var1 != 0) {
               Registry.lookupField(388202870823471257L).setInt(this, a(7865, 4720692661393674316L));
               if (var2 == null) {
                  break label23;
               }
            }

            var10000 = this;
            var10001 = a(12773, 523748926135369501L);
         }

         Registry.lookupField(388202870823471257L).setInt(var10000, var10001);
      }

      Object[] var6 = Registry.emptyArgs();
      long var4 = 360963743248144032L;
      Object[] var3 = var6;
      Ref.h(360963743248144032L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public T32 Q$t3_2() {
      Object var1 = 425434110105144335L;
      return (T32)Ref.g(425434110105144335L, var1);
   }

   public void j(T32 var1) {
      long var3 = 425434110105144335L;
      Ref.s(425434110105144335L, var1, var3);
   }

   public boolean C() {
      return Registry.lookupField(578351821085462234L).getBoolean(this);
   }

   public void H(boolean var1) {
      Registry.lookupField(578351821085462234L).setBoolean(this, var1);
      Object[] var10001 = Registry.emptyArgs();
      long var3 = 360963743248144032L;
      Object[] var2 = var10001;
      Ref.h(360963743248144032L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void f() {
      label24: {
         String[] var1 = s$arrString();
         AM var10000 = this;
         if (var1 == null) {
            if (Registry.lookupField(579186049990057769L).getBoolean(this)) {
               var10000 = this;
               if (var1 == null) {
                  if (!Registry.lookupField(578351821085462234L).getBoolean(this)) {
                     ((TH3)Registry.lookupField(277670051994433027L).get(null))
                        .setSize(((TH3)Registry.lookupField(277670051994433027L).get(null)).getWidth(), a(30295, 4342977418755356845L));
                     Registry.lookupField(374786476283896993L).setInt(this, 1);
                     Registry.lookupField(627149169115132345L).setInt(this, 1);
                     if (var1 == null) {
                        break label24;
                     }
                  }

                  Registry.lookupField(374786476283896993L).setInt(this, 1);
                  var10000 = this;
               }

               Registry.lookupField(627149169115132345L).setInt(var10000, 1);
               ((TH3)Registry.lookupField(277670051994433027L).get(null))
                  .setSize(((TH3)Registry.lookupField(277670051994433027L).get(null)).getWidth(), a(8979, 3211277763751833056L));
               if (var1 == null) {
                  break label24;
               }
            }

            Registry.lookupField(374786476283896993L).setInt(this, a(25600, 4680497975577783025L));
            var10000 = this;
         }

         Registry.lookupField(627149169115132345L).setInt(var10000, a(21971, 1226775875533445935L));
      }

      Object var2 = 158219876422589484L;
      ((FlowLayout)Ref.g(158219876422589484L, var2)).setHgap(Registry.lookupField(374786476283896993L).getInt(this));
      Object var4 = 158219876422589484L;
      ((FlowLayout)Ref.g(158219876422589484L, var4)).setVgap(Registry.lookupField(627149169115132345L).getInt(this));
   }

   public boolean K() {
      return Registry.lookupField(501692309218203508L).getBoolean(this);
   }

   public void k(boolean var1) {
      Registry.lookupField(501692309218203508L).setBoolean(this, var1);
   }

   public boolean P$boolean() {
      return Registry.lookupField(366002109126035603L).getBoolean(this);
   }

   public void s(boolean var1) {
      Registry.lookupField(366002109126035603L).setBoolean(this, var1);
   }

   public boolean A() {
      return Registry.lookupField(225352561188908423L).getBoolean(this);
   }

   public void Y(boolean var1) {
      Registry.lookupField(225352561188908423L).setBoolean(this, var1);
   }

   public boolean q$boolean() {
      return Registry.lookupField(394476637101936438L).getBoolean(this);
   }

   public void a(boolean var1) {
      Registry.lookupField(394476637101936438L).setBoolean(this, var1);
   }

   public boolean p() {
      return Registry.lookupField(423830768464519912L).getBoolean(this);
   }

   public void i(boolean var1) {
      Registry.lookupField(423830768464519912L).setBoolean(this, var1);
   }

   public int Q$int() {
      return Registry.lookupField(388202870823471257L).getInt(this);
   }

   public void G(int var1) {
      Registry.lookupField(388202870823471257L).setInt(this, var1);
   }

   public boolean l$boolean() {
      return Registry.lookupField(185183789069073378L).getBoolean(this);
   }

   public void f(boolean var1) {
      Registry.lookupField(185183789069073378L).setBoolean(this, var1);
   }

   public static Jc2 a$Jc_2() {
      return (Jc2)Registry.lookupField(609684993151237253L).get(null);
   }

   public static void v(Jc2 var0) {
      Registry.lookupField(609684993151237253L).set(null, var0);
   }

   public int z() {
      return Registry.lookupField(421709291189789904L).getInt(this);
   }

   public void s(int var1) {
      Registry.lookupField(421709291189789904L).setInt(this, var1);
   }

   public static DP q$DP() {
      return (DP)Registry.lookupField(349091698802351406L).get(null);
   }

   public static void T(DP var0) {
      Registry.lookupField(349091698802351406L).set(null, var0);
   }

   public com.finalshell.ui.frame.MainFrame G() {
      Object var1 = 393196773307370817L;
      return (com.finalshell.ui.frame.MainFrame)Ref.g(393196773307370817L, var1);
   }

   public void G(com.finalshell.ui.frame.MainFrame var1) {
      long var3 = 393196773307370817L;
      Ref.s(393196773307370817L, var1, var3);
   }

   public boolean E() {
      return Registry.lookupField(210447995261764859L).getBoolean(this);
   }

   public void J(boolean var1) {
      Registry.lookupField(210447995261764859L).setBoolean(this, var1);
   }

   public CommandListPanel u$CW() {
      Object var1 = 273587631854201597L;
      return (CommandListPanel)Ref.g(273587631854201597L, var1);
   }

   public void y(CommandListPanel var1) {
      long var3 = 273587631854201597L;
      Ref.s(273587631854201597L, var1, var3);
   }

   public boolean m$boolean() {
      return Registry.lookupField(631781646741322975L).getBoolean(this);
   }

   public void d(boolean var1) {
      Registry.lookupField(631781646741322975L).setBoolean(this, var1);
   }

   public boolean O$boolean() {
      return Registry.lookupField(291528700222910706L).getBoolean(this);
   }

   public void m(boolean var1) {
      Registry.lookupField(291528700222910706L).setBoolean(this, var1);
   }

   public FlowLayout P$FlowLayout() {
      Object var1 = 158219876422589484L;
      return (FlowLayout)Ref.g(158219876422589484L, var1);
   }

   public void O(FlowLayout var1) {
      long var3 = 158219876422589484L;
      Ref.s(158219876422589484L, var1, var3);
   }

   public boolean j$boolean() {
      return Registry.lookupField(196077290577414286L).getBoolean(this);
   }

   public void M(boolean var1) {
      Registry.lookupField(196077290577414286L).setBoolean(this, var1);
   }

   public void O$void() {
      long var20;
      long var36;
      long var2 = 142536030060271800L;
      Object var1 = null;
      Ref.s(142536030060271800L, var1, var2);
      long var4 = 426406158494779427L;
      Object var3 = null;
      Ref.s(426406158494779427L, var3, var4);
      long var6 = 450702155502063918L;
      Object var5 = null;
      Ref.s(450702155502063918L, var5, var6);
      long var8 = 199288150985905138L;
      Object var7 = null;
      Ref.s(199288150985905138L, var7, var8);
      long var10 = 417119238929760524L;
      Object var9 = null;
      Ref.s(417119238929760524L, var9, var10);
      long var12 = 425434110105144335L;
      Object var11 = null;
      Ref.s(425434110105144335L, var11, var12);
      long var14 = 205853402005133202L;
      Object var13 = null;
      Ref.s(205853402005133202L, var13, var14);
      long var16 = 502036721265141438L;
      Object var15 = null;
      Ref.s(502036721265141438L, var15, var16);
      long var18 = 158219876422589484L;
      Object var17 = null;
      Ref.s(158219876422589484L, var17, var18);
      var20 = 497629741148939873L;
      Object var19 = null;
      Ref.s(497629741148939873L, var19, var20);
      long var22 = 354167307306446936L;
      Object var21 = null;
      Ref.s(354167307306446936L, var21, var22);
      long var24 = 490595310560876529L;
      Object var23 = null;
      Ref.s(490595310560876529L, var23, var24);
      long var26 = 533332121992851488L;
      Object var25 = null;
      Ref.s(533332121992851488L, var25, var26);
      long var28 = 533669572411198848L;
      Object var27 = null;
      Ref.s(533669572411198848L, var27, var28);
      long var30 = 393196773307370817L;
      Object var29 = null;
      Ref.s(393196773307370817L, var29, var30);
      long var32 = 273587631854201597L;
      Object var31 = null;
      Ref.s(273587631854201597L, var31, var32);
      long var34 = 586874291471114490L;
      Object var33 = null;
      Ref.s(586874291471114490L, var33, var34);
      var36 = 576105615503981375L;
      Object var35 = null;
      Ref.s(576105615503981375L, var35, var36);
   }

   public boolean L$boolean() {
      return Registry.lookupField(342832808241187441L).getBoolean(this);
   }

   public void j(boolean var1) {
      Registry.lookupField(342832808241187441L).setBoolean(this, var1);
   }

   public void L$void() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new DK(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   public static void F(String[] var0) {
      N = var0;
   }

   public static String[] s$arrString() {
      return N;
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20222;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }

   public static void __vfClinit__() {
      byte[] var7;
      long var0 = 4657551212789948911L;
      long[] var6 = new long[19];
      F(null);
      int var3 = 0;
      String var4 = "øÁ¿\u0084'_+7\u009f\u007fBx?Ãd}#\u001a\u007f_\u0001¸zÂú\u000fÖäú;®bQ+\u0019\nqüYW\u000fÃ\u0086;\u001dÓJÌRVÞm,B\u009eé[\u00ad\u0004Ï¿ç^\u008fÐ\u0015O@2O;\u001e\u0096ð\u007fSÃ(0Ø.IÒ'j\u009b\u000b\u0086Ì#>ía¡1µ)Û\u001b\u008c\u00820®÷är÷è\u0016\u0001\f\u001bI´ÄKw\u0001¿\u0011\"Y&èÿ·K\u001a\u000eÍ\u0001\u0099òÒ¶\n";
      int var5 = "øÁ¿\u0084'_+7\u009f\u007fBx?Ãd}#\u001a\u007f_\u0001¸zÂú\u000fÖäú;®bQ+\u0019\nqüYW\u000fÃ\u0086;\u001dÓJÌRVÞm,B\u009eé[\u00ad\u0004Ï¿ç^\u008fÐ\u0015O@2O;\u001e\u0096ð\u007fSÃ(0Ø.IÒ'j\u009b\u000b\u0086Ì#>ía¡1µ)Û\u001b\u008c\u00820®÷är÷è\u0016\u0001\f\u001bI´ÄKw\u0001¿\u0011\"Y&èÿ·K\u001a\u000eÍ\u0001\u0099òÒ¶\n"
         .length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     d = var6;
                     e = new Integer[19];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "þØé\u0005<\u008eVß\u0084J\u000bY\u008aÌ7û";
                  var5 = "þØé\u0005<\u008eVß\u0084J\u000bY\u008aÌ7û".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }
}





