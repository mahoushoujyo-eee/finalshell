import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class aM extends JPanel {
   aM v;
   ge_2 W;
   static tH_3 g;
   static DP t;
   JScrollPane F;
   Bq_2 i;
   ArrayList c;
   int a;
   t3_2 E;
   JPanel h;
   ArrayList M;
   int X;
   int I;
   FlowLayout p;
   nY V;
   Thread q;
   boolean Y;
   boolean k;
   boolean b;
   boolean G;
   boolean S;
   boolean R;
   boolean l;
   int K;
   boolean f;
   JComponent m;
   JComponent n;
   HashMap A;
   static Jc_2 T;
   int y;
   U j;
   boolean s;
   CW B;
   boolean U;
   boolean C;
   boolean O;
   boolean P;
   Color u;
   Color Q;
   private static String[] N;
   private static final long[] d;
   private static final Integer[] e;

   public aM() {
      this(false);
   }

   public aM(boolean var1) {
      String[] var2;
      JFrame var3;
      label48: {
         super();
         com.c.c(199288150985905138L).set(this, null);
         com.c.c(417119238929760524L).set(this, new ArrayList());
         com.c.c(502036721265141438L).set(this, new ArrayList());
         com.c.c(374786476283896993L).setInt(this, a(4109, 216013914738614013L));
         String[] var10000 = s();
         com.c.c(627149169115132345L).setInt(this, a(488, 4670093833738407706L));
         com.c.c(579186049990057769L).setBoolean(this, false);
         com.c.c(578351821085462234L).setBoolean(this, false);
         com.c.c(501692309218203508L).setBoolean(this, false);
         com.c.c(366002109126035603L).setBoolean(this, true);
         com.c.c(225352561188908423L).setBoolean(this, true);
         com.c.c(394476637101936438L).setBoolean(this, true);
         com.c.c(423830768464519912L).setBoolean(this, false);
         com.c.c(388202870823471257L).setInt(this, a(31172, 2406642350534604587L));
         com.c.c(185183789069073378L).setBoolean(this, true);
         com.c.c(533669572411198848L).set(this, new HashMap());
         var2 = var10000;
         com.c.c(421709291189789904L).setInt(this, -1);
         com.c.c(210447995261764859L).setBoolean(this, false);
         com.c.c(631781646741322975L).setBoolean(this, false);
         com.c.c(291528700222910706L).setBoolean(this, false);
         com.c.c(196077290577414286L).setBoolean(this, true);
         com.c.c(342832808241187441L).setBoolean(this, false);
         com.c.c(586874291471114490L).set(this, new Color(a(25872, 7805825191738321899L), a(440, 2468831384235626309L), a(440, 2468831384235626309L)));
         com.c.c(576105615503981375L)
            .set(this, new Color(a(9271, 5417176631180782275L), a(5293, 5772053881979132507L), a(5293, 5772053881979132507L), a(6180, 8806695532090414792L)));
         com.c.c(631781646741322975L).setBoolean(this, var1);
         com.c.c(142536030060271800L).set(this, this);
         var3 = (JFrame)SwingUtilities.getWindowAncestor(this);
         tH_3 var6 = (tH_3)com.c.c(277670051994433027L).get(null);
         if (var2 == null) {
            if (var6 != null) {
               break label48;
            }

            var6 = new tH_3(var3);
         }

         com.c.c(277670051994433027L).set(null, var6);
      }

      label42: {
         DP var7 = (DP)com.c.c(349091698802351406L).get(null);
         if (var2 == null) {
            if (var7 != null) {
               break label42;
            }

            var7 = new DP(var3);
         }

         com.c.c(349091698802351406L).set(null, var7);
      }

      this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      com.c.c(158219876422589484L).set(this, new FlowLayout(0));
      ((FlowLayout)com.c.c(158219876422589484L).get(this)).setVgap(com.c.c(374786476283896993L).getInt(this));
      ((FlowLayout)com.c.c(158219876422589484L).get(this)).setHgap(com.c.c(627149169115132345L).getInt(this));
      this.setLayout((FlowLayout)com.c.c(158219876422589484L).get(this));
      com.c.c(426406158494779427L).set(this, new ge_2());
      this.addComponentListener(new Vv_2(this));
      if (var2 == null) {
         if ((Jc_2)com.c.c(609684993151237253L).get(null) == null) {
            com.c.c(609684993151237253L).set(null, new Jc_2());
         }

         this.addMouseListener(new ft_4(this));
      }

      if (var1) {
         Object[] var8 = com.c.a("\uf067");
         Method var9 = com.c.d(378399160856121064L);
         Object[] var12 = var8;
         Object var11 = null;

         try {
            var8 = (C_)var9.invoke(var11, var12);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         C_ var4 = var8;
         var4.setFont((Font)com.c.c(334953030171430953L).get(null));
         var4.setMargin(new Insets(0, 2, 1, a(1068, 4921128532049382098L)));
         com.c.c(533332121992851488L).set(this, var4);
         this.add((JComponent)com.c.c(533332121992851488L).get(this));
         var4.addActionListener(new TW(this));
         var4.addMouseListener(new Uz_2(this, var4));
      }

      if (com.ky_4.F() != null) {
         F(new String[5]);
      }
   }

   public void y() {
      String[] var10000 = s();
      Iterator var2 = ((HashMap)com.c.c(533669572411198848L).get(this)).keySet().iterator();
      String[] var1 = var10000;

      while (true) {
         if (var2.hasNext()) {
            t3_2 var3 = (t3_2)((HashMap)com.c.c(533669572411198848L).get(this)).get(var2.next());
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(414457989140731651L);
            Object[] var10002 = var10001;
            t3_2 var11 = var3;
            Method var7 = var10003;

            try {
               var7.invoke(var11, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         ((HashMap)com.c.c(533669572411198848L).get(this)).clear();
         Object[] var8 = com.c.a(this);
         Method var9 = com.c.d(242617331513341262L);
         Object[] var17 = var8;
         Object var13 = null;

         try {
            var9.invoke(var13, var17);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var13 = com.c.f();
         Method var19 = com.c.d(335828355375361477L);
         var17 = (Object[])var13;
         var13 = this;
         Method var10 = var19;

         try {
            var10.invoke(var13, var17);
            break;
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }

   public t3_2 x(int var1) {
      return var1 <= ((ArrayList)com.c.c(417119238929760524L).get(this)).size()
         ? (t3_2)((ArrayList)com.c.c(417119238929760524L).get(this)).get(var1 - 1)
         : null;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      String[] var2;
      int var10;
      label40: {
         super.paintComponent(var1);
         String[] var10000 = s();
         Graphics2D var3 = (Graphics2D)var1;
         var2 = var10000;
         Color var4 = (Color)com.c.c(586874291471114490L).get(this);
         if (var2 == null) {
            if ((aM)com.c.c(142536030060271800L).get(this) != null) {
               Object var7 = com.c.c(142536030060271800L).get(this);
               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(230171768324088030L);
               Object[] var10002 = var10001;
               var10001 = (Object[])var7;
               Method var8 = var10003;

               try {
                  var9 = (ArrayList)var8.invoke(var10001, var10002);
               } catch (InvocationTargetException var6) {
                  throw var6.getTargetException();
               }

               var10 = var9.size();
               if (var2 != null) {
                  break label40;
               }

               if (var10 > 0) {
                  var4 = (Color)com.c.c(576105615503981375L).get(this);
               }
            }

            var1.setColor(var4);
         }

         var10 = 1;
      }

      int var5 = var10;
      boolean var11 = com.c.c(579186049990057769L).getBoolean(this);
      if (var2 == null) {
         if (var11) {
            var5 = 0;
         }

         var11 = com.c.c(196077290577414286L).getBoolean(this);
      }

      if (var11) {
         var1.drawLine(0, this.getHeight() - var5, this.getWidth(), this.getHeight() - var5);
      }
   }

   public JComponent o() {
      return (JComponent)com.c.c(490595310560876529L).get(this);
   }

   public void q(JComponent var1) {
      com.c.c(490595310560876529L).set(this, var1);
      this.add(var1, 0);
   }

   public void i() {
      String[] var10000 = s();
      Method var10001 = (Method)com.c.c(277670051994433027L).get(null);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(163672173046701219L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      String[] var1 = var10000;
      var10000 = (String[])com.c.c(349091698802351406L).get(null);
      Object[] var14 = com.c.f();
      Method var34 = com.c.d(259007488175563915L);
      var10002 = var14;
      var10001 = var10000;
      Method var11 = var34;

      try {
         var11.invoke(var10001, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Iterator var2 = ((ArrayList)com.c.c(417119238929760524L).get(this)).iterator();

      while (true) {
         if (var2.hasNext()) {
            t3_2 var3 = (t3_2)var2.next();
            Object[] var16 = com.c.f();
            Method var35 = com.c.d(139482980886447442L);
            var10002 = var16;
            t3_2 var17 = var3;
            Method var12 = var35;

            try {
               var12.invoke(var17, var10002);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               continue;
            }
         }

         Object[] var18 = com.c.f();
         var10001 = com.c.d(270389152141252877L);
         var10003 = var18;
         var10002 = null;

         try {
            var10001 = (Method)var10001.invoke(var10002, var10003);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         var10002 = com.c.f();
         var10004 = com.c.d(399585344452154517L);
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10004;

         try {
            var10001 = (Method)var10001.invoke(var10002, var10003);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var10002 = com.c.f();
         var10004 = com.c.d(149968465491171480L);
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10004;

         try {
            var10001 = (Method)var10001.invoke(var10002, var10003);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         com.c.c(497629741148939873L).set(this, var10001);
         this.repaint();
         break;
      }
   }

   protected void P(Graphics var1) {
      if ((nY)com.c.c(497629741148939873L).get(this) != null) {
         Graphics2D var2 = (Graphics2D)var1;
         Method var10000 = (Method)com.c.c(497629741148939873L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(345089686683358688L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var9 = (Color)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         Color var4 = var9;
         Object[] var10 = com.c.a(var4);
         var10000 = com.c.d(430829682188014939L);
         var10002 = var10;
         var10001 = null;

         try {
            Color var12 = (Color)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         GradientPaint var13;
         Color var10004 = new Color(a(7991, 5906071494280139200L), a(29038, 9053128655859859351L), a(29038, 9053128655859859351L));
         float var10006 = (float)(this.getHeight() * 5);
         Method var10007 = (Method)com.c.c(497629741148939873L).get(this);
         Object[] var10008 = com.c.f();
         Method var10010 = com.c.d(345089686683358688L);
         Object[] var10009 = var10008;
         var10008 = var10007;
         var10007 = var10010;

         try {
            var20 = (Color)var10007.invoke(var10008, var10009);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var13 = new GradientPaint(0.0F, 0.0F, var10004, 0.0F, var10006, var20);
         GradientPaint var3 = var13;
         var2.setPaint(var3);
         var2.fillRect(0, 0, this.getWidth(), this.getHeight());
      }
   }

   public void h(Y9 var1) {
      String[] var10000 = s();
      Iterator var3 = ((ArrayList)com.c.c(502036721265141438L).get(this)).iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         aL var4 = (aL)var3.next();
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(147296966455368819L);
         Object[] var10002 = var10001;
         Y9 var20 = var1;
         Method var12 = var10003;

         try {
            var13 = (Integer)var12.invoke(var20, var10002);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         label108: {
            int var5 = var13;
            int var14 = var5;
            int var21 = com.c.c(307190072297206240L).getInt(null);
            if (var2 == null) {
               if (var5 == var21) {
                  var10001 = com.c.a(var1);
                  var10003 = com.c.d(212968630715837381L);
                  var10002 = var10001;
                  aL var23 = var4;
                  Method var15 = var10003;

                  try {
                     var15.invoke(var23, var10002);
                  } catch (InvocationTargetException var10) {
                     throw var10.getTargetException();
                  }

                  if (var2 == null) {
                     break label108;
                  }
               }

               var14 = var5;
               var21 = com.c.c(534616084670407665L).getInt(null);
            }

            if (var2 == null) {
               if (var14 == var21) {
                  var10001 = com.c.a(var1);
                  var10003 = com.c.d(422255114587411686L);
                  var10002 = var10001;
                  aL var25 = var4;
                  Method var16 = var10003;

                  try {
                     var16.invoke(var25, var10002);
                  } catch (InvocationTargetException var9) {
                     throw var9.getTargetException();
                  }

                  if (var2 == null) {
                     break label108;
                  }
               }

               var14 = var5;
               var21 = com.c.c(141500763651848578L).getInt(null);
            }

            if (var2 == null) {
               if (var14 == var21) {
                  var10001 = com.c.a(var1);
                  var10003 = com.c.d(411995691252881560L);
                  var10002 = var10001;
                  aL var27 = var4;
                  Method var17 = var10003;

                  try {
                     var17.invoke(var27, var10002);
                  } catch (InvocationTargetException var8) {
                     throw var8.getTargetException();
                  }

                  if (var2 == null) {
                     break label108;
                  }
               }

               var14 = var5;
               var21 = com.c.c(454291477903395804L).getInt(null);
            }

            if (var2 == null) {
               if (var14 == var21) {
                  var10001 = com.c.a(var1);
                  var10003 = com.c.d(194573996531258606L);
                  var10002 = var10001;
                  aL var29 = var4;
                  Method var18 = var10003;

                  try {
                     var18.invoke(var29, var10002);
                  } catch (InvocationTargetException var7) {
                     throw var7.getTargetException();
                  }

                  if (var2 == null) {
                     break label108;
                  }
               }

               var14 = var5;
               var21 = com.c.c(527075857672909373L).getInt(null);
            }

            if (var14 == var21) {
               var10001 = com.c.a(var1);
               var10003 = com.c.d(433835034885219625L);
               var10002 = var10001;
               aL var31 = var4;
               Method var19 = var10003;

               try {
                  var19.invoke(var31, var10002);
               } catch (InvocationTargetException var6) {
                  throw var6.getTargetException();
               }
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void c(aL var1) {
      ((ArrayList)com.c.c(502036721265141438L).get(this)).add(var1);
   }

   public void n(t3_2 var1) {
      ArrayList var3 = (ArrayList)((ArrayList)com.c.c(417119238929760524L).get(this)).clone();
      String[] var10000 = s();
      Iterator var4 = var3.iterator();
      String[] var2 = var10000;

      while (var4.hasNext()) {
         label42: {
            t3_2 var5 = (t3_2)var4.next();
            boolean var9 = var5.equals(var1);
            if (var2 == null) {
               if (var9) {
                  break label42;
               }

               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(584096728105558414L);
               Object[] var10002 = var10001;
               t3_2 var14 = var5;
               Method var10 = var10003;

               try {
                  var10000 = (String[])var10.invoke(var14, var10002);
               } catch (InvocationTargetException var8) {
                  throw var8.getTargetException();
               }

               var10001 = com.c.f();
               var10003 = com.c.d(589411218730404657L);
               var10002 = var10001;
               var10001 = var10000;
               Method var12 = var10003;

               try {
                  var9 = (Boolean)var12.invoke(var10001, var10002);
               } catch (InvocationTargetException var7) {
                  throw var7.getTargetException();
               }
            }

            if (var9) {
               Object[] var17 = com.c.a(var5);
               Method var22 = com.c.d(267026473738179692L);
               Object[] var20 = var17;
               aM var18 = this;
               Method var13 = var22;

               try {
                  var13.invoke(var18, var20);
               } catch (InvocationTargetException var6) {
                  throw var6.getTargetException();
               }
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void n(boolean var1) {
      String[] var10000 = s();
      byte var3 = 0;
      String[] var2 = var10000;
      if (com.c.c(631781646741322975L).getBoolean(this)) {
      }

      while (((ArrayList)com.c.c(417119238929760524L).get(this)).size() > var3) {
         t3_2 var4 = (t3_2)((ArrayList)com.c.c(417119238929760524L).get(this)).get(((ArrayList)com.c.c(417119238929760524L).get(this)).size() - 1 - var3);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(584096728105558414L);
         Object[] var10002 = var10001;
         t3_2 var13 = var4;
         Method var8 = var10003;

         try {
            var10000 = (String[])var8.invoke(var13, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(589411218730404657L);
         var10002 = var10001;
         var10001 = var10000;
         Method var10 = var10003;

         try {
            var11 = (Boolean)var10.invoke(var10001, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         if (var11) {
            boolean var21 = var1;
            if (var2 == null) {
               var21 = !var1;
            }

            var10001 = com.c.a(var4, false, var21);
            var10003 = com.c.d(456507190647444792L);
            var10002 = var10001;
            aM var17 = this;
            Method var12 = var10003;

            try {
               var12.invoke(var17, var10002);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void j() {
      Object[] var10001 = com.c.a(false);
      Method var10003 = com.c.d(328322194154687590L);
      Object[] var10002 = var10001;
      aM var2 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public void a(t3_2 var1) {
      Object[] var10001 = com.c.a(var1, false, false, false);
      Method var10003 = com.c.d(379470519563754551L);
      Object[] var10002 = var10001;
      aM var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void r(t3_2 var1) {
      Object[] var10001 = com.c.a(var1, false, false);
      Method var10003 = com.c.d(456507190647444792L);
      Object[] var10002 = var10001;
      aM var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void l() {
      Object[] var10001 = com.c.a(((ArrayList)com.c.c(417119238929760524L).get(this)).size() - 1);
      Method var10003 = com.c.d(451518351793196330L);
      Object[] var10002 = var10001;
      aM var2 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public void v(t3_2 var1, boolean var2) {
      Object[] var10001 = com.c.a(var1, false, var2);
      Method var10003 = com.c.d(456507190647444792L);
      Object[] var10002 = var10001;
      aM var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void N(t3_2 var1) {
      String[] var10000 = s();
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(267026473738179692L);
      Object[] var10003 = var10002;
      aM var14 = this;
      Method var10001 = var10004;

      try {
         var10001.invoke(var14, var10003);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      String[] var2 = var10000;
      Object[] var10 = com.c.f();
      Method var17 = com.c.d(559745286191336380L);
      var10002 = var10;
      aM var11 = this;
      Method var7 = var17;

      try {
         var8 = (Boolean)var7.invoke(var11, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      if (var2 != null) {
         int var3 = var8;
         SwingUtilities.invokeLater(new kf_4(this, var3));
      } else if (var8 != 0) {
         Object[] var12 = com.c.f();
         Method var18 = com.c.d(328118709254946779L);
         var10002 = var12;
         t3_2 var13 = var1;
         Method var9 = var18;

         label24:
         try {
            var8 = (Integer)var9.invoke(var13, var10002);
            break label24;
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }

   public void X(t3_2 var1, boolean var2, boolean var3) {
      Object[] var10001 = com.c.a(var1, var2, var3, true);
      Method var10003 = com.c.d(379470519563754551L);
      Object[] var10002 = var10001;
      aM var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void n(t3_2 var1, boolean var2, boolean var3, boolean var4) {
      String[] var10000 = s();
      t3_2 var6 = null;
      int var7 = -1;
      String[] var5 = var10000;
      t3_2 var30 = var1;
      if (var5 == null) {
         if (var1 == null) {
            return;
         }

         var30 = var1;
      }

      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(328118709254946779L);
      Object[] var10002 = var10001;
      t3_2 var52 = var30;
      Method var31 = var10003;

      try {
         var32 = (Integer)var31.invoke(var52, var10002);
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      int var8 = var32;
      var10001 = com.c.f();
      var10003 = com.c.d(258040024224799506L);
      var10002 = var10001;
      t3_2 var54 = var1;
      Method var33 = var10003;

      try {
         var34 = (Boolean)var33.invoke(var54, var10002);
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      label193:
      if (var5 == null) {
         if (var34 != 0) {
            var34 = ((ArrayList)com.c.c(417119238929760524L).get(this)).size();
            if (var5 != null) {
               break label193;
            }

            label189:
            if (var34 > 1) {
               int var35 = var8;
               if (var5 == null) {
                  if (var8 == ((ArrayList)com.c.c(417119238929760524L).get(this)).size() - 1) {
                     var7 = var8 - 1;
                     if (var5 == null) {
                        break label189;
                     }
                  }

                  var35 = var8;
               }

               var7 = var35;
            }
         }

         ((ArrayList)com.c.c(417119238929760524L).get(this)).remove(var1);
         var10002 = com.c.f();
         Method var10004 = com.c.d(584096728105558414L);
         Object[] var108 = var10002;
         t3_2 var89 = var1;
         Method var55 = var10004;

         try {
            var10001 = (Bq_2)var55.invoke(var89, var108);
         } catch (InvocationTargetException var27) {
            throw var27.getTargetException();
         }

         this.remove(var10001);
         var10001 = com.c.f();
         var10003 = com.c.d(258040024224799506L);
         var10002 = var10001;
         t3_2 var58 = var1;
         Method var36 = var10003;

         try {
            var34 = (Boolean)var36.invoke(var58, var10002);
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }
      }

      if (var5 == null) {
         if (var34 != 0) {
            var10000 = (String[])com.c.c(426406158494779427L).get(this);
            var10001 = com.c.f();
            var10003 = com.c.d(207074520377939911L);
            var10002 = var10001;
            var10001 = var10000;
            Method var38 = var10003;

            try {
               var38.invoke(var10001, var10002);
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }
         }

         var34 = var7;
      }

      if (var34 > -1) {
         var6 = (t3_2)((ArrayList)com.c.c(417119238929760524L).get(this)).get(var7);
         var10001 = com.c.a(true);
         var10003 = com.c.d(330506269608966297L);
         var10002 = var10001;
         t3_2 var62 = var6;
         Method var39 = var10003;

         try {
            var39.invoke(var62, var10002);
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(176235325809488947L);
         var10002 = var10001;
         t3_2 var64 = var6;
         Method var40 = var10003;

         try {
            var40.invoke(var64, var10002);
         } catch (InvocationTargetException var23) {
            throw var23.getTargetException();
         }

         com.c.c(425434110105144335L).set(this, var6);
         var10000 = (String[])com.c.c(426406158494779427L).get(this);
         var10002 = com.c.f();
         Method var124 = com.c.d(424156930953488367L);
         Object[] var113 = var10002;
         t3_2 var95 = var6;
         Method var65 = var124;

         try {
            var10001 = (Object[])var65.invoke(var95, var113);
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }

         var10001 = com.c.a(var10001);
         var10003 = com.c.d(597359146714455209L);
         var10002 = var10001;
         var10001 = var10000;
         Method var42 = var10003;

         try {
            var42.invoke(var10001, var10002);
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }
      }

      HashMap var43 = (HashMap)com.c.c(533669572411198848L).get(this);
      var10002 = com.c.f();
      Method var125 = com.c.d(229192454276026216L);
      Object[] var115 = var10002;
      t3_2 var98 = var1;
      Method var69 = var125;

      try {
         var70 = (Integer)var69.invoke(var98, var115);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      var43.remove(var70);
      var10001 = com.c.f();
      var10003 = com.c.d(246765627653456113L);
      var10002 = var10001;
      aM var72 = this;
      Method var44 = var10003;

      try {
         var44.invoke(var72, var10002);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(487819805049017899L);
      var10002 = var10001;
      aM var74 = this;
      Method var45 = var10003;

      try {
         var45.invoke(var74, var10002);
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Y9 var9 = new Y9(var1, com.c.c(534616084670407665L).getInt(null));
      var10001 = com.c.a(var2);
      var10003 = com.c.d(152866268449868611L);
      var10002 = var10001;
      Y9 var76 = var9;
      Method var46 = var10003;

      try {
         var46.invoke(var76, var10002);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      if (var5 == null) {
         if (var4) {
            var10001 = com.c.a(var9);
            var10003 = com.c.d(484591085759846041L);
            var10002 = var10001;
            aM var78 = this;
            Method var47 = var10003;

            try {
               var47.invoke(var78, var10002);
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }
         }

         ((ArrayList)com.c.c(417119238929760524L).get(this)).size();
      }

      if (var6 != null && !var3) {
         var10001 = com.c.a(var6);
         var10003 = com.c.d(397047287828875528L);
         var10002 = var10001;
         aM var80 = this;
         Method var48 = var10003;

         try {
            var48.invoke(var80, var10002);
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }

         Y9 var11 = new Y9(var6, com.c.c(141500763651848578L).getInt(null));
         var10001 = com.c.a(true);
         var10003 = com.c.d(582387900151160398L);
         var10002 = var10001;
         Y9 var82 = var11;
         Method var49 = var10003;

         try {
            var49.invoke(var82, var10002);
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         var10001 = com.c.a(var2);
         var10003 = com.c.d(152866268449868611L);
         var10002 = var10001;
         Y9 var84 = var11;
         Method var50 = var10003;

         try {
            var50.invoke(var84, var10002);
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         var10001 = com.c.a(var11);
         var10003 = com.c.d(484591085759846041L);
         var10002 = var10001;
         aM var86 = this;
         Method var51 = var10003;

         try {
            var51.invoke(var86, var10002);
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }
      }
   }

   public t3_2 U(t3_2 var1, int var2) {
      Object[] var10001 = com.c.a(var1, var2, true);
      Method var10003 = com.c.d(302051953273770611L);
      Object[] var10002 = var10001;
      aM var4 = this;
      Method var10000 = var10003;

      try {
         return (t3_2)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public t3_2 L(t3_2 var1, int var2, boolean var3) {
      Object[] var10001 = com.c.a(var1, null, null, var2, false, var3);
      Method var10003 = com.c.d(574784922018541486L);
      Object[] var10002 = var10001;
      aM var5 = this;
      Method var10000 = var10003;

      try {
         return (t3_2)var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public t3_2 l(F8 var1, String var2, int var3, boolean var4, boolean var5) {
      Object[] var10001 = com.c.a(null, var1, var2, var3, var4, var5);
      Method var10003 = com.c.d(574784922018541486L);
      Object[] var10002 = var10001;
      aM var7 = this;
      Method var10000 = var10003;

      try {
         return (t3_2)var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public t3_2 P(t3_2 var1, F8 var2, String var3, int var4, boolean var5, boolean var6) {
      String[] var7;
      t3_2 var8;
      label248: {
         String[] var10000 = s();
         com.c.c(133320001629591502L).setInt(this, var4);
         var7 = var10000;
         var8 = new t3_2(var3);
         t3_2 var41 = var1;
         if (var7 == null) {
            if (var1 != null) {
               Object[] var10002 = com.c.f();
               Method var10004 = com.c.d(532019896893594989L);
               Object[] var10003 = var10002;
               t3_2 var128 = var1;
               Method var10001 = var10004;

               try {
                  var73 = var10001.invoke(var128, var10003);
               } catch (InvocationTargetException var39) {
                  throw var39.getTargetException();
               }

               Object[] var74 = com.c.a(var73);
               Method var159 = com.c.d(519460332647460288L);
               var10002 = var74;
               t3_2 var75 = var8;
               Method var42 = var159;

               try {
                  var42.invoke(var75, var10002);
               } catch (InvocationTargetException var38) {
                  throw var38.getTargetException();
               }

               var10002 = com.c.f();
               var10004 = com.c.d(160719341149611325L);
               var10003 = var10002;
               t3_2 var131 = var1;
               var10001 = var10004;

               try {
                  var77 = var10001.invoke(var131, var10003);
               } catch (InvocationTargetException var37) {
                  throw var37.getTargetException();
               }

               Object[] var78 = com.c.a(var77);
               Method var161 = com.c.d(331953291291636753L);
               var10002 = var78;
               t3_2 var79 = var8;
               Method var43 = var161;

               try {
                  var43.invoke(var79, var10002);
               } catch (InvocationTargetException var36) {
                  throw var36.getTargetException();
               }

               var10002 = com.c.f();
               var10004 = com.c.d(424156930953488367L);
               var10003 = var10002;
               t3_2 var134 = var1;
               var10001 = var10004;

               try {
                  var81 = var10001.invoke(var134, var10003);
               } catch (InvocationTargetException var35) {
                  throw var35.getTargetException();
               }

               Object[] var82 = com.c.a(var81);
               Method var163 = com.c.d(394686213359187078L);
               var10002 = var82;
               t3_2 var83 = var8;
               Method var44 = var163;

               try {
                  var44.invoke(var83, var10002);
               } catch (InvocationTargetException var34) {
                  throw var34.getTargetException();
               }

               Object[] var84 = com.c.f();
               Method var164 = com.c.d(584096728105558414L);
               var10002 = var84;
               t3_2 var85 = var1;
               Method var45 = var164;

               try {
                  var10000 = (String[])var45.invoke(var85, var10002);
               } catch (InvocationTargetException var33) {
                  throw var33.getTargetException();
               }

               Object[] var86 = com.c.f();
               Method var165 = com.c.d(247202017205943608L);
               var10002 = var86;
               Object var87 = var10000;
               Method var47 = var165;

               try {
                  var48 = (Boolean)var47.invoke(var87, var10002);
               } catch (InvocationTargetException var32) {
                  throw var32.getTargetException();
               }

               var5 = var48;
               if (var7 == null) {
                  break label248;
               }
            }

            var41 = var8;
         }

         Object[] var88 = com.c.a(var2);
         Method var166 = com.c.d(394686213359187078L);
         Object[] var138 = var88;
         t3_2 var89 = var41;
         Method var49 = var166;

         try {
            var49.invoke(var89, var138);
         } catch (InvocationTargetException var31) {
            throw var31.getTargetException();
         }
      }

      Object[] var90 = com.c.a(this);
      Method var167 = com.c.d(629272671697070338L);
      Object[] var139 = var90;
      t3_2 var91 = var8;
      Method var50 = var167;

      try {
         var50.invoke(var91, var139);
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      var90 = com.c.f();
      var167 = com.c.d(424156930953488367L);
      var139 = var90;
      t3_2 var93 = var8;
      var50 = var167;

      try {
         var52 = (F8)var50.invoke(var93, var139);
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      var2 = var52;
      var90 = com.c.a(var8);
      var167 = com.c.d(552175363050732967L);
      var139 = var90;
      F8 var95 = var2;
      var50 = var167;

      try {
         var50.invoke(var95, var139);
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      var90 = com.c.a(this);
      var167 = com.c.d(416612758253976707L);
      var139 = var90;
      F8 var97 = var2;
      var50 = var167;

      try {
         var50.invoke(var97, var139);
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      var90 = com.c.a(var8, this, var5, var6);
      var167 = com.c.d(566591783561533654L);
      var139 = var90;
      aM var99 = this;
      var50 = var167;

      try {
         var56 = (Bq_2)var50.invoke(var99, var139);
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      Bq_2 var9 = var56;
      ((ArrayList)com.c.c(417119238929760524L).get(this)).add(var4, var8);
      aM var57 = this;
      if (var7 == null) {
         if ((JComponent)com.c.c(490595310560876529L).get(this) != null) {
            var4++;
         }

         var57 = this;
      }

      var90 = com.c.f();
      var167 = com.c.d(496057640532296914L);
      var139 = var90;
      aM var101 = var57;
      var50 = var167;

      try {
         var59 = (Integer)var50.invoke(var101, var139);
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      int var10 = var59;
      var90 = com.c.a(true);
      var167 = com.c.d(330506269608966297L);
      var139 = var90;
      t3_2 var103 = var8;
      var50 = var167;

      try {
         var50.invoke(var103, var139);
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      var90 = com.c.a(var4);
      var167 = com.c.d(599989240986758347L);
      var139 = var90;
      t3_2 var105 = var8;
      var50 = var167;

      try {
         var50.invoke(var105, var139);
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      var90 = com.c.a(var4);
      var167 = com.c.d(243679155515376706L);
      var139 = var90;
      t3_2 var107 = var8;
      var50 = var167;

      try {
         var50.invoke(var107, var139);
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      ((HashMap)com.c.c(533669572411198848L).get(this)).put(var10, var8);
      com.c.c(425434110105144335L).set(this, var8);
      var90 = com.c.a(var9);
      var167 = com.c.d(334753124708650117L);
      var139 = var90;
      t3_2 var109 = var8;
      var50 = var167;

      try {
         var50.invoke(var109, var139);
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      this.add(var9, var4);
      var90 = com.c.a(var8);
      var167 = com.c.d(379860037679905473L);
      var139 = var90;
      Bq_2 var111 = var9;
      var50 = var167;

      try {
         var50.invoke(var111, var139);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      var90 = com.c.a(var8);
      var167 = com.c.d(397047287828875528L);
      var139 = var90;
      aM var113 = this;
      var50 = var167;

      try {
         var50.invoke(var113, var139);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      var90 = com.c.f();
      var167 = com.c.d(176235325809488947L);
      var139 = var90;
      t3_2 var115 = var8;
      var50 = var167;

      try {
         var50.invoke(var115, var139);
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Method var67 = (Method)com.c.c(426406158494779427L).get(this);
      var139 = com.c.f();
      Method var188 = com.c.d(424156930953488367L);
      Object[] var180 = var139;
      t3_2 var153 = var8;
      Method var116 = var188;

      try {
         var90 = (Object[])var116.invoke(var153, var180);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      var90 = com.c.a(var90);
      var167 = com.c.d(597359146714455209L);
      var139 = var90;
      var90 = var67;
      var67 = var167;

      try {
         var67.invoke(var90, var139);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      this.doLayout();
      this.repaint();
      var90 = com.c.f();
      var167 = com.c.d(487819805049017899L);
      var139 = var90;
      aM var121 = this;
      var67 = var167;

      try {
         var67.invoke(var121, var139);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      var90 = com.c.f();
      var167 = com.c.d(246765627653456113L);
      var139 = var90;
      aM var123 = this;
      var67 = var167;

      try {
         var67.invoke(var123, var139);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Y9 var11 = new Y9(var8, com.c.c(141500763651848578L).getInt(null));
      var90 = com.c.a(true);
      var167 = com.c.d(439556559655959651L);
      var139 = var90;
      Y9 var125 = var11;
      var67 = var167;

      try {
         var67.invoke(var125, var139);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      var90 = com.c.a(var11);
      var167 = com.c.d(484591085759846041L);
      var139 = var90;
      aM var127 = this;
      var67 = var167;

      try {
         var67.invoke(var127, var139);
         return var8;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   int N() {
      String[] var10000 = s();
      int var2 = 0;
      byte var3 = 1;
      int var4 = var3;
      String[] var1 = var10000;

      while (true) {
         label26:
         if (var4 < a(6883, 8562121222573937677L)) {
            var5 = ((HashMap)com.c.c(533669572411198848L).get(this)).containsKey(var4);
            if (var1 != null) {
               break;
            }

            label23: {
               if (var1 == null) {
                  if (var5 != 0) {
                     break label23;
                  }

                  var5 = var4;
               }

               var2 = var5;
               if (var1 == null) {
                  break label26;
               }
            }

            var4++;
            if (var1 == null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   public void N(JComponent var1) {
      Method var10000 = (Method)com.c.c(426406158494779427L).get(this);
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(597359146714455209L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      this.doLayout();
      this.repaint();
   }

   public t3_2 T(F8 var1, String var2, boolean var3, boolean var4) {
      int var5 = ((ArrayList)com.c.c(417119238929760524L).get(this)).size();
      Object[] var10001 = com.c.a(var1, var2, var5, var3, var4);
      Method var10003 = com.c.d(451133235546109527L);
      Object[] var10002 = var10001;
      aM var7 = this;
      Method var10000 = var10003;

      try {
         return (t3_2)var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public t3_2 m(F8 var1, String var2) {
      int var3 = ((ArrayList)com.c.c(417119238929760524L).get(this)).size();
      Object[] var10001 = com.c.a(var1, var2, var3, false, com.c.c(394476637101936438L).getBoolean(this));
      Method var10003 = com.c.d(451133235546109527L);
      Object[] var10002 = var10001;
      aM var5 = this;
      Method var10000 = var10003;

      try {
         return (t3_2)var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public t3_2 N(F8 var1, String var2) {
      Object[] var10001 = com.c.a(var1, var2, false, true);
      Method var10003 = com.c.d(200546729325125412L);
      Object[] var10002 = var10001;
      aM var4 = this;
      Method var10000 = var10003;

      try {
         return (t3_2)var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public t3_2 w(String var1) {
      String var10000 = s();
      t3_2 var3 = null;
      Iterator var4 = ((ArrayList)com.c.c(417119238929760524L).get(this)).iterator();
      String[] var2 = var10000;

      while (var4.hasNext()) {
         t3_2 var5 = (t3_2)var4.next();
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(424156930953488367L);
         Object[] var10002 = var10001;
         t3_2 var18 = var5;
         Method var11 = var10003;

         try {
            var12 = (F8)var11.invoke(var18, var10002);
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         F8 var6 = var12;
         F8 var13 = var6;
         if (var2 == null) {
            if (!var6.getClass().equals(CT.class)) {
               continue;
            }

            var13 = var6;
         }

         CT var7 = (CT)var13;
         var10001 = com.c.f();
         var10003 = com.c.d(119416120528652269L);
         var10002 = var10001;
         CT var20 = var7;
         Method var14 = var10003;

         try {
            var15 = (Boolean)var14.invoke(var20, var10002);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         if (var2 == null) {
            if (var15) {
               continue;
            }

            var10001 = com.c.f();
            var10003 = com.c.d(134780214066966408L);
            var10002 = var10001;
            CT var22 = var7;
            Method var16 = var10003;

            try {
               var10000 = (String)var16.invoke(var22, var10002);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            var15 = var10000.equals(var1);
         }

         if (var15) {
            var3 = var5;
            break;
         }
      }

      return var3;
   }

   public t3_2 B(String var1) {
      String[] var10000 = s();
      t3_2 var3 = null;
      String[] var2 = var10000;

      for (t3_2 var5 : (ArrayList)com.c.c(417119238929760524L).get(this)) {
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(424156930953488367L);
         Object[] var10002 = var10001;
         t3_2 var15 = var5;
         Method var10 = var10003;

         try {
            var11 = (F8)var10.invoke(var15, var10002);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         F8 var6 = var11;
         F8 var12 = var6;
         if (var2 == null) {
            if (!var6.getClass().equals(C4.class)) {
               continue;
            }

            var12 = var6;
         }

         C4 var7 = (C4)var12;
         var10001 = com.c.f();
         var10003 = com.c.d(493034572907583781L);
         var10002 = var10001;
         C4 var17 = var7;
         Method var13 = var10003;

         try {
            var10000 = (String)var13.invoke(var17, var10002);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         if (var10000.equals(var1)) {
            var3 = var5;
            break;
         }
      }

      return var3;
   }

   public t3_2 q(String var1) {
      t3_2 var3 = null;
      String var10000 = s();
      Iterator var4 = ((ArrayList)com.c.c(417119238929760524L).get(this)).iterator();
      String[] var2 = var10000;

      while (var4.hasNext()) {
         t3_2 var5 = (t3_2)var4.next();
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(424156930953488367L);
         Object[] var10002 = var10001;
         t3_2 var18 = var5;
         Method var11 = var10003;

         try {
            var12 = (F8)var11.invoke(var18, var10002);
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         F8 var6 = var12;
         F8 var13 = var6;
         if (var2 == null) {
            if (!var6.getClass().equals(CE.class)) {
               continue;
            }

            var13 = var6;
         }

         CE var7 = (CE)var13;
         var10001 = com.c.f();
         var10003 = com.c.d(243557514454506006L);
         var10002 = var10001;
         CE var20 = var7;
         Method var14 = var10003;

         try {
            var15 = (Boolean)var14.invoke(var20, var10002);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         if (var2 == null) {
            if (!var15) {
               continue;
            }

            var10001 = com.c.f();
            var10003 = com.c.d(504379882782984288L);
            var10002 = var10001;
            CE var22 = var7;
            Method var16 = var10003;

            try {
               var10000 = (String)var16.invoke(var22, var10002);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            var15 = var10000.equals(var1);
         }

         if (var15) {
            var3 = var5;
            break;
         }
      }

      return var3;
   }

   public t3_2 l(String var1) {
      t3_2 var3 = null;
      String[] var10000 = s();
      Iterator var4 = ((ArrayList)com.c.c(417119238929760524L).get(this)).iterator();
      String[] var2 = var10000;

      while (var4.hasNext()) {
         t3_2 var5 = (t3_2)var4.next();
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(424156930953488367L);
         Object[] var10002 = var10001;
         t3_2 var15 = var5;
         Method var10 = var10003;

         try {
            var11 = (F8)var10.invoke(var15, var10002);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         F8 var6 = var11;
         F8 var12 = var6;
         if (var2 == null) {
            if (!var6.getClass().equals(F5.class)) {
               continue;
            }

            var12 = var6;
         }

         F5 var7 = (F5)var12;
         var10001 = com.c.f();
         var10003 = com.c.d(394153669787250679L);
         var10002 = var10001;
         F5 var17 = var7;
         Method var13 = var10003;

         try {
            var10000 = (String)var13.invoke(var17, var10002);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         if (var10000.equals(var1)) {
            var3 = var5;
            break;
         }
      }

      return var3;
   }

   public t3_2 Y(JComponent var1) {
      t3_2 var2 = null;

      for (t3_2 var4 : (ArrayList)com.c.c(417119238929760524L).get(this)) {
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(424156930953488367L);
         Object[] var10002 = var10001;
         t3_2 var8 = var4;
         Method var10000 = var10003;

         try {
            var7 = (F8)var10000.invoke(var8, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         F8 var5 = var7;
         if (var5.equals(var1)) {
            var2 = var4;
            break;
         }
      }

      return var2;
   }

   public void m() {
      String[] var1 = s();
      int var10000 = ((ArrayList)com.c.c(417119238929760524L).get(this)).size();
      byte var10001 = 1;
      if (var1 == null) {
         if (var10000 <= 1) {
            return;
         }

         var10000 = com.c.c(133320001629591502L).getInt(this);
         var10001 = 1;
      }

      int var2 = var10000 - var10001;
      if (var1 == null) {
         if (var2 < 0) {
            var2 = ((ArrayList)com.c.c(417119238929760524L).get(this)).size() - 1;
         }

         Object[] var5 = com.c.a((t3_2)((ArrayList)com.c.c(417119238929760524L).get(this)).get(var2));
         Method var10003 = com.c.d(176011466134249595L);
         Object[] var10002 = var5;
         aM var6 = this;
         Method var4 = var10003;

         try {
            var4.invoke(var6, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }

   public void s() {
      String[] var1 = s();
      int var10000 = ((ArrayList)com.c.c(417119238929760524L).get(this)).size();
      byte var10001 = 1;
      if (var1 == null) {
         if (var10000 <= 1) {
            return;
         }

         var10000 = com.c.c(133320001629591502L).getInt(this);
         var10001 = 1;
      }

      int var2 = var10000 + var10001;
      if (var1 == null) {
         if (var2 > ((ArrayList)com.c.c(417119238929760524L).get(this)).size() - 1) {
            var2 = 0;
         }

         Object[] var5 = com.c.a((t3_2)((ArrayList)com.c.c(417119238929760524L).get(this)).get(var2));
         Method var10003 = com.c.d(176011466134249595L);
         Object[] var10002 = var5;
         aM var6 = this;
         Method var4 = var10003;

         try {
            var4.invoke(var6, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }

   public void l(int var1) {
      label31: {
         int var10000;
         label34: {
            String[] var2 = s();
            var10000 = ((ArrayList)com.c.c(417119238929760524L).get(this)).size();
            int var10001 = 1;
            if (var2 == null) {
               if (var10000 <= 1) {
                  return;
               }

               var10000 = var1;
               if (var2 != null) {
                  break label34;
               }

               var10001 = ((ArrayList)com.c.c(417119238929760524L).get(this)).size() - 1;
            }

            if (var10000 <= var10001) {
               break label31;
            }

            var10000 = 0;
         }

         var1 = var10000;
      }

      Object[] var5 = com.c.a((t3_2)((ArrayList)com.c.c(417119238929760524L).get(this)).get(var1));
      Method var10003 = com.c.d(176011466134249595L);
      Object[] var10002 = var5;
      aM var6 = this;
      Method var4 = var10003;

      try {
         var4.invoke(var6, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void X(t3_2 var1) {
      String[] var2 = s();
      t3_2 var10000 = var1;
      if (var2 == null) {
         if (var1 == null) {
            return;
         }

         var10000 = (t3_2)com.c.c(425434110105144335L).get(this);
      }

      if (var2 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = (t3_2)com.c.c(425434110105144335L).get(this);
      }

      int var9 = var10000.equals(var1);
      if (var2 != null) {
         int var3 = var9;
         if (var3 == com.c.c(133320001629591502L).getInt(this)) {
         }

         com.c.c(133320001629591502L).setInt(this, var3);
         Object[] var16 = com.c.a(true);
         Method var28 = com.c.d(330506269608966297L);
         Object[] var24 = var16;
         t3_2 var17 = var1;
         Method var11 = var28;

         try {
            var11.invoke(var17, var24);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var16 = com.c.f();
         var28 = com.c.d(176235325809488947L);
         var24 = var16;
         t3_2 var19 = var1;
         Method var12 = var28;

         try {
            var12.invoke(var19, var24);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         com.c.c(425434110105144335L).set(this, var1);
         var16 = com.c.a(var1);
         var28 = com.c.d(397047287828875528L);
         var24 = var16;
         aM var21 = this;
         Method var13 = var28;

         try {
            var13.invoke(var21, var24);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         this.validate();
         this.repaint();
         var16 = com.c.a(var1);
         var28 = com.c.d(372107610519867932L);
         var24 = var16;
         aM var23 = this;
         Method var14 = var28;

         try {
            var14.invoke(var23, var24);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      } else if (var9 == 0) {
         com.c.c(501692309218203508L).setBoolean(this, true);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(328118709254946779L);
         Object[] var10002 = var10001;
         t3_2 var15 = var1;
         Method var10 = var10003;

         label53:
         try {
            var9 = (Integer)var10.invoke(var15, var10002);
            break label53;
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }
      }
   }

   public void T(t3_2 var1) {
      Y9 var2 = new Y9(var1, com.c.c(141500763651848578L).getInt(null));
      Object[] var10001 = com.c.a(var2);
      Method var10003 = com.c.d(484591085759846041L);
      Object[] var10002 = var10001;
      aM var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   void h(t3_2 var1) {
      String[] var10000 = s();
      Iterator var3 = ((ArrayList)com.c.c(417119238929760524L).get(this)).iterator();
      String[] var2 = var10000;

      while (var3.hasNext()) {
         label92: {
            t3_2 var4 = (t3_2)var3.next();
            t3_2 var13 = var4;
            if (var2 == null) {
               if (!var4.equals(var1)) {
                  Object[] var10001 = com.c.a(false);
                  Method var10003 = com.c.d(330506269608966297L);
                  Object[] var10002 = var10001;
                  t3_2 var24 = var4;
                  Method var14 = var10003;

                  try {
                     var14.invoke(var24, var10002);
                  } catch (InvocationTargetException var12) {
                     throw var12.getTargetException();
                  }

                  var10001 = com.c.f();
                  var10003 = com.c.d(584096728105558414L);
                  var10002 = var10001;
                  t3_2 var26 = var4;
                  Method var15 = var10003;

                  try {
                     var10000 = (String[])var15.invoke(var26, var10002);
                  } catch (InvocationTargetException var11) {
                     throw var11.getTargetException();
                  }

                  var10001 = com.c.f();
                  var10003 = com.c.d(467250021884313480L);
                  var10002 = var10001;
                  var10001 = var10000;
                  Method var17 = var10003;

                  try {
                     var17.invoke(var10001, var10002);
                  } catch (InvocationTargetException var10) {
                     throw var10.getTargetException();
                  }

                  if (var2 == null) {
                     break label92;
                  }
               }

               Object[] var29 = com.c.a(true);
               Method var49 = com.c.d(330506269608966297L);
               Object[] var41 = var29;
               t3_2 var30 = var4;
               Method var18 = var49;

               try {
                  var18.invoke(var30, var41);
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }

               var13 = var4;
            }

            Object[] var31 = com.c.f();
            Method var50 = com.c.d(584096728105558414L);
            Object[] var42 = var31;
            t3_2 var32 = var13;
            Method var19 = var50;

            try {
               var10000 = (String[])var19.invoke(var32, var42);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            var31 = com.c.f();
            var50 = com.c.d(467250021884313480L);
            var42 = var31;
            var31 = var10000;
            Method var21 = var50;

            try {
               var21.invoke(var31, var42);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            var10000 = (String[])com.c.c(426406158494779427L).get(this);
            var42 = com.c.f();
            Method var10004 = com.c.d(424156930953488367L);
            Object[] var52 = var42;
            t3_2 var45 = var1;
            Method var35 = var10004;

            try {
               var31 = (Object[])var35.invoke(var45, var52);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            var31 = com.c.a(var31);
            var50 = com.c.d(597359146714455209L);
            var42 = var31;
            var31 = var10000;
            Method var23 = var50;

            try {
               var23.invoke(var31, var42);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }
         }

         if (var2 != null) {
            break;
         }
      }
   }

   public void u() {
      String[] var10000 = s();
      Iterator var2 = ((ArrayList)com.c.c(417119238929760524L).get(this)).iterator();
      String[] var1 = var10000;

      while (var2.hasNext()) {
         t3_2 var3 = (t3_2)var2.next();
         Object[] var10001 = com.c.a(false);
         Method var10003 = com.c.d(330506269608966297L);
         Object[] var10002 = var10001;
         t3_2 var13 = var3;
         Method var8 = var10003;

         try {
            var8.invoke(var13, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(584096728105558414L);
         var10002 = var10001;
         t3_2 var15 = var3;
         Method var9 = var10003;

         try {
            var10000 = (String[])var9.invoke(var15, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(467250021884313480L);
         var10002 = var10001;
         var10001 = var10000;
         Method var11 = var10003;

         try {
            var11.invoke(var10001, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(176235325809488947L);
         var10002 = var10001;
         t3_2 var19 = var3;
         Method var12 = var10003;

         try {
            var12.invoke(var19, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         if (var1 != null) {
            break;
         }
      }
   }

   void e(t3_2 var1, int var2, int var3) {
      String[] var10000 = s();
      Object[] var10003 = com.c.f();
      Method var10005 = com.c.d(584096728105558414L);
      Object[] var10004 = var10003;
      t3_2 var64 = var1;
      Method var10002 = var10005;

      try {
         var53 = var10002.invoke(var64, var10004);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      com.c.c(199288150985905138L).set(this, var53);
      this.add((Bq_2)com.c.c(199288150985905138L).get(this), var3);
      String[] var4 = var10000;
      var10000 = (String[])com.c.c(199288150985905138L).get(this);
      Object[] var10001 = com.c.f();
      Method var65 = com.c.d(168016210297284127L);
      Object[] var54 = var10001;
      var10001 = var10000;
      Method var24 = var65;

      try {
         var24.invoke(var10001, var54);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      Component[] var5 = this.getComponents();
      Component[] var6 = var5;
      int var7 = var5.length;
      int var8 = 0;

      while (true) {
         if (var8 < var7) {
            Component var9 = var6[var8];
            if (var4 == null) {
               var25 = var9.equals((Bq_2)com.c.c(199288150985905138L).get(this));
               if (var4 != null) {
                  break;
               }

               label114:
               if (var25 == 0) {
                  Component var26 = var9;
                  if (var4 == null) {
                     if (!var9.getClass().equals(Bq_2.class)) {
                        break label114;
                     }

                     var26 = var9;
                  }

                  Bq_2 var10 = (Bq_2)var26;
                  var10001 = com.c.f();
                  Method var66 = com.c.d(467250021884313480L);
                  Object[] var55 = var10001;
                  Bq_2 var38 = var10;
                  Method var27 = var66;

                  try {
                     var27.invoke(var38, var55);
                  } catch (InvocationTargetException var18) {
                     throw var18.getTargetException();
                  }
               }

               var8++;
            }

            if (var4 == null) {
               continue;
            }
         }

         var25 = var3;
         break;
      }

      int var21 = var25;
      JComponent var28 = (JComponent)com.c.c(490595310560876529L).get(this);
      if (var4 == null) {
         if (var28 != null) {
            var21--;
         }

         ArrayList var29 = (ArrayList)com.c.c(417119238929760524L).get(this);
         Object[] var56 = com.c.f();
         Method var74 = com.c.d(328118709254946779L);
         var10003 = var56;
         t3_2 var57 = var1;
         Method var39 = var74;

         try {
            var40 = (Integer)var39.invoke(var57, var10003);
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         var29.remove(var40);
      }

      ((ArrayList)com.c.c(417119238929760524L).get(this)).add(var21, var1);
      com.c.c(133320001629591502L).setInt(this, var21);
      com.c.c(425434110105144335L).set(this, var1);
      var10001 = com.c.f();
      Method var68 = com.c.d(246765627653456113L);
      Object[] var58 = var10001;
      aM var42 = this;
      Method var30 = var68;

      try {
         var30.invoke(var42, var58);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      var10001 = com.c.f();
      Method var69 = com.c.d(487819805049017899L);
      Object[] var59 = var10001;
      aM var44 = this;
      Method var31 = var69;

      try {
         var31.invoke(var44, var59);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Y9 var22 = new Y9(var1, com.c.c(527075857672909373L).getInt(null));
      var10001 = com.c.a(var2);
      Method var70 = com.c.d(572246038895817982L);
      Object[] var60 = var10001;
      Y9 var46 = var22;
      Method var32 = var70;

      try {
         var32.invoke(var46, var60);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      var10001 = com.c.a(var3);
      Method var71 = com.c.d(400022735440161010L);
      Object[] var61 = var10001;
      Y9 var48 = var22;
      Method var33 = var71;

      try {
         var33.invoke(var48, var61);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      var10001 = com.c.a(var21);
      Method var72 = com.c.d(456834232298630458L);
      Object[] var62 = var10001;
      Y9 var50 = var22;
      Method var34 = var72;

      try {
         var34.invoke(var50, var62);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var10001 = com.c.a(var22);
      Method var73 = com.c.d(484591085759846041L);
      Object[] var63 = var10001;
      aM var52 = this;
      Method var35 = var73;

      try {
         var35.invoke(var52, var63);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   void B() {
      this.doLayout();
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new gE(this));
      Method var10003 = com.c.d(434592463220957006L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   void U() {
      String[] var10000 = s();
      int var2 = 0;
      String[] var1 = var10000;

      while (var2 < ((ArrayList)com.c.c(417119238929760524L).get(this)).size()) {
         t3_2 var5 = (t3_2)((ArrayList)com.c.c(417119238929760524L).get(this)).get(var2);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(584096728105558414L);
         Object[] var10002 = var10001;
         t3_2 var9 = var5;
         Method var6 = var10003;

         try {
            var10000 = (String[])var6.invoke(var9, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(467250021884313480L);
         var10002 = var10001;
         var10001 = var10000;
         Method var8 = var10003;

         try {
            var8.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         var2++;
         if (var1 != null) {
            break;
         }
      }
   }

   void R() {
      String[] var10000 = s();
      int var2 = 0;
      String[] var1 = var10000;

      while (var2 < ((ArrayList)com.c.c(417119238929760524L).get(this)).size()) {
         t3_2 var3 = (t3_2)((ArrayList)com.c.c(417119238929760524L).get(this)).get(var2);
         Object[] var10001 = com.c.a(var2);
         Method var10003 = com.c.d(599989240986758347L);
         Object[] var10002 = var10001;
         t3_2 var13 = var3;
         Method var8 = var10003;

         try {
            var8.invoke(var13, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var10001 = com.c.a(var2 + 1);
         var10003 = com.c.d(243679155515376706L);
         var10002 = var10001;
         t3_2 var15 = var3;
         Method var9 = var10003;

         try {
            var9.invoke(var15, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(584096728105558414L);
         var10002 = var10001;
         t3_2 var17 = var3;
         Method var10 = var10003;

         try {
            var10000 = (String[])var10.invoke(var17, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         var10001 = com.c.a(var3);
         var10003 = com.c.d(379860037679905473L);
         var10002 = var10001;
         var10001 = var10000;
         Method var12 = var10003;

         try {
            var12.invoke(var10001, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var2++;
         if (var1 != null) {
            break;
         }
      }
   }

   int X(Component var1) {
      int var3 = 0;
      Component[] var4 = this.getComponents();
      String[] var10000 = s();
      Component[] var5 = var4;
      String[] var2 = var10000;
      int var6 = var4.length;
      int var7 = 0;

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

   public void K(t3_2 var1) {
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(584096728105558414L);
      Object[] var10003 = var10002;
      t3_2 var4 = var1;
      Method var10001 = var10004;

      try {
         var3 = (Bq_2)var10001.invoke(var4, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      this.remove(var3);
      this.doLayout();
      this.repaint();
   }

   public void Q(t3_2 var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(584096728105558414L);
      Object[] var10002 = var10001;
      t3_2 var6 = var1;
      Method var10000 = var10003;

      try {
         var4 = var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.a(var1);
      var10003 = com.c.d(379860037679905473L);
      var10002 = var10001;
      var10001 = (Object[])var4;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      this.doLayout();
      this.repaint();
   }

   public static void P(Bq_2 var0, Point var1, aM var2) {
      String[] var10000 = s();
      new Point();
      SwingUtilities.convertPointFromScreen(var1, var2);
      String[] var3 = var10000;
      boolean var5 = true;
      var10000 = (String[])com.c.c(609684993151237253L).get(null);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(400084338690857485L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      Method var9 = var10003;

      try {
         var10 = (Boolean)var9.invoke(var10001, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      label21: {
         if (var3 == null) {
            if (!var10) {
               break label21;
            }

            var10 = true;
         }

         var5 = var10;
      }

      Point var6 = MouseInfo.getPointerInfo().getLocation();
      var6.x = var6.x + a(19303, 7176326699541038488L);
      var6.y = var6.y + a(19303, 7176326699541038488L);
      ((DP)com.c.c(349091698802351406L).get(null)).setLocation(var6);
      ((DP)com.c.c(349091698802351406L).get(null)).setVisible(var5);
      ((tH_3)com.c.c(277670051994433027L).get(null)).setVisible(false);
   }

   public static int X(Bq_2 var0, Point var1, aM var2, boolean var3) {
      String[] var10000 = s();
      Point var5 = new Point();
      SwingUtilities.convertPointFromScreen(var1, var2);
      Component var6 = var2.getComponentAt(var1);
      Object[] var10002 = com.c.a(var0);
      Method var10004 = com.c.d(339397787032745950L);
      Object[] var10003 = var10002;
      aM var51 = var2;
      Method var10001 = var10004;

      try {
         var44 = (Integer)var10001.invoke(var51, var10003);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      String[] var4;
      int var7;
      byte var8;
      int var9;
      int var10;
      boolean var12;
      var7 = var44;
      var4 = var10000;
      var8 = 4;
      var9 = 1;
      var10 = -1;
      Object var11 = null;
      var12 = false;
      var28 = var6;
      label263:
      if (var4 == null) {
         if (var6 != null) {
            var28 = var6;
            if (var4 != null) {
               break label263;
            }

            if (!var6.getClass().equals(Bq_2.class)) {
               Point var13 = new Point();
               var13.y = (int)var1.getY();
               var13.x = (int)var1.getX();
               Component var14 = var6;

               label268: {
                  while (var13.getX() > 0.0) {
                     var29 = var14.getClass().equals(Bq_2.class);
                     if (var4 != null || var4 != null) {
                        break label268;
                     }

                     if (var29) {
                        break;
                     }

                     var13.x--;
                     var14 = var2.getComponentAt(var13);
                     if (var4 != null) {
                        break;
                     }
                  }

                  var28 = var14;
                  if (var4 != null) {
                     break label263;
                  }

                  var29 = var14.getClass().equals(Bq_2.class);
               }

               if (var29) {
                  var12 = true;
                  var6 = var14;
               }
            }
         }

         var28 = var6;
      }

      label238: {
         label270: {
            if (var4 == null) {
               if (var28 == null) {
                  break label270;
               }

               var28 = var6;
            }

            var30 = var28.getClass().equals(Bq_2.class);
            if (var4 != null) {
               break label238;
            }

            label231:
            if (!var30) {
               Point var21 = new Point();
               var21.y = (int)var1.getY();
               var21.x = (int)var1.getX();
               Component var25 = var6;

               label228: {
                  while (var21.getX() < (double)var2.getWidth()) {
                     var31 = var25;
                     if (var4 != null) {
                        break label228;
                     }

                     var30 = var25.getClass().equals(Bq_2.class);
                     if (var4 != null) {
                        break label238;
                     }

                     if (var30) {
                        break;
                     }

                     var21.x++;
                     var25 = var2.getComponentAt(var21);
                     if (var4 != null) {
                        break;
                     }
                  }

                  var31 = var25;
               }

               if (var4 == null) {
                  if (var31 == null) {
                     break label231;
                  }

                  var31 = var25;
               }

               var30 = var31.getClass().equals(Bq_2.class);
               if (var4 != null) {
                  break label238;
               }

               if (var30) {
                  var12 = true;
                  var6 = var25;
               }
            }
         }

         var30 = var12;
      }

      if (!var30) {
      }

      label204: {
         label273: {
            Component var32 = var6;
            if (var4 == null) {
               if (var6 == null) {
                  break label273;
               }

               var32 = var6;
            }

            label274: {
               boolean var33 = var32.getClass().equals(Bq_2.class);
               if (var4 == null) {
                  if (var33) {
                     Bq_2 var23 = (Bq_2)var6;
                     var11 = SwingUtilities.convertPoint(var2, var1, var23);
                     var5.y = var23.getLocationOnScreen().y;
                     var5.x = var23.getLocationOnScreen().x;
                     Object[] var45 = com.c.a(var23);
                     Method var56 = com.c.d(339397787032745950L);
                     var10002 = var45;
                     aM var46 = var2;
                     Method var35 = var56;

                     try {
                        var36 = (Integer)var35.invoke(var46, var10002);
                     } catch (InvocationTargetException var18) {
                        throw var18.getTargetException();
                     }

                     label184: {
                        var10 = var36;
                        Point var37 = (Point)var11;
                        if (var4 == null) {
                           if (((Point)var11).x > var23.getWidth() / 2) {
                              var5.x = var5.x + var23.getWidth() + var8 / 2;
                              var10++;
                              if (var4 == null) {
                                 break label184;
                              }
                           }

                           var37 = var5;
                        }

                        var37.x -= var8 / 2;
                     }

                     var5.x--;
                     if (var7 == var10) {
                     }

                     int var38 = var7 + 1;
                     if (var4 == null) {
                        if (var38 != var10) {
                           break label204;
                        }

                        var38 = 0;
                     }

                     var9 = var38;
                     break label204;
                  }

                  var34 = var6;
                  if (var4 != null) {
                     break label274;
                  }

                  var33 = var6.getClass().equals(aM.class);
               }

               if (!var33) {
                  break label204;
               }

               var34 = var6;
            }

            aM var22 = (aM)var34;
            var9 = 0;
            if (var4 == null) {
               break label204;
            }
         }

         var9 = 0;
      }

      label171: {
         label277: {
            aM var39 = var2;
            if (var4 == null) {
               Object[] var47 = com.c.f();
               Method var57 = com.c.d(493414787501530871L);
               var10002 = var47;
               aM var48 = var2;
               Method var40 = var57;

               try {
                  var41 = (JScrollPane)var40.invoke(var48, var10002);
               } catch (InvocationTargetException var17) {
                  throw var17.getTargetException();
               }

               if (var41 == null) {
                  break label277;
               }

               var39 = var2;
            }

            Rectangle var24 = var39.getBounds();
            var42 = var1.y;
            if (var4 == null) {
               var10002 = com.c.f();
               var10004 = com.c.d(493414787501530871L);
               var10003 = var10002;
               aM var55 = var2;
               var10001 = var10004;

               try {
                  var50 = (JScrollPane)var10001.invoke(var55, var10003);
               } catch (InvocationTargetException var16) {
                  throw var16.getTargetException();
               }

               if (var42 > var50.getHeight()) {
                  Rectangle var26 = new Rectangle(0, (int)var1.getY(), var2.getWidth(), 5);
                  var2.scrollRectToVisible(var26);
               }

               double var60;
               var42 = (var60 = var24.getY() - 0.0) == 0.0 ? 0 : (var60 < 0.0 ? -1 : 1);
            }

            if (var4 != null) {
               break label171;
            }

            if (var42 < 0) {
               int var27 = var24.y + var1.y;
               var42 = var27;
               if (var4 != null) {
                  break label171;
               }

               if (var27 < 0) {
                  Rectangle var15 = new Rectangle(var24.x, var1.y - 5, var2.getWidth(), 5);
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

         double var61;
         var43 = (var61 = var5.getX() - 0.0) == 0.0 ? 0 : (var61 < 0.0 ? -1 : 1);
      }

      label144:
      if (var4 == null) {
         if (var43 > 0) {
            double var62;
            var43 = (var62 = var5.getY() - 0.0) == 0.0 ? 0 : (var62 < 0.0 ? -1 : 1);
            if (var4 != null) {
               break label144;
            }

            if (var43 > 0) {
               ((tH_3)com.c.c(277670051994433027L).get(null)).setLocation(var5);
               ((tH_3)com.c.c(277670051994433027L).get(null))
                  .setSize(((tH_3)com.c.c(277670051994433027L).get(null)).getWidth(), com.c.c(388202870823471257L).getInt(var2) - 2);
            }
         }

         var43 = var3;
      }

      if (var4 == null) {
         if (var43 != 0) {
            ((tH_3)com.c.c(277670051994433027L).get(null)).setVisible(true);
         }

         ((DP)com.c.c(349091698802351406L).get(null)).setVisible(false);
         var43 = var10;
      }

      return var43;
   }

   Bq_2 y(t3_2 var1, aM var2, boolean var3, boolean var4) {
      return new Bq_2(
         var1,
         var2,
         com.c.c(579186049990057769L).getBoolean(this),
         com.c.c(578351821085462234L).getBoolean(this),
         var3,
         com.c.c(388202870823471257L).getInt(this),
         var4
      );
   }

   public tH_3 L() {
      return (tH_3)com.c.c(277670051994433027L).get(null);
   }

   public void W(tH_3 var1) {
      com.c.c(277670051994433027L).set(null, var1);
   }

   public JScrollPane O() {
      return (JScrollPane)com.c.c(450702155502063918L).get(this);
   }

   public void x(JScrollPane var1) {
      com.c.c(450702155502063918L).set(this, var1);
   }

   public Bq_2 a() {
      return (Bq_2)com.c.c(199288150985905138L).get(this);
   }

   public void J(Bq_2 var1) {
      com.c.c(199288150985905138L).set(this, var1);
   }

   public ge_2 v() {
      return (ge_2)com.c.c(426406158494779427L).get(this);
   }

   public void a(ge_2 var1) {
      com.c.c(426406158494779427L).set(this, var1);
   }

   public ArrayList g() {
      return (ArrayList)com.c.c(417119238929760524L).get(this);
   }

   public void e(ArrayList var1) {
      com.c.c(417119238929760524L).set(this, var1);
   }

   public Thread W() {
      return (Thread)com.c.c(354167307306446936L).get(this);
   }

   public void M(Thread var1) {
      com.c.c(354167307306446936L).set(this, var1);
   }

   public boolean J() {
      return com.c.c(579186049990057769L).getBoolean(this);
   }

   public void N(boolean var1) {
      label23: {
         String[] var2 = s();
         aM var10000 = this;
         int var10001 = var1;
         if (var2 == null) {
            com.c.c(579186049990057769L).setBoolean(this, (boolean)var1);
            if (var1 != 0) {
               com.c.c(388202870823471257L).setInt(this, a(7865, 4720692661393674316L));
               if (var2 == null) {
                  break label23;
               }
            }

            var10000 = this;
            var10001 = a(12773, 523748926135369501L);
         }

         com.c.c(388202870823471257L).setInt(var10000, var10001);
      }

      Object[] var5 = com.c.f();
      Method var10003 = com.c.d(360963743248144032L);
      Object[] var10002 = var5;
      aM var6 = this;
      Method var4 = var10003;

      try {
         var4.invoke(var6, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public t3_2 Q() {
      return (t3_2)com.c.c(425434110105144335L).get(this);
   }

   public void j(t3_2 var1) {
      com.c.c(425434110105144335L).set(this, var1);
   }

   public boolean C() {
      return com.c.c(578351821085462234L).getBoolean(this);
   }

   public void H(boolean var1) {
      com.c.c(578351821085462234L).setBoolean(this, var1);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(360963743248144032L);
      Object[] var10002 = var10001;
      aM var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   void f() {
      label24: {
         String[] var1 = s();
         aM var10000 = this;
         if (var1 == null) {
            if (com.c.c(579186049990057769L).getBoolean(this)) {
               var10000 = this;
               if (var1 == null) {
                  if (!com.c.c(578351821085462234L).getBoolean(this)) {
                     ((tH_3)com.c.c(277670051994433027L).get(null))
                        .setSize(((tH_3)com.c.c(277670051994433027L).get(null)).getWidth(), a(30295, 4342977418755356845L));
                     com.c.c(374786476283896993L).setInt(this, 1);
                     com.c.c(627149169115132345L).setInt(this, 1);
                     if (var1 == null) {
                        break label24;
                     }
                  }

                  com.c.c(374786476283896993L).setInt(this, 1);
                  var10000 = this;
               }

               com.c.c(627149169115132345L).setInt(var10000, 1);
               ((tH_3)com.c.c(277670051994433027L).get(null)).setSize(((tH_3)com.c.c(277670051994433027L).get(null)).getWidth(), a(8979, 3211277763751833056L));
               if (var1 == null) {
                  break label24;
               }
            }

            com.c.c(374786476283896993L).setInt(this, a(25600, 4680497975577783025L));
            var10000 = this;
         }

         com.c.c(627149169115132345L).setInt(var10000, a(21971, 1226775875533445935L));
      }

      ((FlowLayout)com.c.c(158219876422589484L).get(this)).setHgap(com.c.c(374786476283896993L).getInt(this));
      ((FlowLayout)com.c.c(158219876422589484L).get(this)).setVgap(com.c.c(627149169115132345L).getInt(this));
   }

   public boolean K() {
      return com.c.c(501692309218203508L).getBoolean(this);
   }

   public void k(boolean var1) {
      com.c.c(501692309218203508L).setBoolean(this, var1);
   }

   public boolean P() {
      return com.c.c(366002109126035603L).getBoolean(this);
   }

   public void s(boolean var1) {
      com.c.c(366002109126035603L).setBoolean(this, var1);
   }

   public boolean A() {
      return com.c.c(225352561188908423L).getBoolean(this);
   }

   public void Y(boolean var1) {
      com.c.c(225352561188908423L).setBoolean(this, var1);
   }

   public boolean q() {
      return com.c.c(394476637101936438L).getBoolean(this);
   }

   public void a(boolean var1) {
      com.c.c(394476637101936438L).setBoolean(this, var1);
   }

   public boolean p() {
      return com.c.c(423830768464519912L).getBoolean(this);
   }

   public void i(boolean var1) {
      com.c.c(423830768464519912L).setBoolean(this, var1);
   }

   public int Q$int() {
      return com.c.c(388202870823471257L).getInt(this);
   }

   public void G(int var1) {
      com.c.c(388202870823471257L).setInt(this, var1);
   }

   public boolean l$boolean() {
      return com.c.c(185183789069073378L).getBoolean(this);
   }

   public void f(boolean var1) {
      com.c.c(185183789069073378L).setBoolean(this, var1);
   }

   public static Jc_2 a$Jc_2() {
      return (Jc_2)com.c.c(609684993151237253L).get(null);
   }

   public static void v(Jc_2 var0) {
      com.c.c(609684993151237253L).set(null, var0);
   }

   public int z() {
      return com.c.c(421709291189789904L).getInt(this);
   }

   public void s(int var1) {
      com.c.c(421709291189789904L).setInt(this, var1);
   }

   public static DP q$DP() {
      return (DP)com.c.c(349091698802351406L).get(null);
   }

   public static void T(DP var0) {
      com.c.c(349091698802351406L).set(null, var0);
   }

   public U G() {
      return (U)com.c.c(393196773307370817L).get(this);
   }

   public void G(U var1) {
      com.c.c(393196773307370817L).set(this, var1);
   }

   public boolean E() {
      return com.c.c(210447995261764859L).getBoolean(this);
   }

   public void J(boolean var1) {
      com.c.c(210447995261764859L).setBoolean(this, var1);
   }

   public CW u$CW() {
      return (CW)com.c.c(273587631854201597L).get(this);
   }

   public void y(CW var1) {
      com.c.c(273587631854201597L).set(this, var1);
   }

   public boolean m$boolean() {
      return com.c.c(631781646741322975L).getBoolean(this);
   }

   public void d(boolean var1) {
      com.c.c(631781646741322975L).setBoolean(this, var1);
   }

   public boolean O$boolean() {
      return com.c.c(291528700222910706L).getBoolean(this);
   }

   public void m(boolean var1) {
      com.c.c(291528700222910706L).setBoolean(this, var1);
   }

   public FlowLayout P$FlowLayout() {
      return (FlowLayout)com.c.c(158219876422589484L).get(this);
   }

   public void O(FlowLayout var1) {
      com.c.c(158219876422589484L).set(this, var1);
   }

   public boolean j$boolean() {
      return com.c.c(196077290577414286L).getBoolean(this);
   }

   public void M(boolean var1) {
      com.c.c(196077290577414286L).setBoolean(this, var1);
   }

   public void O$void() {
      com.c.c(142536030060271800L).set(this, null);
      com.c.c(426406158494779427L).set(this, null);
      com.c.c(450702155502063918L).set(this, null);
      com.c.c(199288150985905138L).set(this, null);
      com.c.c(417119238929760524L).set(this, null);
      com.c.c(425434110105144335L).set(this, null);
      com.c.c(205853402005133202L).set(this, null);
      com.c.c(502036721265141438L).set(this, null);
      com.c.c(158219876422589484L).set(this, null);
      com.c.c(497629741148939873L).set(this, null);
      com.c.c(354167307306446936L).set(this, null);
      com.c.c(490595310560876529L).set(this, null);
      com.c.c(533332121992851488L).set(this, null);
      com.c.c(533669572411198848L).set(this, null);
      com.c.c(393196773307370817L).set(this, null);
      com.c.c(273587631854201597L).set(this, null);
      com.c.c(586874291471114490L).set(this, null);
      com.c.c(576105615503981375L).set(this, null);
   }

   public boolean L$boolean() {
      return com.c.c(342832808241187441L).getBoolean(this);
   }

   public void j(boolean var1) {
      com.c.c(342832808241187441L).setBoolean(this, var1);
   }

   public void L$void() {
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new DK(this), com.c.c(222883478649268280L).getInt(null));
      Method var10003 = com.c.d(266288712085965362L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public static void F(String[] var0) {
      N = var0;
   }

   public static String[] s$String() {
      return N;
   }

   static {
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
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20222;
      if (e[var3] == null) {
         e[var3] = (int)(d[var3] ^ var1);
      }

      return e[var3];
   }
}





