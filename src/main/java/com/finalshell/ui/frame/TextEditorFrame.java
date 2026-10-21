package com.finalshell.ui.frame;

import com.finalshell.core.AL;
import com.finalshell.core.FT3;
import com.finalshell.core.T32;
import com.finalshell.core.Y9;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.adapter.SaveActionAdapter;
import com.finalshell.ui.adapter.FindReplaceAdapter;
import com.finalshell.ui.adapter.LocateLineAdapter;
import com.finalshell.ui.listener.Ar2;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.F8;
import com.finalshell.ui.panel.TextFileEditorPanel;
import com.finalshell.ui.panel.Ge2;
import com.finalshell.ui.panel.Ky4;
import java.awt.Rectangle;
import java.lang.reflect.InvocationTargetException;
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

public class TextEditorFrame extends JFrame implements AL, SearchListener {
   public AM f;
   public Ge2 W;
   public JPanel C;
   public FindDialog L;
   public ReplaceDialog D;
   public RSyntaxTextArea n;
   public StatusBar z;
   public TextFileEditorPanel K;
   public static int[] x;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] d;

   public static void main(String[] var0) {
   }

   public TextEditorFrame() {
   super();
      m();
      JMenuBar var10003 = (JMenuBar)(Registry.emptyArgs());
      long var5 = 330644631369405137L;
      Object var4 = var10003;
      var10003 = Ref.h(330644631369405137L, var4, var5);

      try {
         var10003 = (JMenuBar)var10003;
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }

      this.setJMenuBar(var10003);
      FindDialog var49 = new FindDialog(this, this);
      long var7 = 302714629802079714L;
      FindDialog var6 = var49;
      Ref.s(302714629802079714L, var6, var7);
      ReplaceDialog var10004 = new ReplaceDialog(this, this);
      long var9 = 531305216617898025L;
      ReplaceDialog var8 = var10004;
      Ref.s(531305216617898025L, var8, var9);
      Object var10 = 302714629802079714L;
      SearchContext var2 = ((FindDialog)Ref.g(302714629802079714L, var10)).getSearchContext();
      Object var12 = 531305216617898025L;
      ((ReplaceDialog)Ref.g(531305216617898025L, var12)).setSearchContext(var2);
      JPanel var10007 = (JPanel)this.getContentPane();
      long var15 = 553580509721703423L;
      JPanel var14 = var10007;
      Ref.s(553580509721703423L, var14, var15);
      Object var16 = 553580509721703423L;
      ((JPanel)Ref.g(553580509721703423L, var16)).setOpaque(false);
      this.setLayout(new MigLayout(a(30081, -15541), a(30085, 28006), a(30087, -26267)));
      AM var10008 = new AM();
      long var19 = 327693251494669760L;
      AM var18 = var10008;
      Ref.s(327693251494669760L, var18, var19);
      Object var20 = 553580509721703423L;
      JPanel var10009 = (JPanel)Ref.g(553580509721703423L, var20);
      Object var22 = 327693251494669760L;
      this.add((AM)Ref.g(327693251494669760L, var22), a(30084, 8025));
      Object var24 = 327693251494669760L;
      Ref.g(327693251494669760L, var24);
      Object[] var10013 = Registry.emptyArgs();
      long var27 = 435326248614032175L;
      Object[] var26 = var10013;
      var10013 = Ref.h(435326248614032175L, var26, var27);
      long var29 = 254507677226170946L;
      Object var28 = var10013;
      Ref.s(254507677226170946L, var28, var29);
      Object var30 = 553580509721703423L;
      JPanel var10014 = (JPanel)Ref.g(553580509721703423L, var30);
      Object var32 = 254507677226170946L;
      this.add((Ge2)Ref.g(254507677226170946L, var32), a(30083, 7124));
      Object var34 = 327693251494669760L;
      Ref.g(327693251494669760L, var34);
      Object[] var10017 = Registry.packArgs(this);
      long var37 = 253827983161591241L;
      Object[] var36 = var10017;
      Ref.h(253827983161591241L, var36, var37);

      try {
         ;
      } catch (InvocationTargetException var45) {
         throw var45.getTargetException();
      }

      Registry.emptyArgs();
      long var38 = 270389152141252877L;
      Ref.h2(270389152141252877L, var38);
      Object[] var10019 = Registry.emptyArgs();
      long var41 = 306266403902896148L;
      Object[] var40 = var10019;
      Ref.h(306266403902896148L, var40, var41);
      Rectangle var10020 = (Rectangle)(Registry.emptyArgs());
      long var43 = 579757891192141370L;
      Object var42 = var10020;
      var10020 = Ref.h(579757891192141370L, var42, var43);

      try {
         var10020 = (Rectangle)var10020;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      label52: {
         Rectangle var3 = var10020;
         if (this == null) {
            if (var3 != null) {
               this.setBounds(var3);
               if (this == null) {
                  break label52;
               }
            }

            this.setSize(a(11452, 3246236062821485125L), a(11627, 5795432439698033555L));
         }

         this.setLocationRelativeTo(null);
      }

      this.addWindowFocusListener(new FT3(this));
      this.addWindowListener(new Ar2(this));
      if (Ky4.F$arrString() != null) {
         c(new int[2]);
      }
   }

   public void O$void() {
      this.setVisible(false);
      Object var2 = 327693251494669760L;
      Ref.g(327693251494669760L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 409034760944520307L;
      Object[] var4 = var10002;
      Ref.h(409034760944520307L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      Registry.emptyArgs();
      long var6 = 270389152141252877L;
      Ref.h2(270389152141252877L, var6);
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 306266403902896148L;
      Object[] var8 = var10004;
      Ref.h(306266403902896148L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Object[] var10005 = Registry.packArgs(this.getBounds());
      long var11 = 473303666637100881L;
      Object[] var10 = var10005;
      Ref.h(473303666637100881L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Registry.emptyArgs();
      long var12 = 270389152141252877L;
      Ref.h2(270389152141252877L, var12);
      Object[] var10007 = Registry.emptyArgs();
      long var15 = 578864097947885485L;
      Object[] var14 = var10007;
      Ref.h(578864097947885485L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }

   public void X() {
      Object var7 = 327693251494669760L;
      Ref.g(327693251494669760L, var7);
      ArrayList var10002 = (ArrayList)(Registry.emptyArgs());
      long var10 = 230171768324088030L;
      Object var9 = var10002;
      var10002 = Ref.h(230171768324088030L, var9, var10);

      try {
         var10002 = (ArrayList)var10002;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      ArrayList var2 = var10002;
      int[] var25 = m();
      Iterator var3 = var2.iterator();
      int[] var1 = var25;

      while (true) {
         if (var3.hasNext()) {
            T32 var4 = (T32)var3.next();
            F8 var10003 = (F8)(Registry.emptyArgs());
            long var12 = 424156930953488367L;
            Object var11 = var10003;
            var10003 = Ref.h(424156930953488367L, var11, var12);

            try {
               var10003 = (F8)var10003;
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }

            F8 var5 = var10003;
            if (var1 != null) {
               break;
            }

            label61: {
               F8 var28 = var5;
               if (var1 == null) {
                  if (!var5.getClass().equals(TextFileEditorPanel.class)) {
                     break label61;
                  }

                  var28 = var5;
               }

               TextFileEditorPanel var6 = (TextFileEditorPanel)var28;
               Object[] var10004 = Registry.emptyArgs();
               long var14 = 244719647487910118L;
               Object[] var13 = var10004;
               Ref.h(244719647487910118L, var13, var14);

               try {
                  ;
               } catch (InvocationTargetException var21) {
                  throw var21.getTargetException();
               }
            }

            if (var1 == null) {
               continue;
            }
         }

         Object var15 = 327693251494669760L;
         Ref.g(327693251494669760L, var15);
         Object[] var29 = Registry.emptyArgs();
         long var18 = 415642889349902360L;
         Object[] var17 = var29;
         Ref.h(415642889349902360L, var17, var18);

         try {
            break;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }
      }
   }

   public void c(String var1) {
      long var30;
      Object var3 = null;
      m();
      Object var9 = 327693251494669760L;
      Object var10002 = Ref.g(327693251494669760L, var9);
      ArrayList var10003 = (ArrayList)(Registry.emptyArgs());
      long var12 = 230171768324088030L;
      Object var11 = var10003;
      var10003 = Ref.h(230171768324088030L, var11, var12);

      try {
         var10003 = (ArrayList)var10003;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      ArrayList var4 = var10003;
      Object var2 = var10002;
      Iterator var5 = var4.iterator();

      while (true) {
         if (var5.hasNext()) {
            T32 var6 = (T32)var5.next();
            var10003 = Registry.emptyArgs();
            long var14 = 424156930953488367L;
            Object var13 = var10003;
            var10003 = Ref.h(424156930953488367L, var13, var14);

            try {
               var10003 = (F8)var10003;
            } catch (InvocationTargetException var37) {
               throw var37.getTargetException();
            }

            F8 var7 = var10003;
            if (var2 != null) {
               break;
            }

            label119: {
               F8 var46 = var7;
               if (var2 == null) {
                  if (!var7.getClass().equals(TextFileEditorPanel.class)) {
                     break label119;
                  }

                  var46 = var7;
               }

               TextFileEditorPanel var8 = (TextFileEditorPanel)var46;
               String var10004 = (String)(Registry.emptyArgs());
               long var16 = 448969912548627778L;
               Object var15 = var10004;
               var10004 = Ref.h(448969912548627778L, var15, var16);

               try {
                  var10004 = (String)var10004;
               } catch (InvocationTargetException var36) {
                  throw var36.getTargetException();
               }

               label120: {
                  if (var2 == null) {
                     if (var10004 == null) {
                        break label119;
                     }

                     var10004 = var8;
                     if (var2 != null) {
                        break label120;
                     }

                     Object[] var10005 = Registry.emptyArgs();
                     long var18 = 448969912548627778L;
                     Object[] var17 = var10005;
                     Ref.h(448969912548627778L, var17, var18);

                     try {
                        ;
                     } catch (InvocationTargetException var35) {
                        throw var35.getTargetException();
                     }
                  }

                  if (!var10004.equals(var1)) {
                     break label119;
                  }

                  var10004 = var8;
               }

               var3 = var10004;
               Object var19 = 327693251494669760L;
               Ref.g(327693251494669760L, var19);
               Object[] var10006 = Registry.packArgs(var6);
               long var22 = 176011466134249595L;
               Object[] var21 = var10006;
               Ref.h(176011466134249595L, var21, var22);

               try {
                  ;
               } catch (InvocationTargetException var34) {
                  throw var34.getTargetException();
               }
            }

            if (var2 == null) {
               continue;
            }
         }

         if (var2 == null && var3 == null) {
            var3 = new TextFileEditorPanel();
            java.io.File var40 = new java.io.File(var1);
            var10003 = Registry.packArgs(var1);
            long var24 = 172971994260078935L;
            Object var23 = var10003;
            Ref.h(172971994260078935L, var23, var24);

            try {
               ;
            } catch (InvocationTargetException var33) {
               throw var33.getTargetException();
            }

            Object var25 = 327693251494669760L;
            Ref.g(327693251494669760L, var25);
            Object[] var51 = Registry.packArgs(var3, var40.getName());
            long var28 = 407014907239672455L;
            Object[] var27 = var51;
            Ref.h(407014907239672455L, var27, var28);

            try {
               return;
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }
         }
         break;
      }

      var10003 = Registry.packArgs(var1);
      var30 = 172971994260078935L;
      Object var29 = var10003;
      Ref.h(172971994260078935L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }
   }

   @Override
   public void P(Y9 var1) {
      this.setTitle(a(30094, -22167));
      Object var2 = 247518897504885985L;
      Ref.g(247518897504885985L, var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 350430905847772330L;
      Object[] var4 = var10002;
      Ref.h(350430905847772330L, var4, var5);

      try {
         ;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   @Override
   public void v(Y9 var1) {
      Object var5 = 327693251494669760L;
      Ref.g(327693251494669760L, var5);
      Object[] var10002 = Registry.emptyArgs();
      long var8 = 194560825135347400L;
      Object[] var7 = var10002;
      Ref.h(194560825135347400L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      m();
      Object[] var10005 = Registry.emptyArgs();
      long var10 = 424156930953488367L;
      Object[] var9 = var10005;
      TextFileEditorPanel var43 = (TextFileEditorPanel)Ref.h(424156930953488367L, var9, var10);
      long var12 = 247518897504885985L;
      TextFileEditorPanel var11 = var43;
      Ref.s(247518897504885985L, var11, var12);
      Object var13 = 247518897504885985L;
      Object var10007 = Ref.g(247518897504885985L, var13);
      Object[] var10008 = Registry.emptyArgs();
      long var16 = 505841786096566187L;
      Object[] var15 = var10008;
      var10008 = Ref.h(505841786096566187L, var15, var16);
      long var18 = 547657448113180624L;
      Object var17 = var10008;
      Ref.s(547657448113180624L, var17, var18);
      Object var2 = var10007;
      Object var19 = 247518897504885985L;
      Ref.g(247518897504885985L, var19);
      Object[] var10010 = Registry.emptyArgs();
      long var22 = 209632557416186612L;
      Object[] var21 = var10010;
      var10010 = Ref.h(209632557416186612L, var21, var22);
      long var24 = 247581788569489208L;
      Object var23 = var10010;
      Ref.s(247581788569489208L, var23, var24);
      Object var25 = 247518897504885985L;
      TextFileEditorPanel var10011 = (TextFileEditorPanel)Ref.g(247518897504885985L, var25);
      if (var2 == null) {
         String var10012 = (String)(Registry.emptyArgs());
         long var28 = 448969912548627778L;
         Object var27 = var10012;
         var10012 = Ref.h(448969912548627778L, var27, var28);

         try {
            var10012 = (String)var10012;
         } catch (InvocationTargetException var41) {
            throw var41.getTargetException();
         }

         if (var10012 != null) {
            Object var29 = 247518897504885985L;
            Object var10015 = Ref.g(247518897504885985L, var29);
            String var10016 = (String)(Registry.emptyArgs());
            long var32 = 448969912548627778L;
            Object var31 = var10016;
            var10016 = Ref.h(448969912548627778L, var31, var32);

            try {
               var10016 = (String)var10016;
            } catch (InvocationTargetException var40) {
               throw var40.getTargetException();
            }

var10015 = new AM(var10016);
            this.setTitle(this.getAbsolutePath());
         }

         Object var33 = 247518897504885985L;
         TextFileEditorPanel var10013 = (TextFileEditorPanel)Ref.g(247518897504885985L, var33);
      }

      if (var2 == null) {
         if (var10011 == null) {
            return;
         }

         Object var35 = 247518897504885985L;
         TextFileEditorPanel var48 = (TextFileEditorPanel)Ref.g(247518897504885985L, var35);
      }

      Object[] var49 = Registry.emptyArgs();
      long var38 = 155099205039445149L;
      Object[] var37 = var49;
      Ref.h(155099205039445149L, var37, var38);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }
   }

   @Override
   public void MainFrame(Y9 var1) {
   }

   @Override
   public void D(Y9 var1) {
   }

   @Override
   public void K(Y9 var1) {
   }

   public JMenuBar O$JMenuBar() {
      JMenuBar var1 = new JMenuBar();
      JMenu var2 = new JMenu(a(30095, -12441));
      var2.add(new JMenuItem(new SaveActionAdapter(this)));
      var1.add(var2);
      JMenu var3 = new JMenu(a(30082, 5213));
      var3.add(new JMenuItem(new FindReplaceAdapter(this)));
      var3.add(new JMenuItem(new LocateLineAdapter(this)));
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
      switch (((int[])Registry.lookupField(145952206637596212L).get(null))[var3.ordinal()]) {
         case 1:
         default:
            Object var7 = 547657448113180624L;
            var5 = SearchEngine.markAll((RSyntaxTextArea)Ref.g(547657448113180624L, var7), var4);
            break;
         case 2:
            Object var9 = 547657448113180624L;
            var5 = SearchEngine.find((RSyntaxTextArea)Ref.g(547657448113180624L, var9), var4);
            if (var2 == null && !var5.wasFound()) {
               UIManager.getLookAndFeel();
               Object var11 = 547657448113180624L;
               this.provideErrorFeedback((RSyntaxTextArea)Ref.g(547657448113180624L, var11));
            }
            break;
         case 3:
            Object var13 = 547657448113180624L;
            var5 = SearchEngine.replace((RSyntaxTextArea)Ref.g(547657448113180624L, var13), var4);
            if (var2 == null && !var5.wasFound()) {
               UIManager.getLookAndFeel();
               Object var15 = 547657448113180624L;
               this.provideErrorFeedback((RSyntaxTextArea)Ref.g(547657448113180624L, var15));
            }
            break;
         case 4:
            Object var17 = 547657448113180624L;
            var5 = SearchEngine.replaceAll((RSyntaxTextArea)Ref.g(547657448113180624L, var17), var4);
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

      Object var19 = 247581788569489208L;
      ((StatusBar)Ref.g(247581788569489208L, var19)).setLabel((String)var6);
   }

   @Override
   public String getSelectedText() {
      Object var1 = 547657448113180624L;
      return ((RSyntaxTextArea)Ref.g(547657448113180624L, var1)).getSelectedText();
   }

   public static RSyntaxTextArea G(TextEditorFrame var0) {
      Object var1 = 547657448113180624L;
      return (RSyntaxTextArea)Ref.g(547657448113180624L, var1);
   }

   public static ReplaceDialog W(TextEditorFrame var0) {
      Object var1 = 531305216617898025L;
      return (ReplaceDialog)Ref.g(531305216617898025L, var1);
   }

   public static void c(int[] var0) {
      x = var0;
   }

   public static int[] m() {
      return x;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
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

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9976;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var30;
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
}





