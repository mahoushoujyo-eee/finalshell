package com.finalshell.ui.panel;

import com.finalshell.connection.Connection12;
import com.finalshell.core.DN;
import com.finalshell.core.File8;
import com.finalshell.core.Fy2;
import com.finalshell.core.KC;
import com.finalshell.core.Km2;
import com.finalshell.core.LE;
import com.finalshell.core.Td4;
import com.finalshell.core.Uf4;
import com.finalshell.core.YI;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Bu4;
import com.finalshell.task.KI;
import com.finalshell.task.Kq2;
import com.finalshell.task.Ni2;
import com.finalshell.task.Va2;
import com.finalshell.ui.listener.CG3;
import com.finalshell.ui.listener.DO;
import com.finalshell.ui.listener.Fk4;
import com.finalshell.ui.listener.LD;
import com.finalshell.ui.listener.Qy2;
import com.finalshell.ui.listener.VY;
import com.finalshell.ui.listener.Ve2;
import com.finalshell.ui.listener.ZJ;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.MZ;
import com.finalshell.ui.model.Tf4;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.swing.DropMode;
import javax.swing.SwingUtilities;
import javax.swing.JTree.DropLocation;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class Connection4 extends AA {
   LE i;
   Fy2 y;
   Connection4 K;
   HashMap r;
   Tf4 D;
   DefaultMutableTreeNode w;
   FileSystemView d;
   long m;
   boolean U;
   TreePath s;
   Object F;
   DefaultMutableTreeNode B;
   int a;
   boolean S;
   int Y;
   com.finalshell.config.File I;
   HashSet Z;
   HashSet P;
   boolean c;
   Connection12 X;
   com.finalshell.ui.model.Kl4 z;
   Km2 h;
   Address o;
   Tf4 V;
   HashSet T;
   String E;
   ArrayList g;
   Object p;
   boolean j;
   long W;
   boolean J;
   String f;
   java.io.File e;
   long k;
   String t;
   public static int[] M;
   public static String[] l;
   public static String[] n;
   public static long[] A;
   public static Integer[] C;
   public static long[] G;
   public static Long[] H;

   public Connection4(boolean var1, com.finalshell.ui.model.Kl4 var2) {
      Connection4 var3;
      label86: {
         super(new DefaultMutableTreeNode(a(4992, -23343), true));
         HashMap var10001 = new HashMap();
         long var13 = 159245943539531162L;
         HashMap var12 = var10001;
         Ref.s(159245943539531162L, var12, var13);
         long var15 = 458323850669368206L;
         Object var14 = null;
         Ref.s(458323850669368206L, var14, var15);
         Registry.lookupField(191167021799414579L).setBoolean(this, false);
         Registry.lookupField(532071324274744951L).setBoolean(this, false);
         Registry.lookupField(341137764522313600L).setInt(this, b(4479, 8254247404394555649L));
         I();
         HashSet var10004 = new HashSet();
         long var17 = 490343386624486773L;
         HashSet var16 = var10004;
         Ref.s(490343386624486773L, var16, var17);
         HashSet var10005 = new HashSet();
         long var19 = 467542466021000295L;
         HashSet var18 = var10005;
         Ref.s(467542466021000295L, var18, var19);
         Registry.lookupField(274780790290515243L).setBoolean(this, true);
         HashSet var10006 = new HashSet();
         long var21 = 428509894309855334L;
         HashSet var20 = var10006;
         Ref.s(428509894309855334L, var20, var21);
         var3 = this;
         long var23 = 438003004996277190L;
         Object var22 = null;
         Ref.s(438003004996277190L, var22, var23);
         ArrayList var10007 = new ArrayList();
         long var25 = 499316983962981071L;
         ArrayList var24 = var10007;
         Ref.s(499316983962981071L, var24, var25);
         long var27 = 382302557934315212L;
         Ref.s(382302557934315212L, this, var27);
         Registry.lookupField(218493194116849754L).setBoolean(this, true);
         Registry.lookupField(257707175806650747L).setBoolean(this, true);
         FileSystemView var10009 = FileSystemView.getFileSystemView();
         long var29 = 139380390802876288L;
         FileSystemView var28 = var10009;
         Ref.s(139380390802876288L, var28, var29);
         if (this != null) {
            Registry.emptyArgs();
            long var30 = 253808553645062345L;
            Object var10010 = Ref.h2(253808553645062345L, var30);

            try {
               var104 = (Boolean)var10010;
            } catch (InvocationTargetException var103) {
               throw var103.getTargetException();
            }

            if (var104) {
               Object var32 = 139380390802876288L;
               java.io.File var10012 = ((FileSystemView)Ref.g(139380390802876288L, var32)).getHomeDirectory();
               long var35 = 631471321046808880L;
               java.io.File var34 = var10012;
               Ref.s(631471321046808880L, var34, var35);
               Object var36 = 631471321046808880L;
               String var10014 = ((java.io.File)Ref.g(631471321046808880L, var36)).getAbsolutePath();
               long var39 = 159972400659094256L;
               String var38 = var10014;
               Ref.s(159972400659094256L, var38, var39);
               if (this != null) {
                  break label86;
               }

               Ky4.K(new String[1]);
            }

            long var41 = 159972400659094256L;
            String var40 = "/";
            Ref.s(159972400659094256L, var40, var41);
         }

         java.io.File var10011;
         Object var42 = 159972400659094256L;
         super((String)Ref.g(159972400659094256L, var42));
         long var45 = 631471321046808880L;
         java.io.File var44 = var10011;
         Ref.s(631471321046808880L, var44, var45);
      }

      label90: {
         long var47 = 608688273536518013L;
         Ref.s(608688273536518013L, var2, var47);
         Registry.lookupField(274780790290515243L).setBoolean(this, var1);
         Registry.emptyArgs();
         long var48 = 270389152141252877L;
         Ref.h2(270389152141252877L, var48);
         Object[] var10015 = Registry.emptyArgs();
         long var51 = 362821904568389131L;
         Object[] var50 = var10015;
         var10015 = Ref.h(362821904568389131L, var50, var51);
         long var53 = 486969408556937700L;
         Object var52 = var10015;
         Ref.s(486969408556937700L, var52, var53);
         this.setBorder(null);
         long var55 = 230619793659643674L;
         Ref.s(230619793659643674L, this, var55);
         this.getSelectionModel().setSelectionMode(1);
         this.setAutoscrolls(false);
         DefaultMutableTreeNode var10017 = new DefaultMutableTreeNode(a(5001, -8758));
         long var57 = 250204424432541123L;
         DefaultMutableTreeNode var56 = var10017;
         Ref.s(250204424432541123L, var56, var57);
         Fy2 var10019;
         Object var58 = 250204424432541123L;
         super((DefaultMutableTreeNode)Ref.g(250204424432541123L, var58));
         long var61 = 204612050171034220L;
         Fy2 var60 = var10019;
         Ref.s(204612050171034220L, var60, var61);
         Object var62 = 204612050171034220L;
         this.setModel((Fy2)Ref.g(204612050171034220L, var62));
         LE var10021 = new LE();
         long var65 = 403979601484882933L;
         LE var64 = var10021;
         Ref.s(403979601484882933L, var64, var65);
         Object var66 = 403979601484882933L;
         this.setCellRenderer((LE)Ref.g(403979601484882933L, var66));
         this.setEditable(true);
         DN var4 = new DN();
         KC var5 = new KC(this, var4);
         this.setCellEditor(var5);
         Object var68 = 230619793659643674L;
         ((Connection4)Ref.g(230619793659643674L, var68)).setDragEnabled(true);
         Object var70 = 230619793659643674L;
         ((Connection4)Ref.g(230619793659643674L, var70)).setDropMode(DropMode.ON);
         Object var72 = 230619793659643674L;
         Connection4 var10025 = (Connection4)Ref.g(230619793659643674L, var72);
         File8 var10026;
         Object var74 = 230619793659643674L;
         super((Connection4)Ref.g(230619793659643674L, var74));
         var10026.setTransferHandler(var10026);
         Object var76 = 230619793659643674L;
         ((Connection4)Ref.g(230619793659643674L, var76)).getSelectionModel().setSelectionMode(4);
         Object var78 = 230619793659643674L;
         ((Connection4)Ref.g(230619793659643674L, var78)).setEditable(true);
         this.getSelectionModel().addTreeSelectionListener(new Ve2(this));
         this.addMouseListener(new VY(this));
         Object var80 = 230619793659643674L;
         ((Connection4)Ref.g(230619793659643674L, var80)).addTreeWillExpandListener(new LD(this));
         Object var82 = 230619793659643674L;
         ((Connection4)Ref.g(230619793659643674L, var82)).addMouseMotionListener(new DO(this));
         Tf4 var10031 = new Tf4();
         long var85 = 458323850669368206L;
         Tf4 var84 = var10031;
         Ref.s(458323850669368206L, var84, var85);
         java.io.File var6 = new java.io.File((String)Registry.lookupField(478301022169899080L).get(null));
         Connection4 var106 = var6.exists();
         if (this != null) {
            if (var106 == false) {
               var6.mkdirs();
            }

            var106 = this;
            Object var86 = 458323850669368206L;
            Ref.g(458323850669368206L, var86);
            Object[] var10033 = Registry.packArgs(var6);
            long var89 = 349593801287953443L;
            Object[] var88 = var10033;
            Ref.h(349593801287953443L, var88, var89);

            try {
               ;
            } catch (InvocationTargetException var102) {
               throw var102.getTargetException();
            }

            Object var90 = 458323850669368206L;
            Ref.g(458323850669368206L, var90);
            Object[] var10035 = Registry.packArgs(a(5004, 10296));
            long var93 = 124677196473982808L;
            Object[] var92 = var10035;
            Ref.h(124677196473982808L, var92, var93);

            try {
               ;
            } catch (InvocationTargetException var101) {
               throw var101.getTargetException();
            }

            Object var94 = 204612050171034220L;
            Fy2 var10036 = (Fy2)Ref.g(204612050171034220L, var94);
            Object var96 = 250204424432541123L;
            this.nodeStructureChanged((DefaultMutableTreeNode)Ref.g(250204424432541123L, var96));
            if (this == null) {
               break label90;
            }
         }

         if (var106 != false) {
            Object[] var10032 = Registry.packArgs(true);
            long var99 = 587464397243746167L;
            Object[] var98 = var10032;
            Ref.h(587464397243746167L, var98, var99);

            try {
               ;
            } catch (InvocationTargetException var100) {
               throw var100.getTargetException();
            }
         }

         this.getSelectionModel().addTreeSelectionListener(new ZJ(this, var2));
         this.addMouseListener(new Qy2(this));
      }

      KeyListener[] var7 = this.getKeyListeners();
      KeyListener[] var8 = var7;
      int var9 = var7.length;
      int var10 = 0;

      while (true) {
         if (var10 < var9) {
            KeyListener var11 = var8[var10];
            this.removeKeyListener(var11);
            var10++;
            if (var3 == null) {
               break;
            }

            if (var3 != null) {
               continue;
            }
         }

         this.addKeyListener(new CG3(this));
         this.addKeyListener(new Fk4(this));
         break;
      }
   }

   public void y() {
      Registry.packArgs(this);
      long var1 = 242617331513341262L;
      Ref.h2(242617331513341262L, var1);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public Ck4 q(String var1) {
      I();
      Object var4 = 159245943539531162L;
      DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var4)).get(var1);
      Object var10001 = var3;
      if (this != null) {
         if (var3 == null) {
            return null;
         }

         var10001 = var3.getUserObject();
      }

      return (Ck4)var10001;
   }

   public Tf4 c(String var1) {
      I();
      Object var4 = 159245943539531162L;
      DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var4)).get(var1);
      Object var10001 = var3;
      if (this != null) {
         if (var3 == null) {
            return null;
         }

         var10001 = var3.getUserObject();
      }

      return (Tf4)var10001;
   }

   public Tf4 f$tf_4() {
      DefaultMutableTreeNode var10001 = (DefaultMutableTreeNode)(Registry.emptyArgs());
      long var4 = 148691699844242618L;
      Object[] var3 = var10001;
      var10001 = Ref.h(148691699844242618L, var3, var4);

      try {
         var10001 = (DefaultMutableTreeNode)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      DefaultMutableTreeNode var1 = var10001;
      return (Tf4)var1.getUserObject();
   }

   public void U(DefaultMutableTreeNode var1, Tf4 var2) {
      int[] var3 = I();

      try {
         Object[] var10001 = Registry.packArgs(var2);
         long var8 = 300370310318036695L;
         Object[] var7 = var10001;
         Ref.h(300370310318036695L, var7, var8);

         try {
            ;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }
      } catch (Exception var18) {
         var18.printStackTrace();
      }

      List var20 = Registry.emptyArgs();
      long var10 = 369380169373911815L;
      Object[] var9 = var20;
      var20 = Ref.h(369380169373911815L, var9, var10);

      try {
         var20 = (List)var20;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      Iterator var4 = var20.iterator();

      while (true) {
         if (var4.hasNext()) {
            Tf4 var5 = (Tf4)var4.next();
            Object[] var10002 = Registry.packArgs(var1, var5);
            long var12 = 514128027944670770L;
            Object[] var11 = var10002;
            Ref.h(514128027944670770L, var11, var12);

            try {
               ;
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            try {
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            } catch (Exception var19) {
               throw a(var19);
            }
         }

         Object var13 = 204612050171034220L;
         ((Fy2)Ref.g(204612050171034220L, var13)).nodeChanged(var1);
         break;
      }
   }

   public void s(DefaultMutableTreeNode var1, Tf4 var2, TreePath var3, String var4, boolean var5, boolean var6) {
      I();
      long var10 = 307767423934223271L;
      Ref.s(307767423934223271L, var2, var10);
      Object var11 = 490343386624486773L;
      HashSet var10002 = (HashSet)Ref.g(490343386624486773L, var11);
      String var10004 = (String)(Registry.emptyArgs());
      long var14 = 498856411508641826L;
      Object[] var13 = var10004;
      var10004 = Ref.h(498856411508641826L, var13, var14);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var64) {
         throw var64.getTargetException();
      }

      Object var10003;
      var10003 = var2.contains(var10004);
      label141:
      if (this != null) {
         if (var10003 == false) {
            var10003 = this;
            Object var15 = 467542466021000295L;
            HashSet var67 = (HashSet)Ref.g(467542466021000295L, var15);
            String var10006 = (String)(Registry.emptyArgs());
            long var18 = 498856411508641826L;
            Object[] var17 = var10006;
            var10006 = Ref.h(498856411508641826L, var17, var18);

            try {
               var10006 = (String)var10006;
            } catch (InvocationTargetException var63) {
               throw var63.getTargetException();
            }

            boolean var10005 = var2.contains(var10006);
            if (this == null) {
               break label141;
            }

            if (!var10005) {
               Object var19 = 159245943539531162L;
               HashMap var75 = (HashMap)Ref.g(159245943539531162L, var19);
               String var10008 = (String)(Registry.emptyArgs());
               long var22 = 498856411508641826L;
               Object[] var21 = var10008;
               var10008 = Ref.h(498856411508641826L, var21, var22);

               try {
                  var10008 = (String)var10008;
               } catch (InvocationTargetException var62) {
                  throw var62.getTargetException();
               }

               DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var2.get(var10008);
               Object[] var10009 = Registry.emptyArgs();
               long var24 = 498856411508641826L;
               Object[] var23 = var10009;
               var10009 = Registry.packArgs(Ref.h(498856411508641826L, var23, var24));
               long var26 = 177354243147298003L;
               Object[] var25 = var10009;
               Ref.h(177354243147298003L, var25, var26);

               try {
                  ;
               } catch (InvocationTargetException var61) {
                  throw var61.getTargetException();
               }

               Object[] var10011 = Registry.emptyArgs();
               long var28 = 498856411508641826L;
               Object[] var27 = var10011;
               var10011 = Registry.packArgs(Ref.h(498856411508641826L, var27, var28));
               long var30 = 496399544432301198L;
               Object[] var29 = var10011;
               Ref.h(496399544432301198L, var29, var30);

               try {
                  ;
               } catch (InvocationTargetException var60) {
                  throw var60.getTargetException();
               }

               if (this != null) {
                  Object[] var10012 = Registry.emptyArgs();
                  long var32 = 490764181082108623L;
                  Object[] var31 = var10012;
                  var10012 = Ref.h(490764181082108623L, var31, var32);

                  try {
                     var84 = (Boolean)var10012;
                  } catch (InvocationTargetException var59) {
                     throw var59.getTargetException();
                  }

                  if (!var84) {
                     Object var33 = 592764144014982287L;
                     Ref.g(592764144014982287L, var33);
                     Object[] var10014 = Registry.packArgs(true);
                     long var36 = 596499686400442579L;
                     Object[] var35 = var10014;
                     Ref.h(596499686400442579L, var35, var36);

                     try {
                        ;
                     } catch (InvocationTargetException var58) {
                        throw var58.getTargetException();
                     }
                  }

                  Registry.lookupField(388376917454860932L).get(null);
                  Object[] var10013 = Registry.packArgs(new Kq2(this, var1, var2, var8, var6, var3, var4, var5));
                  long var38 = 434592463220957006L;
                  Object[] var37 = var10013;
                  Ref.h(434592463220957006L, var37, var38);

                  try {
                     ;
                  } catch (InvocationTargetException var57) {
                     throw var57.getTargetException();
                  }
               }

               if (this != null) {
                  return;
               }
            }
         }

         var10003 = var2;
         var10004 = Registry.emptyArgs();
         long var40 = 490764181082108623L;
         Object[] var39 = var10004;
         var10004 = Ref.h(490764181082108623L, var39, var40);

         try {
         } catch (InvocationTargetException var56) {
            throw var56.getTargetException();
         }
      }

      label151: {
         if (this != null) {
            if (var10003 != false) {
               return;
            }

            var10003 = this;
            if (this == null) {
               break label151;
            }

            Object var41 = 467542466021000295L;
            HashSet var70 = (HashSet)Ref.g(467542466021000295L, var41);
            String var76 = (String)(Registry.emptyArgs());
            long var44 = 498856411508641826L;
            Object[] var43 = var76;
            var76 = Ref.h(498856411508641826L, var43, var44);

            try {
               var76 = (String)var76;
            } catch (InvocationTargetException var55) {
               throw var55.getTargetException();
            }

            var2.contains(var76);
         }

         if (var10003 != false) {
            Object var45 = 592764144014982287L;
            Ref.g(592764144014982287L, var45);
            Object[] var71 = Registry.packArgs(true);
            long var48 = 596499686400442579L;
            Object[] var47 = var71;
            Ref.h(596499686400442579L, var47, var48);

            try {
               ;
            } catch (InvocationTargetException var54) {
               throw var54.getTargetException();
            }

            if (this != null) {
               return;
            }
         }
      }

      Object var49 = 592764144014982287L;
      Ref.g(592764144014982287L, var49);
      Object[] var72 = Registry.packArgs(false);
      long var52 = 596499686400442579L;
      Object[] var51 = var72;
      Ref.h(596499686400442579L, var51, var52);

      try {
         ;
      } catch (InvocationTargetException var53) {
         throw var53.getTargetException();
      }
   }

   public void X(String var1, boolean var2) {
      Object var4 = 159245943539531162L;
      DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var4)).get(var1);
      Object[] var10002 = Registry.packArgs(var3);
      long var7 = 325887470340955715L;
      Object[] var6 = var10002;
      Ref.h(325887470340955715L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      SwingUtilities.invokeLater(new Bu4(this, var2));
   }

   public Rectangle h() {
      Object[] var10002 = Registry.emptyArgs();
      long var2 = 148691699844242618L;
      Object[] var1 = var10002;
      var10002 = Registry.packArgs(Ref.h(148691699844242618L, var1, var2));
      long var4 = 181146716655875086L;
      Object[] var3 = var10002;
      var10002 = Ref.h(181146716655875086L, var3, var4);

      try {
         return (Rectangle)var10002;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   @Override
   public DefaultMutableTreeNode C(TreePath var1) {
      int[] var2 = I();
      Object var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return null;
         }

         var10000 = var1.getLastPathComponent();
      }

      return (DefaultMutableTreeNode)var10000;
   }

   @Override
   public DefaultMutableTreeNode i(int var1) {
      Object[] var10001 = Registry.packArgs(this.getPathForRow(var1));
      long var3 = 170828279568644375L;
      Object[] var2 = var10001;
      var10001 = Ref.h(170828279568644375L, var2, var3);

      try {
         return (DefaultMutableTreeNode)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public int p(Point var1) {
      Object[] var10001 = Registry.packArgs(var1, true);
      long var3 = 180859681207129054L;
      Object[] var2 = var10001;
      var10001 = Ref.h(180859681207129054L, var2, var3);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public DefaultMutableTreeNode o(Point var1) {
      DefaultMutableTreeNode var2 = null;
      Object[] var10001 = Registry.packArgs(var1);
      long var5 = 282975181547362546L;
      Object[] var4 = var10001;
      var10001 = Ref.h(282975181547362546L, var4, var5);

      try {
         var11 = (Integer)var10001;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      int var3 = var11;
      if (var3 > -1) {
         DefaultMutableTreeNode var10002 = (DefaultMutableTreeNode)(Registry.packArgs(var3));
         long var7 = 290714206414786866L;
         Object[] var6 = var10002;
         var10002 = Ref.h(290714206414786866L, var6, var7);

         try {
            var10002 = (DefaultMutableTreeNode)var10002;
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         var2 = var10002;
      }

      return var2;
   }

   public int Y(Point var1, boolean var2) {
      int[] var3 = I();
      Object var6 = 230619793659643674L;
      if ((Connection4)Ref.g(230619793659643674L, var6) != null) {
         int var4 = 0;

         do {
            Object var8 = 230619793659643674L;
            if (!(this < ((Connection4)Ref.g(230619793659643674L, var8)).getRowCount())) {
               break;
            }

            Rectangle var10003 = (Rectangle)(Registry.packArgs(var4, var2));
            long var11 = 262352195177975129L;
            Object[] var10 = var10003;
            var10003 = Ref.h(262352195177975129L, var10, var11);

            try {
               var10003 = (Rectangle)var10003;
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            Rectangle var5 = var10003;
            if (var3 != null) {
               boolean var15 = var5.contains(var1);
               if (var3 == null) {
                  return var4;
               }

               if (var15) {
                  return var4;
               }

               var4++;
            }
         } while (var3 != null);
      }

      return -1;
   }

   public Rectangle m(int var1, boolean var2) {
      Rectangle var9;
      if (var2) {
         Object[] var10001 = Registry.packArgs(var1);
         long var4 = 238718948396054910L;
         Object[] var3 = var10001;
         Object var8 = Ref.h(238718948396054910L, var3, var4);

         try {
            var9 = (Rectangle)var8;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      } else {
         Object var5 = 230619793659643674L;
         var9 = ((Connection4)Ref.g(230619793659643674L, var5)).getRowBounds(var1);
      }

      return var9;
   }

   public Rectangle l(DefaultMutableTreeNode var1) {
      Object[] var10002 = Registry.packArgs(var1);
      long var3 = 266272579052802176L;
      Object[] var2 = var10002;
      var10002 = Ref.h(266272579052802176L, var2, var3);

      try {
         var9 = (Integer)var10002;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10002 = Registry.packArgs(var9);
      long var5 = 238718948396054910L;
      Object[] var4 = var10002;
      var10002 = Ref.h(238718948396054910L, var4, var5);

      try {
         return (Rectangle)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public int r(DefaultMutableTreeNode var1) {
      TreePath var10002 = (TreePath)(Registry.packArgs(var1));
      long var3 = 340222048447034407L;
      Object[] var2 = var10002;
      var10002 = Ref.h(340222048447034407L, var2, var3);

      try {
         var10002 = (TreePath)var10002;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      return this.getRowForPath(var10002);
   }

   public Rectangle M(int var1) {
      I();
      Object var5 = 230619793659643674L;
      Rectangle var3 = ((Connection4)Ref.g(230619793659643674L, var5)).getRowBounds(var1);
      Rectangle var10001 = var3;
      if (this != null) {
         if (var3 != null) {
            Object var7 = 230619793659643674L;
            Insets var4 = ((Connection4)Ref.g(230619793659643674L, var7)).getInsets();
            var3.x = var4.left;
            Object var9 = 230619793659643674L;
            super.width = ((Connection4)Ref.g(230619793659643674L, var9)).getWidth() - var4.left - var4.right;
         }

         var10001 = var3;
      }

      return var10001;
   }

   @Override
   public void A(DefaultMutableTreeNode var1) {
      TreePath var10001 = (TreePath)(Registry.packArgs(var1));
      long var4 = 340222048447034407L;
      Object[] var3 = var10001;
      var10001 = Ref.h(340222048447034407L, var3, var4);

      try {
         var10001 = (TreePath)var10001;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      TreePath var2 = var10001;
      if (var2 != null) {
         this.setSelectionPath(var2);
      }
   }

   public DefaultMutableTreeNode M$DefaultMutableTreeNode(String var1) {
      Object var2 = 159245943539531162L;
      return (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var2)).get(var1);
   }

   public void Y(String var1) {
      Object var3 = 230619793659643674L;
      Ref.g(230619793659643674L, var3);
      DefaultMutableTreeNode var10002 = (DefaultMutableTreeNode)(Registry.packArgs(var1));
      long var6 = 224847783244984261L;
      Object[] var5 = var10002;
      var10002 = Ref.h(224847783244984261L, var5, var6);

      try {
         var10002 = (DefaultMutableTreeNode)var10002;
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      DefaultMutableTreeNode var2 = var10002;
      Object var7 = 204612050171034220L;
      ((Fy2)Ref.g(204612050171034220L, var7)).removeNodeFromParent(var2);
   }

   public Tf4 Z(String var1, String var2, String var3, boolean var4, Tf4 var5, DefaultMutableTreeNode var6) {
      int[] var7;
      label167: {
         var7 = I();
         Object var10000 = var6;
         if (var7 != null) {
            if (var6 != null) {
               break label167;
            }

            var10000 = this;
            Object var16 = 159245943539531162L;
            DefaultMutableTreeNode var10001 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var16)).get(var1);
         }

         var6 = var10000;
      }

      Tf4 var8 = null;
      DefaultMutableTreeNode var9 = (DefaultMutableTreeNode)var6.getParent();
      var9.getUserObject();
      Tf4 var10 = (Tf4)var9.getUserObject();
      String var75 = (String)(Registry.emptyArgs());
      long var19 = 498856411508641826L;
      Object[] var18 = var75;
      var75 = Ref.h(498856411508641826L, var18, var19);

      try {
         var75 = (String)var75;
      } catch (InvocationTargetException var73) {
         throw var73.getTargetException();
      }

      String var11 = var75;
      Object var20 = 159245943539531162L;
      DefaultMutableTreeNode var12 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var20)).get(var11);
      Object var22 = 159245943539531162L;
      ((HashMap)Ref.g(159245943539531162L, var22)).remove(var11);
      Object[] var10004 = Registry.packArgs(var2, var12);
      long var25 = 314737538622127353L;
      Object[] var24 = var10004;
      Ref.h(314737538622127353L, var24, var25);

      try {
         ;
      } catch (InvocationTargetException var72) {
         throw var72.getTargetException();
      }

      label170: {
         if (var7 != null) {
            Object[] var10005 = Registry.emptyArgs();
            long var27 = 490764181082108623L;
            Object[] var26 = var10005;
            var10005 = Ref.h(490764181082108623L, var26, var27);

            try {
               var79 = (Boolean)var10005;
            } catch (InvocationTargetException var71) {
               throw var71.getTargetException();
            }

            if (var79) {
               var8 = new Tf4(new java.io.File(var2));
               break label170;
            }
         }

         var8 = var5;
         Object[] var80 = Registry.packArgs(var2);
         long var29 = 309720334529505891L;
         Object[] var28 = var80;
         Ref.h(309720334529505891L, var28, var29);

         try {
            ;
         } catch (InvocationTargetException var70) {
            throw var70.getTargetException();
         }

         Object[] var10006 = Registry.packArgs(var3);
         long var31 = 268583885901814073L;
         Object[] var30 = var10006;
         Ref.h(268583885901814073L, var30, var31);

         try {
            ;
         } catch (InvocationTargetException var69) {
            throw var69.getTargetException();
         }
      }

      var12.setUserObject(var8);
      Object[] var10007 = Registry.emptyArgs();
      long var33 = 349405327249700630L;
      Object[] var32 = var10007;
      Ref.h(349405327249700630L, var32, var33);

      try {
         ;
      } catch (InvocationTargetException var68) {
         throw var68.getTargetException();
      }

      Object[] var10008 = Registry.emptyArgs();
      long var35 = 360422804605248482L;
      Object[] var34 = var10008;
      Ref.h(360422804605248482L, var34, var35);

      try {
         ;
      } catch (InvocationTargetException var67) {
         throw var67.getTargetException();
      }

      Object[] var10009 = Registry.packArgs(var2);
      long var37 = 478023116908039358L;
      Object[] var36 = var10009;
      var10009 = Ref.h(478023116908039358L, var36, var37);

      try {
         var82 = (Integer)var10009;
      } catch (InvocationTargetException var66) {
         throw var66.getTargetException();
      }

      int var13 = var82;
      Boolean var10010 = (Boolean)(Registry.packArgs(var9));
      long var39 = 201726770406369370L;
      Object[] var38 = var10010;
      var10010 = Ref.h(201726770406369370L, var38, var39);

      try {
         var10010 = (Boolean)var10010;
      } catch (InvocationTargetException var65) {
         throw var65.getTargetException();
      }

      Object var14 = var10010;
      Boolean var10011 = (Boolean)(Registry.packArgs(var12));
      long var41 = 201726770406369370L;
      Object[] var40 = var10011;
      var10011 = Ref.h(201726770406369370L, var40, var41);

      try {
         var10011 = (Boolean)var10011;
      } catch (InvocationTargetException var64) {
         throw var64.getTargetException();
      }

      Object var15 = var10011;
      Object var42 = 204612050171034220L;
      ((Fy2)Ref.g(204612050171034220L, var42)).removeNodeFromParent(var12);
      Object[] var10013 = Registry.packArgs(var12, var9, var13);
      long var45 = 158472919928157277L;
      Object[] var44 = var10013;
      Ref.h(158472919928157277L, var44, var45);

      try {
         ;
      } catch (InvocationTargetException var63) {
         throw var63.getTargetException();
      }

      Connection4 var87 = (Connection4)var14;
      if (var7 != null) {
         if (var14 != false) {
            this.expandPath(new TreePath(var9.getPath()));
         }

         var87 = (Connection4)var15;
      }

      if (var7 != null) {
         if (var87 != false) {
            this.expandPath(new TreePath(var12.getPath()));
         }

         var87 = (Connection4)var4;
      }

      if (var7 != null) {
         if (var87 != false) {
            Object[] var10014 = Registry.packArgs(var12);
            long var47 = 325887470340955715L;
            Object[] var46 = var10014;
            Ref.h(325887470340955715L, var46, var47);

            try {
               ;
            } catch (InvocationTargetException var62) {
               throw var62.getTargetException();
            }
         }

         var87 = this;
         Object var48 = 490343386624486773L;
         ((HashSet)Ref.g(490343386624486773L, var48)).contains(var1);
      }

      if (var7 != null) {
         if (var87 != false) {
            Object[] var88 = Registry.packArgs(var2);
            long var51 = 177354243147298003L;
            Object[] var50 = var88;
            Ref.h(177354243147298003L, var50, var51);

            try {
               ;
            } catch (InvocationTargetException var61) {
               throw var61.getTargetException();
            }
         }

         Object var52 = 490343386624486773L;
         ((HashSet)Ref.g(490343386624486773L, var52)).remove(var1);
         Object var54 = 467542466021000295L;
         ((HashSet)Ref.g(467542466021000295L, var54)).remove(var1);
      }

      Object[] var89 = Registry.packArgs(var6, var2, var1);
      long var57 = 455357571470037037L;
      Object[] var56 = var89;
      Ref.h(455357571470037037L, var56, var57);

      try {
         ;
      } catch (InvocationTargetException var60) {
         throw var60.getTargetException();
      }

      Object var58 = 285663222664681848L;
      ((Km2)Ref.g(285663222664681848L, var58)).getRowSorter().allRowsChanged();
      if (Ky4.F$arrString() != null) {
         h(new int[3]);
      }

      return var8;
   }

   public Ck4 F(String var1, String var2, String var3) {
      Registry.packArgs(var1);
      long var8 = 405430188584561323L;
      Object var10001 = Ref.h2(405430188584561323L, var8);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      String var4 = (String)var10001;
      Object var10 = 159245943539531162L;
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var10)).get(var4);
      Tf4 var6 = (Tf4)var5.getUserObject();
      Ck4 var10003 = (Ck4)(Registry.packArgs(var1));
      long var13 = 401199004121092607L;
      Object[] var12 = var10003;
      var10003 = Ref.h(401199004121092607L, var12, var13);

      try {
         var10003 = (Ck4)var10003;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      Ck4 var7 = var10003;
      Object[] var10004 = Registry.packArgs(var2);
      long var15 = 584136914483294074L;
      Object[] var14 = var10004;
      Ref.h(584136914483294074L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      Object[] var10005 = Registry.packArgs(var3);
      long var17 = 155850144873198620L;
      Object[] var16 = var10005;
      Ref.h(155850144873198620L, var16, var17);

      try {
         ;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      Object[] var10006 = Registry.emptyArgs();
      long var19 = 349405327249700630L;
      Object[] var18 = var10006;
      Ref.h(349405327249700630L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      Object[] var10007 = Registry.emptyArgs();
      long var21 = 360422804605248482L;
      Object[] var20 = var10007;
      Ref.h(360422804605248482L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      Object var22 = 285663222664681848L;
      ((Km2)Ref.g(285663222664681848L, var22)).getRowSorter().allRowsChanged();
      return var7;
   }

   void i(DefaultMutableTreeNode var1, String var2, String var3) {
      int[] var10000 = I();
      int var5 = 0;
      int[] var4 = var10000;

      while (true) {
         if (var5 < var1.getChildCount()) {
            DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)var1.getChildAt(var5);
            var10000 = (int[])this;
            if (var4 == null) {
               break;
            }

            Object[] var10001 = Registry.packArgs(var6, var2, var3);
            long var8 = 157758653987128050L;
            Object[] var7 = var10001;
            Ref.h(157758653987128050L, var7, var8);

            try {
               ;
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            var5++;
            if (var4 != null) {
               continue;
            }
         }

         var10000 = (int[])var1.getUserObject();
         break;
      }

      Tf4 var13 = (Tf4)var10000;
      Object[] var15 = Registry.packArgs(var13, var2, var3);
      long var10 = 550828352058500889L;
      Object[] var9 = var15;
      Ref.h(550828352058500889L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   void f(String var1, String var2) {
      int[] var3 = I();
      Object var5 = 490343386624486773L;
      Object var10001 = (HashSet)Ref.g(490343386624486773L, var5);
      if (var3 != null) {
         if (var10001.contains(var2)) {
            Object var7 = 490343386624486773L;
            ((HashSet)Ref.g(490343386624486773L, var7)).remove(var2);
            Object[] var10003 = Registry.packArgs(var1);
            long var10 = 177354243147298003L;
            Object[] var9 = var10003;
            Ref.h(177354243147298003L, var9, var10);

            try {
               ;
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }
         }

         var10001 = this;
         Object var11 = 159245943539531162L;
         ((HashMap)Ref.g(159245943539531162L, var11)).remove(var2);
      }

      DefaultMutableTreeNode var4 = (DefaultMutableTreeNode)var10001;
      if (var4 != null) {
         Object[] var10002 = Registry.packArgs(var1, var4);
         long var14 = 314737538622127353L;
         Object[] var13 = var10002;
         Ref.h(314737538622127353L, var13, var14);

         try {
            ;
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }
      }
   }

   void O(Tf4 var1, String var2, String var3) {
      List var10001 = (List)(Registry.emptyArgs());
      long var11 = 248698316749304686L;
      Object[] var10 = var10001;
      var10001 = Ref.h(248698316749304686L, var10, var11);

      try {
         var10001 = (List)var10001;
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      List var5 = var10001;
      int[] var24 = I();
      Iterator var6 = var5.iterator();
      int[] var4 = var24;

      while (var6.hasNext()) {
         Ck4 var7 = (Ck4)var6.next();
         String var10002 = (String)(Registry.emptyArgs());
         long var13 = 605430732347023634L;
         Object[] var12 = var10002;
         var10002 = Ref.h(605430732347023634L, var12, var13);

         try {
            var10002 = (String)var10002;
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         String var8 = var10002;
         String var10003 = (String)(Registry.packArgs(var8, var2, var3));
         long var15 = 445108065698264000L;
         Object[] var14 = var10003;
         var10003 = Ref.h(445108065698264000L, var14, var15);

         try {
            var10003 = (String)var10003;
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }

         String var9 = var10003;
         Object[] var10004 = Registry.packArgs(var9);
         long var17 = 584136914483294074L;
         Object[] var16 = var10004;
         Ref.h(584136914483294074L, var16, var17);

         try {
            ;
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         if (var4 == null) {
            break;
         }
      }
   }

   void G(DefaultMutableTreeNode var1, String var2, String var3) {
      int[] var10000 = I();
      Object var5 = var1.getUserObject();
      int[] var4 = var10000;
      boolean var29 = var5.getClass().equals(Tf4.class);
      if (var4 != null) {
         if (var29) {
            Tf4 var6 = (Tf4)var5;
            String var10001 = (String)(Registry.emptyArgs());
            long var12 = 498856411508641826L;
            Object[] var11 = var10001;
            var10001 = Ref.h(498856411508641826L, var11, var12);

            try {
               var10001 = (String)var10001;
            } catch (InvocationTargetException var28) {
               throw var28.getTargetException();
            }

            String var7 = var10001;
            String var10002 = (String)(Registry.packArgs(var7, var2, var3));
            long var14 = 445108065698264000L;
            Object[] var13 = var10002;
            var10002 = Ref.h(445108065698264000L, var13, var14);

            try {
               var10002 = (String)var10002;
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            String var8 = var10002;
            Object[] var10003 = Registry.packArgs(var8);
            long var16 = 309720334529505891L;
            Object[] var15 = var10003;
            Ref.h(309720334529505891L, var15, var16);

            try {
               ;
            } catch (InvocationTargetException var26) {
               throw var26.getTargetException();
            }

            Object[] var10004 = Registry.packArgs(var6, var2, var3);
            long var18 = 550828352058500889L;
            Object[] var17 = var10004;
            Ref.h(550828352058500889L, var17, var18);

            try {
               ;
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }

            Object[] var10005 = Registry.packArgs(var8, var7);
            long var20 = 344670769051664157L;
            Object[] var19 = var10005;
            Ref.h(344670769051664157L, var19, var20);

            try {
               ;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }

            int var9 = 0;

            while (var9 < var1.getChildCount()) {
               DefaultMutableTreeNode var10 = (DefaultMutableTreeNode)var1.getChildAt(var9);
               Object[] var10006 = Registry.packArgs(var10, var2, var3);
               long var22 = 157758653987128050L;
               Object[] var21 = var10006;
               Ref.h(157758653987128050L, var21, var22);

               try {
                  ;
               } catch (InvocationTargetException var23) {
                  throw var23.getTargetException();
               }

               var9++;
               if (var4 == null) {
                  return;
               }

               if (var4 == null) {
                  break;
               }
            }

            if (var4 != null) {
               return;
            }
         }

         var29 = var5.getClass().equals(Ck4.class);
      }

      if (var29) {
      }
   }

   String n(String var1, String var2, String var3) {
      return var2 + var1.substring(var3.length());
   }

   public void m(String var1) {
      I();
      Object var6 = 159245943539531162L;
      DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var6)).get(var1);
      DefaultMutableTreeNode var10001 = var3;
      if (this != null) {
         if (var3 == null) {
            return;
         }

         var10001 = (DefaultMutableTreeNode)var3.getParent();
      }

      DefaultMutableTreeNode var4 = var10001;
      Tf4 var5 = (Tf4)var4.getUserObject();
      Object[] var10002 = Registry.packArgs(var1);
      long var9 = 630828008397989993L;
      Object[] var8 = var10002;
      Ref.h(630828008397989993L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      Object var10 = 159245943539531162L;
      ((HashMap)Ref.g(159245943539531162L, var10)).remove(var1);
      Object var12 = 490343386624486773L;
      ((HashSet)Ref.g(490343386624486773L, var12)).remove(var1);
      if (this != null) {
         Object var14 = 467542466021000295L;
         ((HashSet)Ref.g(467542466021000295L, var14)).remove(var1);
         if (var3 != null) {
            Object var16 = 204612050171034220L;
            ((Fy2)Ref.g(204612050171034220L, var16)).removeNodeFromParent(var3);
         }
      }

      Object var18 = 608688273536518013L;
      Ref.g(608688273536518013L, var18);
      Object[] var10006 = Registry.packArgs(var5);
      long var21 = 217942201414471271L;
      Object[] var20 = var10006;
      Ref.h(217942201414471271L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }
   }

   public void i(String var1) {
      I();
      Object[] var10001 = Registry.packArgs(var1);
      long var6 = 405430188584561323L;
      Object var10002 = Ref.h2(405430188584561323L, var6);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      String var3 = (String)var10002;
      Object[] var2 = var10001;
      Object var8 = 159245943539531162L;
      DefaultMutableTreeNode var4 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var8)).get(var3);
      var10002 = var4;
      if (var2 != null) {
         if (var4 == null) {
            return;
         }

         var10002 = var4.getUserObject();
      }

      Tf4 var5 = (Tf4)var10002;
      Object[] var10003 = Registry.packArgs(var1);
      long var11 = 548576199562161390L;
      Object[] var10 = var10003;
      Ref.h(548576199562161390L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Object var12 = 608688273536518013L;
      Ref.g(608688273536518013L, var12);
      Object[] var10005 = Registry.packArgs(var5);
      long var15 = 217942201414471271L;
      Object[] var14 = var10005;
      Ref.h(217942201414471271L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }

   public Ck4 G(String var1, String var2, boolean var3) {
      Ck4 var4 = null;
      Object var6 = 159245943539531162L;
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var6)).get(var1);
      Object var8 = 159245943539531162L;
      ((HashMap)Ref.g(159245943539531162L, var8)).remove(var1);
      Object[] var10003 = Registry.packArgs(var2, var5);
      long var11 = 314737538622127353L;
      Object[] var10 = var10003;
      Ref.h(314737538622127353L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Object[] var10004 = Registry.packArgs(var2, var1);
      long var13 = 344670769051664157L;
      Object[] var12 = var10004;
      Ref.h(344670769051664157L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      var4 = new Ck4(new java.io.File(var2));
      var5.setUserObject(var4);
      Object var14 = 204612050171034220L;
      ((Fy2)Ref.g(204612050171034220L, var14)).nodeChanged(var5);
      return var4;
   }

   public Ck4 U(String var1, String var2, boolean var3) {
      Ck4 var4 = null;
      Object var6 = 159245943539531162L;
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var6)).get(var1);
      Object var8 = 159245943539531162L;
      ((HashMap)Ref.g(159245943539531162L, var8)).remove(var1);
      Object[] var10003 = Registry.packArgs(var2, var5);
      long var11 = 314737538622127353L;
      Object[] var10 = var10003;
      Ref.h(314737538622127353L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      var4 = new Ck4(new java.io.File(var2));
      var5.setUserObject(var4);
      Object var12 = 204612050171034220L;
      ((Fy2)Ref.g(204612050171034220L, var12)).nodeChanged(var5);
      return var4;
   }

   @Override
   public String convertValueToText(Object var1, boolean var2, boolean var3, boolean var4, int var5, boolean var6) {
      int[] var7 = I();
      Object var10000 = var1;
      if (var7 != null) {
         if (var1 == null) {
            return "";
         }

         var10000 = var1;
      }

      String var8 = var10000.toString();
      if (var7 == null) {
         return var8;
      } else {
         return var8 != null ? var8 : "";
      }
   }

   public void f(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: invokevirtual com/finalshell/ui/panel/Connection4.setRootVisible (Z)V
      // 005: invokestatic com/finalshell/ui/panel/Connection4.I ()[I
      // 008: aload 0
      // 009: aload 0
      // 00a: ldc2_w 159972400659094256
      // 00d: astore 9
      // 00f: ldc2_w 159972400659094256
      // 012: aload 9
      // 014: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 017: iload 1
      // 018: bipush 1
      // 019: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 01c: ldc2_w 413727787977868950
      // 01f: astore 12
      // 021: astore 11
      // 023: ldc2_w 413727787977868950
      // 026: aload 11
      // 028: aload 12
      // 02a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 02d: pop
      // 02e: goto 035
      // 031: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 034: athrow
      // 035: astore 2
      // 036: aload 0
      // 037: ldc2_w 159245943539531162
      // 03a: astore 13
      // 03c: ldc2_w 159245943539531162
      // 03f: aload 13
      // 041: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 044: checkcast java/util/HashMap
      // 047: aload 0
      // 048: ldc2_w 159972400659094256
      // 04b: astore 15
      // 04d: ldc2_w 159972400659094256
      // 050: aload 15
      // 052: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 055: checkcast java/lang/String
      // 058: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 05b: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 05e: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 061: checkcast com/finalshell/ui/model/Tf4
      // 064: astore 3
      // 065: aload 0
      // 066: ldc2_w 608688273536518013
      // 069: astore 17
      // 06b: ldc2_w 608688273536518013
      // 06e: aload 17
      // 070: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 073: aload 3
      // 074: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 077: ldc2_w 217942201414471271
      // 07a: astore 20
      // 07c: astore 19
      // 07e: ldc2_w 217942201414471271
      // 081: aload 19
      // 083: aload 20
      // 085: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 088: pop
      // 089: goto 090
      // 08c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08f: athrow
      // 090: invokestatic java/io/File.listRoots ()[Ljava/io/File;
      // 093: astore 4
      // 095: aload 4
      // 097: bipush 0
      // 098: aaload
      // 099: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 09c: astore 5
      // 09e: bipush 0
      // 09f: istore 6
      // 0a1: iload 6
      // 0a3: sipush 4348
      // 0a6: ldc2_w 3302863423431288961
      // 0a9: invokestatic com/finalshell/ui/panel/Connection4.b (IJ)I
      // 0ac: if_icmpge 15e
      // 0af: aload 0
      // 0b0: ldc2_w 159245943539531162
      // 0b3: astore 21
      // 0b5: ldc2_w 159245943539531162
      // 0b8: aload 21
      // 0ba: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0bd: checkcast java/util/HashMap
      // 0c0: aload 5
      // 0c2: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0c5: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 0c8: astore 7
      // 0ca: aload 2
      // 0cb: ifnull 14d
      // 0ce: aload 7
      // 0d0: aload 2
      // 0d1: ifnull 19e
      // 0d4: goto 0db
      // 0d7: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: ifnull 141
      // 0de: goto 0e5
      // 0e1: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: aload 7
      // 0e8: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0eb: ldc2_w 325887470340955715
      // 0ee: astore 24
      // 0f0: astore 23
      // 0f2: ldc2_w 325887470340955715
      // 0f5: aload 23
      // 0f7: aload 24
      // 0f9: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0fc: pop
      // 0fd: goto 104
      // 100: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 103: athrow
      // 104: aload 0
      // 105: ldc2_w 250204424432541123
      // 108: astore 25
      // 10a: ldc2_w 250204424432541123
      // 10d: aload 25
      // 10f: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 112: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 115: bipush 0
      // 116: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getChildAt (I)Ljavax/swing/tree/TreeNode;
      // 119: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 11c: astore 8
      // 11e: aload 0
      // 11f: aload 8
      // 121: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 124: ldc2_w 325887470340955715
      // 127: astore 28
      // 129: astore 27
      // 12b: ldc2_w 325887470340955715
      // 12e: aload 27
      // 130: aload 28
      // 132: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 135: pop
      // 136: goto 13d
      // 139: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: aload 2
      // 13e: ifnonnull 15e
      // 141: sipush 24859
      // 144: ldc2_w 2150559354459530008
      // 147: invokestatic com/finalshell/ui/panel/Connection4.c (IJ)J
      // 14a: invokestatic java/lang/Thread.sleep (J)V
      // 14d: goto 157
      // 150: astore 8
      // 152: aload 8
      // 154: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 157: iinc 6 1
      // 15a: aload 2
      // 15b: ifnonnull 0a1
      // 15e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 161: ldc2_w 253808553645062345
      // 164: astore 29
      // 166: ldc2_w 253808553645062345
      // 169: aload 29
      // 16b: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 16e: checkcast java/lang/Boolean
      // 171: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 174: goto 17b
      // 177: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17a: athrow
      // 17b: ifne 1bf
      // 17e: aload 0
      // 17f: ldc2_w 159245943539531162
      // 182: astore 31
      // 184: ldc2_w 159245943539531162
      // 187: aload 31
      // 189: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 18c: checkcast java/util/HashMap
      // 18f: ldc "/"
      // 191: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 194: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 197: goto 19e
      // 19a: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 19d: athrow
      // 19e: astore 6
      // 1a0: aload 0
      // 1a1: aload 6
      // 1a3: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1a6: ldc2_w 432401853757608830
      // 1a9: astore 34
      // 1ab: astore 33
      // 1ad: ldc2_w 432401853757608830
      // 1b0: aload 33
      // 1b2: aload 34
      // 1b4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1b7: pop
      // 1b8: goto 1bf
      // 1bb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1be: athrow
      // 1bf: return
   }

   public void j(String param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/Connection4.I ()[I
      // 003: astore 4
      // 005: aload 0
      // 006: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 009: ldc2_w 124537922262452220
      // 00c: astore 17
      // 00e: astore 16
      // 010: ldc2_w 124537922262452220
      // 013: aload 16
      // 015: aload 17
      // 017: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 01a: checkcast java/lang/Boolean
      // 01d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 020: goto 027
      // 023: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 026: athrow
      // 027: ifeq 058
      // 02a: new java/io/File
      // 02d: dup
      // 02e: aload 1
      // 02f: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 032: astore 5
      // 034: aload 5
      // 036: invokevirtual java/io/File.isDirectory ()Z
      // 039: aload 4
      // 03b: ifnull 054
      // 03e: ifeq 057
      // 041: goto 048
      // 044: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 047: athrow
      // 048: aload 5
      // 04a: invokevirtual java/io/File.exists ()Z
      // 04d: goto 054
      // 050: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: ifne 058
      // 057: return
      // 058: aconst_null
      // 059: astore 5
      // 05b: new java/util/ArrayList
      // 05e: dup
      // 05f: invokespecial java/util/ArrayList.<init> ()V
      // 062: astore 6
      // 064: aconst_null
      // 065: astore 7
      // 067: aload 1
      // 068: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 06b: ldc2_w 159824902428932603
      // 06e: astore 18
      // 070: ldc2_w 159824902428932603
      // 073: aload 18
      // 075: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 078: checkcast java/lang/String
      // 07b: goto 082
      // 07e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 081: athrow
      // 082: astore 8
      // 084: aload 1
      // 085: astore 9
      // 087: aload 9
      // 089: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 08c: ldc2_w 537779894720802184
      // 08f: astore 20
      // 091: ldc2_w 537779894720802184
      // 094: aload 20
      // 096: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 099: checkcast java/lang/Boolean
      // 09c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 09f: goto 0a6
      // 0a2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: ifne 0e0
      // 0a9: aload 6
      // 0ab: bipush 0
      // 0ac: aload 9
      // 0ae: invokevirtual java/util/ArrayList.add (ILjava/lang/Object;)V
      // 0b1: aload 9
      // 0b3: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0b6: ldc2_w 405430188584561323
      // 0b9: astore 22
      // 0bb: ldc2_w 405430188584561323
      // 0be: aload 22
      // 0c0: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 0c3: checkcast java/lang/String
      // 0c6: goto 0cd
      // 0c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: astore 9
      // 0cf: aload 4
      // 0d1: ifnull 25a
      // 0d4: aload 4
      // 0d6: ifnonnull 087
      // 0d9: goto 0e0
      // 0dc: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: ldc2_w 393220934160143516
      // 0e4: astore 24
      // 0e6: ldc2_w 393220934160143516
      // 0e9: aload 24
      // 0eb: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 0ee: checkcast com/finalshell/connection/Connection12
      // 0f1: aload 4
      // 0f3: ifnull 27f
      // 0f6: ifnull 25a
      // 0f9: goto 100
      // 0fc: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ff: athrow
      // 100: aload 0
      // 101: ldc2_w 159245943539531162
      // 104: astore 26
      // 106: ldc2_w 159245943539531162
      // 109: aload 26
      // 10b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 10e: checkcast java/util/HashMap
      // 111: ldc "/"
      // 113: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 116: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 119: astore 10
      // 11b: aload 10
      // 11d: ifnonnull 255
      // 120: new com/finalshell/ui/model/Tf4
      // 123: dup
      // 124: invokespecial com/finalshell/ui/model/Tf4.<init> ()V
      // 127: astore 11
      // 129: aload 11
      // 12b: aload 0
      // 12c: ldc2_w 393220934160143516
      // 12f: astore 28
      // 131: ldc2_w 393220934160143516
      // 134: aload 28
      // 136: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 139: checkcast com/finalshell/connection/Connection12
      // 13c: ifnonnull 147
      // 13f: bipush 1
      // 140: goto 148
      // 143: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 146: athrow
      // 147: bipush 0
      // 148: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 14b: ldc2_w 239155702935749150
      // 14e: astore 31
      // 150: astore 30
      // 152: ldc2_w 239155702935749150
      // 155: aload 30
      // 157: aload 31
      // 159: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 15c: pop
      // 15d: goto 164
      // 160: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 163: athrow
      // 164: aload 11
      // 166: ldc "/"
      // 168: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 16b: ldc2_w 309720334529505891
      // 16e: astore 33
      // 170: astore 32
      // 172: ldc2_w 309720334529505891
      // 175: aload 32
      // 177: aload 33
      // 179: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 17c: pop
      // 17d: goto 184
      // 180: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 183: athrow
      // 184: aload 11
      // 186: ldc "/"
      // 188: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 18b: ldc2_w 268583885901814073
      // 18e: astore 35
      // 190: astore 34
      // 192: ldc2_w 268583885901814073
      // 195: aload 34
      // 197: aload 35
      // 199: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 19c: pop
      // 19d: goto 1a4
      // 1a0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a3: athrow
      // 1a4: new javax/swing/tree/DefaultMutableTreeNode
      // 1a7: dup
      // 1a8: aload 11
      // 1aa: invokespecial javax/swing/tree/DefaultMutableTreeNode.<init> (Ljava/lang/Object;)V
      // 1ad: astore 12
      // 1af: aload 0
      // 1b0: aload 11
      // 1b2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1b5: ldc2_w 498856411508641826
      // 1b8: astore 37
      // 1ba: astore 36
      // 1bc: ldc2_w 498856411508641826
      // 1bf: aload 36
      // 1c1: aload 37
      // 1c3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1c6: goto 1cd
      // 1c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1cc: athrow
      // 1cd: aload 12
      // 1cf: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 1d2: ldc2_w 314737538622127353
      // 1d5: astore 39
      // 1d7: astore 38
      // 1d9: ldc2_w 314737538622127353
      // 1dc: aload 38
      // 1de: aload 39
      // 1e0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e3: pop
      // 1e4: goto 1eb
      // 1e7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ea: athrow
      // 1eb: aload 0
      // 1ec: aload 12
      // 1ee: aload 0
      // 1ef: ldc2_w 250204424432541123
      // 1f2: astore 40
      // 1f4: ldc2_w 250204424432541123
      // 1f7: aload 40
      // 1f9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1fc: bipush 0
      // 1fd: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;I)[Ljava/lang/Object;
      // 200: ldc2_w 158472919928157277
      // 203: astore 43
      // 205: astore 42
      // 207: ldc2_w 158472919928157277
      // 20a: aload 42
      // 20c: aload 43
      // 20e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 211: pop
      // 212: goto 219
      // 215: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 218: athrow
      // 219: aload 0
      // 21a: aload 0
      // 21b: ldc2_w 250204424432541123
      // 21e: astore 44
      // 220: ldc2_w 250204424432541123
      // 223: aload 44
      // 225: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 228: aload 11
      // 22a: new javax/swing/tree/TreePath
      // 22d: dup
      // 22e: aload 12
      // 230: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getPath ()[Ljavax/swing/tree/TreeNode;
      // 233: invokespecial javax/swing/tree/TreePath.<init> ([Ljava/lang/Object;)V
      // 236: aconst_null
      // 237: iload 2
      // 238: iload 3
      // 239: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 23c: ldc2_w 523405946948830526
      // 23f: astore 47
      // 241: astore 46
      // 243: ldc2_w 523405946948830526
      // 246: aload 46
      // 248: aload 47
      // 24a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 24d: pop
      // 24e: goto 255
      // 251: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 254: athrow
      // 255: aload 4
      // 257: ifnonnull 2e9
      // 25a: aload 0
      // 25b: ldc2_w 159245943539531162
      // 25e: astore 48
      // 260: ldc2_w 159245943539531162
      // 263: aload 48
      // 265: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 268: checkcast java/util/HashMap
      // 26b: aload 0
      // 26c: ldc2_w 159972400659094256
      // 26f: astore 50
      // 271: ldc2_w 159972400659094256
      // 274: aload 50
      // 276: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 279: checkcast java/lang/String
      // 27c: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 27f: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 282: astore 10
      // 284: aload 4
      // 286: ifnull 2df
      // 289: aload 10
      // 28b: ifnonnull 2e9
      // 28e: goto 295
      // 291: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 294: athrow
      // 295: aload 0
      // 296: aload 0
      // 297: ldc2_w 250204424432541123
      // 29a: astore 52
      // 29c: ldc2_w 250204424432541123
      // 29f: aload 52
      // 2a1: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2a4: new com/finalshell/ui/model/Tf4
      // 2a7: dup
      // 2a8: aload 0
      // 2a9: ldc2_w 631471321046808880
      // 2ac: astore 54
      // 2ae: ldc2_w 631471321046808880
      // 2b1: aload 54
      // 2b3: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2b6: checkcast java/io/File
      // 2b9: invokespecial com/finalshell/ui/model/Tf4.<init> (Ljava/io/File;)V
      // 2bc: bipush 1
      // 2bd: bipush 1
      // 2be: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 2c1: aconst_null
      // 2c2: bipush 1
      // 2c3: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 2c6: ldc2_w 280876818035359663
      // 2c9: astore 57
      // 2cb: astore 56
      // 2cd: ldc2_w 280876818035359663
      // 2d0: aload 56
      // 2d2: aload 57
      // 2d4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2d7: pop
      // 2d8: goto 2df
      // 2db: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2de: athrow
      // 2df: goto 2e9
      // 2e2: astore 11
      // 2e4: aload 11
      // 2e6: invokevirtual java/lang/Exception.printStackTrace ()V
      // 2e9: bipush 1
      // 2ea: istore 10
      // 2ec: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2ef: ldc2_w 253808553645062345
      // 2f2: astore 58
      // 2f4: ldc2_w 253808553645062345
      // 2f7: aload 58
      // 2f9: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2fc: checkcast java/lang/Boolean
      // 2ff: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 302: goto 309
      // 305: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 308: athrow
      // 309: aload 4
      // 30b: ifnull 334
      // 30e: ifeq 346
      // 311: goto 318
      // 314: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 317: athrow
      // 318: aload 1
      // 319: aload 0
      // 31a: ldc2_w 159972400659094256
      // 31d: astore 60
      // 31f: ldc2_w 159972400659094256
      // 322: aload 60
      // 324: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 327: checkcast java/lang/String
      // 32a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 32d: goto 334
      // 330: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 333: athrow
      // 334: aload 4
      // 336: ifnull 344
      // 339: ifeq 346
      // 33c: goto 343
      // 33f: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 342: athrow
      // 343: bipush 0
      // 344: istore 10
      // 346: aload 6
      // 348: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 34b: astore 11
      // 34d: aload 11
      // 34f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 354: ifeq 47b
      // 357: aload 11
      // 359: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 35e: checkcast java/lang/String
      // 361: astore 12
      // 363: aload 0
      // 364: ldc2_w 159245943539531162
      // 367: astore 62
      // 369: ldc2_w 159245943539531162
      // 36c: aload 62
      // 36e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 371: checkcast java/util/HashMap
      // 374: aload 12
      // 376: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 379: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 37c: astore 13
      // 37e: aload 4
      // 380: ifnull 49a
      // 383: bipush 0
      // 384: istore 14
      // 386: iload 10
      // 388: ifeq 3fa
      // 38b: iload 14
      // 38d: aload 4
      // 38f: ifnull 354
      // 392: bipush 22
      // 394: ldc2_w 7143513546777213034
      // 397: invokestatic com/finalshell/ui/panel/Connection4.b (IJ)I
      // 39a: if_icmpge 3fa
      // 39d: sipush 13750
      // 3a0: ldc2_w 7936045584714528692
      // 3a3: invokestatic com/finalshell/ui/panel/Connection4.c (IJ)J
      // 3a6: invokestatic java/lang/Thread.sleep (J)V
      // 3a9: goto 3b3
      // 3ac: astore 15
      // 3ae: aload 15
      // 3b0: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 3b3: aload 0
      // 3b4: ldc2_w 159245943539531162
      // 3b7: astore 64
      // 3b9: ldc2_w 159245943539531162
      // 3bc: aload 64
      // 3be: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3c1: checkcast java/util/HashMap
      // 3c4: aload 12
      // 3c6: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3c9: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 3cc: astore 13
      // 3ce: aload 4
      // 3d0: ifnull 3f5
      // 3d3: aload 13
      // 3d5: ifnull 3eb
      // 3d8: goto 3df
      // 3db: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3de: athrow
      // 3df: aload 4
      // 3e1: ifnonnull 3fa
      // 3e4: goto 3eb
      // 3e7: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ea: athrow
      // 3eb: iinc 14 1
      // 3ee: goto 3f5
      // 3f1: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f4: athrow
      // 3f5: aload 4
      // 3f7: ifnonnull 386
      // 3fa: aload 13
      // 3fc: aload 4
      // 3fe: ifnull 427
      // 401: ifnull 476
      // 404: goto 40b
      // 407: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 40a: athrow
      // 40b: aload 0
      // 40c: new javax/swing/tree/TreePath
      // 40f: dup
      // 410: aload 13
      // 412: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getPath ()[Ljavax/swing/tree/TreeNode;
      // 415: invokespecial javax/swing/tree/TreePath.<init> ([Ljava/lang/Object;)V
      // 418: invokevirtual com/finalshell/ui/panel/Connection4.expandPath (Ljavax/swing/tree/TreePath;)V
      // 41b: aload 13
      // 41d: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 420: goto 427
      // 423: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 426: athrow
      // 427: checkcast com/finalshell/ui/model/Tf4
      // 42a: astore 14
      // 42c: new javax/swing/tree/TreePath
      // 42f: dup
      // 430: aload 13
      // 432: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getPath ()[Ljavax/swing/tree/TreeNode;
      // 435: invokespecial javax/swing/tree/TreePath.<init> ([Ljava/lang/Object;)V
      // 438: astore 15
      // 43a: aload 0
      // 43b: ldc2_w 428509894309855334
      // 43e: astore 66
      // 440: ldc2_w 428509894309855334
      // 443: aload 66
      // 445: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 448: checkcast java/util/HashSet
      // 44b: aload 1
      // 44c: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 44f: pop
      // 450: aload 0
      // 451: aload 13
      // 453: aload 14
      // 455: aload 15
      // 457: aload 1
      // 458: iload 2
      // 459: iload 3
      // 45a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 45d: ldc2_w 523405946948830526
      // 460: astore 69
      // 462: astore 68
      // 464: ldc2_w 523405946948830526
      // 467: aload 68
      // 469: aload 69
      // 46b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 46e: pop
      // 46f: goto 476
      // 472: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 475: athrow
      // 476: aload 4
      // 478: ifnonnull 34d
      // 47b: aload 0
      // 47c: aload 1
      // 47d: iload 2
      // 47e: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 481: ldc2_w 164933463804385401
      // 484: astore 71
      // 486: astore 70
      // 488: ldc2_w 164933463804385401
      // 48b: aload 70
      // 48d: aload 71
      // 48f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 492: pop
      // 493: goto 49a
      // 496: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 499: athrow
      // 49a: return
   }

   void g(TreeExpansionEvent var1) {
      Registry.lookupField(392487943619353892L).setLong(this, System.currentTimeMillis());
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new Va2(this, var1));
      long var3 = 434592463220957006L;
      Object[] var2 = var10001;
      Ref.h(434592463220957006L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public DefaultMutableTreeNode J(DefaultMutableTreeNode var1, Tf4 var2, int var3) {
      I();
      DefaultMutableTreeNode var5 = new DefaultMutableTreeNode(var2);
      Object[] var10003 = Registry.emptyArgs();
      long var12 = 498856411508641826L;
      Object[] var11 = var10003;
      var10003 = Registry.packArgs(Ref.h(498856411508641826L, var11, var12), var5);
      long var14 = 314737538622127353L;
      Object[] var13 = var10003;
      Ref.h(314737538622127353L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      Object[] var10004 = Registry.packArgs(var5, var1, var3);
      long var16 = 158472919928157277L;
      Object[] var15 = var10004;
      Ref.h(158472919928157277L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      ArrayList var6 = new ArrayList();
      List var10005 = Registry.emptyArgs();
      long var18 = 369380169373911815L;
      Object[] var17 = var10005;
      var10005 = Ref.h(369380169373911815L, var17, var18);

      try {
         var10005 = (List)var10005;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      Iterator var7 = var10005.iterator();
      Tf4 var4 = var2;

      while (true) {
         if (var7.hasNext()) {
            Tf4 var8 = (Tf4)var7.next();
            var6.add(var8);
            if (var4 == null) {
               break;
            }

            if (var4 != null) {
               continue;
            }
         }

         Object[] var40 = Registry.emptyArgs();
         long var20 = 248698316749304686L;
         Object[] var19 = var40;
         var10005 = (List)Ref.h(248698316749304686L, var19, var20);

         try {
            var10005 = var10005;
         } catch (InvocationTargetException var29) {
            throw var29.getTargetException();
         }

         var7 = var10005.iterator();
         break;
      }

      while (true) {
         if (var7.hasNext()) {
            Ck4 var34 = (Ck4)var7.next();
            var6.add(var34);
            if (var4 == null) {
               break;
            }

            if (var4 != null) {
               continue;
            }
         }

         Collections.sort(var6, new MZ(this));
         break;
      }

      for (Object var35 : var6) {
         label120: {
            label121: {
               String var9 = "";
               boolean var43 = var35.getClass().equals(Ck4.class);
               if (var4 != null) {
                  if (var43) {
                     Ck4 var10 = (Ck4)var35;
                     Object[] var10006 = Registry.emptyArgs();
                     long var22 = 605430732347023634L;
                     Object[] var21 = var10006;
                     Ref.h(605430732347023634L, var21, var22);

                     try {
                        ;
                     } catch (InvocationTargetException var28) {
                        throw var28.getTargetException();
                     }

                     if (var4 != null) {
                        break label120;
                     }
                  }

                  var10005 = var35.getClass();
                  if (var4 == null) {
                     break label121;
                  }

                  var43 = var10005.equals(Tf4.class);
               }

               if (!var43) {
                  break label120;
               }

               var10005 = (List)var35;
            }

            Tf4 var36 = (Tf4)var10005;
            Object[] var45 = Registry.emptyArgs();
            long var24 = 498856411508641826L;
            Object[] var23 = var45;
            Ref.h(498856411508641826L, var23, var24);

            try {
               ;
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            Object[] var10007 = Registry.packArgs(var5, var36, var5.getChildCount());
            long var26 = 598053055183063382L;
            Object[] var25 = var10007;
            Ref.h(598053055183063382L, var25, var26);
         }

         if (var4 == null) {
            break;
         }
      }

      return var5;
   }

   int V(Object var1) {
      int[] var10000 = I();
      int var3 = 0;
      int[] var2 = var10000;
      byte var32 = (var1.getClass().equals(Ck4.class)) ? 1 : 0;
      if (var2 != null) {
         if (var32 != 0) {
            Ck4 var4 = (Ck4)var1;
            Object var5 = 486969408556937700L;
            Ref.g(486969408556937700L, var5);
            Object[] var10004 = Registry.emptyArgs();
            long var8 = 272998330038223631L;
            Object[] var7 = var10004;
            var10004 = Registry.packArgs(Ref.h(272998330038223631L, var7, var8));
            long var10 = 161001903655294681L;
            Object[] var9 = var10004;
            var10004 = Ref.h(161001903655294681L, var9, var10);

            try {
               var35 = (Integer)var10004;
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }

            var10004 = Registry.packArgs(var35);
            long var12 = 373451884489290303L;
            Object[] var11 = var10004;
            Ref.h(373451884489290303L, var11, var12);

            try {
               ;
            } catch (InvocationTargetException var29) {
               throw var29.getTargetException();
            }

            Object[] var10005 = Registry.emptyArgs();
            long var14 = 340831131124362618L;
            Object[] var13 = var10005;
            var10005 = Ref.h(340831131124362618L, var13, var14);

            try {
               var43 = (Integer)var10005;
            } catch (InvocationTargetException var28) {
               throw var28.getTargetException();
            }

            var3 = var43;
            if (var2 != null) {
               return var3;
            }
         }

         var32 = (var1.getClass().equals(Tf4.class)) ? 1 : 0;
      }

      if (var2 == null) {
         return var32;
      } else {
         if (var32 != 0) {
            Tf4 var31 = (Tf4)var1;
            Object var15 = 486969408556937700L;
            Ref.g(486969408556937700L, var15);
            Object[] var37 = Registry.emptyArgs();
            long var18 = 543633160597441792L;
            Object[] var17 = var37;
            var37 = Registry.packArgs(Ref.h(543633160597441792L, var17, var18));
            long var20 = 161001903655294681L;
            Object[] var19 = var37;
            var37 = Ref.h(161001903655294681L, var19, var20);

            try {
               var40 = (Integer)var37;
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            var37 = Registry.packArgs(var40);
            long var22 = 179831926534770454L;
            Object[] var21 = var37;
            Ref.h(179831926534770454L, var21, var22);

            try {
               ;
            } catch (InvocationTargetException var26) {
               throw var26.getTargetException();
            }

            Object[] var44 = Registry.emptyArgs();
            long var24 = 122582478688599456L;
            Object[] var23 = var44;
            var44 = Ref.h(122582478688599456L, var23, var24);

            try {
               var46 = (Integer)var44;
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }

            var3 = var46;
         }

         return var3;
      }
   }

   public void F(DefaultMutableTreeNode var1, Ck4 var2) {
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 605430732347023634L;
      Object[] var3 = var10002;
      var10002 = Registry.packArgs(Ref.h(605430732347023634L, var3, var4), var1);
      long var6 = 314737538622127353L;
      Object[] var5 = var10002;
      Ref.h(314737538622127353L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   void u(String var1, DefaultMutableTreeNode var2) {
      Object var3 = 159245943539531162L;
      ((HashMap)Ref.g(159245943539531162L, var3)).put(var1, var2);
   }

   public void c(DefaultMutableTreeNode var1, Tf4 var2) {
      Object[] var10002 = Registry.emptyArgs();
      long var4 = 498856411508641826L;
      Object[] var3 = var10002;
      var10002 = Registry.packArgs(Ref.h(498856411508641826L, var3, var4), var1);
      long var6 = 314737538622127353L;
      Object[] var5 = var10002;
      Ref.h(314737538622127353L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   public void M$void(String var1) {
      Object var2 = 159245943539531162L;
      ((HashMap)Ref.g(159245943539531162L, var2)).remove(var1);
   }

   public void w(DefaultMutableTreeNode var1, Tf4 var2, boolean var3, Boolean var4, DefaultMutableTreeNode var5, boolean var6) throws Exception {
      int[] var7 = I();

      label102: {
         label106: {
            try {
               if (var5 != null) {
                  break label102;
               }

               if (!var6) {
                  break label106;
               }
            } catch (Exception var32) {
               throw a(var32);
            }

            DefaultMutableTreeNode var10001 = (DefaultMutableTreeNode)(Registry.packArgs(var1, var2));
            long var14 = 514128027944670770L;
            Object[] var13 = var10001;
            var10001 = Ref.h(514128027944670770L, var13, var14);

            try {
               var10001 = (DefaultMutableTreeNode)var10001;
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }

            var5 = var10001;
            if (var7 != null) {
               break label102;
            }
         }

         var5 = var1;
      }

      HashSet var8 = new HashSet();
      int var9 = 0;

      while (true) {
         if (var9 < var5.getChildCount()) {
            DefaultMutableTreeNode var10 = (DefaultMutableTreeNode)var5.getChildAt(var9);
            Tf4 var11 = (Tf4)var10.getUserObject();

            try {
               String var10002 = (String)(Registry.emptyArgs());
               long var16 = 179612178163941306L;
               Object[] var15 = var10002;
               var10002 = Ref.h(179612178163941306L, var15, var16);

               try {
                  var10002 = (String)var10002;
               } catch (InvocationTargetException var29) {
                  throw var29.getTargetException();
               }

               var11.add(var10002);
               var9++;
               if (var7 == null) {
                  break;
               }

               if (var7 != null) {
                  continue;
               }
            } catch (Exception var31) {
               throw a(var31);
            }
         }

         Object[] var38 = Registry.packArgs(var2);
         long var18 = 300370310318036695L;
         Object[] var17 = var38;
         Ref.h(300370310318036695L, var17, var18);

         try {
            break;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }
      }

      ArrayList var33 = new ArrayList();
      List var41 = (List)(Registry.emptyArgs());
      long var20 = 369380169373911815L;
      Object[] var19 = var41;
      var41 = Ref.h(369380169373911815L, var19, var20);

      try {
         var41 = (List)var41;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      for (Tf4 var35 : var41) {
         String var10004 = (String)(Registry.emptyArgs());
         long var22 = 179612178163941306L;
         Object[] var21 = var10004;
         var10004 = Ref.h(179612178163941306L, var21, var22);

         try {
            var10004 = (String)var10004;
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }

         if (!var35.contains(var10004)) {
            var10004 = Registry.packArgs(var5, var35);
            long var24 = 514128027944670770L;
            Object[] var23 = var10004;
            var10004 = Ref.h(514128027944670770L, var23, var24);

            try {
               var10004 = (DefaultMutableTreeNode)var10004;
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }

            DefaultMutableTreeNode var12 = var10004;
            var33.add(var12);
         }

         if (var7 == null) {
            break;
         }
      }
   }

   synchronized DefaultMutableTreeNode r(DefaultMutableTreeNode var1, Tf4 var2) {
      DefaultMutableTreeNode var3 = new DefaultMutableTreeNode(var2);
      Object[] var10002 = Registry.emptyArgs();
      long var5 = 498856411508641826L;
      Object[] var4 = var10002;
      var10002 = Registry.packArgs(Ref.h(498856411508641826L, var4, var5), var3);
      long var7 = 314737538622127353L;
      Object[] var6 = var10002;
      Ref.h(314737538622127353L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      Object[] var10003 = Registry.packArgs(var3, var1, var1.getChildCount());
      long var9 = 158472919928157277L;
      Object[] var8 = var10003;
      Ref.h(158472919928157277L, var8, var9);

      try {
         return var3;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   public void w(String var1, String var2, boolean var3) {
      Object var15 = 159245943539531162L;
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var15)).get(var1);
      Object var17 = 159245943539531162L;
      DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var17)).get(var2);
      DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)var5.getParent();
      DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var6.getParent();
      Tf4 var9 = (Tf4)var5.getUserObject();
      Tf4 var10 = (Tf4)var6.getUserObject();
      Tf4 var11 = (Tf4)var7.getUserObject();
      I();
      Object var19 = 204612050171034220L;
      ((Fy2)Ref.g(204612050171034220L, var19)).removeNodeFromParent(var5);
      Object[] var10004 = Registry.packArgs(var6, var9);
      long var22 = 490478023156050364L;
      Object[] var21 = var10004;
      var10004 = Ref.h(490478023156050364L, var21, var22);

      try {
         var65 = (Integer)var10004;
      } catch (InvocationTargetException var63) {
         throw var63.getTargetException();
      }

      int var12 = var65;
      Object[] var10005 = Registry.packArgs(var5, var6, var12);
      long var24 = 158472919928157277L;
      Object[] var23 = var10005;
      Ref.h(158472919928157277L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var62) {
         throw var62.getTargetException();
      }

      Object[] var10006 = Registry.packArgs(var1);
      long var26 = 630828008397989993L;
      Object[] var25 = var10006;
      Ref.h(630828008397989993L, var25, var26);

      try {
         ;
      } catch (InvocationTargetException var61) {
         throw var61.getTargetException();
      }

      Registry.packArgs(var2);
      long var27 = 159824902428932603L;
      Object var10007 = Ref.h2(159824902428932603L, var27);

      try {
         var10007 = (String)var10007;
      } catch (InvocationTargetException var60) {
         throw var60.getTargetException();
      }

      String var13 = (String)var10007;
      new StringBuilder();
      String var10009 = (String)(Registry.emptyArgs());
      long var30 = 498856411508641826L;
      Object[] var29 = var10009;
      var10009 = Ref.h(498856411508641826L, var29, var30);

      try {
         var10009 = (String)var10009;
      } catch (InvocationTargetException var59) {
         throw var59.getTargetException();
      }

      var10.append((String)var10009).append(var13);
      String var10010 = (String)(Registry.emptyArgs());
      long var32 = 179612178163941306L;
      Object[] var31 = var10010;
      var10010 = Ref.h(179612178163941306L, var31, var32);

      try {
         var10010 = (String)var10010;
      } catch (InvocationTargetException var58) {
         throw var58.getTargetException();
      }

      String var14 = var9.append((String)var10010).toString();
      if (this != null) {
         Object[] var10013 = Registry.emptyArgs();
         long var34 = 498856411508641826L;
         Object[] var33 = var10013;
         Object[] var10011 = Registry.packArgs(var14, var9, Ref.h(498856411508641826L, var33, var34));
         long var36 = 157758653987128050L;
         Object[] var35 = var10011;
         Ref.h(157758653987128050L, var35, var36);

         try {
            ;
         } catch (InvocationTargetException var57) {
            throw var57.getTargetException();
         }

         List var10012 = Registry.emptyArgs();
         long var38 = 369380169373911815L;
         Object[] var37 = var10012;
         var10012 = Ref.h(369380169373911815L, var37, var38);

         try {
            var10012 = (List)var10012;
         } catch (InvocationTargetException var56) {
            throw var56.getTargetException();
         }

         var10012.add(var9);
         var10013 = Registry.packArgs(var14);
         long var40 = 309720334529505891L;
         Object[] var39 = var10013;
         Ref.h(309720334529505891L, var39, var40);

         try {
            ;
         } catch (InvocationTargetException var55) {
            throw var55.getTargetException();
         }

         Object[] var10014 = Registry.emptyArgs();
         long var42 = 349405327249700630L;
         Object[] var41 = var10014;
         Ref.h(349405327249700630L, var41, var42);

         try {
            ;
         } catch (InvocationTargetException var54) {
            throw var54.getTargetException();
         }

         if (var3) {
            if (this != null && this.isExpanded(new TreePath(var6.getPath()))) {
               Object[] var10015 = Registry.packArgs(var5);
               long var44 = 325887470340955715L;
               Object[] var43 = var10015;
               Ref.h(325887470340955715L, var43, var44);

               try {
                  ;
               } catch (InvocationTargetException var53) {
                  throw var53.getTargetException();
               }

               if (this != null) {
                  return;
               }
            }

            Object[] var75 = Registry.packArgs(var6);
            long var46 = 325887470340955715L;
            Object[] var45 = var75;
            Ref.h(325887470340955715L, var45, var46);

            try {
               ;
            } catch (InvocationTargetException var52) {
               throw var52.getTargetException();
            }

            if (this != null) {
               return;
            }
         }
      }

      Object var47 = 608688273536518013L;
      Ref.g(608688273536518013L, var47);
      Object[] var71 = Registry.packArgs(var11);
      long var50 = 217942201414471271L;
      Object[] var49 = var71;
      Ref.h(217942201414471271L, var49, var50);

      try {
         ;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }
   }

   public void P(String var1, String var2, String var3) {
      Registry.packArgs(var1);
      long var13 = 405430188584561323L;
      Object var10001 = Ref.h2(405430188584561323L, var13);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      String var4 = (String)var10001;
      Object var15 = 159245943539531162L;
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var15)).get(var4);
      Tf4 var6 = (Tf4)var5.getUserObject();
      Registry.packArgs(var2);
      long var17 = 159824902428932603L;
      Object var10003 = Ref.h2(159824902428932603L, var17);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var47) {
         throw var47.getTargetException();
      }

      String var7 = (String)var10003;
      String var8 = var2 + var7 + var3;
      Ck4 var10004 = (Ck4)(Registry.packArgs(var1));
      long var20 = 401199004121092607L;
      Object[] var19 = var10004;
      var10004 = Ref.h(401199004121092607L, var19, var20);

      try {
         var10004 = (Ck4)var10004;
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }

      Ck4 var9 = var10004;
      Object[] var10005 = Registry.packArgs(var8);
      long var22 = 584136914483294074L;
      Object[] var21 = var10005;
      Ref.h(584136914483294074L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var45) {
         throw var45.getTargetException();
      }

      Object[] var10006 = Registry.packArgs(var3);
      long var24 = 155850144873198620L;
      Object[] var23 = var10006;
      Ref.h(155850144873198620L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      Registry.packArgs(var8);
      long var25 = 405430188584561323L;
      Object var10007 = Ref.h2(405430188584561323L, var25);

      try {
         var10007 = (String)var10007;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      String var10 = (String)var10007;
      Object var27 = 159245943539531162L;
      DefaultMutableTreeNode var11 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var27)).get(var10);
      Tf4 var12 = (Tf4)var11.getUserObject();
      Object[] var10009 = Registry.packArgs(var9);
      long var30 = 157463525259295599L;
      Object[] var29 = var10009;
      Ref.h(157463525259295599L, var29, var30);

      try {
         ;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      Object[] var10010 = Registry.emptyArgs();
      long var32 = 360422804605248482L;
      Object[] var31 = var10010;
      Ref.h(360422804605248482L, var31, var32);

      try {
         ;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      Object[] var10011 = Registry.packArgs(var8);
      long var34 = 548576199562161390L;
      Object[] var33 = var10011;
      Ref.h(548576199562161390L, var33, var34);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      Object var35 = 608688273536518013L;
      Ref.g(608688273536518013L, var35);
      Object[] var10013 = Registry.packArgs(var6);
      long var38 = 217942201414471271L;
      Object[] var37 = var10013;
      Ref.h(217942201414471271L, var37, var38);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }
   }

   public synchronized void d(MutableTreeNode var1, MutableTreeNode var2, int var3) {
      Object var4 = 204612050171034220L;
      ((Fy2)Ref.g(204612050171034220L, var4)).insertNodeInto(var1, var2, var3);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void x(Tf4 var1) {
      I();
      List var10002 = (List)(Registry.emptyArgs());
      long var13 = 369380169373911815L;
      Object[] var12 = var10002;
      var10002 = Ref.h(369380169373911815L, var12, var13);

      try {
         var10002 = (List)var10002;
      } catch (InvocationTargetException var113) {
         throw var113.getTargetException();
      }

      List var3 = var10002;
      List var10003 = (List)(Registry.emptyArgs());
      long var15 = 248698316749304686L;
      Object[] var14 = var10003;
      var10003 = Ref.h(248698316749304686L, var14, var15);

      try {
         var10003 = (List)var10003;
      } catch (InvocationTargetException var112) {
         throw var112.getTargetException();
      }

      List var4 = var10003;
      Tf4 var2 = var1;
      Object var16 = 159245943539531162L;
      HashMap var127 = (HashMap)Ref.g(159245943539531162L, var16);
      List var10005 = Registry.emptyArgs();
      long var19 = 498856411508641826L;
      Object[] var18 = var10005;
      var10005 = Ref.h(498856411508641826L, var18, var19);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var111) {
         throw var111.getTargetException();
      }

      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var1.get(var10005);
      Object var10004 = var5;
      if (var1 != null) {
         if (var5 == null) {
            return;
         }

         var10004 = var5.getUserObject();
      }

      Tf4 var6 = (Tf4)var10004;
      ArrayList var7 = new ArrayList();
      var10005 = Registry.emptyArgs();
      long var21 = 369380169373911815L;
      Object[] var20 = var10005;
      var10005 = Ref.h(369380169373911815L, var20, var21);

      try {
         var10005 = (List)var10005;
      } catch (InvocationTargetException var110) {
         throw var110.getTargetException();
      }

      Iterator var8 = var10005.iterator();

      while (true) {
         if (var8.hasNext()) {
            label365: {
               Tf4 var9 = (Tf4)var8.next();
               var10005 = var3;
               if (var2 != null) {
                  Object[] var10007 = Registry.emptyArgs();
                  long var23 = 498856411508641826L;
                  Object[] var22 = var10007;
                  Registry.packArgs(var9, Ref.h(498856411508641826L, var22, var23));
                  long var24 = 536028396857944776L;
                  var10007 = Ref.h2(536028396857944776L, var24);

                  try {
                     var135 = (Boolean)var10007;
                  } catch (InvocationTargetException var106) {
                     throw var106.getTargetException();
                  }

                  if (var2 == null) {
                     break;
                  }

                  if (var135) {
                     break label365;
                  }

                  Object var26 = 159245943539531162L;
                  HashMap var10008 = (HashMap)Ref.g(159245943539531162L, var26);
                  String var10010 = (String)(Registry.emptyArgs());
                  long var29 = 498856411508641826L;
                  Object[] var28 = var10010;
                  var10010 = Ref.h(498856411508641826L, var28, var29);

                  try {
                     var10010 = (String)var10010;
                  } catch (InvocationTargetException var109) {
                     throw var109.getTargetException();
                  }

                  var9.get(var10010);
               }

               DefaultMutableTreeNode var10 = (DefaultMutableTreeNode)var3;
               String var136 = (String)(Registry.emptyArgs());
               long var31 = 498856411508641826L;
               Object[] var30 = var136;
               var136 = Ref.h(498856411508641826L, var30, var31);

               try {
                  var136 = (String)var136;
               } catch (InvocationTargetException var108) {
                  throw var108.getTargetException();
               }

               var9.add(var136);
               var136 = Registry.packArgs(var10);
               long var33 = 123962211953866727L;
               Object[] var32 = var136;
               Ref.h(123962211953866727L, var32, var33);

               try {
                  ;
               } catch (InvocationTargetException var107) {
                  throw var107.getTargetException();
               }
            }

            if (var2 != null) {
               continue;
            }
         }

         var8 = var7.iterator();
         var10005 = var8.hasNext();
         break;
      }

      while (var10005 != false) {
         String var115 = (String)var8.next();
         var10005 = var6;
         Object[] var10006 = Registry.packArgs(var115);
         long var35 = 630828008397989993L;
         Object[] var34 = var10006;
         Ref.h(630828008397989993L, var34, var35);

         try {
            ;
         } catch (InvocationTargetException var105) {
            throw var105.getTargetException();
         }

         if (var2 == null || var2 == null) {
            break;
         }

         var8.hasNext();
      }

      for (Tf4 var116 : var3) {
         Object[] var140 = Registry.emptyArgs();
         long var37 = 369380169373911815L;
         Object[] var36 = var140;
         Ref.h(369380169373911815L, var36, var37);
         Object[] var10009 = Registry.emptyArgs();
         long var39 = 498856411508641826L;
         Object[] var38 = var10009;
         Registry.packArgs(var116, Ref.h(498856411508641826L, var38, var39));
         long var40 = 536028396857944776L;
         var10009 = Ref.h2(536028396857944776L, var40);

         try {
            var147 = (Boolean)var10009;
         } catch (InvocationTargetException var104) {
            throw var104.getTargetException();
         }

         if (!var147) {
            DefaultMutableTreeNode var119 = new DefaultMutableTreeNode(var116);
            Object[] var10011 = Registry.emptyArgs();
            long var43 = 498856411508641826L;
            Object[] var42 = var10011;
            var10011 = Registry.packArgs(Ref.h(498856411508641826L, var42, var43), var119);
            long var45 = 314737538622127353L;
            Object[] var44 = var10011;
            Ref.h(314737538622127353L, var44, var45);

            try {
               ;
            } catch (InvocationTargetException var103) {
               throw var103.getTargetException();
            }

            List var10012 = Registry.emptyArgs();
            long var47 = 369380169373911815L;
            Object[] var46 = var10012;
            var10012 = Ref.h(369380169373911815L, var46, var47);

            try {
               var10012 = (List)var10012;
            } catch (InvocationTargetException var102) {
               throw var102.getTargetException();
            }

            var10012.add(var116);
            Object[] var10013 = Registry.emptyArgs();
            long var49 = 349405327249700630L;
            Object[] var48 = var10013;
            Ref.h(349405327249700630L, var48, var49);

            try {
               ;
            } catch (InvocationTargetException var101) {
               throw var101.getTargetException();
            }

            Object[] var10014 = Registry.emptyArgs();
            long var51 = 369380169373911815L;
            Object[] var50 = var10014;
            Registry.packArgs(Ref.h(369380169373911815L, var50, var51), var116);
            long var52 = 604658843385035248L;
            Object var10015 = Ref.h2(604658843385035248L, var52);

            try {
               var173 = (Integer)var10015;
            } catch (InvocationTargetException var100) {
               throw var100.getTargetException();
            }

            int var11 = var173;
            Object[] var10016 = Registry.packArgs(var119, var5, var11);
            long var55 = 158472919928157277L;
            Object[] var54 = var10016;
            Ref.h(158472919928157277L, var54, var55);

            try {
               ;
            } catch (InvocationTargetException var99) {
               throw var99.getTargetException();
            }
         }

         if (var2 == null) {
            break;
         }
      }

      ArrayList var114 = new ArrayList();
      List var141 = Registry.emptyArgs();
      long var57 = 248698316749304686L;
      Object[] var56 = var141;
      var141 = Ref.h(248698316749304686L, var56, var57);

      try {
         var141 = (List)var141;
      } catch (InvocationTargetException var98) {
         throw var98.getTargetException();
      }

      Iterator var117 = var141.iterator();

      label370: {
         while (true) {
            if (var117.hasNext()) {
               Ck4 var120 = (Ck4)var117.next();
               var141 = var4;
               Object[] var148 = Registry.emptyArgs();
               long var59 = 605430732347023634L;
               Object[] var58 = var148;
               Registry.packArgs(var120, Ref.h(605430732347023634L, var58, var59));
               long var60 = 486147290058226095L;
               var148 = Ref.h2(486147290058226095L, var60);

               try {
                  var150 = (Boolean)var148;
               } catch (InvocationTargetException var96) {
                  throw var96.getTargetException();
               }

               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  if (!var150) {
                     String var157 = (String)(Registry.emptyArgs());
                     long var63 = 605430732347023634L;
                     Object[] var62 = var157;
                     var157 = Ref.h(605430732347023634L, var62, var63);

                     try {
                        var157 = (String)var157;
                     } catch (InvocationTargetException var97) {
                        throw var97.getTargetException();
                     }

                     var120.add(var157);
                  }
               }

               if (var2 != null) {
                  continue;
               }
            }

            var117 = var114.iterator();
            var141 = var117.hasNext();
            break;
         }

         while (var141 != false) {
            String var121 = (String)var117.next();
            var141 = var6;
            Object[] var145 = Registry.packArgs(var121);
            long var65 = 548576199562161390L;
            Object[] var64 = var145;
            Ref.h(548576199562161390L, var64, var65);

            try {
               ;
            } catch (InvocationTargetException var95) {
               throw var95.getTargetException();
            }

            if (var2 == null) {
               break label370;
            }

            if (var2 == null) {
               break;
            }

            var117.hasNext();
         }

         var117 = var4.iterator();
      }

      while (true) {
         if (var117.hasNext()) {
            Ck4 var122 = (Ck4)var117.next();
            if (var2 == null) {
               break;
            }

            Object[] var151 = Registry.emptyArgs();
            long var67 = 248698316749304686L;
            Object[] var66 = var151;
            Ref.h(248698316749304686L, var66, var67);
            Object[] var160 = Registry.emptyArgs();
            long var69 = 605430732347023634L;
            Object[] var68 = var160;
            Registry.packArgs(var122, Ref.h(605430732347023634L, var68, var69));
            long var70 = 486147290058226095L;
            var160 = Ref.h2(486147290058226095L, var70);

            try {
               var162 = (Boolean)var160;
            } catch (InvocationTargetException var94) {
               throw var94.getTargetException();
            }

            label377: {
               if (var2 != null) {
                  if (var162) {
                     break label377;
                  }

                  List var165 = Registry.emptyArgs();
                  long var73 = 248698316749304686L;
                  Object[] var72 = var165;
                  var165 = Ref.h(248698316749304686L, var72, var73);

                  try {
                     var165 = (List)var165;
                  } catch (InvocationTargetException var93) {
                     throw var93.getTargetException();
                  }

                  var165.add(var122);
               }

               Object[] var168 = Registry.emptyArgs();
               long var75 = 360422804605248482L;
               Object[] var74 = var168;
               Ref.h(360422804605248482L, var74, var75);

               try {
                  ;
               } catch (InvocationTargetException var92) {
                  throw var92.getTargetException();
               }
            }

            if (var2 != null) {
               continue;
            }
         }

         Object[] var154 = Registry.emptyArgs();
         long var77 = 369380169373911815L;
         Object[] var76 = var154;
         var154 = Registry.packArgs(Ref.h(369380169373911815L, var76, var77));
         long var79 = 407744580579201251L;
         Object[] var78 = var154;
         Ref.h(407744580579201251L, var78, var79);

         try {
            break;
         } catch (InvocationTargetException var91) {
            throw var91.getTargetException();
         }
      }

      Object[] var169 = Registry.emptyArgs();
      long var81 = 248698316749304686L;
      Object[] var80 = var169;
      var169 = Registry.packArgs(Ref.h(248698316749304686L, var80, var81));
      long var83 = 486938477933204520L;
      Object[] var82 = var169;
      Ref.h(486938477933204520L, var82, var83);

      try {
         ;
      } catch (InvocationTargetException var90) {
         throw var90.getTargetException();
      }

      Uf4 var118 = new Uf4(Registry.lookupField(451440066276164151L).getInt(null));
      Object[] var171 = Registry.packArgs(var1);
      long var85 = 558704810566468504L;
      Object[] var84 = var171;
      Ref.h(558704810566468504L, var84, var85);

      try {
         ;
      } catch (InvocationTargetException var89) {
         throw var89.getTargetException();
      }

      Object[] var172 = Registry.packArgs(var118);
      long var87 = 161850615995031181L;
      Object[] var86 = var172;
      Ref.h(161850615995031181L, var86, var87);

      try {
         ;
      } catch (InvocationTargetException var88) {
         throw var88.getTargetException();
      }
   }

   public void W(Td4 var1) {
      Object var2 = 499316983962981071L;
      ((ArrayList)Ref.g(499316983962981071L, var2)).add(var1);
   }

   public void r(Uf4 var1) {
      SwingUtilities.invokeLater(new KI(this, var1));
   }

   void N(DefaultMutableTreeNode var1) {
      int[] var2 = I();
      Object var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return;
         }

         var10000 = var1.getUserObject();
      }

      Object var3 = var10000;
      byte var20 = (var3.getClass().equals(Tf4.class)) ? 1 : 0;
      if (var2 != null) {
         if (var20 == 0) {
            return;
         }

         var20 = 0;
      }

      int var4 = var20;

      while (var4 < var1.getChildCount()) {
         DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var1.getChildAt(var4);
         Object[] var10001 = Registry.packArgs(var5);
         long var7 = 123962211953866727L;
         Object[] var6 = var10001;
         Ref.h(123962211953866727L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         var4++;
         if (var2 == null) {
            return;
         }

         if (var2 == null) {
            break;
         }
      }

      Tf4 var18 = (Tf4)var3;
      String var21 = (String)(Registry.emptyArgs());
      long var9 = 498856411508641826L;
      Object[] var8 = var21;
      var21 = Ref.h(498856411508641826L, var8, var9);

      try {
         var21 = (String)var21;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      String var19 = var21;
      Object var10 = 490343386624486773L;
      ((HashSet)Ref.g(490343386624486773L, var10)).remove(var19);
      Object var12 = 159245943539531162L;
      ((HashMap)Ref.g(159245943539531162L, var12)).remove(var19);
      Object var14 = 204612050171034220L;
      ((Fy2)Ref.g(204612050171034220L, var14)).removeNodeFromParent(var1);
   }

   public void H(Tf4 var1, String var2, String var3, boolean var4) {
      I();
      Object var13 = 159245943539531162L;
      DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var13)).get(var2);
      Tf4 var7 = (Tf4)var6.getUserObject();
      Object[] var10003 = Registry.emptyArgs();
      long var16 = 498856411508641826L;
      Object[] var15 = var10003;
      Registry.packArgs(Ref.h(498856411508641826L, var15, var16));
      long var17 = 159824902428932603L;
      Object var10004 = Ref.h2(159824902428932603L, var17);

      try {
         var10004 = (String)var10004;
      } catch (InvocationTargetException var86) {
         throw var86.getTargetException();
      }

      String var8 = (String)var10004;
      var10004 = new StringBuilder();
      String var10006 = (String)(Registry.emptyArgs());
      long var20 = 498856411508641826L;
      Object[] var19 = var10006;
      var10006 = Ref.h(498856411508641826L, var19, var20);

      try {
         var10006 = (String)var10006;
      } catch (InvocationTargetException var85) {
         throw var85.getTargetException();
      }

      String var9 = var7.append((String)var10006).append(var8).append(var3).toString();
      StringBuilder var5 = (StringBuilder)var10004;
      long var22 = 438003004996277190L;
      Ref.s(438003004996277190L, var9, var22);
      Object var10 = null;
      Object var23 = 490343386624486773L;
      HashSet var94 = (HashSet)Ref.g(490343386624486773L, var23);
      String var10008 = (String)(Registry.emptyArgs());
      long var26 = 498856411508641826L;
      Object[] var25 = var10008;
      var10008 = Ref.h(498856411508641826L, var25, var26);

      try {
         var10008 = (String)var10008;
      } catch (InvocationTargetException var84) {
         throw var84.getTargetException();
      }

      label195: {
         label190: {
            Connection4 var10007 = var7.contains(var10008);
            if (var5 != null) {
               if (var10007 == false) {
                  break label190;
               }

               var10007 = this;
               Object var27 = 467542466021000295L;
               HashSet var98 = (HashSet)Ref.g(467542466021000295L, var27);
               String var10010 = (String)(Registry.emptyArgs());
               long var30 = 498856411508641826L;
               Object[] var29 = var10010;
               var10010 = Ref.h(498856411508641826L, var29, var30);

               try {
                  var10010 = (String)var10010;
               } catch (InvocationTargetException var83) {
                  throw var83.getTargetException();
               }

               var7.contains(var10010);
            }

            if (var10007 == false) {
               Tf4 var87;
               label198: {
                  var87 = null;
                  Tf4 var95 = var1;
                  if (var5 != null) {
                     if (var1 != null) {
                        var87 = var1;
                        break label198;
                     }

                     var95 = new Tf4();
                  }

                  var87 = var95;
                  var10008 = Registry.packArgs(false);
                  long var32 = 239155702935749150L;
                  Object[] var31 = var10008;
                  Ref.h(239155702935749150L, var31, var32);

                  try {
                     ;
                  } catch (InvocationTargetException var82) {
                     throw var82.getTargetException();
                  }

                  Object[] var10009 = Registry.packArgs(var9);
                  long var34 = 309720334529505891L;
                  Object[] var33 = var10009;
                  Ref.h(309720334529505891L, var33, var34);

                  try {
                     ;
                  } catch (InvocationTargetException var81) {
                     throw var81.getTargetException();
                  }

                  Object[] var108 = Registry.packArgs(var3);
                  long var36 = 268583885901814073L;
                  Object[] var35 = var108;
                  Ref.h(268583885901814073L, var35, var36);

                  try {
                     ;
                  } catch (InvocationTargetException var80) {
                     throw var80.getTargetException();
                  }

                  Object[] var10011 = Registry.e(System.currentTimeMillis());
                  long var38 = 181429069641073377L;
                  Object[] var37 = var10011;
                  Ref.h(181429069641073377L, var37, var38);

                  try {
                     ;
                  } catch (InvocationTargetException var79) {
                     throw var79.getTargetException();
                  }
               }

               Object[] var10012 = Registry.packArgs(var6, var87);
               long var40 = 377476817943649811L;
               Object[] var39 = var10012;
               Ref.h(377476817943649811L, var39, var40);

               try {
                  ;
               } catch (InvocationTargetException var78) {
                  throw var78.getTargetException();
               }

               List var10013 = Registry.emptyArgs();
               long var42 = 369380169373911815L;
               Object[] var41 = var10013;
               var10013 = Ref.h(369380169373911815L, var41, var42);

               try {
                  var10013 = (List)var10013;
               } catch (InvocationTargetException var77) {
                  throw var77.getTargetException();
               }

               var10013.add(var87);
               if (var4) {
               }
               break label195;
            }
         }

         TreePath var88 = new TreePath(var6.getPath());
         var10008 = Registry.packArgs(var6, var7, var88, null, false, false);
         long var44 = 523405946948830526L;
         Object[] var43 = var10008;
         Ref.h(523405946948830526L, var43, var44);

         try {
            ;
         } catch (InvocationTargetException var76) {
            throw var76.getTargetException();
         }

         if (var4) {
         }
      }

      if (var5 != null) {
         Object[] var101 = Registry.emptyArgs();
         long var46 = 349405327249700630L;
         Object[] var45 = var101;
         Ref.h(349405327249700630L, var45, var46);

         try {
            ;
         } catch (InvocationTargetException var75) {
            throw var75.getTargetException();
         }

         if (var4) {
            Object[] var109 = Registry.packArgs(var6);
            long var48 = 325887470340955715L;
            Object[] var47 = var109;
            Ref.h(325887470340955715L, var47, var48);

            try {
               ;
            } catch (InvocationTargetException var74) {
               throw var74.getTargetException();
            }
         }

         Object var49 = 608688273536518013L;
         Ref.g(608688273536518013L, var49);
         Object[] var110 = Registry.emptyArgs();
         long var52 = 152919711700242153L;
         Object[] var51 = var110;
         Ref.h(152919711700242153L, var51, var52);

         try {
            ;
         } catch (InvocationTargetException var73) {
            throw var73.getTargetException();
         }
      }

      String var102 = (String)(Registry.emptyArgs());
      long var54 = 498856411508641826L;
      Object[] var53 = var102;
      var102 = Ref.h(498856411508641826L, var53, var54);

      try {
         var102 = (String)var102;
      } catch (InvocationTargetException var72) {
         throw var72.getTargetException();
      }

      String var89 = var102;
      Connection4 var105 = var2.equals(var89);
      if (var5 != null) {
         if (var105 == 0) {
            return;
         }

         var105 = this;
         Object var55 = 608688273536518013L;
         Ref.g(608688273536518013L, var55);
         Object[] var111 = Registry.packArgs(var7);
         long var58 = 217942201414471271L;
         Object[] var57 = var111;
         Ref.h(217942201414471271L, var57, var58);

         try {
            ;
         } catch (InvocationTargetException var71) {
            throw var71.getTargetException();
         }

         Object var59 = 285663222664681848L;
         Ref.g(285663222664681848L, var59);
         Object[] var115 = Registry.packArgs(var9);
         long var62 = 343697430899942544L;
         Object[] var61 = var115;
         Ref.h(343697430899942544L, var61, var62);

         try {
            ;
         } catch (InvocationTargetException var70) {
            throw var70.getTargetException();
         }

         Object var63 = 285663222664681848L;
         ((Km2)Ref.g(285663222664681848L, var63)).getSelectedRow();
      }

      Connection4 var12 = var105;
      if (var12 > -1) {
         Object var65 = 285663222664681848L;
         Ref.g(285663222664681848L, var65);
         Object[] var112 = Registry.packArgs((int)var12);
         long var68 = 442091497690345581L;
         Object[] var67 = var112;
         Ref.h(442091497690345581L, var67, var68);

         try {
            ;
         } catch (InvocationTargetException var69) {
            throw var69.getTargetException();
         }
      }
   }

   public void P(YI var1, String var2) {
      I();
      Registry.packArgs(var2);
      long var14 = 405430188584561323L;
      Object var10002 = Ref.h2(405430188584561323L, var14);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var58) {
         throw var58.getTargetException();
      }

      String var4 = (String)var10002;
      var10002 = Registry.packArgs(var2);
      long var16 = 477969598131796924L;
      Ref.h2(477969598131796924L, var16);

      try {
         ;
      } catch (InvocationTargetException var57) {
         throw var57.getTargetException();
      }

      Object[] var3 = (Object[])var10002;
      Object var18 = 159245943539531162L;
      DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)((HashMap)Ref.g(159245943539531162L, var18)).get(var4);
      Object var10003 = var6;
      if (var3 != null) {
         if (var6 == null) {
            return;
         }

         var10003 = var6.getUserObject();
      }

      Tf4 var7 = (Tf4)var10003;
      Object[] var10004 = Registry.emptyArgs();
      long var21 = 498856411508641826L;
      Object[] var20 = var10004;
      Registry.packArgs(Ref.h(498856411508641826L, var20, var21));
      long var22 = 159824902428932603L;
      Ref.h2(159824902428932603L, var22);

      try {
         ;
      } catch (InvocationTargetException var56) {
         throw var56.getTargetException();
      }

      if (var3 != null) {
         Object var24 = 490343386624486773L;
         HashSet var10006 = (HashSet)Ref.g(490343386624486773L, var24);
         String var10008 = (String)(Registry.emptyArgs());
         long var27 = 498856411508641826L;
         Object[] var26 = var10008;
         var10008 = Ref.h(498856411508641826L, var26, var27);

         try {
            var10008 = (String)var10008;
         } catch (InvocationTargetException var55) {
            throw var55.getTargetException();
         }

         if (var7.contains(var10008) && var3 != null) {
            Object var28 = 467542466021000295L;
            HashSet var64 = (HashSet)Ref.g(467542466021000295L, var28);
            String var10010 = (String)(Registry.emptyArgs());
            long var31 = 498856411508641826L;
            Object[] var30 = var10010;
            var10010 = Ref.h(498856411508641826L, var30, var31);

            try {
               var10010 = (String)var10010;
            } catch (InvocationTargetException var54) {
               throw var54.getTargetException();
            }

            if (!var7.contains(var10010)) {
               var10010 = Registry.emptyArgs();
               long var33 = 619474355764320649L;
               Object[] var32 = var10010;
               var10010 = Ref.h(619474355764320649L, var32, var33);

               try {
                  var10010 = (Ck4)var10010;
               } catch (InvocationTargetException var53) {
                  throw var53.getTargetException();
               }

               Ck4 var9 = var10010;
               List var10011 = (List)(Registry.emptyArgs());
               long var35 = 248698316749304686L;
               Object[] var34 = var10011;
               long var10013 = var35;
               var10011 = Ref.h(248698316749304686L, var34, var35);

               try {
                  var10011 = (List)var10011;
               } catch (InvocationTargetException var52) {
                  throw var52.getTargetException();
               }

               List var10 = var10011;
               long var11 = (long)-1;
               long var12 = (long)0;

               while (var12 < var10.size()) {
                  Ck4 var13 = (Ck4)var10.get((int)var12);
                  if (var3 != null) {
                     Object[] var10012 = Registry.emptyArgs();
                     long var37 = 396085629172753019L;
                     Object[] var36 = var10012;
                     Ref.h(396085629172753019L, var36, var37);

                     try {
                        ;
                     } catch (InvocationTargetException var51) {
                        throw var51.getTargetException();
                     }

                     String var10014 = (String)(Registry.emptyArgs());
                     long var39 = 396085629172753019L;
                     Object[] var38 = var10014;
                     var10014 = Ref.h(396085629172753019L, var38, var39);

                     try {
                        var10014 = (String)var10014;
                     } catch (InvocationTargetException var50) {
                        throw var50.getTargetException();
                     }

                     var10013 = (((((((((long)var9.equals(var10014)) ? 1 : 0) ? 1 : 0) ? 1 : 0) != 0) ? 1 : 0) != 0) != 0) ? 1 : 0;
                     if (var3 == null) {
                        break;
                     }

                     if (var10013 != false) {
                        var10013 = var11 = var12;
                     }

                     var12++;
                  }

                  if (var3 == null) {
                     break;
                  }
               }

               if (var3 != null) {
                  if (var10013 > -1) {
                     var10.remove((int)var11);
                  }

                  var10.add(var9);
               }

               Object[] var77 = Registry.emptyArgs();
               long var41 = 360422804605248482L;
               Object[] var40 = var77;
               Ref.h(360422804605248482L, var40, var41);

               try {
                  ;
               } catch (InvocationTargetException var49) {
                  throw var49.getTargetException();
               }
            }
         }
      }

      Object var42 = 608688273536518013L;
      Ref.g(608688273536518013L, var42);
      Object[] var10007 = Registry.emptyArgs();
      long var45 = 152919711700242153L;
      Object[] var44 = var10007;
      Ref.h(152919711700242153L, var44, var45);
      String var65 = (String)(Registry.emptyArgs());
      long var47 = 498856411508641826L;
      Object[] var46 = var65;
      var65 = Ref.h(498856411508641826L, var46, var47);

      try {
         var65 = (String)var65;
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      String var59 = var65;
      if (var4.equals(var59)) {
         SwingUtilities.invokeLater(new Ni2(this, var7, var2));
      }
   }

   DefaultMutableTreeNode g(DefaultMutableTreeNode var1, Tf4 var2) {
      DefaultMutableTreeNode var3 = new DefaultMutableTreeNode(var2);
      Object[] var10002 = Registry.emptyArgs();
      long var6 = 498856411508641826L;
      Object[] var5 = var10002;
      var10002 = Registry.packArgs(Ref.h(498856411508641826L, var5, var6), var3);
      long var8 = 314737538622127353L;
      Object[] var7 = var10002;
      Ref.h(314737538622127353L, var7, var8);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Object[] var10003 = Registry.packArgs(var1, var2);
      long var10 = 490478023156050364L;
      Object[] var9 = var10003;
      var10003 = Ref.h(490478023156050364L, var9, var10);

      try {
         var18 = (Integer)var10003;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      int var4 = var18;
      Object[] var10004 = Registry.packArgs(var3, var1, var4);
      long var12 = 158472919928157277L;
      Object[] var11 = var10004;
      Ref.h(158472919928157277L, var11, var12);

      try {
         return var3;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }

   int X(DefaultMutableTreeNode var1, Tf4 var2) {
      int[] var10000 = I();
      int var4 = var1.getChildCount();
      int[] var3 = var10000;
      int var11 = (var1.getUserObject().getClass().equals(Tf4.class)) ? 1 : 0;
      if (var3 != null) {
         if (var11 != 0) {
            Tf4 var5 = (Tf4)var1.getUserObject();
            Object[] var10001 = Registry.emptyArgs();
            long var7 = 369380169373911815L;
            Object[] var6 = var10001;
            Registry.packArgs(Ref.h(369380169373911815L, var6, var7), var2);
            long var8 = 604658843385035248L;
            Object var10002 = Ref.h2(604658843385035248L, var8);

            try {
               var12 = (Integer)var10002;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            var4 = var12;
         }

         var11 = var4;
      }

      return var11;
   }

   boolean J(Tf4 var1) {
      int[] var10000 = I();
      boolean var3 = false;
      int[] var2 = var10000;
      Object var4 = 307767423934223271L;
      if (var2 == null || (Tf4)Ref.g(307767423934223271L, var4) != null) {
         Object[] var10002 = Registry.emptyArgs();
         long var7 = 498856411508641826L;
         Object[] var6 = var10002;
         Ref.h(498856411508641826L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         Object var8 = 307767423934223271L;
         Object var10004 = Ref.g(307767423934223271L, var8);
         String var10005 = (String)(Registry.emptyArgs());
         long var11 = 498856411508641826L;
         Object[] var10 = var10005;
         var10005 = Ref.h(498856411508641826L, var10, var11);

         try {
            var10005 = (String)var10005;
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         boolean var14 = var10004.equals(var10005);
         if (var2 == null) {
            return var14;
         }

         if (var14) {
            var3 = true;
         }
      }

      return var3;
   }

   void H(String var1) {
      Object var2 = 490343386624486773L;
      ((HashSet)Ref.g(490343386624486773L, var2)).add(var1);
   }

   void v(String var1) {
      Object var2 = 467542466021000295L;
      ((HashSet)Ref.g(467542466021000295L, var2)).add(var1);
   }

   void w(Tf4 param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/Connection4.I ()[I
      // 003: aload 0
      // 004: aload 1
      // 005: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 008: ldc2_w 498856411508641826
      // 00b: astore 17
      // 00d: astore 16
      // 00f: ldc2_w 498856411508641826
      // 012: aload 16
      // 014: aload 17
      // 016: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 019: goto 020
      // 01c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 01f: athrow
      // 020: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 023: ldc2_w 177354243147298003
      // 026: astore 19
      // 028: astore 18
      // 02a: ldc2_w 177354243147298003
      // 02d: aload 18
      // 02f: aload 19
      // 031: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 034: pop
      // 035: goto 03c
      // 038: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03b: athrow
      // 03c: aload 0
      // 03d: aload 1
      // 03e: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 041: ldc2_w 498856411508641826
      // 044: astore 21
      // 046: astore 20
      // 048: ldc2_w 498856411508641826
      // 04b: aload 20
      // 04d: aload 21
      // 04f: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 052: goto 059
      // 055: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 058: athrow
      // 059: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 05c: ldc2_w 496399544432301198
      // 05f: astore 23
      // 061: astore 22
      // 063: ldc2_w 496399544432301198
      // 066: aload 22
      // 068: aload 23
      // 06a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 06d: pop
      // 06e: goto 075
      // 071: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 074: athrow
      // 075: astore 2
      // 076: invokestatic java/lang/System.currentTimeMillis ()J
      // 079: lstore 3
      // 07a: new java/util/Vector
      // 07d: dup
      // 07e: invokespecial java/util/Vector.<init> ()V
      // 081: astore 5
      // 083: new java/util/Vector
      // 086: dup
      // 087: invokespecial java/util/Vector.<init> ()V
      // 08a: astore 6
      // 08c: bipush 1
      // 08d: istore 7
      // 08f: aload 1
      // 090: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 093: ldc2_w 490764181082108623
      // 096: astore 25
      // 098: astore 24
      // 09a: ldc2_w 490764181082108623
      // 09d: aload 24
      // 09f: aload 25
      // 0a1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0a4: checkcast java/lang/Boolean
      // 0a7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0aa: goto 0b1
      // 0ad: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0b0: athrow
      // 0b1: aload 2
      // 0b2: ifnull 0c0
      // 0b5: ifeq 390
      // 0b8: goto 0bf
      // 0bb: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0be: athrow
      // 0bf: bipush 0
      // 0c0: istore 8
      // 0c2: aload 1
      // 0c3: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0c6: ldc2_w 242892459251541809
      // 0c9: astore 27
      // 0cb: astore 26
      // 0cd: ldc2_w 242892459251541809
      // 0d0: aload 26
      // 0d2: aload 27
      // 0d4: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0d7: checkcast java/lang/String
      // 0da: goto 0e1
      // 0dd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 2
      // 0e2: ifnull 115
      // 0e5: ifnull 123
      // 0e8: goto 0ef
      // 0eb: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ee: athrow
      // 0ef: aload 1
      // 0f0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0f3: ldc2_w 242892459251541809
      // 0f6: astore 29
      // 0f8: astore 28
      // 0fa: ldc2_w 242892459251541809
      // 0fd: aload 28
      // 0ff: aload 29
      // 101: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 104: checkcast java/lang/String
      // 107: goto 10e
      // 10a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: goto 115
      // 111: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 114: athrow
      // 115: sipush 5005
      // 118: sipush 26684
      // 11b: invokestatic com/finalshell/ui/panel/Connection4.a (II)Ljava/lang/String;
      // 11e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 121: istore 8
      // 123: iload 8
      // 125: aload 2
      // 126: ifnull 1a5
      // 129: ifeq 173
      // 12c: goto 133
      // 12f: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 132: athrow
      // 133: aload 1
      // 134: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 137: ldc2_w 498856411508641826
      // 13a: astore 31
      // 13c: astore 30
      // 13e: ldc2_w 498856411508641826
      // 141: aload 30
      // 143: aload 31
      // 145: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 148: checkcast java/lang/String
      // 14b: goto 152
      // 14e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 151: athrow
      // 152: sipush 5000
      // 155: sipush -25117
      // 158: invokestatic com/finalshell/ui/panel/Connection4.a (II)Ljava/lang/String;
      // 15b: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 15e: aload 2
      // 15f: ifnull 1a5
      // 162: goto 169
      // 165: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 168: athrow
      // 169: ifne 1f3
      // 16c: goto 173
      // 16f: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 172: athrow
      // 173: aload 1
      // 174: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 177: ldc2_w 498856411508641826
      // 17a: astore 33
      // 17c: astore 32
      // 17e: ldc2_w 498856411508641826
      // 181: aload 32
      // 183: aload 33
      // 185: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 188: checkcast java/lang/String
      // 18b: goto 192
      // 18e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 191: athrow
      // 192: sipush 5006
      // 195: sipush -29775
      // 198: invokestatic com/finalshell/ui/panel/Connection4.a (II)Ljava/lang/String;
      // 19b: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 19e: goto 1a5
      // 1a1: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a4: athrow
      // 1a5: aload 2
      // 1a6: ifnull 1f0
      // 1a9: ifne 1f3
      // 1ac: goto 1b3
      // 1af: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b2: athrow
      // 1b3: aload 1
      // 1b4: aload 2
      // 1b5: ifnull 1f5
      // 1b8: goto 1bf
      // 1bb: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1be: athrow
      // 1bf: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1c2: ldc2_w 498856411508641826
      // 1c5: astore 35
      // 1c7: astore 34
      // 1c9: ldc2_w 498856411508641826
      // 1cc: aload 34
      // 1ce: aload 35
      // 1d0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1d3: checkcast java/lang/String
      // 1d6: goto 1dd
      // 1d9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1dc: athrow
      // 1dd: sipush 5002
      // 1e0: sipush 11409
      // 1e3: invokestatic com/finalshell/ui/panel/Connection4.a (II)Ljava/lang/String;
      // 1e6: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1e9: goto 1f0
      // 1ec: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1ef: athrow
      // 1f0: ifeq 1f4
      // 1f3: return
      // 1f4: aload 1
      // 1f5: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1f8: ldc2_w 543633160597441792
      // 1fb: astore 37
      // 1fd: astore 36
      // 1ff: ldc2_w 543633160597441792
      // 202: aload 36
      // 204: aload 37
      // 206: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 209: checkcast java/io/File
      // 20c: goto 213
      // 20f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 212: athrow
      // 213: astore 9
      // 215: aload 1
      // 216: aload 9
      // 218: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 21b: ldc2_w 349593801287953443
      // 21e: astore 39
      // 220: astore 38
      // 222: ldc2_w 349593801287953443
      // 225: aload 38
      // 227: aload 39
      // 229: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 22c: pop
      // 22d: goto 234
      // 230: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 233: athrow
      // 234: aload 9
      // 236: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 239: astore 10
      // 23b: aload 10
      // 23d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 240: ldc2_w 190853263991371564
      // 243: astore 40
      // 245: ldc2_w 190853263991371564
      // 248: aload 40
      // 24a: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 24d: checkcast java/util/ArrayList
      // 250: goto 257
      // 253: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 256: athrow
      // 257: astore 11
      // 259: aload 11
      // 25b: aload 2
      // 25c: ifnull 26b
      // 25f: ifnull 38c
      // 262: goto 269
      // 265: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 268: athrow
      // 269: aload 11
      // 26b: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 26e: astore 12
      // 270: aload 12
      // 272: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 277: ifeq 38c
      // 27a: aload 12
      // 27c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 281: checkcast java/io/File
      // 284: astore 13
      // 286: aload 13
      // 288: invokevirtual java/io/File.isDirectory ()Z
      // 28b: aload 2
      // 28c: ifnull 46f
      // 28f: aload 2
      // 290: ifnull 352
      // 293: goto 29a
      // 296: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 299: athrow
      // 29a: ifeq 34d
      // 29d: goto 2a4
      // 2a0: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a3: athrow
      // 2a4: new com/finalshell/ui/model/Tf4
      // 2a7: dup
      // 2a8: invokespecial com/finalshell/ui/model/Tf4.<init> ()V
      // 2ab: astore 14
      // 2ad: aload 14
      // 2af: aload 13
      // 2b1: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2b4: ldc2_w 349593801287953443
      // 2b7: astore 43
      // 2b9: astore 42
      // 2bb: ldc2_w 349593801287953443
      // 2be: aload 42
      // 2c0: aload 43
      // 2c2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2c5: pop
      // 2c6: goto 2cd
      // 2c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2cc: athrow
      // 2cd: bipush 1
      // 2ce: istore 15
      // 2d0: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2d3: ldc2_w 253808553645062345
      // 2d6: astore 44
      // 2d8: ldc2_w 253808553645062345
      // 2db: aload 44
      // 2dd: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 2e0: checkcast java/lang/Boolean
      // 2e3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2e6: goto 2ed
      // 2e9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2ec: athrow
      // 2ed: aload 2
      // 2ee: ifnull 32e
      // 2f1: ifeq 32c
      // 2f4: goto 2fb
      // 2f7: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fa: athrow
      // 2fb: aload 13
      // 2fd: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // 300: aload 0
      // 301: ldc2_w 159972400659094256
      // 304: astore 46
      // 306: ldc2_w 159972400659094256
      // 309: aload 46
      // 30b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 30e: checkcast java/lang/String
      // 311: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 314: aload 2
      // 315: ifnull 32e
      // 318: goto 31f
      // 31b: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31e: athrow
      // 31f: ifeq 32c
      // 322: goto 329
      // 325: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 328: athrow
      // 329: bipush 0
      // 32a: istore 15
      // 32c: iload 15
      // 32e: aload 2
      // 32f: ifnull 352
      // 332: ifeq 34d
      // 335: goto 33c
      // 338: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 33b: athrow
      // 33c: aload 5
      // 33e: aload 14
      // 340: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 345: pop
      // 346: goto 34d
      // 349: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 34c: athrow
      // 34d: aload 13
      // 34f: invokevirtual java/io/File.isFile ()Z
      // 352: ifeq 388
      // 355: new com/finalshell/ui/model/Ck4
      // 358: dup
      // 359: invokespecial com/finalshell/ui/model/Ck4.<init> ()V
      // 35c: astore 14
      // 35e: aload 14
      // 360: aload 13
      // 362: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 365: ldc2_w 325634526741383265
      // 368: astore 49
      // 36a: astore 48
      // 36c: ldc2_w 325634526741383265
      // 36f: aload 48
      // 371: aload 49
      // 373: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 376: pop
      // 377: goto 37e
      // 37a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 37d: athrow
      // 37e: aload 6
      // 380: aload 14
      // 382: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 387: pop
      // 388: aload 2
      // 389: ifnonnull 270
      // 38c: aload 2
      // 38d: ifnonnull 42e
      // 390: aconst_null
      // 391: astore 8
      // 393: aload 0
      // 394: ldc2_w 393220934160143516
      // 397: astore 50
      // 399: ldc2_w 393220934160143516
      // 39c: aload 50
      // 39e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3a1: aload 1
      // 3a2: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3a5: ldc2_w 498856411508641826
      // 3a8: astore 53
      // 3aa: astore 52
      // 3ac: ldc2_w 498856411508641826
      // 3af: aload 52
      // 3b1: aload 53
      // 3b3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3b6: goto 3bd
      // 3b9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3bc: athrow
      // 3bd: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3c0: ldc2_w 276206147642460148
      // 3c3: astore 55
      // 3c5: astore 54
      // 3c7: ldc2_w 276206147642460148
      // 3ca: aload 54
      // 3cc: aload 55
      // 3ce: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3d1: checkcast com/finalshell/ui/model/Tf4
      // 3d4: goto 3db
      // 3d7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3da: athrow
      // 3db: astore 8
      // 3dd: aload 8
      // 3df: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3e2: ldc2_w 369380169373911815
      // 3e5: astore 57
      // 3e7: astore 56
      // 3e9: ldc2_w 369380169373911815
      // 3ec: aload 56
      // 3ee: aload 57
      // 3f0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3f3: checkcast java/util/List
      // 3f6: goto 3fd
      // 3f9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3fc: athrow
      // 3fd: astore 5
      // 3ff: aload 8
      // 401: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 404: ldc2_w 248698316749304686
      // 407: astore 59
      // 409: astore 58
      // 40b: ldc2_w 248698316749304686
      // 40e: aload 58
      // 410: aload 59
      // 412: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 415: checkcast java/util/List
      // 418: goto 41f
      // 41b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 41e: athrow
      // 41f: astore 6
      // 421: goto 42e
      // 424: astore 9
      // 426: aload 9
      // 428: invokevirtual java/lang/Exception.printStackTrace ()V
      // 42b: bipush 0
      // 42c: istore 7
      // 42e: aload 0
      // 42f: ldc2_w 467542466021000295
      // 432: astore 60
      // 434: ldc2_w 467542466021000295
      // 437: aload 60
      // 439: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 43c: checkcast java/util/HashSet
      // 43f: aload 1
      // 440: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 443: ldc2_w 498856411508641826
      // 446: astore 63
      // 448: astore 62
      // 44a: ldc2_w 498856411508641826
      // 44d: aload 62
      // 44f: aload 63
      // 451: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 454: checkcast java/lang/String
      // 457: goto 45e
      // 45a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 45d: athrow
      // 45e: invokevirtual java/util/HashSet.remove (Ljava/lang/Object;)Z
      // 461: pop
      // 462: aload 2
      // 463: ifnull 4f3
      // 466: iload 7
      // 468: goto 46f
      // 46b: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 46e: athrow
      // 46f: ifeq 4f7
      // 472: aload 1
      // 473: aload 5
      // 475: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 478: ldc2_w 407744580579201251
      // 47b: astore 65
      // 47d: astore 64
      // 47f: ldc2_w 407744580579201251
      // 482: aload 64
      // 484: aload 65
      // 486: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 489: pop
      // 48a: goto 491
      // 48d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 490: athrow
      // 491: aload 1
      // 492: aload 6
      // 494: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 497: ldc2_w 486938477933204520
      // 49a: astore 67
      // 49c: astore 66
      // 49e: ldc2_w 486938477933204520
      // 4a1: aload 66
      // 4a3: aload 67
      // 4a5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4a8: pop
      // 4a9: goto 4b0
      // 4ac: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4af: athrow
      // 4b0: aload 1
      // 4b1: bipush 1
      // 4b2: invokestatic com/finalshell/reflect/Registry.packArgs (Z)[Ljava/lang/Object;
      // 4b5: ldc2_w 562551325043961401
      // 4b8: astore 69
      // 4ba: astore 68
      // 4bc: ldc2_w 562551325043961401
      // 4bf: aload 68
      // 4c1: aload 69
      // 4c3: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4c6: pop
      // 4c7: goto 4ce
      // 4ca: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4cd: athrow
      // 4ce: aload 0
      // 4cf: aload 1
      // 4d0: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4d3: ldc2_w 354921658348946569
      // 4d6: astore 71
      // 4d8: astore 70
      // 4da: ldc2_w 354921658348946569
      // 4dd: aload 70
      // 4df: aload 71
      // 4e1: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4e4: pop
      // 4e5: goto 4ec
      // 4e8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4eb: athrow
      // 4ec: goto 4f3
      // 4ef: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f2: athrow
      // 4f3: aload 2
      // 4f4: ifnonnull 50c
      // 4f7: new java/lang/Exception
      // 4fa: dup
      // 4fb: sipush 5007
      // 4fe: sipush 22155
      // 501: invokestatic com/finalshell/ui/panel/Connection4.a (II)Ljava/lang/String;
      // 504: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 507: athrow
      // 508: invokestatic com/finalshell/ui/panel/Connection4.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50b: athrow
      // 50c: return
   }

   public HashMap c() {
      int[] var10000 = I();
      HashMap var2 = new HashMap();
      int[] var1 = var10000;
      Object var10 = 159245943539531162L;
      Iterator var3 = ((HashMap)Ref.g(159245943539531162L, var10)).keySet().iterator();

      Object var10001;
      label92:
      while (true) {
         if (var3.hasNext()) {
            String var4 = (String)var3.next();
            var10001 = this;
            Object var12 = 159245943539531162L;
            HashMap var10002 = (HashMap)Ref.g(159245943539531162L, var12);
            if (var1 == null) {
               break;
            }

            label97: {
               label98: {
                  DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var10002.get(var4);
                  Object var6 = var5.getUserObject();
                  boolean var28 = var6.getClass().equals(Ck4.class);
                  if (var1 != null) {
                     if (var28) {
                        Ck4 var7 = (Ck4)var6;
                        var2.put(var4, var7);
                        if (var1 != null) {
                           break label97;
                        }
                     }

                     var29 = var6.getClass();
                     if (var1 == null) {
                        break label98;
                     }

                     var28 = var29.equals(Tf4.class);
                  }

                  if (!var28) {
      java.io.File var29;
      java.io.File var29;
                     break label97;
                  }

                  var29 = var6;
               }

               Tf4 var26 = (Tf4)var29;
               List var10003 = Registry.emptyArgs();
               long var15 = 369380169373911815L;
               Object[] var14 = var10003;
               var10003 = Ref.h(369380169373911815L, var14, var15);

               try {
                  var10003 = (List)var10003;
               } catch (InvocationTargetException var25) {
                  throw var25.getTargetException();
               }

               Iterator var8 = var10003.iterator();

               List var33;
               while (true) {
                  if (var8.hasNext()) {
                     Tf4 var9 = (Tf4)var8.next();
                     Object[] var10005 = Registry.emptyArgs();
                     long var17 = 498856411508641826L;
                     Object[] var16 = var10005;
                     var10005 = Ref.h(498856411508641826L, var16, var17);

                     try {
                        var10005 = (String)var10005;
                     } catch (InvocationTargetException var24) {
                        throw var24.getTargetException();
                     }

                     var9.put(var10005, var9);
                     if (var1 == null) {
                        break;
                     }

                     if (var1 != null) {
                        continue;
                     }
                  }

                  Object[] var10004 = Registry.emptyArgs();
                  long var19 = 248698316749304686L;
                  Object[] var18 = var10004;
                  var33 = (List)Ref.h(248698316749304686L, var18, var19);

                  try {
                     var33 = var33;
                     break;
                  } catch (InvocationTargetException var23) {
                     throw var23.getTargetException();
                  }
               }

               for (Ck4 var27 : var33) {
                  Object[] var10006 = Registry.emptyArgs();
                  long var21 = 605430732347023634L;
                  Object[] var20 = var10006;
                  var10006 = Ref.h(605430732347023634L, var20, var21);

                  try {
                     var10006 = (String)var10006;
                  } catch (InvocationTargetException var22) {
                     throw var22.getTargetException();
                  }

                  var27.put(var10006, var27);
                  if (var1 == null) {
                     continue label92;
                  }

                  if (var1 == null) {
                     break;
                  }
               }
            }

            if (var1 != null) {
               continue;
            }
         }

         var10001 = var2;
         break;
      }

      return (HashMap)var10001;
   }

   public void W(TreeNode var1) {
      Object var2 = 204612050171034220L;
      ((Fy2)Ref.g(204612050171034220L, var2)).removeNodeFromParent((MutableTreeNode)var1);
   }

   @Override
   public int getClosestRowForLocation(int var1, int var2) {
      return this.getRowForPath(this.getClosestPathForLocation(var1, var2));
   }

   int M() {
      Connection4 var1 = this;
      int var2 = 0;

      try {
         Field var3 = DropLocation.class.getDeclaredField(a(5003, -18582));
         var3.setAccessible(true);
         var2 = var3.getInt(var1);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      return var2;
   }

   int x(int var1) {
      Connection4 var2 = this;
      byte var3 = 0;

      try {
         Field var4 = DropLocation.class.getDeclaredField(a(4993, -15900));
         var4.setAccessible(true);
         var4.setInt(var2, var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      return var3;
   }

   DropLocation h(Point var1, TreePath var2, int var3) {
      Class<DropLocation> var4 = DropLocation.class;
      DropLocation var6 = null;

      try {
         Constructor var5 = var4.getDeclaredConstructor(Point.class, TreePath.class, Integer.class);
         var5.setAccessible(true);
         var6 = (DropLocation)var5.newInstance(var1, var2, var3);
      } catch (Exception var8) {
         var8.printStackTrace();
      }

      return var6;
   }

   @Override
   public Rectangle f$Rectangle(DefaultMutableTreeNode var1) {
      Object[] var10002 = Registry.packArgs(var1);
      long var3 = 340222048447034407L;
      Object[] var2 = var10002;
      var10002 = Ref.h(340222048447034407L, var2, var3);

      try {
         var10002 = (TreePath)var10002;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      return this.getPathBounds(var10002);
   }

   @Override
   public TreePath y(DefaultMutableTreeNode var1) {
      return var1 != null ? new TreePath(var1.getPath()) : null;
   }

   public void p(java.io.File var1) {
      java.io.File[] var3 = var1.listFiles();
      java.io.File[] var4 = var3;
      int var5 = var3.length;
      int[] var10000 = I();
      int var6 = 0;
      int[] var2 = var10000;

      while (var6 < var5) {
         java.io.File var7 = var4[var6];
         if (var7.isDirectory()) {
         }

         var6++;
         if (var2 == null) {
            break;
         }
      }
   }

   public void G() {
   }

   public boolean P() {
      return Registry.lookupField(274780790290515243L).getBoolean(this);
   }

   public void s(boolean var1) {
      Registry.lookupField(274780790290515243L).setBoolean(this, var1);
   }

   public Connection12 N() {
      Object var1 = 393220934160143516L;
      return (Connection12)Ref.g(393220934160143516L, var1);
   }

   public void k(Connection12 var1) {
      long var3 = 393220934160143516L;
      Ref.s(393220934160143516L, var1, var3);
   }

   public com.finalshell.ui.model.Kl4 H() {
      Object var1 = 608688273536518013L;
      return (com.finalshell.ui.model.Kl4)Ref.g(608688273536518013L, var1);
   }

   public Address R() {
      Object var1 = 592764144014982287L;
      return (Address)Ref.g(592764144014982287L, var1);
   }

   public void C(Address var1) {
      long var3 = 592764144014982287L;
      Ref.s(592764144014982287L, var1, var3);
   }

   public Km2 a() {
      Object var1 = 285663222664681848L;
      return (Km2)Ref.g(285663222664681848L, var1);
   }

   public void h(Km2 var1) {
      long var3 = 285663222664681848L;
      Ref.s(285663222664681848L, var1, var3);
   }

   public boolean u() {
      return Registry.lookupField(218493194116849754L).getBoolean(this);
   }

   public void u(boolean var1) {
      Registry.lookupField(218493194116849754L).setBoolean(this, var1);
   }

   public boolean n() {
      return Registry.lookupField(257707175806650747L).getBoolean(this);
   }

   public void t(boolean var1) {
      Registry.lookupField(257707175806650747L).setBoolean(this, var1);
   }

   public String f$String() {
      Object var1 = 343160910034620817L;
      return (String)Ref.g(343160910034620817L, var1);
   }

   public void P(String var1) {
      long var3 = 343160910034620817L;
      Ref.s(343160910034620817L, var1, var3);
   }

   public static void h(int[] var0) {
      M = var0;
   }

   public static int[] I() {
      return M;
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 5000) & 65535;
      if (n[var2] == null) {
         char[] var3 = l[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 49;
               break;
            case 1:
               var10000 = 87;
               break;
            case 2:
               var10000 = 20;
               break;
            case 3:
               var10000 = 39;
               break;
            case 4:
               var10000 = 144;
               break;
            case 5:
               var10000 = 169;
               break;
            case 6:
               var10000 = 133;
               break;
            case 7:
               var10000 = 223;
               break;
            case 8:
               var10000 = 177;
               break;
            case 9:
               var10000 = 19;
               break;
            case 10:
               var10000 = 181;
               break;
            case 11:
               var10000 = 156;
               break;
            case 12:
               var10000 = 123;
               break;
            case 13:
               var10000 = 104;
               break;
            case 14:
               var10000 = 42;
               break;
            case 15:
               var10000 = 86;
               break;
            case 16:
               var10000 = 140;
               break;
            case 17:
               var10000 = 252;
               break;
            case 18:
               var10000 = 243;
               break;
            case 19:
               var10000 = 77;
               break;
            case 20:
               var10000 = 220;
               break;
            case 21:
               var10000 = 137;
               break;
            case 22:
               var10000 = 204;
               break;
            case 23:
               var10000 = 155;
               break;
            case 24:
               var10000 = 91;
               break;
            case 25:
               var10000 = 24;
               break;
            case 26:
               var10000 = 235;
               break;
            case 27:
               var10000 = 142;
               break;
            case 28:
               var10000 = 85;
               break;
            case 29:
               var10000 = 26;
               break;
            case 30:
               var10000 = 202;
               break;
            case 31:
               var10000 = 147;
               break;
            case 32:
               var10000 = 208;
               break;
            case 33:
               var10000 = 173;
               break;
            case 34:
               var10000 = 67;
               break;
            case 35:
               var10000 = 102;
               break;
            case 36:
               var10000 = 80;
               break;
            case 37:
               var10000 = 141;
               break;
            case 38:
               var10000 = 216;
               break;
            case 39:
               var10000 = 165;
               break;
            case 40:
               var10000 = 78;
               break;
            case 41:
               var10000 = 54;
               break;
            case 42:
               var10000 = 159;
               break;
            case 43:
               var10000 = 108;
               break;
            case 44:
               var10000 = 124;
               break;
            case 45:
               var10000 = 9;
               break;
            case 46:
               var10000 = 113;
               break;
            case 47:
               var10000 = 221;
               break;
            case 48:
               var10000 = 69;
               break;
            case 49:
               var10000 = 128;
               break;
            case 50:
               var10000 = 179;
               break;
            case 51:
               var10000 = 22;
               break;
            case 52:
               var10000 = 117;
               break;
            case 53:
               var10000 = 149;
               break;
            case 54:
               var10000 = 121;
               break;
            case 55:
               var10000 = 195;
               break;
            case 56:
               var10000 = 60;
               break;
            case 57:
               var10000 = 146;
               break;
            case 58:
               var10000 = 171;
               break;
            case 59:
               var10000 = 164;
               break;
            case 60:
               var10000 = 64;
               break;
            case 61:
               var10000 = 189;
               break;
            case 62:
               var10000 = 65;
               break;
            case 63:
               var10000 = 11;
               break;
            case 64:
               var10000 = 14;
               break;
            case 65:
               var10000 = 21;
               break;
            case 66:
               var10000 = 109;
               break;
            case 67:
               var10000 = 50;
               break;
            case 68:
               var10000 = 227;
               break;
            case 69:
               var10000 = 244;
               break;
            case 70:
               var10000 = 71;
               break;
            case 71:
               var10000 = 175;
               break;
            case 72:
               var10000 = 194;
               break;
            case 73:
               var10000 = 38;
               break;
            case 74:
               var10000 = 161;
               break;
            case 75:
               var10000 = 145;
               break;
            case 76:
               var10000 = 245;
               break;
            case 77:
               var10000 = 162;
               break;
            case 78:
               var10000 = 35;
               break;
            case 79:
               var10000 = 46;
               break;
            case 80:
               var10000 = 43;
               break;
            case 81:
               var10000 = 92;
               break;
            case 82:
               var10000 = 213;
               break;
            case 83:
               var10000 = 58;
               break;
            case 84:
               var10000 = 94;
               break;
            case 85:
               var10000 = 197;
               break;
            case 86:
               var10000 = 212;
               break;
            case 87:
               var10000 = 150;
               break;
            case 88:
               var10000 = 83;
               break;
            case 89:
               var10000 = 240;
               break;
            case 90:
               var10000 = 138;
               break;
            case 91:
               var10000 = 251;
               break;
            case 92:
               var10000 = 236;
               break;
            case 93:
               var10000 = 130;
               break;
            case 94:
               var10000 = 34;
               break;
            case 95:
               var10000 = 16;
               break;
            case 96:
               var10000 = 170;
               break;
            case 97:
               var10000 = 36;
               break;
            case 98:
               var10000 = 246;
               break;
            case 99:
               var10000 = 166;
               break;
            case 100:
               var10000 = 218;
               break;
            case 101:
               var10000 = 17;
               break;
            case 102:
               var10000 = 7;
               break;
            case 103:
               var10000 = 93;
               break;
            case 104:
               var10000 = 115;
               break;
            case 105:
               var10000 = 61;
               break;
            case 106:
               var10000 = 183;
               break;
            case 107:
               var10000 = 88;
               break;
            case 108:
               var10000 = 135;
               break;
            case 109:
               var10000 = 184;
               break;
            case 110:
               var10000 = 63;
               break;
            case 111:
               var10000 = 2;
               break;
            case 112:
               var10000 = 215;
               break;
            case 113:
               var10000 = 72;
               break;
            case 114:
               var10000 = 232;
               break;
            case 115:
               var10000 = 224;
               break;
            case 116:
               var10000 = 73;
               break;
            case 117:
               var10000 = 48;
               break;
            case 118:
               var10000 = 248;
               break;
            case 119:
               var10000 = 226;
               break;
            case 120:
               var10000 = 126;
               break;
            case 121:
               var10000 = 103;
               break;
            case 122:
               var10000 = 3;
               break;
            case 123:
               var10000 = 187;
               break;
            case 124:
               var10000 = 188;
               break;
            case 125:
               var10000 = 122;
               break;
            case 126:
               var10000 = 62;
               break;
            case 127:
               var10000 = 47;
               break;
            case 128:
               var10000 = 82;
               break;
            case 129:
               var10000 = 217;
               break;
            case 130:
               var10000 = 191;
               break;
            case 131:
               var10000 = 53;
               break;
            case 132:
               var10000 = 253;
               break;
            case 133:
               var10000 = 90;
               break;
            case 134:
               var10000 = 13;
               break;
            case 135:
               var10000 = 152;
               break;
            case 136:
               var10000 = 168;
               break;
            case 137:
               var10000 = 111;
               break;
            case 138:
               var10000 = 106;
               break;
            case 139:
               var10000 = 1;
               break;
            case 140:
               var10000 = 219;
               break;
            case 141:
               var10000 = 242;
               break;
            case 142:
               var10000 = 98;
               break;
            case 143:
               var10000 = 84;
               break;
            case 144:
               var10000 = 76;
               break;
            case 145:
               var10000 = 250;
               break;
            case 146:
               var10000 = 110;
               break;
            case 147:
               var10000 = 8;
               break;
            case 148:
               var10000 = 28;
               break;
            case 149:
               var10000 = 153;
               break;
            case 150:
               var10000 = 41;
               break;
            case 151:
               var10000 = 254;
               break;
            case 152:
               var10000 = 203;
               break;
            case 153:
               var10000 = 10;
               break;
            case 154:
               var10000 = 120;
               break;
            case 155:
               var10000 = 185;
               break;
            case 156:
               var10000 = 131;
               break;
            case 157:
               var10000 = 116;
               break;
            case 158:
               var10000 = 241;
               break;
            case 159:
               var10000 = 105;
               break;
            case 160:
               var10000 = 45;
               break;
            case 161:
               var10000 = 52;
               break;
            case 162:
               var10000 = 222;
               break;
            case 163:
               var10000 = 178;
               break;
            case 164:
               var10000 = 55;
               break;
            case 165:
               var10000 = 157;
               break;
            case 166:
               var10000 = 112;
               break;
            case 167:
               var10000 = 125;
               break;
            case 168:
               var10000 = 18;
               break;
            case 169:
               var10000 = 139;
               break;
            case 170:
               var10000 = 134;
               break;
            case 171:
               var10000 = 193;
               break;
            case 172:
               var10000 = 51;
               break;
            case 173:
               var10000 = 29;
               break;
            case 174:
               var10000 = 79;
               break;
            case 175:
               var10000 = 176;
               break;
            case 176:
               var10000 = 129;
               break;
            case 177:
               var10000 = 57;
               break;
            case 178:
               var10000 = 255;
               break;
            case 179:
               var10000 = 230;
               break;
            case 180:
               var10000 = 233;
               break;
            case 181:
               var10000 = 119;
               break;
            case 182:
               var10000 = 225;
               break;
            case 183:
               var10000 = 4;
               break;
            case 184:
               var10000 = 59;
               break;
            case 185:
               var10000 = 101;
               break;
            case 186:
               var10000 = 89;
               break;
            case 187:
               var10000 = 167;
               break;
            case 188:
               var10000 = 249;
               break;
            case 189:
               var10000 = 15;
               break;
            case 190:
               var10000 = 75;
               break;
            case 191:
               var10000 = 97;
               break;
            case 192:
               var10000 = 74;
               break;
            case 193:
               var10000 = 68;
               break;
            case 194:
               var10000 = 237;
               break;
            case 195:
               var10000 = 200;
               break;
            case 196:
               var10000 = 136;
               break;
            case 197:
               var10000 = 143;
               break;
            case 198:
               var10000 = 192;
               break;
            case 199:
               var10000 = 214;
               break;
            case 200:
               var10000 = 151;
               break;
            case 201:
               var10000 = 196;
               break;
            case 202:
               var10000 = 186;
               break;
            case 203:
               var10000 = 205;
               break;
            case 204:
               var10000 = 231;
               break;
            case 205:
               var10000 = 40;
               break;
            case 206:
               var10000 = 127;
               break;
            case 207:
               var10000 = 114;
               break;
            case 208:
               var10000 = 5;
               break;
            case 209:
               var10000 = 201;
               break;
            case 210:
               var10000 = 25;
               break;
            case 211:
               var10000 = 160;
               break;
            case 212:
               var10000 = 207;
               break;
            case 213:
               var10000 = 37;
               break;
            case 214:
               var10000 = 99;
               break;
            case 215:
               var10000 = 56;
               break;
            case 216:
               var10000 = 247;
               break;
            case 217:
               var10000 = 211;
               break;
            case 218:
               var10000 = 81;
               break;
            case 219:
               var10000 = 180;
               break;
            case 220:
               var10000 = 6;
               break;
            case 221:
               var10000 = 234;
               break;
            case 222:
               var10000 = 198;
               break;
            case 223:
               var10000 = 132;
               break;
            case 224:
               var10000 = 118;
               break;
            case 225:
               var10000 = 44;
               break;
            case 226:
               var10000 = 239;
               break;
            case 227:
               var10000 = 228;
               break;
            case 228:
               var10000 = 163;
               break;
            case 229:
               var10000 = 31;
               break;
            case 230:
               var10000 = 100;
               break;
            case 231:
               var10000 = 30;
               break;
            case 232:
               var10000 = 154;
               break;
            case 233:
               var10000 = 66;
               break;
            case 234:
               var10000 = 174;
               break;
            case 235:
               var10000 = 70;
               break;
            case 236:
               var10000 = 27;
               break;
            case 237:
               var10000 = 182;
               break;
            case 238:
               var10000 = 210;
               break;
            case 239:
               var10000 = 32;
               break;
            case 240:
               var10000 = 209;
               break;
            case 241:
               var10000 = 95;
               break;
            case 242:
               var10000 = 12;
               break;
            case 243:
               var10000 = 229;
               break;
            case 244:
               var10000 = 23;
               break;
            case 245:
               var10000 = 107;
               break;
            case 246:
               var10000 = 190;
               break;
            case 247:
               var10000 = 0;
               break;
            case 248:
               var10000 = 238;
               break;
            case 249:
               var10000 = 158;
               break;
            case 250:
               var10000 = 199;
               break;
            case 251:
               var10000 = 148;
               break;
            case 252:
               var10000 = 172;
               break;
            case 253:
               var10000 = 206;
               break;
            case 254:
               var10000 = 96;
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

         n[var2] = new String(var3).intern();
      }

      return n[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14460;
      if (C[var3] == null) {
         C[var3] = (int)(A[var3] ^ var1);
      }

      return C[var3];
   }

   public static long c(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 16899) & 32767;
      if (H[var3] == null) {
         H[var3] = G[var3] ^ var1;
      }

      return H[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var21 = new String[10];
      int[] var10000 = new int[4];
      int var19 = 0;
      String var18 = "\u0017à\u0004T\u0015xÈ$å`\u001a\u0080X¼éÄß\u009d\u00adcò=\u0081Ð`y2A\u009dH.Ð\u000b\u0093Á8\u0091x\u00adb\u0007Zùë\t\r\u008a¹Û\u001f+p»Ú\u0002辞揜\u0002罌组$è\u008d\u0000X}\u0018êwýÁî8x<u\u0087\u0088\t\u0097V î°[\u008bèï\u001d\u0012\u008aTÐéÕ\u0081.\u0006勍轶療忕奲贙";
      int var20 = "\u0017à\u0004T\u0015xÈ$å`\u001a\u0080X¼éÄß\u009d\u00adcò=\u0081Ð`y2A\u009dH.Ð\u000b\u0093Á8\u0091x\u00adb\u0007Zùë\t\r\u008a¹Û\u001f+p»Ú\u0002辞揜\u0002罌组$è\u008d\u0000X}\u0018êwýÁî8x<u\u0087\u0088\t\u0097V î°[\u008bèï\u001d\u0012\u008aTÐéÕ\u0081.\u0006勍轶療忕奲贙"
         .length();
      char var17 = 2;
      h(var10000);
      int var24 = -1;

      label71:
      while (true) {
         byte var25 = 23;
         String var10001 = var18.substring(++var24, var24 + var17);
         byte var10002 = -1;

         while (true) {
            label66: {
               char[] var45 = var10001.toCharArray();
               int var10004 = var45.length;
               int var22 = 0;
               byte var48 = var25;
               var41 = var45;
               int var31 = var10004;
               byte var55;
               char[] var61;
               int var10006;
               if (var10004 <= 1) {
                  var61 = var45;
                  var55 = var25;
                  var10006 = var22;
               } else {
                  var48 = var25;
                  var31 = var10004;
                  if (var10004 <= var22) {
                     break label66;
                  }

                  var61 = var45;
                  var55 = var25;
                  var10006 = var22;
               }

               while (true) {
                  char var70 = var61[var10006];
                  byte var71;
                  switch (var22 % 7) {
                     case 0:
                        var71 = 8;
                        break;
                     case 1:
                        var71 = 33;
                        break;
                     case 2:
                        var71 = 85;
                        break;
                     case 3:
                        var71 = 77;
                        break;
                     case 4:
                        var71 = 103;
                        break;
                     case 5:
                        var71 = 37;
                        break;
                     default:
                        var71 = 123;
                  }

                  var61[var10006] = (char)(var70 ^ var55 ^ var71);
                  var22++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var61 = var41;
                     var55 = var48;
                  } else {
                     if (var31 <= var22) {
                        break;
                     }

                     var61 = var41;
                     var55 = var48;
                     var10006 = var22;
                  }
               }
            }

            String var50 = new String(var41).intern();
            switch (var10002) {
               case 0:
                  var21[var19++] = var50;
                  if ((var24 += var17) >= var20) {
                     l = var21;
                     n = new String[10];
                     long var8 = 1404591937481773002L;
                     long[] var14 = new long[3];
                     int var11 = 0;
                     String var12 = "\u000eóJpÔ\"7Ä×Îý@\u0018º'UhX6\u0012ÔÚ'ç";
                     int var13 = "\u000eóJpÔ\"7Ä×Îý@\u0018º'UhX6\u0012ÔÚ'ç".length();
                     byte var10 = 0;

                     do {
                        byte var33 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var33, var10).getBytes("ISO-8859-1");
                        int var34 = var11++;
                        long var59 = (
                              ((long)var15[0] & 255L) << 56
                                 | ((long)var15[1] & 255L) << 48
                                 | ((long)var15[2] & 255L) << 40
                                 | ((long)var15[3] & 255L) << 32
                                 | ((long)var15[4] & 255L) << 24
                                 | ((long)var15[5] & 255L) << 16
                                 | ((long)var15[6] & 255L) << 8
                                 | (long)var15[7] & 255L
                           )
                           ^ var8;
                        byte var51 = -1;
                        var14[var34] = var59;
                     } while (var10 < var13);

                     A = var14;
                     C = new Integer[3];
                     long var0 = 9133816610172933324L;
                     long[] var6 = new long[2];
                     int var3 = 0;
                     String var4 = "c\u0019\u0087\u0086ê\u001f·°\u0010ãª¹ÒÜãJ";
                     int var5 = "c\u0019\u0087\u0086ê\u001f·°\u0010ãª¹ÒÜãJ".length();
                     byte var2 = 0;

                     do {
                        byte var35 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                        int var36 = var3++;
                        long var60 = (
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
                        byte var52 = -1;
                        var6[var36] = var60;
                     } while (var2 < var5);

                     G = var6;
                     H = new Long[2];
                     return;
                  }

                  var17 = var18.charAt(var24);
                  break;
               default:
                  var21[var19++] = var50;
                  if ((var24 += var17) < var20) {
                     var17 = var18.charAt(var24);
                     continue label71;
                  }

                  var18 = "?%\u0013«+`\u009ei\t<'U¤H\u000ePÕ\u0014";
                  var20 = "?%\u0013«+`\u009ei\t<'U¤H\u000ePÕ\u0014".length();
                  var17 = '\b';
                  var24 = -1;
            }

            var25 = 56;
            var10001 = var18.substring(++var24, var24 + var17);
            var10002 = 0;
         }
      }
   }
}






