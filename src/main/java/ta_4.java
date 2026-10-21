import java.awt.Rectangle;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import net.miginfocom.swing.MigLayout;
import org.fife.rsta.ui.demo.StatusBar;
import org.fife.rsta.ui.search.FindDialog;
import org.fife.rsta.ui.search.ReplaceDialog;
import org.fife.rsta.ui.search.SearchEvent;
import org.fife.rsta.ui.search.SearchListener;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.SearchContext;
import org.fife.ui.rtextarea.SearchEngine;
import org.fife.ui.rtextarea.SearchResult;

public class ta_4 extends JFrame implements aL, SearchListener {
   aM f;
   ge_2 W;
   JPanel C;
   private FindDialog L;
   private ReplaceDialog D;
   private RSyntaxTextArea n;
   StatusBar z;
   FF K;
   private static int[] x;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   public static void main(String[] var0) {
   }

   public ta_4() {
      int[] var10000 = m();
      super();
      Object[] var10003 = com.c.f();
      Method var10005 = com.c.d(330644631369405137L);
      Object[] var10004 = var10003;
      ta_4 var37 = this;
      Method var10002 = var10005;

      try {
         var29 = (JMenuBar)var10002.invoke(var37, var10004);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      this.setJMenuBar(var29);
      com.c.c(302714629802079714L).set(this, new FindDialog(this, this));
      com.c.c(531305216617898025L).set(this, new ReplaceDialog(this, this));
      SearchContext var2 = ((FindDialog)com.c.c(302714629802079714L).get(this)).getSearchContext();
      ((ReplaceDialog)com.c.c(531305216617898025L).get(this)).setSearchContext(var2);
      com.c.c(553580509721703423L).set(this, (JPanel)this.getContentPane());
      ((JPanel)com.c.c(553580509721703423L).get(this)).setOpaque(false);
      int[] var1 = var10000;
      this.setLayout(new MigLayout(a(30081, -15541), a(30085, 28006), a(30087, -26267)));
      com.c.c(327693251494669760L).set(this, new aM());
      ((JPanel)com.c.c(553580509721703423L).get(this)).add((aM)com.c.c(327693251494669760L).get(this), a(30084, 8025));
      Method var10001 = (Method)com.c.c(327693251494669760L).get(this);
      Object[] var30 = com.c.f();
      Method var42 = com.c.d(435326248614032175L);
      var10003 = var30;
      Object var31 = var10001;
      var10001 = var42;

      try {
         var10001 = (Method)var10001.invoke(var31, var10003);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      com.c.c(254507677226170946L).set(this, var10001);
      ((JPanel)com.c.c(553580509721703423L).get(this)).add((ge_2)com.c.c(254507677226170946L).get(this), a(30083, 7124));
      var10000 = (int[])com.c.c(327693251494669760L).get(this);
      Object[] var21 = com.c.a(this);
      Method var39 = com.c.d(253827983161591241L);
      var31 = var21;
      var10001 = var10000;
      Method var11 = var39;

      try {
         var11.invoke(var10001, (Object[])var31);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Object[] var12 = com.c.f();
      Method var13 = com.c.d(270389152141252877L);
      var31 = var12;
      var10001 = null;

      try {
         var10000 = (int[])var13.invoke(var10001, (Object[])var31);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Object[] var25 = com.c.f();
      Method var40 = com.c.d(306266403902896148L);
      var31 = var25;
      var10001 = var10000;
      Method var15 = var40;

      try {
         var10000 = (int[])var15.invoke(var10001, (Object[])var31);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      Object[] var27 = com.c.f();
      Method var41 = com.c.d(579757891192141370L);
      var31 = var27;
      var10001 = var10000;
      Method var17 = var41;

      try {
         var18 = (Rectangle)var17.invoke(var10001, (Object[])var31);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      label67: {
         Rectangle var3 = var18;
         if (var1 == null) {
            if (var3 != null) {
               this.setBounds(var3);
               if (var1 == null) {
                  break label67;
               }
            }

            this.setSize(a(11452, 3246236062821485125L), a(11627, 5795432439698033555L));
         }

         this.setLocationRelativeTo(null);
      }

      this.addWindowFocusListener(new fT_3(this));
      this.addWindowListener(new ar_2(this));
      if (com.ky_4.F() != null) {
         c(new int[2]);
      }
   }

   public void O() {
      this.setVisible(false);
      Method var10000 = (Method)com.c.c(327693251494669760L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(409034760944520307L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Object[] var9 = com.c.f();
      var10000 = com.c.d(270389152141252877L);
      var10002 = var9;
      var10001 = null;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(306266403902896148L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var13 = (u6_2)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      u6_2 var1 = var13;
      var10001 = com.c.a(this.getBounds());
      var10003 = com.c.d(473303666637100881L);
      var10002 = var10001;
      u6_2 var25 = var1;
      var10000 = var10003;

      try {
         var10000.invoke(var25, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      Object[] var15 = com.c.f();
      var10000 = com.c.d(270389152141252877L);
      var10002 = var15;
      var10001 = null;

      try {
         var10000 = (Method)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(578864097947885485L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void X() {
      Method var10000 = (Method)com.c.c(327693251494669760L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(230171768324088030L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var12 = (ArrayList)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      ArrayList var2 = var12;
      int[] var13 = m();
      Iterator var3 = var2.iterator();
      int[] var1 = var13;

      while (true) {
         if (var3.hasNext()) {
            t3_2 var4 = (t3_2)var3.next();
            var10001 = com.c.f();
            var10003 = com.c.d(424156930953488367L);
            var10002 = var10001;
            t3_2 var22 = var4;
            var10000 = var10003;

            try {
               var15 = (F8)var10000.invoke(var22, var10002);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            F8 var5 = var15;
            if (var1 != null) {
               break;
            }

            label61: {
               F8 var16 = var5;
               if (var1 == null) {
                  if (!var5.getClass().equals(FF.class)) {
                     break label61;
                  }

                  var16 = var5;
               }

               FF var6 = (FF)var16;
               var10001 = com.c.f();
               var10003 = com.c.d(244719647487910118L);
               var10002 = var10001;
               FF var24 = var6;
               var10000 = var10003;

               try {
                  var10000.invoke(var24, var10002);
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }
            }

            if (var1 == null) {
               continue;
            }
         }

         var10000 = (Method)com.c.c(327693251494669760L).get(this);
         var10001 = com.c.f();
         var10003 = com.c.d(415642889349902360L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var10000.invoke(var10001, var10002);
            break;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      }
   }

   public void c(String var1) {
      FF var3 = null;
      int[] var10000 = m();
      Method var10001 = (Method)com.c.c(327693251494669760L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(230171768324088030L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var35 = (ArrayList)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      ArrayList var4 = var35;
      int[] var2 = var10000;
      Iterator var5 = var4.iterator();

      label111: {
         while (true) {
            if (var5.hasNext()) {
               t3_2 var6 = (t3_2)var5.next();
               Object[] var36 = com.c.f();
               Method var58 = com.c.d(424156930953488367L);
               var10002 = var36;
               t3_2 var37 = var6;
               Method var19 = var58;

               try {
                  var20 = (F8)var19.invoke(var37, var10002);
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }

               F8 var7 = var20;
               if (var2 != null) {
                  break;
               }

               label119: {
                  F8 var21 = var7;
                  if (var2 == null) {
                     if (!var7.getClass().equals(FF.class)) {
                        break label119;
                     }

                     var21 = var7;
                  }

                  FF var8 = (FF)var21;
                  Object[] var38 = com.c.f();
                  Method var59 = com.c.d(448969912548627778L);
                  var10002 = var38;
                  FF var39 = var8;
                  Method var22 = var59;

                  try {
                     var23 = (String)var22.invoke(var39, var10002);
                  } catch (InvocationTargetException var14) {
                     throw var14.getTargetException();
                  }

                  label120: {
                     if (var2 == null) {
                        if (var23 == null) {
                           break label119;
                        }

                        var24 = var8;
                        if (var2 != null) {
                           break label120;
                        }

                        Object[] var40 = com.c.f();
                        Method var60 = com.c.d(448969912548627778L);
                        var10002 = var40;
                        FF var41 = var8;
                        Method var25 = var60;

                        try {
                           var23 = (String)var25.invoke(var41, var10002);
                        } catch (InvocationTargetException var13) {
                           throw var13.getTargetException();
                        }
                     }

                     if (!var23.equals(var1)) {
                        break label119;
                     }

                     var24 = var8;
                  }

                  var3 = var24;
                  var10000 = (int[])com.c.c(327693251494669760L).get(this);
                  Object[] var42 = com.c.a(var6);
                  Method var61 = com.c.d(176011466134249595L);
                  var10002 = var42;
                  var10001 = var10000;
                  Method var27 = var61;

                  try {
                     var27.invoke(var10001, var10002);
                  } catch (InvocationTargetException var12) {
                     throw var12.getTargetException();
                  }
               }

               if (var2 == null) {
                  continue;
               }
            }

            var28 = var3;
            if (var2 != null) {
               break label111;
            }

            if (var3 == null) {
               var3 = new FF();
               File var18 = new File(var1);
               Object[] var44 = com.c.a(var1);
               Method var62 = com.c.d(172971994260078935L);
               var10002 = var44;
               FF var45 = var3;
               Method var29 = var62;

               try {
                  var29.invoke(var45, var10002);
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               var10000 = (int[])com.c.c(327693251494669760L).get(this);
               Object[] var46 = com.c.a(var3, var18.getName());
               Method var63 = com.c.d(407014907239672455L);
               var10002 = var46;
               var10001 = var10000;
               Method var31 = var63;

               try {
                  t3_2 var32 = (t3_2)var31.invoke(var10001, var10002);
                  return;
               } catch (InvocationTargetException var10) {
                  throw var10.getTargetException();
               }
            }
            break;
         }

         var28 = var3;
      }

      Object[] var48 = com.c.a(var1);
      Method var64 = com.c.d(172971994260078935L);
      var10002 = var48;
      FF var49 = var28;
      Method var33 = var64;

      try {
         var33.invoke(var49, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   @Override
   public void P(Y9 var1) {
      this.setTitle(a(30094, -22167));
      Method var10000 = (Method)com.c.c(247518897504885985L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(350430905847772330L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void v(Y9 var1) {
      Method var10000 = (Method)com.c.c(327693251494669760L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(194560825135347400L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var13 = (t3_2)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      t3_2 var3 = var13;
      int[] var14 = m();
      Object[] var40 = com.c.f();
      Method var10005 = com.c.d(424156930953488367L);
      Object[] var10004 = var40;
      t3_2 var41 = var3;
      Method var28 = var10005;

      try {
         var10002 = (Object[])var28.invoke(var41, var10004);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      com.c.c(247518897504885985L).set(this, (FF)var10002);
      var10002 = (Object[])com.c.c(247518897504885985L).get(this);
      Object[] var42 = com.c.f();
      var10005 = com.c.d(505841786096566187L);
      var10004 = var42;
      var10003 = var10002;
      Method var31 = var10005;

      try {
         var10002 = (Object[])var31.invoke(var10003, var10004);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      com.c.c(547657448113180624L).set(this, var10002);
      int[] var2 = var14;
      var10001 = (Object[])com.c.c(247518897504885985L).get(this);
      var10002 = com.c.f();
      Method var50 = com.c.d(209632557416186612L);
      Object[] var44 = var10002;
      var10002 = var10001;
      Method var22 = var50;

      try {
         var10001 = (Object[])var22.invoke(var10002, var44);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      com.c.c(247581788569489208L).set(this, var10001);
      FF var15 = (FF)com.c.c(247518897504885985L).get(this);
      if (var2 == null) {
         var10001 = com.c.f();
         var10003 = com.c.d(448969912548627778L);
         var10002 = var10001;
         FF var25 = var15;
         var10000 = var10003;

         try {
            var17 = (String)var10000.invoke(var25, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         if (var17 != null) {
            File var18;
            var10002 = (Object[])com.c.c(247518897504885985L).get(this);
            Object[] var46 = com.c.f();
            var10005 = com.c.d(448969912548627778L);
            var10004 = var46;
            var10003 = var10002;
            Method var37 = var10005;

            try {
               var10002 = (String)var37.invoke(var10003, var10004);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            var18 = new File(var10002);
            File var4 = var18;
            this.setTitle(var4.getAbsolutePath());
         }

         var15 = (FF)com.c.c(247518897504885985L).get(this);
      }

      if (var2 == null) {
         if (var15 == null) {
            return;
         }

         var15 = (FF)com.c.c(247518897504885985L).get(this);
      }

      var10001 = com.c.f();
      var10003 = com.c.d(155099205039445149L);
      var10002 = var10001;
      FF var27 = var15;
      var10000 = var10003;

      try {
         var10000.invoke(var27, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   @Override
   public void U(Y9 var1) {
   }

   @Override
   public void D(Y9 var1) {
   }

   @Override
   public void K(Y9 var1) {
   }

   private JMenuBar O$JMenuBar() {
      JMenuBar var1 = new JMenuBar();
      JMenu var2 = new JMenu(a(30095, -12441));
      var2.add(new JMenuItem(new Co_2(this)));
      var1.add(var2);
      JMenu var3 = new JMenu(a(30082, 5213));
      var3.add(new JMenuItem(new QY(this)));
      var3.add(new JMenuItem(new xC(this)));
      int var4 = this.getToolkit().getMenuShortcutKeyMask();
      byte var5 = 1;
      KeyStroke var6 = KeyStroke.getKeyStroke(a(27180, 1781817754465881302L), var4 | var5);
      var1.add(var3);
      return var1;
   }

   @Override
   public void searchEvent(SearchEvent var1) {
      int[] var10000 = m();
      SearchEvent.Type var3 = var1.getType();
      SearchContext var4 = var1.getSearchContext();
      int[] var2 = var10000;
      SearchResult var5 = null;
      switch (((int[])com.c.c(145952206637596212L).get(null))[var3.ordinal()]) {
         case 1:
         default:
            var5 = SearchEngine.markAll((RSyntaxTextArea)com.c.c(547657448113180624L).get(this), var4);
            break;
         case 2:
            var5 = SearchEngine.find((RSyntaxTextArea)com.c.c(547657448113180624L).get(this), var4);
            if (var2 == null && !var5.wasFound()) {
               UIManager.getLookAndFeel().provideErrorFeedback((RSyntaxTextArea)com.c.c(547657448113180624L).get(this));
            }
            break;
         case 3:
            var5 = SearchEngine.replace((RSyntaxTextArea)com.c.c(547657448113180624L).get(this), var4);
            if (var2 == null && !var5.wasFound()) {
               UIManager.getLookAndFeel().provideErrorFeedback((RSyntaxTextArea)com.c.c(547657448113180624L).get(this));
            }
            break;
         case 4:
            var5 = SearchEngine.replaceAll((RSyntaxTextArea)com.c.c(547657448113180624L).get(this), var4);
            JOptionPane.showMessageDialog(null, var5.getCount() + a(30092, -30365));
      }

      Object var6 = null;
      if (var5.wasFound()) {
         var6 = a(30080, -3060) + var5.getMarkedCount();
      } else if (var3 == SearchEvent.Type.MARK_ALL) {
         if (var5.getMarkedCount() > 0) {
            var6 = a(30093, -20489) + var5.getMarkedCount();
         } else {
            var6 = "";
         }
      } else {
         var6 = a(30086, 3094);
      }

      ((StatusBar)com.c.c(247581788569489208L).get(this)).setLabel((String)var6);
   }

   @Override
   public String getSelectedText() {
      return ((RSyntaxTextArea)com.c.c(547657448113180624L).get(this)).getSelectedText();
   }

   static RSyntaxTextArea G(ta_4 var0) {
      return (RSyntaxTextArea)com.c.c(547657448113180624L).get(var0);
   }

   static ReplaceDialog W(ta_4 var0) {
      return (ReplaceDialog)com.c.c(531305216617898025L).get(var0);
   }

   public static void c(int[] var0) {
      x = var0;
   }

   public static int[] m() {
      return x;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[12];
      int var11 = 0;
      String var10 = "\u00002;JmxöýÄ(±CÑÈúðÜâ\u000fÿ¢°X\u0081ì^=?þáÂä\u0099\u008c\u0088\\Üµë\u0005ÕÎ|Hn\u000e^\u0003«á¨CPS¾0 S\u0013Û\u0005á-ú4¾ 2-&$\u0019ófM6ÐbX\u0094B\u009f$H\u0011Ú\u009bÿY\u0095\u0004þO\u0086ÁeL\u0099}\u000fóz\u008fµ\u0012ç\u0096=Àg `ë\u0004\u0095\u0002摍綬7)j\u001eAÉ\u0019hÚVºðÛùr\u009e\u007f\u0013Õò\u000f\u009c\u0001+Ê¦\u0096ÿÉ^\b\u000b;ç\u008b¿ºç\u0097Ú)kÏÊ\u0015*\u008e\u0014ÞÇÌ[~\u008c½6\u0016\u008a9ÐúêÉú\u008c\u001bý\u0099I1H\u008bS\u0012IJê,V\u0014û\u0089|wx¬X+·e¶ÏM²÷fa\u0092Uq";
      int var12 = "\u00002;JmxöýÄ(±CÑÈúðÜâ\u000fÿ¢°X\u0081ì^=?þáÂä\u0099\u008c\u0088\\Üµë\u0005ÕÎ|Hn\u000e^\u0003«á¨CPS¾0 S\u0013Û\u0005á-ú4¾ 2-&$\u0019ófM6ÐbX\u0094B\u009f$H\u0011Ú\u009bÿY\u0095\u0004þO\u0086ÁeL\u0099}\u000fóz\u008fµ\u0012ç\u0096=Àg `ë\u0004\u0095\u0002摍綬7)j\u001eAÉ\u0019hÚVºðÛùr\u009e\u007f\u0013Õò\u000f\u009c\u0001+Ê¦\u0096ÿÉ^\b\u000b;ç\u008b¿ºç\u0097Ú)kÏÊ\u0015*\u008e\u0014ÞÇÌ[~\u008c½6\u0016\u008a9ÐúêÉú\u008c\u001bý\u0099I1H\u008bS\u0012IJê,V\u0014û\u0089|wx¬X+·e¶ÏM²÷fa\u0092Uq"
         .length();
      char var9 = '\'';
      c(null);
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 15;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 67;
                        break;
                     case 1:
                        var58 = 85;
                        break;
                     case 2:
                        var58 = 64;
                        break;
                     case 3:
                        var58 = 120;
                        break;
                     case 4:
                        var58 = 108;
                        break;
                     case 5:
                        var58 = 10;
                        break;
                     default:
                        var58 = 109;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     a = var13;
                     b = new String[12];
                     long var0 = 6035783696377121599L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "Ø&%¬Ô]\u0002ô\u0088Ò£\u008c\u000e.\u0082Z\u0015\u009dÎ×^ËG¯";
                     int var5 = "Ø&%¬Ô]\u0002ô\u0088Ò£\u008c\u000e.\u0082Z\u0015\u009dÎ×^ËG¯".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
                              ((long)var7[0] & 255L) << 56
                                 | ((long)var7[1] & 255L) << 48
                                 | ((long)var7[2] & 255L) << 40
                                 | ((long)var7[3] & 255L) << 32
                                 | ((long)var7[4] & 255L) << 24
                                 | ((long)var7[5] & 255L) << 16
                                 | ((long)var7[6] & 255L) << 8
                                 | (long)var7[7] & 255L
                           )
                           ^ var0;
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     c = var6;
                     d = new Integer[3];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "R«\u008b\u008bÓc\u001a;»ã旊柜缴轊嘱\u0002攝互";
                  var12 = "R«\u008b\u008bÓc\u001a;»ã旊柜缴轊嘱\u0002攝互".length();
                  var9 = 15;
                  var16 = -1;
            }

            var10000 = 8;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 30084) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 34;
               break;
            case 1:
               var10000 = 64;
               break;
            case 2:
               var10000 = 87;
               break;
            case 3:
               var10000 = 253;
               break;
            case 4:
               var10000 = 229;
               break;
            case 5:
               var10000 = 43;
               break;
            case 6:
               var10000 = 180;
               break;
            case 7:
               var10000 = 49;
               break;
            case 8:
               var10000 = 233;
               break;
            case 9:
               var10000 = 105;
               break;
            case 10:
               var10000 = 26;
               break;
            case 11:
               var10000 = 192;
               break;
            case 12:
               var10000 = 53;
               break;
            case 13:
               var10000 = 213;
               break;
            case 14:
               var10000 = 136;
               break;
            case 15:
               var10000 = 37;
               break;
            case 16:
               var10000 = 158;
               break;
            case 17:
               var10000 = 172;
               break;
            case 18:
               var10000 = 208;
               break;
            case 19:
               var10000 = 221;
               break;
            case 20:
               var10000 = 91;
               break;
            case 21:
               var10000 = 20;
               break;
            case 22:
               var10000 = 231;
               break;
            case 23:
               var10000 = 101;
               break;
            case 24:
               var10000 = 89;
               break;
            case 25:
               var10000 = 10;
               break;
            case 26:
               var10000 = 25;
               break;
            case 27:
               var10000 = 174;
               break;
            case 28:
               var10000 = 6;
               break;
            case 29:
               var10000 = 7;
               break;
            case 30:
               var10000 = 131;
               break;
            case 31:
               var10000 = 204;
               break;
            case 32:
               var10000 = 249;
               break;
            case 33:
               var10000 = 114;
               break;
            case 34:
               var10000 = 79;
               break;
            case 35:
               var10000 = 188;
               break;
            case 36:
               var10000 = 31;
               break;
            case 37:
               var10000 = 115;
               break;
            case 38:
               var10000 = 48;
               break;
            case 39:
               var10000 = 77;
               break;
            case 40:
               var10000 = 61;
               break;
            case 41:
               var10000 = 227;
               break;
            case 42:
               var10000 = 195;
               break;
            case 43:
               var10000 = 214;
               break;
            case 44:
               var10000 = 110;
               break;
            case 45:
               var10000 = 185;
               break;
            case 46:
               var10000 = 162;
               break;
            case 47:
               var10000 = 205;
               break;
            case 48:
               var10000 = 14;
               break;
            case 49:
               var10000 = 254;
               break;
            case 50:
               var10000 = 54;
               break;
            case 51:
               var10000 = 86;
               break;
            case 52:
               var10000 = 65;
               break;
            case 53:
               var10000 = 119;
               break;
            case 54:
               var10000 = 154;
               break;
            case 55:
               var10000 = 81;
               break;
            case 56:
               var10000 = 127;
               break;
            case 57:
               var10000 = 1;
               break;
            case 58:
               var10000 = 130;
               break;
            case 59:
               var10000 = 216;
               break;
            case 60:
               var10000 = 76;
               break;
            case 61:
               var10000 = 36;
               break;
            case 62:
               var10000 = 99;
               break;
            case 63:
               var10000 = 153;
               break;
            case 64:
               var10000 = 155;
               break;
            case 65:
               var10000 = 245;
               break;
            case 66:
               var10000 = 178;
               break;
            case 67:
               var10000 = 148;
               break;
            case 68:
               var10000 = 124;
               break;
            case 69:
               var10000 = 75;
               break;
            case 70:
               var10000 = 149;
               break;
            case 71:
               var10000 = 203;
               break;
            case 72:
               var10000 = 16;
               break;
            case 73:
               var10000 = 15;
               break;
            case 74:
               var10000 = 50;
               break;
            case 75:
               var10000 = 45;
               break;
            case 76:
               var10000 = 30;
               break;
            case 77:
               var10000 = 140;
               break;
            case 78:
               var10000 = 138;
               break;
            case 79:
               var10000 = 106;
               break;
            case 80:
               var10000 = 187;
               break;
            case 81:
               var10000 = 177;
               break;
            case 82:
               var10000 = 167;
               break;
            case 83:
               var10000 = 69;
               break;
            case 84:
               var10000 = 160;
               break;
            case 85:
               var10000 = 23;
               break;
            case 86:
               var10000 = 150;
               break;
            case 87:
               var10000 = 60;
               break;
            case 88:
               var10000 = 230;
               break;
            case 89:
               var10000 = 244;
               break;
            case 90:
               var10000 = 145;
               break;
            case 91:
               var10000 = 51;
               break;
            case 92:
               var10000 = 39;
               break;
            case 93:
               var10000 = 152;
               break;
            case 94:
               var10000 = 144;
               break;
            case 95:
               var10000 = 80;
               break;
            case 96:
               var10000 = 142;
               break;
            case 97:
               var10000 = 132;
               break;
            case 98:
               var10000 = 235;
               break;
            case 99:
               var10000 = 100;
               break;
            case 100:
               var10000 = 159;
               break;
            case 101:
               var10000 = 194;
               break;
            case 102:
               var10000 = 56;
               break;
            case 103:
               var10000 = 141;
               break;
            case 104:
               var10000 = 202;
               break;
            case 105:
               var10000 = 107;
               break;
            case 106:
               var10000 = 190;
               break;
            case 107:
               var10000 = 156;
               break;
            case 108:
               var10000 = 175;
               break;
            case 109:
               var10000 = 184;
               break;
            case 110:
               var10000 = 71;
               break;
            case 111:
               var10000 = 218;
               break;
            case 112:
               var10000 = 219;
               break;
            case 113:
               var10000 = 40;
               break;
            case 114:
               var10000 = 161;
               break;
            case 115:
               var10000 = 210;
               break;
            case 116:
               var10000 = 176;
               break;
            case 117:
               var10000 = 189;
               break;
            case 118:
               var10000 = 193;
               break;
            case 119:
               var10000 = 78;
               break;
            case 120:
               var10000 = 17;
               break;
            case 121:
               var10000 = 122;
               break;
            case 122:
               var10000 = 240;
               break;
            case 123:
               var10000 = 169;
               break;
            case 124:
               var10000 = 209;
               break;
            case 125:
               var10000 = 11;
               break;
            case 126:
               var10000 = 226;
               break;
            case 127:
               var10000 = 225;
               break;
            case 128:
               var10000 = 181;
               break;
            case 129:
               var10000 = 13;
               break;
            case 130:
               var10000 = 116;
               break;
            case 131:
               var10000 = 57;
               break;
            case 132:
               var10000 = 147;
               break;
            case 133:
               var10000 = 5;
               break;
            case 134:
               var10000 = 197;
               break;
            case 135:
               var10000 = 250;
               break;
            case 136:
               var10000 = 134;
               break;
            case 137:
               var10000 = 243;
               break;
            case 138:
               var10000 = 201;
               break;
            case 139:
               var10000 = 183;
               break;
            case 140:
               var10000 = 247;
               break;
            case 141:
               var10000 = 173;
               break;
            case 142:
               var10000 = 252;
               break;
            case 143:
               var10000 = 237;
               break;
            case 144:
               var10000 = 206;
               break;
            case 145:
               var10000 = 2;
               break;
            case 146:
               var10000 = 42;
               break;
            case 147:
               var10000 = 66;
               break;
            case 148:
               var10000 = 228;
               break;
            case 149:
               var10000 = 59;
               break;
            case 150:
               var10000 = 4;
               break;
            case 151:
               var10000 = 52;
               break;
            case 152:
               var10000 = 165;
               break;
            case 153:
               var10000 = 164;
               break;
            case 154:
               var10000 = 242;
               break;
            case 155:
               var10000 = 248;
               break;
            case 156:
               var10000 = 196;
               break;
            case 157:
               var10000 = 157;
               break;
            case 158:
               var10000 = 27;
               break;
            case 159:
               var10000 = 224;
               break;
            case 160:
               var10000 = 70;
               break;
            case 161:
               var10000 = 41;
               break;
            case 162:
               var10000 = 92;
               break;
            case 163:
               var10000 = 12;
               break;
            case 164:
               var10000 = 0;
               break;
            case 165:
               var10000 = 9;
               break;
            case 166:
               var10000 = 74;
               break;
            case 167:
               var10000 = 47;
               break;
            case 168:
               var10000 = 118;
               break;
            case 169:
               var10000 = 241;
               break;
            case 170:
               var10000 = 3;
               break;
            case 171:
               var10000 = 151;
               break;
            case 172:
               var10000 = 239;
               break;
            case 173:
               var10000 = 111;
               break;
            case 174:
               var10000 = 85;
               break;
            case 175:
               var10000 = 223;
               break;
            case 176:
               var10000 = 133;
               break;
            case 177:
               var10000 = 22;
               break;
            case 178:
               var10000 = 186;
               break;
            case 179:
               var10000 = 112;
               break;
            case 180:
               var10000 = 168;
               break;
            case 181:
               var10000 = 222;
               break;
            case 182:
               var10000 = 220;
               break;
            case 183:
               var10000 = 255;
               break;
            case 184:
               var10000 = 32;
               break;
            case 185:
               var10000 = 211;
               break;
            case 186:
               var10000 = 113;
               break;
            case 187:
               var10000 = 234;
               break;
            case 188:
               var10000 = 199;
               break;
            case 189:
               var10000 = 18;
               break;
            case 190:
               var10000 = 143;
               break;
            case 191:
               var10000 = 117;
               break;
            case 192:
               var10000 = 104;
               break;
            case 193:
               var10000 = 46;
               break;
            case 194:
               var10000 = 67;
               break;
            case 195:
               var10000 = 8;
               break;
            case 196:
               var10000 = 108;
               break;
            case 197:
               var10000 = 179;
               break;
            case 198:
               var10000 = 125;
               break;
            case 199:
               var10000 = 73;
               break;
            case 200:
               var10000 = 68;
               break;
            case 201:
               var10000 = 166;
               break;
            case 202:
               var10000 = 55;
               break;
            case 203:
               var10000 = 139;
               break;
            case 204:
               var10000 = 24;
               break;
            case 205:
               var10000 = 251;
               break;
            case 206:
               var10000 = 44;
               break;
            case 207:
               var10000 = 95;
               break;
            case 208:
               var10000 = 182;
               break;
            case 209:
               var10000 = 19;
               break;
            case 210:
               var10000 = 102;
               break;
            case 211:
               var10000 = 191;
               break;
            case 212:
               var10000 = 62;
               break;
            case 213:
               var10000 = 29;
               break;
            case 214:
               var10000 = 123;
               break;
            case 215:
               var10000 = 198;
               break;
            case 216:
               var10000 = 28;
               break;
            case 217:
               var10000 = 135;
               break;
            case 218:
               var10000 = 88;
               break;
            case 219:
               var10000 = 94;
               break;
            case 220:
               var10000 = 121;
               break;
            case 221:
               var10000 = 58;
               break;
            case 222:
               var10000 = 126;
               break;
            case 223:
               var10000 = 232;
               break;
            case 224:
               var10000 = 103;
               break;
            case 225:
               var10000 = 170;
               break;
            case 226:
               var10000 = 207;
               break;
            case 227:
               var10000 = 171;
               break;
            case 228:
               var10000 = 128;
               break;
            case 229:
               var10000 = 38;
               break;
            case 230:
               var10000 = 215;
               break;
            case 231:
               var10000 = 236;
               break;
            case 232:
               var10000 = 93;
               break;
            case 233:
               var10000 = 82;
               break;
            case 234:
               var10000 = 21;
               break;
            case 235:
               var10000 = 212;
               break;
            case 236:
               var10000 = 109;
               break;
            case 237:
               var10000 = 163;
               break;
            case 238:
               var10000 = 98;
               break;
            case 239:
               var10000 = 96;
               break;
            case 240:
               var10000 = 35;
               break;
            case 241:
               var10000 = 90;
               break;
            case 242:
               var10000 = 83;
               break;
            case 243:
               var10000 = 137;
               break;
            case 244:
               var10000 = 217;
               break;
            case 245:
               var10000 = 146;
               break;
            case 246:
               var10000 = 97;
               break;
            case 247:
               var10000 = 84;
               break;
            case 248:
               var10000 = 129;
               break;
            case 249:
               var10000 = 72;
               break;
            case 250:
               var10000 = 200;
               break;
            case 251:
               var10000 = 246;
               break;
            case 252:
               var10000 = 120;
               break;
            case 253:
               var10000 = 238;
               break;
            case 254:
               var10000 = 63;
               break;
            default:
               var10000 = 33;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9976;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





