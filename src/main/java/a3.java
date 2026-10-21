import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyListener;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

public class a3 extends aA {
   LE i;
   Fy_2 y;
   a3 K;
   HashMap r;
   tf_4 D;
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
   lu_4 I;
   HashSet Z;
   HashSet P;
   boolean c;
   zD X;
   kl_4 z;
   Km_2 h;
   F6 o;
   tf_4 V;
   HashSet T;
   String E;
   ArrayList g;
   Object p;
   boolean j;
   long W;
   boolean J;
   String f;
   File e;
   long k;
   String t;
   private static int[] M;
   private static final String[] l;
   private static final String[] n;
   private static final long[] A;
   private static final Integer[] C;
   private static final long[] G;
   private static final Long[] H;

   public a3(boolean var1, kl_4 var2) {
      int[] var3;
      label96: {
         super(new DefaultMutableTreeNode(a(4992, -23343), true));
         com.c.c(159245943539531162L).set(this, new HashMap());
         com.c.c(458323850669368206L).set(this, null);
         com.c.c(191167021799414579L).setBoolean(this, false);
         com.c.c(532071324274744951L).setBoolean(this, false);
         com.c.c(341137764522313600L).setInt(this, b(4479, 8254247404394555649L));
         int[] var10000 = I();
         com.c.c(490343386624486773L).set(this, new HashSet());
         com.c.c(467542466021000295L).set(this, new HashSet());
         com.c.c(274780790290515243L).setBoolean(this, true);
         com.c.c(428509894309855334L).set(this, new HashSet());
         var3 = var10000;
         com.c.c(438003004996277190L).set(this, null);
         com.c.c(499316983962981071L).set(this, new ArrayList());
         com.c.c(382302557934315212L).set(this, this);
         com.c.c(218493194116849754L).setBoolean(this, true);
         com.c.c(257707175806650747L).setBoolean(this, true);
         com.c.c(139380390802876288L).set(this, FileSystemView.getFileSystemView());
         if (var3 != null) {
            Object[] var18 = com.c.f();
            Method var19 = com.c.d(253808553645062345L);
            Object[] var39 = var18;
            Object var27 = null;

            try {
               var20 = (Boolean)var19.invoke(var27, var39);
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }

            if (var20) {
               com.c.c(631471321046808880L).set(this, ((FileSystemView)com.c.c(139380390802876288L).get(this)).getHomeDirectory());
               com.c.c(159972400659094256L).set(this, ((File)com.c.c(631471321046808880L).get(this)).getAbsolutePath());
               if (var3 != null) {
                  break label96;
               }

               com.ky_4.K(new String[1]);
            }

            com.c.c(159972400659094256L).set(this, "/");
         }

         com.c.c(631471321046808880L).set(this, new File((String)com.c.c(159972400659094256L).get(this)));
      }

      com.c.c(608688273536518013L).set(this, var2);
      com.c.c(274780790290515243L).setBoolean(this, var1);
      Object[] var28 = com.c.f();
      Method var29 = com.c.d(270389152141252877L);
      Object[] var47 = var28;
      Object var41 = null;

      try {
         var28 = (Object[])var29.invoke(var41, var47);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      var41 = com.c.f();
      Method var10004 = com.c.d(362821904568389131L);
      var47 = (Object[])var41;
      var41 = var28;
      Method var31 = var10004;

      try {
         var28 = (Object[])var31.invoke(var41, var47);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      label100: {
         com.c.c(486969408556937700L).set(this, var28);
         this.setBorder(null);
         com.c.c(230619793659643674L).set(this, this);
         this.getSelectionModel().setSelectionMode(1);
         this.setAutoscrolls(false);
         com.c.c(250204424432541123L).set(this, new DefaultMutableTreeNode(a(5001, -8758)));
         com.c.c(204612050171034220L).set(this, new Fy_2((DefaultMutableTreeNode)com.c.c(250204424432541123L).get(this)));
         this.setModel((Fy_2)com.c.c(204612050171034220L).get(this));
         com.c.c(403979601484882933L).set(this, new LE());
         this.setCellRenderer((LE)com.c.c(403979601484882933L).get(this));
         this.setEditable(true);
         DN var4 = new DN();
         KC var5 = new KC(this, var4);
         this.setCellEditor(var5);
         ((a3)com.c.c(230619793659643674L).get(this)).setDragEnabled(true);
         ((a3)com.c.c(230619793659643674L).get(this)).setDropMode(DropMode.ON);
         ((a3)com.c.c(230619793659643674L).get(this)).setTransferHandler(new nK((a3)com.c.c(230619793659643674L).get(this)));
         ((a3)com.c.c(230619793659643674L).get(this)).getSelectionModel().setSelectionMode(4);
         ((a3)com.c.c(230619793659643674L).get(this)).setEditable(true);
         this.getSelectionModel().addTreeSelectionListener(new Ve_2(this));
         this.addMouseListener(new VY(this));
         ((a3)com.c.c(230619793659643674L).get(this)).addTreeWillExpandListener(new LD(this));
         ((a3)com.c.c(230619793659643674L).get(this)).addMouseMotionListener(new DO(this));
         com.c.c(458323850669368206L).set(this, new tf_4());
         File var6 = new File((String)com.c.c(478301022169899080L).get(null));
         boolean var21 = var6.exists();
         if (var3 != null) {
            if (!var21) {
               var6.mkdirs();
            }

            Object var22 = com.c.c(458323850669368206L).get(this);
            var28 = com.c.a(var6);
            Method var49 = com.c.d(349593801287953443L);
            var41 = var28;
            var28 = (Object[])var22;
            Method var23 = var49;

            try {
               var23.invoke(var28, (Object[])var41);
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            Object var24 = com.c.c(458323850669368206L).get(this);
            var28 = com.c.a(a(5004, 10296));
            Method var50 = com.c.d(124677196473982808L);
            var41 = var28;
            var28 = (Object[])var24;
            Method var25 = var50;

            try {
               var25.invoke(var28, (Object[])var41);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            ((Fy_2)com.c.c(204612050171034220L).get(this)).nodeStructureChanged((DefaultMutableTreeNode)com.c.c(250204424432541123L).get(this));
            if (var3 == null) {
               break label100;
            }

            var21 = var1;
         }

         if (var21) {
            var28 = com.c.a(true);
            Method var51 = com.c.d(587464397243746167L);
            var41 = var28;
            a3 var38 = this;
            Method var26 = var51;

            try {
               var26.invoke(var38, (Object[])var41);
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }
         }

         this.getSelectionModel().addTreeSelectionListener(new zJ(this, var2));
         this.addMouseListener(new Qy_2(this));
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

         this.addKeyListener(new cG_3(this));
         this.addKeyListener(new fk_4(this));
         break;
      }
   }

   public void y() {
      Object[] var10000 = com.c.a(this);
      Method var2 = com.c.d(242617331513341262L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public ck_4 q(String var1) {
      int[] var10000 = I();
      DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var1);
      int[] var2 = var10000;
      var10000 = (int[])var3;
      if (var2 != null) {
         if (var3 == null) {
            return null;
         }

         var10000 = (int[])var3.getUserObject();
      }

      return (ck_4)var10000;
   }

   public tf_4 c(String var1) {
      int[] var10000 = I();
      DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var1);
      int[] var2 = var10000;
      var10000 = (int[])var3;
      if (var2 != null) {
         if (var3 == null) {
            return null;
         }

         var10000 = (int[])var3.getUserObject();
      }

      return (tf_4)var10000;
   }

   public tf_4 f() {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(148691699844242618L);
      Object[] var10002 = var10001;
      a3 var5 = this;
      Method var10000 = var10003;

      try {
         var4 = (DefaultMutableTreeNode)var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      DefaultMutableTreeNode var1 = var4;
      return (tf_4)var1.getUserObject();
   }

   public void U(DefaultMutableTreeNode var1, tf_4 var2) {
      int[] var3 = I();

      try {
         Object[] var10001 = com.c.a(var2);
         Method var10003 = com.c.d(300370310318036695L);
         Object[] var10002 = var10001;
         a3 var16 = this;
         Method var10000 = var10003;

         try {
            var10000.invoke(var16, var10002);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }
      } catch (Exception var10) {
         var10.printStackTrace();
      }

      Object[] var17 = com.c.f();
      Method var23 = com.c.d(369380169373911815L);
      Object[] var21 = var17;
      tf_4 var18 = var2;
      Method var12 = var23;

      try {
         var13 = (List)var12.invoke(var18, var21);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Iterator var4 = var13.iterator();

      while (true) {
         if (var4.hasNext()) {
            tf_4 var5 = (tf_4)var4.next();
            var17 = com.c.a(var1, var5);
            var23 = com.c.d(514128027944670770L);
            var21 = var17;
            a3 var20 = this;
            var12 = var23;

            try {
               DefaultMutableTreeNode var15 = (DefaultMutableTreeNode)var12.invoke(var20, var21);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            try {
               if (var3 == null) {
                  break;
               }

               if (var3 != null) {
                  continue;
               }
            } catch (Exception var11) {
               throw a(var11);
            }
         }

         ((Fy_2)com.c.c(204612050171034220L).get(this)).nodeChanged(var1);
         break;
      }
   }

   public void s(DefaultMutableTreeNode var1, tf_4 var2, TreePath var3, String var4, boolean var5, boolean var6) {
      int[] var10000 = I();
      com.c.c(307767423934223271L).set(this, var2);
      int[] var7 = var10000;
      HashSet var23 = (HashSet)com.c.c(490343386624486773L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(498856411508641826L);
      Object[] var10003 = var10002;
      tf_4 var69 = var2;
      Method var10001 = var10004;

      try {
         var42 = (String)var10001.invoke(var69, var10003);
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      var24 = var23.contains(var42);
      label151:
      if (var7 != null) {
         if (!var24) {
            HashSet var25 = (HashSet)com.c.c(467542466021000295L).get(this);
            var10002 = com.c.f();
            var10004 = com.c.d(498856411508641826L);
            var10003 = var10002;
            tf_4 var71 = var2;
            var10001 = var10004;

            try {
               var44 = (String)var10001.invoke(var71, var10003);
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            var24 = var25.contains(var44);
            if (var7 == null) {
               break label151;
            }

            if (!var24) {
               HashMap var26 = (HashMap)com.c.c(159245943539531162L).get(this);
               var10002 = com.c.f();
               var10004 = com.c.d(498856411508641826L);
               var10003 = var10002;
               tf_4 var73 = var2;
               var10001 = var10004;

               try {
                  var46 = (String)var10001.invoke(var73, var10003);
               } catch (InvocationTargetException var20) {
                  throw var20.getTargetException();
               }

               DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var26.get(var46);
               var10002 = com.c.f();
               var10004 = com.c.d(498856411508641826L);
               var10003 = var10002;
               tf_4 var75 = var2;
               var10001 = var10004;

               try {
                  var48 = var10001.invoke(var75, var10003);
               } catch (InvocationTargetException var19) {
                  throw var19.getTargetException();
               }

               Object[] var49 = com.c.a(var48);
               Method var91 = com.c.d(177354243147298003L);
               var10002 = var49;
               a3 var50 = this;
               Method var27 = var91;

               try {
                  var27.invoke(var50, var10002);
               } catch (InvocationTargetException var18) {
                  throw var18.getTargetException();
               }

               var10002 = com.c.f();
               var10004 = com.c.d(498856411508641826L);
               var10003 = var10002;
               tf_4 var78 = var2;
               var10001 = var10004;

               try {
                  var52 = var10001.invoke(var78, var10003);
               } catch (InvocationTargetException var17) {
                  throw var17.getTargetException();
               }

               Object[] var53 = com.c.a(var52);
               Method var93 = com.c.d(496399544432301198L);
               var10002 = var53;
               a3 var54 = this;
               Method var28 = var93;

               try {
                  var28.invoke(var54, var10002);
               } catch (InvocationTargetException var16) {
                  throw var16.getTargetException();
               }

               if (var7 != null) {
                  Object[] var55 = com.c.f();
                  Method var94 = com.c.d(490764181082108623L);
                  var10002 = var55;
                  tf_4 var56 = var2;
                  Method var29 = var94;

                  try {
                     var30 = (Boolean)var29.invoke(var56, var10002);
                  } catch (InvocationTargetException var15) {
                     throw var15.getTargetException();
                  }

                  if (!var30) {
                     var10000 = (int[])com.c.c(592764144014982287L).get(this);
                     Object[] var57 = com.c.a(true);
                     Method var95 = com.c.d(596499686400442579L);
                     var10002 = var57;
                     Object var58 = var10000;
                     Method var32 = var95;

                     try {
                        var32.invoke(var58, var10002);
                     } catch (InvocationTargetException var14) {
                        throw var14.getTargetException();
                     }
                  }

                  var10000 = (int[])com.c.c(388376917454860932L).get(null);
                  Object[] var59 = com.c.a(new Kq_2(this, var1, var2, var8, var6, var3, var4, var5));
                  Method var96 = com.c.d(434592463220957006L);
                  var10002 = var59;
                  Object var60 = var10000;
                  Method var34 = var96;

                  try {
                     var34.invoke(var60, var10002);
                  } catch (InvocationTargetException var13) {
                     throw var13.getTargetException();
                  }
               }

               if (var7 != null) {
                  return;
               }
            }
         }

         Object[] var61 = com.c.f();
         Method var97 = com.c.d(490764181082108623L);
         var10002 = var61;
         tf_4 var62 = var2;
         Method var35 = var97;

         try {
            var24 = (Boolean)var35.invoke(var62, var10002);
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }
      }

      label161: {
         if (var7 != null) {
            if (var24) {
               return;
            }

            var36 = this;
            if (var7 == null) {
               break label161;
            }

            HashSet var37 = (HashSet)com.c.c(467542466021000295L).get(this);
            var10002 = com.c.f();
            var10004 = com.c.d(498856411508641826L);
            var10003 = var10002;
            tf_4 var85 = var2;
            var10001 = var10004;

            try {
               var64 = (String)var10001.invoke(var85, var10003);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            var24 = var37.contains(var64);
         }

         if (var24) {
            var10000 = (int[])com.c.c(592764144014982287L).get(this);
            Object[] var65 = com.c.a(true);
            Method var99 = com.c.d(596499686400442579L);
            var10002 = var65;
            Object var66 = var10000;
            Method var39 = var99;

            try {
               var39.invoke(var66, var10002);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            if (var7 != null) {
               return;
            }
         }

         var36 = this;
      }

      var10000 = (int[])com.c.c(592764144014982287L).get(var36);
      Object[] var67 = com.c.a(false);
      Method var100 = com.c.d(596499686400442579L);
      var10002 = var67;
      Object var68 = var10000;
      Method var41 = var100;

      try {
         var41.invoke(var68, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }
   }

   public void X(String var1, boolean var2) {
      DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var1);
      Object[] var10001 = com.c.a(var3);
      Method var10003 = com.c.d(325887470340955715L);
      Object[] var10002 = var10001;
      a3 var5 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      SwingUtilities.invokeLater(new bu_4(this, var2));
   }

   public Rectangle h() {
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(148691699844242618L);
      Object[] var10003 = var10002;
      a3 var6 = this;
      Method var10001 = var10004;

      try {
         var3 = var10001.invoke(var6, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      Object[] var4 = com.c.a(var3);
      Method var8 = com.c.d(181146716655875086L);
      var10002 = var4;
      a3 var5 = this;
      Method var10000 = var8;

      try {
         return (Rectangle)var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
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
      Object[] var10001 = com.c.a(this.getPathForRow(var1));
      Method var10003 = com.c.d(170828279568644375L);
      Object[] var10002 = var10001;
      a3 var3 = this;
      Method var10000 = var10003;

      try {
         return (DefaultMutableTreeNode)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public int p(Point var1) {
      Object[] var10001 = com.c.a(var1, true);
      Method var10003 = com.c.d(180859681207129054L);
      Object[] var10002 = var10001;
      a3 var3 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public DefaultMutableTreeNode o(Point var1) {
      DefaultMutableTreeNode var2 = null;
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(282975181547362546L);
      Object[] var10002 = var10001;
      a3 var9 = this;
      Method var10000 = var10003;

      try {
         var6 = (Integer)var10000.invoke(var9, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      int var3 = var6;
      if (var3 > -1) {
         var10001 = com.c.a(var3);
         var10003 = com.c.d(290714206414786866L);
         var10002 = var10001;
         a3 var11 = this;
         var10000 = var10003;

         try {
            var8 = (DefaultMutableTreeNode)var10000.invoke(var11, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var2 = var8;
      }

      return var2;
   }

   public int Y(Point var1, boolean var2) {
      int[] var3 = I();
      if ((a3)com.c.c(230619793659643674L).get(this) != null) {
         int var4 = 0;

         while (var4 < ((a3)com.c.c(230619793659643674L).get(this)).getRowCount()) {
            Object[] var10001 = com.c.a(var4, var2);
            Method var10003 = com.c.d(262352195177975129L);
            Object[] var10002 = var10001;
            a3 var9 = this;
            Method var10000 = var10003;

            try {
               var7 = (Rectangle)var10000.invoke(var9, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            Rectangle var5 = var7;
            if (var3 != null) {
               byte var8 = var5.contains(var1);
               if (var3 == null) {
                  return var8;
               }

               if (var8 != 0) {
                  return var4;
               }

               var4++;
            }

            if (var3 == null) {
               break;
            }
         }
      }

      return -1;
   }

   public Rectangle m(int var1, boolean var2) {
      Rectangle var4;
      if (var2) {
         Object[] var10001 = com.c.a(var1);
         Method var10003 = com.c.d(238718948396054910L);
         Object[] var10002 = var10001;
         a3 var5 = this;
         Method var10000 = var10003;

         try {
            var4 = (Rectangle)var10000.invoke(var5, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      } else {
         var4 = ((a3)com.c.c(230619793659643674L).get(this)).getRowBounds(var1);
      }

      return var4;
   }

   public Rectangle l(DefaultMutableTreeNode var1) {
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(266272579052802176L);
      Object[] var10003 = var10002;
      a3 var7 = this;
      Method var10001 = var10004;

      try {
         var4 = (Integer)var10001.invoke(var7, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      Object[] var5 = com.c.a(var4);
      Method var9 = com.c.d(238718948396054910L);
      var10002 = var5;
      a3 var6 = this;
      Method var10000 = var9;

      try {
         return (Rectangle)var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public int r(DefaultMutableTreeNode var1) {
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(340222048447034407L);
      Object[] var10003 = var10002;
      a3 var4 = this;
      Method var10001 = var10004;

      try {
         var3 = (TreePath)var10001.invoke(var4, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      return this.getRowForPath(var3);
   }

   public Rectangle M(int var1) {
      int[] var10000 = I();
      Rectangle var3 = ((a3)com.c.c(230619793659643674L).get(this)).getRowBounds(var1);
      int[] var2 = var10000;
      Rectangle var5 = var3;
      if (var2 != null) {
         if (var3 != null) {
            Insets var4 = ((a3)com.c.c(230619793659643674L).get(this)).getInsets();
            var3.x = var4.left;
            var3.width = ((a3)com.c.c(230619793659643674L).get(this)).getWidth() - var4.left - var4.right;
         }

         var5 = var3;
      }

      return var5;
   }

   @Override
   public void A(DefaultMutableTreeNode var1) {
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(340222048447034407L);
      Object[] var10002 = var10001;
      a3 var5 = this;
      Method var10000 = var10003;

      try {
         var4 = (TreePath)var10000.invoke(var5, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      TreePath var2 = var4;
      if (var2 != null) {
         this.setSelectionPath(var2);
      }
   }

   public DefaultMutableTreeNode M(String var1) {
      return (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var1);
   }

   public void Y(String var1) {
      Method var10000 = (Method)com.c.c(230619793659643674L).get(this);
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(224847783244984261L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var5 = (DefaultMutableTreeNode)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      DefaultMutableTreeNode var2 = var5;
      ((Fy_2)com.c.c(204612050171034220L).get(this)).removeNodeFromParent(var2);
   }

   public tf_4 Z(String var1, String var2, String var3, boolean var4, tf_4 var5, DefaultMutableTreeNode var6) {
      int[] var7;
      label167: {
         var7 = I();
         DefaultMutableTreeNode var10000 = var6;
         if (var7 != null) {
            if (var6 != null) {
               break label167;
            }

            var10000 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var1);
         }

         var6 = var10000;
      }

      tf_4 var8 = null;
      DefaultMutableTreeNode var9 = (DefaultMutableTreeNode)var6.getParent();
      var9.getUserObject();
      tf_4 var10 = (tf_4)var9.getUserObject();
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(498856411508641826L);
      Object[] var10002 = var10001;
      tf_4 var52 = var5;
      Method var31 = var10003;

      try {
         var32 = (String)var31.invoke(var52, var10002);
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      String var11 = var32;
      DefaultMutableTreeNode var12 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var11);
      ((HashMap)com.c.c(159245943539531162L).get(this)).remove(var11);
      var10001 = com.c.a(var2, var12);
      var10003 = com.c.d(314737538622127353L);
      var10002 = var10001;
      a3 var54 = this;
      var31 = var10003;

      try {
         var31.invoke(var54, var10002);
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      label170: {
         tf_4 var34 = var5;
         if (var7 != null) {
            var10001 = com.c.f();
            var10003 = com.c.d(490764181082108623L);
            var10002 = var10001;
            tf_4 var56 = var5;
            var31 = var10003;

            try {
               var36 = (Boolean)var31.invoke(var56, var10002);
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            if (var36) {
               var8 = new tf_4(new File(var2));
               break label170;
            }

            var34 = var5;
         }

         var8 = var34;
         var10001 = com.c.a(var2);
         var10003 = com.c.d(309720334529505891L);
         var10002 = var10001;
         tf_4 var58 = var8;
         var31 = var10003;

         try {
            var31.invoke(var58, var10002);
         } catch (InvocationTargetException var26) {
            throw var26.getTargetException();
         }

         var10001 = com.c.a(var3);
         var10003 = com.c.d(268583885901814073L);
         var10002 = var10001;
         tf_4 var60 = var8;
         var31 = var10003;

         try {
            var31.invoke(var60, var10002);
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }
      }

      var12.setUserObject(var8);
      var10001 = com.c.f();
      var10003 = com.c.d(349405327249700630L);
      var10002 = var10001;
      tf_4 var62 = var10;
      var31 = var10003;

      try {
         var31.invoke(var62, var10002);
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(360422804605248482L);
      var10002 = var10001;
      tf_4 var64 = var10;
      var31 = var10003;

      try {
         var31.invoke(var64, var10002);
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      var10001 = com.c.a(var2);
      var10003 = com.c.d(478023116908039358L);
      var10002 = var10001;
      tf_4 var66 = var10;
      var31 = var10003;

      try {
         var42 = (Integer)var31.invoke(var66, var10002);
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      int var13 = var42;
      var10001 = com.c.a(var9);
      var10003 = com.c.d(201726770406369370L);
      var10002 = var10001;
      a3 var68 = this;
      var31 = var10003;

      try {
         var44 = (Boolean)var31.invoke(var68, var10002);
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      boolean var14 = var44;
      var10001 = com.c.a(var12);
      var10003 = com.c.d(201726770406369370L);
      var10002 = var10001;
      a3 var70 = this;
      var31 = var10003;

      try {
         var46 = (Boolean)var31.invoke(var70, var10002);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      boolean var15 = var46;
      ((Fy_2)com.c.c(204612050171034220L).get(this)).removeNodeFromParent(var12);
      var10001 = com.c.a(var12, var9, var13);
      var10003 = com.c.d(158472919928157277L);
      var10002 = var10001;
      a3 var72 = this;
      var31 = var10003;

      try {
         var31.invoke(var72, var10002);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      boolean var48 = var14;
      if (var7 != null) {
         if (var14) {
            this.expandPath(new TreePath(var9.getPath()));
         }

         var48 = var15;
      }

      if (var7 != null) {
         if (var48) {
            this.expandPath(new TreePath(var12.getPath()));
         }

         var48 = var4;
      }

      if (var7 != null) {
         if (var48) {
            var10001 = com.c.a(var12);
            var10003 = com.c.d(325887470340955715L);
            var10002 = var10001;
            a3 var74 = this;
            var31 = var10003;

            try {
               var31.invoke(var74, var10002);
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }
         }

         var48 = ((HashSet)com.c.c(490343386624486773L).get(this)).contains(var1);
      }

      if (var7 != null) {
         if (var48) {
            var10001 = com.c.a(var2);
            var10003 = com.c.d(177354243147298003L);
            var10002 = var10001;
            a3 var76 = this;
            var31 = var10003;

            try {
               var31.invoke(var76, var10002);
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }
         }

         ((HashSet)com.c.c(490343386624486773L).get(this)).remove(var1);
         ((HashSet)com.c.c(467542466021000295L).get(this)).remove(var1);
      }

      var10001 = com.c.a(var6, var2, var1);
      var10003 = com.c.d(455357571470037037L);
      var10002 = var10001;
      a3 var78 = this;
      var31 = var10003;

      try {
         var31.invoke(var78, var10002);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      ((Km_2)com.c.c(285663222664681848L).get(this)).getRowSorter().allRowsChanged();
      if (com.ky_4.F() != null) {
         h(new int[3]);
      }

      return var8;
   }

   public ck_4 F(String var1, String var2, String var3) {
      Object[] var10000 = com.c.a(var1);
      Method var14 = com.c.d(405430188584561323L);
      Object[] var33 = var10000;
      Object var22 = null;

      try {
         var10000 = (String)var14.invoke(var22, var33);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      String var4 = var10000;
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var4);
      tf_4 var6 = (tf_4)var5.getUserObject();
      var22 = com.c.a(var1);
      Method var10003 = com.c.d(401199004121092607L);
      var33 = (Object[])var22;
      var22 = var6;
      Method var16 = var10003;

      try {
         var10000 = (ck_4)var16.invoke(var22, var33);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      ck_4 var7 = var10000;
      var22 = com.c.a(var2);
      var10003 = com.c.d(584136914483294074L);
      var33 = (Object[])var22;
      var22 = var7;
      Method var18 = var10003;

      try {
         var18.invoke(var22, var33);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var22 = com.c.a(var3);
      var10003 = com.c.d(155850144873198620L);
      var33 = (Object[])var22;
      var22 = var7;
      Method var19 = var10003;

      try {
         var19.invoke(var22, var33);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var22 = com.c.f();
      var10003 = com.c.d(349405327249700630L);
      var33 = (Object[])var22;
      var22 = var6;
      Method var20 = var10003;

      try {
         var20.invoke(var22, var33);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var22 = com.c.f();
      var10003 = com.c.d(360422804605248482L);
      var33 = (Object[])var22;
      var22 = var6;
      Method var21 = var10003;

      try {
         var21.invoke(var22, var33);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      ((Km_2)com.c.c(285663222664681848L).get(this)).getRowSorter().allRowsChanged();
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

            Object[] var10001 = com.c.a(var6, var2, var3);
            Method var10003 = com.c.d(157758653987128050L);
            Object[] var10002 = var10001;
            a3 var13 = this;
            Method var11 = var10003;

            try {
               var11.invoke(var13, var10002);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            var5++;
            if (var4 != null) {
               continue;
            }
         }

         var10000 = (int[])var1.getUserObject();
         break;
      }

      tf_4 var9 = (tf_4)var10000;
      Object[] var14 = com.c.a(var9, var2, var3);
      Method var17 = com.c.d(550828352058500889L);
      Object[] var16 = var14;
      a3 var15 = this;
      Method var12 = var17;

      try {
         var12.invoke(var15, var16);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }
   }

   void f(String var1, String var2) {
      int[] var3 = I();
      Method var10000 = (HashSet)com.c.c(490343386624486773L).get(this);
      if (var3 != null) {
         if (var10000.contains(var2)) {
            ((HashSet)com.c.c(490343386624486773L).get(this)).remove(var2);
            Object[] var10001 = com.c.a(var1);
            Method var10003 = com.c.d(177354243147298003L);
            Object[] var10002 = var10001;
            a3 var9 = this;
            var10000 = var10003;

            try {
               var10000.invoke(var9, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }
         }

         var10000 = (Method)((HashMap)com.c.c(159245943539531162L).get(this)).remove(var2);
      }

      DefaultMutableTreeNode var4 = (DefaultMutableTreeNode)var10000;
      if (var4 != null) {
         Object[] var10 = com.c.a(var1, var4);
         Method var13 = com.c.d(314737538622127353L);
         Object[] var12 = var10;
         a3 var11 = this;
         var10000 = var13;

         try {
            var10000.invoke(var11, var12);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }
      }
   }

   void O(tf_4 var1, String var2, String var3) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(248698316749304686L);
      Object[] var10002 = var10001;
      tf_4 var21 = var1;
      Method var10000 = var10003;

      try {
         var14 = (List)var10000.invoke(var21, var10002);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      List var5 = var14;
      int[] var15 = I();
      Iterator var6 = var5.iterator();
      int[] var4 = var15;

      while (var6.hasNext()) {
         ck_4 var7 = (ck_4)var6.next();
         var10001 = com.c.f();
         var10003 = com.c.d(605430732347023634L);
         var10002 = var10001;
         ck_4 var23 = var7;
         var10000 = var10003;

         try {
            var17 = (String)var10000.invoke(var23, var10002);
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         String var8 = var17;
         var10001 = com.c.a(var8, var2, var3);
         var10003 = com.c.d(445108065698264000L);
         var10002 = var10001;
         a3 var25 = this;
         var10000 = var10003;

         try {
            var19 = (String)var10000.invoke(var25, var10002);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         String var9 = var19;
         var10001 = com.c.a(var9);
         var10003 = com.c.d(584136914483294074L);
         var10002 = var10001;
         ck_4 var27 = var7;
         var10000 = var10003;

         try {
            var10000.invoke(var27, var10002);
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
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
      boolean var17 = var5.getClass().equals(tf_4.class);
      if (var4 != null) {
         if (var17) {
            tf_4 var6 = (tf_4)var5;
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(498856411508641826L);
            Object[] var10002 = var10001;
            tf_4 var26 = var6;
            Method var18 = var10003;

            try {
               var19 = (String)var18.invoke(var26, var10002);
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }

            String var7 = var19;
            var10001 = com.c.a(var7, var2, var3);
            var10003 = com.c.d(445108065698264000L);
            var10002 = var10001;
            a3 var28 = this;
            Method var20 = var10003;

            try {
               var21 = (String)var20.invoke(var28, var10002);
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            String var8 = var21;
            var10001 = com.c.a(var8);
            var10003 = com.c.d(309720334529505891L);
            var10002 = var10001;
            tf_4 var30 = var6;
            Method var22 = var10003;

            try {
               var22.invoke(var30, var10002);
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            var10001 = com.c.a(var6, var2, var3);
            var10003 = com.c.d(550828352058500889L);
            var10002 = var10001;
            a3 var32 = this;
            Method var23 = var10003;

            try {
               var23.invoke(var32, var10002);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            var10001 = com.c.a(var8, var7);
            var10003 = com.c.d(344670769051664157L);
            var10002 = var10001;
            a3 var34 = this;
            Method var24 = var10003;

            try {
               var24.invoke(var34, var10002);
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            int var9 = 0;

            while (var9 < var1.getChildCount()) {
               DefaultMutableTreeNode var10 = (DefaultMutableTreeNode)var1.getChildAt(var9);
               var10001 = com.c.a(var10, var2, var3);
               var10003 = com.c.d(157758653987128050L);
               var10002 = var10001;
               a3 var36 = this;
               Method var25 = var10003;

               try {
                  var25.invoke(var36, var10002);
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
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

         var17 = var5.getClass().equals(ck_4.class);
      }

      if (var17) {
      }
   }

   String n(String var1, String var2, String var3) {
      return var2 + var1.substring(var3.length());
   }

   public void m(String var1) {
      int[] var10000 = I();
      DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var1);
      int[] var2 = var10000;
      DefaultMutableTreeNode var8 = var3;
      if (var2 != null) {
         if (var3 == null) {
            return;
         }

         var8 = (DefaultMutableTreeNode)var3.getParent();
      }

      DefaultMutableTreeNode var4 = var8;
      tf_4 var5 = (tf_4)var4.getUserObject();
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(630828008397989993L);
      Object[] var10002 = var10001;
      tf_4 var13 = var5;
      Method var9 = var10003;

      try {
         var9.invoke(var13, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      ((HashMap)com.c.c(159245943539531162L).get(this)).remove(var1);
      ((HashSet)com.c.c(490343386624486773L).get(this)).remove(var1);
      a3 var10 = this;
      if (var2 != null) {
         ((HashSet)com.c.c(467542466021000295L).get(this)).remove(var1);
         if (var3 != null) {
            ((Fy_2)com.c.c(204612050171034220L).get(this)).removeNodeFromParent(var3);
         }

         var10 = this;
      }

      var10000 = (int[])com.c.c(608688273536518013L).get(var10);
      var10001 = com.c.a(var5);
      var10003 = com.c.d(217942201414471271L);
      var10002 = var10001;
      var10001 = var10000;
      Method var12 = var10003;

      try {
         var12.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void i(String var1) {
      int[] var10000 = I();
      Object[] var10001 = com.c.a(var1);
      Method var13 = com.c.d(405430188584561323L);
      Object[] var22 = var10001;
      Object var19 = null;

      try {
         var10001 = (String)var13.invoke(var19, var22);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      String var3 = var10001;
      int[] var2 = var10000;
      DefaultMutableTreeNode var4 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var3);
      var10000 = (int[])var4;
      if (var2 != null) {
         if (var4 == null) {
            return;
         }

         var10000 = (int[])var4.getUserObject();
      }

      tf_4 var5 = (tf_4)var10000;
      var10001 = com.c.a(var1);
      Method var23 = com.c.d(548576199562161390L);
      var19 = var10001;
      tf_4 var16 = var5;
      Method var10 = var23;

      try {
         var10.invoke(var16, (Object[])var19);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10000 = (int[])com.c.c(608688273536518013L).get(this);
      var10001 = com.c.a(var5);
      Method var24 = com.c.d(217942201414471271L);
      var19 = var10001;
      var10001 = var10000;
      Method var12 = var24;

      try {
         var12.invoke(var10001, (Object[])var19);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public ck_4 G(String var1, String var2, boolean var3) {
      ck_4 var4 = null;
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var1);
      ((HashMap)com.c.c(159245943539531162L).get(this)).remove(var1);
      Object[] var10001 = com.c.a(var2, var5);
      Method var10003 = com.c.d(314737538622127353L);
      Object[] var10002 = var10001;
      a3 var10 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var10, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10001 = com.c.a(var2, var1);
      var10003 = com.c.d(344670769051664157L);
      var10002 = var10001;
      a3 var12 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var12, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var4 = new ck_4(new File(var2));
      var5.setUserObject(var4);
      ((Fy_2)com.c.c(204612050171034220L).get(this)).nodeChanged(var5);
      return var4;
   }

   public ck_4 U(String var1, String var2, boolean var3) {
      ck_4 var4 = null;
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var1);
      ((HashMap)com.c.c(159245943539531162L).get(this)).remove(var1);
      Object[] var10001 = com.c.a(var2, var5);
      Method var10003 = com.c.d(314737538622127353L);
      Object[] var10002 = var10001;
      a3 var8 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var4 = new ck_4(new File(var2));
      var5.setUserObject(var4);
      ((Fy_2)com.c.c(204612050171034220L).get(this)).nodeChanged(var5);
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
      // 002: invokevirtual a3.setRootVisible (Z)V
      // 005: invokestatic a3.I ()[I
      // 008: aload 0
      // 009: aload 0
      // 00a: ldc2_w 159972400659094256
      // 00d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 010: swap
      // 011: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 014: iload 1
      // 015: bipush 1
      // 016: invokestatic com/c.a (Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 019: ldc2_w 413727787977868950
      // 01c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 01f: dup_x2
      // 020: pop
      // 021: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 024: pop
      // 025: goto 02c
      // 028: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: astore 2
      // 02d: aload 0
      // 02e: ldc2_w 159245943539531162
      // 031: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 034: swap
      // 035: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 038: checkcast java/util/HashMap
      // 03b: aload 0
      // 03c: ldc2_w 159972400659094256
      // 03f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 042: swap
      // 043: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 046: checkcast java/lang/String
      // 049: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 04c: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 04f: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 052: checkcast tf_4
      // 055: astore 3
      // 056: aload 0
      // 057: ldc2_w 608688273536518013
      // 05a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 05d: swap
      // 05e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 061: aload 3
      // 062: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 065: ldc2_w 217942201414471271
      // 068: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 06b: dup_x2
      // 06c: pop
      // 06d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 070: pop
      // 071: goto 078
      // 074: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 077: athrow
      // 078: invokestatic java/io/File.listRoots ()[Ljava/io/File;
      // 07b: astore 4
      // 07d: aload 4
      // 07f: bipush 0
      // 080: aaload
      // 081: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 084: astore 5
      // 086: bipush 0
      // 087: istore 6
      // 089: iload 6
      // 08b: sipush 4348
      // 08e: ldc2_w 3302863423431288961
      // 091: invokestatic a3.b (IJ)I
      // 094: if_icmpge 134
      // 097: aload 0
      // 098: ldc2_w 159245943539531162
      // 09b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 09e: swap
      // 09f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0a2: checkcast java/util/HashMap
      // 0a5: aload 5
      // 0a7: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0aa: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 0ad: astore 7
      // 0af: aload 2
      // 0b0: ifnull 123
      // 0b3: aload 7
      // 0b5: aload 2
      // 0b6: ifnull 170
      // 0b9: goto 0c0
      // 0bc: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bf: athrow
      // 0c0: ifnull 117
      // 0c3: goto 0ca
      // 0c6: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0c9: athrow
      // 0ca: aload 0
      // 0cb: aload 7
      // 0cd: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0d0: ldc2_w 325887470340955715
      // 0d3: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0d6: dup_x2
      // 0d7: pop
      // 0d8: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0db: pop
      // 0dc: goto 0e3
      // 0df: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: ldc2_w 250204424432541123
      // 0e7: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0ea: swap
      // 0eb: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ee: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 0f1: bipush 0
      // 0f2: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getChildAt (I)Ljavax/swing/tree/TreeNode;
      // 0f5: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 0f8: astore 8
      // 0fa: aload 0
      // 0fb: aload 8
      // 0fd: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 100: ldc2_w 325887470340955715
      // 103: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 106: dup_x2
      // 107: pop
      // 108: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 10b: pop
      // 10c: goto 113
      // 10f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 112: athrow
      // 113: aload 2
      // 114: ifnonnull 134
      // 117: sipush 24859
      // 11a: ldc2_w 2150559354459530008
      // 11d: invokestatic a3.c (IJ)J
      // 120: invokestatic java/lang/Thread.sleep (J)V
      // 123: goto 12d
      // 126: astore 8
      // 128: aload 8
      // 12a: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 12d: iinc 6 1
      // 130: aload 2
      // 131: ifnonnull 089
      // 134: invokestatic com/c.f ()[Ljava/lang/Object;
      // 137: ldc2_w 253808553645062345
      // 13a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 13d: swap
      // 13e: aconst_null
      // 13f: swap
      // 140: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 143: checkcast java/lang/Boolean
      // 146: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 149: goto 150
      // 14c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14f: athrow
      // 150: ifne 18b
      // 153: aload 0
      // 154: ldc2_w 159245943539531162
      // 157: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 15a: swap
      // 15b: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 15e: checkcast java/util/HashMap
      // 161: ldc "/"
      // 163: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 166: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 169: goto 170
      // 16c: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16f: athrow
      // 170: astore 6
      // 172: aload 0
      // 173: aload 6
      // 175: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 178: ldc2_w 432401853757608830
      // 17b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 17e: dup_x2
      // 17f: pop
      // 180: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 183: pop
      // 184: goto 18b
      // 187: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 18a: athrow
      // 18b: return
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
      // 000: invokestatic a3.I ()[I
      // 003: astore 4
      // 005: aload 0
      // 006: invokestatic com/c.f ()[Ljava/lang/Object;
      // 009: ldc2_w 124537922262452220
      // 00c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 00f: dup_x2
      // 010: pop
      // 011: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 014: checkcast java/lang/Boolean
      // 017: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01a: goto 021
      // 01d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 020: athrow
      // 021: ifeq 052
      // 024: new java/io/File
      // 027: dup
      // 028: aload 1
      // 029: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 02c: astore 5
      // 02e: aload 5
      // 030: invokevirtual java/io/File.isDirectory ()Z
      // 033: aload 4
      // 035: ifnull 04e
      // 038: ifeq 051
      // 03b: goto 042
      // 03e: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 041: athrow
      // 042: aload 5
      // 044: invokevirtual java/io/File.exists ()Z
      // 047: goto 04e
      // 04a: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 04d: athrow
      // 04e: ifne 052
      // 051: return
      // 052: aconst_null
      // 053: astore 5
      // 055: new java/util/ArrayList
      // 058: dup
      // 059: invokespecial java/util/ArrayList.<init> ()V
      // 05c: astore 6
      // 05e: aconst_null
      // 05f: astore 7
      // 061: aload 1
      // 062: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 065: ldc2_w 159824902428932603
      // 068: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 06b: swap
      // 06c: aconst_null
      // 06d: swap
      // 06e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 071: checkcast java/lang/String
      // 074: goto 07b
      // 077: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: astore 8
      // 07d: aload 1
      // 07e: astore 9
      // 080: aload 9
      // 082: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 085: ldc2_w 537779894720802184
      // 088: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 08b: swap
      // 08c: aconst_null
      // 08d: swap
      // 08e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 091: checkcast java/lang/Boolean
      // 094: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 097: goto 09e
      // 09a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: ifne 0d7
      // 0a1: aload 6
      // 0a3: bipush 0
      // 0a4: aload 9
      // 0a6: invokevirtual java/util/ArrayList.add (ILjava/lang/Object;)V
      // 0a9: aload 9
      // 0ab: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ae: ldc2_w 405430188584561323
      // 0b1: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0b4: swap
      // 0b5: aconst_null
      // 0b6: swap
      // 0b7: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0ba: checkcast java/lang/String
      // 0bd: goto 0c4
      // 0c0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c3: athrow
      // 0c4: astore 9
      // 0c6: aload 4
      // 0c8: ifnull 218
      // 0cb: aload 4
      // 0cd: ifnonnull 080
      // 0d0: goto 0d7
      // 0d3: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: ldc2_w 393220934160143516
      // 0db: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0de: swap
      // 0df: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0e2: checkcast zD
      // 0e5: aload 4
      // 0e7: ifnull 237
      // 0ea: ifnull 218
      // 0ed: goto 0f4
      // 0f0: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: ldc2_w 159245943539531162
      // 0f8: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0fb: swap
      // 0fc: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ff: checkcast java/util/HashMap
      // 102: ldc "/"
      // 104: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 107: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 10a: astore 10
      // 10c: aload 10
      // 10e: ifnonnull 213
      // 111: new tf_4
      // 114: dup
      // 115: invokespecial tf_4.<init> ()V
      // 118: astore 11
      // 11a: aload 11
      // 11c: aload 0
      // 11d: ldc2_w 393220934160143516
      // 120: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 123: swap
      // 124: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 127: checkcast zD
      // 12a: ifnonnull 135
      // 12d: bipush 1
      // 12e: goto 136
      // 131: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 134: athrow
      // 135: bipush 0
      // 136: invokestatic com/c.a (Z)[Ljava/lang/Object;
      // 139: ldc2_w 239155702935749150
      // 13c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 13f: dup_x2
      // 140: pop
      // 141: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 144: pop
      // 145: goto 14c
      // 148: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 14b: athrow
      // 14c: aload 11
      // 14e: ldc "/"
      // 150: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 153: ldc2_w 309720334529505891
      // 156: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 159: dup_x2
      // 15a: pop
      // 15b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 15e: pop
      // 15f: goto 166
      // 162: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 165: athrow
      // 166: aload 11
      // 168: ldc "/"
      // 16a: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 16d: ldc2_w 268583885901814073
      // 170: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 173: dup_x2
      // 174: pop
      // 175: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 178: pop
      // 179: goto 180
      // 17c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17f: athrow
      // 180: new javax/swing/tree/DefaultMutableTreeNode
      // 183: dup
      // 184: aload 11
      // 186: invokespecial javax/swing/tree/DefaultMutableTreeNode.<init> (Ljava/lang/Object;)V
      // 189: astore 12
      // 18b: aload 0
      // 18c: aload 11
      // 18e: invokestatic com/c.f ()[Ljava/lang/Object;
      // 191: ldc2_w 498856411508641826
      // 194: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 197: dup_x2
      // 198: pop
      // 199: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 19c: goto 1a3
      // 19f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a2: athrow
      // 1a3: aload 12
      // 1a5: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 1a8: ldc2_w 314737538622127353
      // 1ab: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1ae: dup_x2
      // 1af: pop
      // 1b0: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1b3: pop
      // 1b4: goto 1bb
      // 1b7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ba: athrow
      // 1bb: aload 0
      // 1bc: aload 12
      // 1be: aload 0
      // 1bf: ldc2_w 250204424432541123
      // 1c2: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1c5: swap
      // 1c6: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1c9: bipush 0
      // 1ca: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;I)[Ljava/lang/Object;
      // 1cd: ldc2_w 158472919928157277
      // 1d0: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1d3: dup_x2
      // 1d4: pop
      // 1d5: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1d8: pop
      // 1d9: goto 1e0
      // 1dc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1df: athrow
      // 1e0: aload 0
      // 1e1: aload 0
      // 1e2: ldc2_w 250204424432541123
      // 1e5: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1e8: swap
      // 1e9: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1ec: aload 11
      // 1ee: new javax/swing/tree/TreePath
      // 1f1: dup
      // 1f2: aload 12
      // 1f4: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getPath ()[Ljavax/swing/tree/TreeNode;
      // 1f7: invokespecial javax/swing/tree/TreePath.<init> ([Ljava/lang/Object;)V
      // 1fa: aconst_null
      // 1fb: iload 2
      // 1fc: iload 3
      // 1fd: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 200: ldc2_w 523405946948830526
      // 203: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 206: dup_x2
      // 207: pop
      // 208: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 20b: pop
      // 20c: goto 213
      // 20f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 212: athrow
      // 213: aload 4
      // 215: ifnonnull 295
      // 218: aload 0
      // 219: ldc2_w 159245943539531162
      // 21c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 21f: swap
      // 220: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 223: checkcast java/util/HashMap
      // 226: aload 0
      // 227: ldc2_w 159972400659094256
      // 22a: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 22d: swap
      // 22e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 231: checkcast java/lang/String
      // 234: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 237: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 23a: astore 10
      // 23c: aload 4
      // 23e: ifnull 28b
      // 241: aload 10
      // 243: ifnonnull 295
      // 246: goto 24d
      // 249: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24c: athrow
      // 24d: aload 0
      // 24e: aload 0
      // 24f: ldc2_w 250204424432541123
      // 252: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 255: swap
      // 256: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 259: new tf_4
      // 25c: dup
      // 25d: aload 0
      // 25e: ldc2_w 631471321046808880
      // 261: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 264: swap
      // 265: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 268: checkcast java/io/File
      // 26b: invokespecial tf_4.<init> (Ljava/io/File;)V
      // 26e: bipush 1
      // 26f: bipush 1
      // 270: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 273: aconst_null
      // 274: bipush 1
      // 275: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 278: ldc2_w 280876818035359663
      // 27b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 27e: dup_x2
      // 27f: pop
      // 280: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 283: pop
      // 284: goto 28b
      // 287: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 28a: athrow
      // 28b: goto 295
      // 28e: astore 11
      // 290: aload 11
      // 292: invokevirtual java/lang/Exception.printStackTrace ()V
      // 295: bipush 1
      // 296: istore 10
      // 298: invokestatic com/c.f ()[Ljava/lang/Object;
      // 29b: ldc2_w 253808553645062345
      // 29e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2a1: swap
      // 2a2: aconst_null
      // 2a3: swap
      // 2a4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2a7: checkcast java/lang/Boolean
      // 2aa: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2ad: goto 2b4
      // 2b0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2b3: athrow
      // 2b4: aload 4
      // 2b6: ifnull 2dc
      // 2b9: ifeq 2ee
      // 2bc: goto 2c3
      // 2bf: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c2: athrow
      // 2c3: aload 1
      // 2c4: aload 0
      // 2c5: ldc2_w 159972400659094256
      // 2c8: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2cb: swap
      // 2cc: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2cf: checkcast java/lang/String
      // 2d2: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2d5: goto 2dc
      // 2d8: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2db: athrow
      // 2dc: aload 4
      // 2de: ifnull 2ec
      // 2e1: ifeq 2ee
      // 2e4: goto 2eb
      // 2e7: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ea: athrow
      // 2eb: bipush 0
      // 2ec: istore 10
      // 2ee: aload 6
      // 2f0: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 2f3: astore 11
      // 2f5: aload 11
      // 2f7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2fc: ifeq 414
      // 2ff: aload 11
      // 301: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 306: checkcast java/lang/String
      // 309: astore 12
      // 30b: aload 0
      // 30c: ldc2_w 159245943539531162
      // 30f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 312: swap
      // 313: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 316: checkcast java/util/HashMap
      // 319: aload 12
      // 31b: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 31e: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 321: astore 13
      // 323: aload 4
      // 325: ifnull 42d
      // 328: bipush 0
      // 329: istore 14
      // 32b: iload 10
      // 32d: ifeq 39c
      // 330: iload 14
      // 332: aload 4
      // 334: ifnull 2fc
      // 337: bipush 22
      // 339: ldc2_w 7143513546777213034
      // 33c: invokestatic a3.b (IJ)I
      // 33f: if_icmpge 39c
      // 342: sipush 13750
      // 345: ldc2_w 7936045584714528692
      // 348: invokestatic a3.c (IJ)J
      // 34b: invokestatic java/lang/Thread.sleep (J)V
      // 34e: goto 358
      // 351: astore 15
      // 353: aload 15
      // 355: invokevirtual java/lang/InterruptedException.printStackTrace ()V
      // 358: aload 0
      // 359: ldc2_w 159245943539531162
      // 35c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 35f: swap
      // 360: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 363: checkcast java/util/HashMap
      // 366: aload 12
      // 368: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 36b: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 36e: astore 13
      // 370: aload 4
      // 372: ifnull 397
      // 375: aload 13
      // 377: ifnull 38d
      // 37a: goto 381
      // 37d: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 380: athrow
      // 381: aload 4
      // 383: ifnonnull 39c
      // 386: goto 38d
      // 389: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38c: athrow
      // 38d: iinc 14 1
      // 390: goto 397
      // 393: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 396: athrow
      // 397: aload 4
      // 399: ifnonnull 32b
      // 39c: aload 13
      // 39e: aload 4
      // 3a0: ifnull 3c9
      // 3a3: ifnull 40f
      // 3a6: goto 3ad
      // 3a9: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3ac: athrow
      // 3ad: aload 0
      // 3ae: new javax/swing/tree/TreePath
      // 3b1: dup
      // 3b2: aload 13
      // 3b4: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getPath ()[Ljavax/swing/tree/TreeNode;
      // 3b7: invokespecial javax/swing/tree/TreePath.<init> ([Ljava/lang/Object;)V
      // 3ba: invokevirtual a3.expandPath (Ljavax/swing/tree/TreePath;)V
      // 3bd: aload 13
      // 3bf: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 3c2: goto 3c9
      // 3c5: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c8: athrow
      // 3c9: checkcast tf_4
      // 3cc: astore 14
      // 3ce: new javax/swing/tree/TreePath
      // 3d1: dup
      // 3d2: aload 13
      // 3d4: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getPath ()[Ljavax/swing/tree/TreeNode;
      // 3d7: invokespecial javax/swing/tree/TreePath.<init> ([Ljava/lang/Object;)V
      // 3da: astore 15
      // 3dc: aload 0
      // 3dd: ldc2_w 428509894309855334
      // 3e0: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3e3: swap
      // 3e4: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3e7: checkcast java/util/HashSet
      // 3ea: aload 1
      // 3eb: invokevirtual java/util/HashSet.add (Ljava/lang/Object;)Z
      // 3ee: pop
      // 3ef: aload 0
      // 3f0: aload 13
      // 3f2: aload 14
      // 3f4: aload 15
      // 3f6: aload 1
      // 3f7: iload 2
      // 3f8: iload 3
      // 3f9: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 3fc: ldc2_w 523405946948830526
      // 3ff: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 402: dup_x2
      // 403: pop
      // 404: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 407: pop
      // 408: goto 40f
      // 40b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 40e: athrow
      // 40f: aload 4
      // 411: ifnonnull 2f5
      // 414: aload 0
      // 415: aload 1
      // 416: iload 2
      // 417: invokestatic com/c.a (Ljava/lang/Object;Z)[Ljava/lang/Object;
      // 41a: ldc2_w 164933463804385401
      // 41d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 420: dup_x2
      // 421: pop
      // 422: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 425: pop
      // 426: goto 42d
      // 429: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 42c: athrow
      // 42d: return
   }

   void g(TreeExpansionEvent var1) {
      com.c.c(392487943619353892L).setLong(this, System.currentTimeMillis());
      Method var10000 = (Method)com.c.c(388376917454860932L).get(null);
      Object[] var10001 = com.c.a(new Va_2(this, var1));
      Method var10003 = com.c.d(434592463220957006L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public DefaultMutableTreeNode J(DefaultMutableTreeNode var1, tf_4 var2, int var3) {
      int[] var10000 = I();
      DefaultMutableTreeNode var5 = new DefaultMutableTreeNode(var2);
      Object[] var10003 = com.c.f();
      Method var10005 = com.c.d(498856411508641826L);
      Object[] var10004 = var10003;
      tf_4 var54 = var2;
      Method var10002 = var10005;

      try {
         var43 = var10002.invoke(var54, var10004);
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Object[] var44 = com.c.a(var43, var5);
      Method var62 = com.c.d(314737538622127353L);
      var10003 = var44;
      a3 var45 = this;
      Method var10001 = var62;

      try {
         var10001.invoke(var45, var10003);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Object[] var46 = com.c.a(var5, var1, var3);
      Method var63 = com.c.d(158472919928157277L);
      var10003 = var46;
      a3 var47 = this;
      var10001 = var63;

      try {
         var10001.invoke(var47, var10003);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      ArrayList var6 = new ArrayList();
      Object[] var48 = com.c.f();
      Method var64 = com.c.d(369380169373911815L);
      var10003 = var48;
      tf_4 var49 = var2;
      var10001 = var64;

      try {
         var34 = (List)var10001.invoke(var49, var10003);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Iterator var7 = var34.iterator();
      int[] var4 = var10000;

      while (true) {
         if (var7.hasNext()) {
            tf_4 var8 = (tf_4)var7.next();
            var6.add(var8);
            if (var4 == null) {
               break;
            }

            if (var4 != null) {
               continue;
            }
         }

         Object[] var35 = com.c.f();
         Method var58 = com.c.d(248698316749304686L);
         Object[] var50 = var35;
         tf_4 var36 = var2;
         Method var23 = var58;

         try {
            var24 = (List)var23.invoke(var36, var50);
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         var7 = var24.iterator();
         break;
      }

      while (true) {
         if (var7.hasNext()) {
            ck_4 var20 = (ck_4)var7.next();
            var6.add(var20);
            if (var4 == null) {
               break;
            }

            if (var4 != null) {
               continue;
            }
         }

         Collections.sort(var6, new mZ(this));
         break;
      }

      for (Object var21 : var6) {
         label130: {
            label131: {
               String var9 = "";
               boolean var25 = var21.getClass().equals(ck_4.class);
               if (var4 != null) {
                  if (var25) {
                     ck_4 var10 = (ck_4)var21;
                     Object[] var37 = com.c.f();
                     Method var59 = com.c.d(605430732347023634L);
                     Object[] var51 = var37;
                     ck_4 var38 = var10;
                     Method var26 = var59;

                     try {
                        String var27 = (String)var26.invoke(var38, var51);
                     } catch (InvocationTargetException var13) {
                        throw var13.getTargetException();
                     }

                     if (var4 != null) {
                        break label130;
                     }
                  }

                  var10000 = (int[])var21.getClass();
                  if (var4 == null) {
                     break label131;
                  }

                  var25 = var10000.equals(tf_4.class);
               }

               if (!var25) {
                  break label130;
               }

               var10000 = (int[])var21;
            }

            tf_4 var22 = (tf_4)var10000;
            Object[] var39 = com.c.f();
            Method var60 = com.c.d(498856411508641826L);
            Object[] var52 = var39;
            tf_4 var40 = var22;
            Method var29 = var60;

            try {
               String var30 = (String)var29.invoke(var40, var52);
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            Object[] var41 = com.c.a(var5, var22, var5.getChildCount());
            Method var61 = com.c.d(598053055183063382L);
            Object[] var53 = var41;
            a3 var42 = this;
            Method var31 = var61;

            try {
               var31.invoke(var42, var53);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }
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
      byte var14 = var1.getClass().equals(ck_4.class);
      if (var2 != null) {
         if (var14 != 0) {
            ck_4 var4 = (ck_4)var1;
            Object var10001 = com.c.c(486969408556937700L).get(this);
            Object[] var10003 = com.c.f();
            Method var10005 = com.c.d(272998330038223631L);
            Object[] var10004 = var10003;
            ck_4 var45 = var4;
            Method var10002 = var10005;

            try {
               var34 = var10002.invoke(var45, var10004);
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            Object[] var35 = com.c.a(var34);
            Method var54 = com.c.d(161001903655294681L);
            var10003 = var35;
            Object var36 = var10001;
            var10001 = var54;

            try {
               var22 = (Integer)var10001.invoke(var36, var10003);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            var10001 = com.c.a(var22);
            Method var47 = com.c.d(373451884489290303L);
            var36 = var10001;
            var10001 = var4;
            Method var15 = var47;

            try {
               var15.invoke(var10001, (Object[])var36);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            var10001 = com.c.f();
            Method var48 = com.c.d(340831131124362618L);
            var36 = var10001;
            var10001 = var4;
            Method var16 = var48;

            try {
               var17 = (Integer)var16.invoke(var10001, (Object[])var36);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }

            var3 = var17;
            if (var2 != null) {
               return var3;
            }
         }

         var14 = var1.getClass().equals(tf_4.class);
      }

      if (var2 == null) {
         return var14;
      } else {
         if (var14 != 0) {
            tf_4 var13 = (tf_4)var1;
            Object var27 = com.c.c(486969408556937700L).get(this);
            Object[] var49 = com.c.f();
            Method var57 = com.c.d(543633160597441792L);
            Object[] var55 = var49;
            tf_4 var50 = var13;
            Method var39 = var57;

            try {
               var40 = var39.invoke(var50, var55);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            Object[] var41 = com.c.a(var40);
            Method var56 = com.c.d(161001903655294681L);
            var49 = var41;
            Object var42 = var27;
            var27 = var56;

            try {
               var29 = (Integer)var27.invoke(var42, var49);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            var27 = com.c.a(var29);
            Method var52 = com.c.d(179831926534770454L);
            var42 = var27;
            var27 = var13;
            Method var18 = var52;

            try {
               var18.invoke(var27, (Object[])var42);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            var27 = com.c.f();
            Method var53 = com.c.d(122582478688599456L);
            var42 = var27;
            var27 = var13;
            Method var19 = var53;

            try {
               var20 = (Integer)var19.invoke(var27, (Object[])var42);
            } catch (InvocationTargetException var5) {
               throw var5.getTargetException();
            }

            var3 = var20;
         }

         return var3;
      }
   }

   public void F(DefaultMutableTreeNode var1, ck_4 var2) {
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(605430732347023634L);
      Object[] var10003 = var10002;
      ck_4 var8 = var2;
      Method var10001 = var10004;

      try {
         var5 = var10001.invoke(var8, var10003);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      Object[] var6 = com.c.a(var5, var1);
      Method var10 = com.c.d(314737538622127353L);
      var10002 = var6;
      a3 var7 = this;
      Method var10000 = var10;

      try {
         var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   void u(String var1, DefaultMutableTreeNode var2) {
      ((HashMap)com.c.c(159245943539531162L).get(this)).put(var1, var2);
   }

   public void c(DefaultMutableTreeNode var1, tf_4 var2) {
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(498856411508641826L);
      Object[] var10003 = var10002;
      tf_4 var8 = var2;
      Method var10001 = var10004;

      try {
         var5 = var10001.invoke(var8, var10003);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      Object[] var6 = com.c.a(var5, var1);
      Method var10 = com.c.d(314737538622127353L);
      var10002 = var6;
      a3 var7 = this;
      Method var10000 = var10;

      try {
         var10000.invoke(var7, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void M$void(String var1) {
      ((HashMap)com.c.c(159245943539531162L).get(this)).remove(var1);
   }

   public void w(DefaultMutableTreeNode var1, tf_4 var2, boolean var3, Boolean var4, DefaultMutableTreeNode var5, boolean var6) throws Exception {
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
            } catch (Exception var20) {
               throw a(var20);
            }

            Object[] var10001 = com.c.a(var1, var2);
            Method var10003 = com.c.d(514128027944670770L);
            Object[] var10002 = var10001;
            a3 var30 = this;
            Method var10000 = var10003;

            try {
               var24 = (DefaultMutableTreeNode)var10000.invoke(var30, var10002);
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }

            var5 = var24;
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
            tf_4 var11 = (tf_4)var10.getUserObject();

            try {
               Object[] var41 = com.c.f();
               Method var10004 = com.c.d(179612178163941306L);
               Object[] var48 = var41;
               tf_4 var42 = var11;
               Method var31 = var10004;

               try {
                  var32 = (String)var31.invoke(var42, var48);
               } catch (InvocationTargetException var17) {
                  throw var17.getTargetException();
               }

               var8.add(var32);
               var9++;
               if (var7 == null) {
                  break;
               }

               if (var7 != null) {
                  continue;
               }
            } catch (Exception var19) {
               throw a(var19);
            }
         }

         Object[] var33 = com.c.a(var2);
         Method var49 = com.c.d(300370310318036695L);
         Object[] var43 = var33;
         a3 var34 = this;
         Method var25 = var49;

         try {
            var25.invoke(var34, var43);
            break;
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }
      }

      ArrayList var21 = new ArrayList();
      Object[] var35 = com.c.f();
      Method var50 = com.c.d(369380169373911815L);
      Object[] var44 = var35;
      tf_4 var36 = var2;
      Method var26 = var50;

      try {
         var27 = (List)var26.invoke(var36, var44);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      for (tf_4 var23 : var27) {
         var44 = com.c.f();
         Method var53 = com.c.d(179612178163941306L);
         Object[] var51 = var44;
         tf_4 var46 = var23;
         Method var37 = var53;

         try {
            var35 = (String)var37.invoke(var46, var51);
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         if (!var8.contains(var35)) {
            var35 = com.c.a(var5, var23);
            var50 = com.c.d(514128027944670770L);
            var44 = var35;
            a3 var40 = this;
            var26 = var50;

            try {
               var29 = (DefaultMutableTreeNode)var26.invoke(var40, var44);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            DefaultMutableTreeNode var12 = var29;
            var21.add(var12);
         }

         if (var7 == null) {
            break;
         }
      }
   }

   synchronized DefaultMutableTreeNode r(DefaultMutableTreeNode var1, tf_4 var2) {
      DefaultMutableTreeNode var3 = new DefaultMutableTreeNode(var2);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(498856411508641826L);
      Object[] var10003 = var10002;
      tf_4 var13 = var2;
      Method var10001 = var10004;

      try {
         var8 = var10001.invoke(var13, var10003);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      Object[] var9 = com.c.a(var8, var3);
      Method var16 = com.c.d(314737538622127353L);
      var10002 = var9;
      a3 var10 = this;
      Method var10000 = var16;

      try {
         var10000.invoke(var10, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      Object[] var11 = com.c.a(var3, var1, var1.getChildCount());
      Method var17 = com.c.d(158472919928157277L);
      var10002 = var11;
      a3 var12 = this;
      var10000 = var17;

      try {
         var10000.invoke(var12, var10002);
         return var3;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void w(String var1, String var2, boolean var3) {
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var1);
      DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var2);
      DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)var5.getParent();
      DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var6.getParent();
      tf_4 var9 = (tf_4)var5.getUserObject();
      tf_4 var10 = (tf_4)var6.getUserObject();
      tf_4 var11 = (tf_4)var7.getUserObject();
      int[] var10000 = I();
      ((Fy_2)com.c.c(204612050171034220L).get(this)).removeNodeFromParent(var5);
      int[] var4 = var10000;
      Object[] var10001 = com.c.a(var6, var9);
      Method var10003 = com.c.d(490478023156050364L);
      Object[] var10002 = var10001;
      a3 var49 = this;
      Method var29 = var10003;

      try {
         var30 = (Integer)var29.invoke(var49, var10002);
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      int var12 = var30;
      var10001 = com.c.a(var5, var6, var12);
      var10003 = com.c.d(158472919928157277L);
      var10002 = var10001;
      a3 var51 = this;
      Method var31 = var10003;

      try {
         var31.invoke(var51, var10002);
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      var10001 = com.c.a(var1);
      var10003 = com.c.d(630828008397989993L);
      var10002 = var10001;
      tf_4 var53 = var11;
      Method var32 = var10003;

      try {
         var32.invoke(var53, var10002);
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      Object[] var33 = com.c.a(var2);
      Method var34 = com.c.d(159824902428932603L);
      var10002 = var33;
      var10001 = null;

      try {
         var35 = (String)var34.invoke(var10001, var10002);
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      String var13 = var35;
      StringBuilder var36 = new StringBuilder();
      var10002 = com.c.f();
      Method var10004 = com.c.d(498856411508641826L);
      Object[] var91 = var10002;
      tf_4 var79 = var10;
      Method var56 = var10004;

      try {
         var10001 = (String)var56.invoke(var79, var91);
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      StringBuilder var37 = var36.append((String)var10001).append(var13);
      var10002 = com.c.f();
      var10004 = com.c.d(179612178163941306L);
      Object[] var92 = var10002;
      tf_4 var81 = var9;
      Method var58 = var10004;

      try {
         var10001 = (String)var58.invoke(var81, var92);
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      String var14 = var37.append((String)var10001).toString();
      a3 var38 = this;
      if (var4 != null) {
         Object[] var103 = com.c.f();
         Method var10006 = com.c.d(498856411508641826L);
         Object[] var10005 = var103;
         tf_4 var104 = var9;
         var10003 = var10006;

         try {
            var10003 = (Method)var10003.invoke(var104, var10005);
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }

         var10001 = com.c.a(var5, var14, var10003);
         var10003 = com.c.d(157758653987128050L);
         var10002 = var10001;
         a3 var61 = this;
         Method var39 = var10003;

         try {
            var39.invoke(var61, var10002);
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(369380169373911815L);
         var10002 = var10001;
         tf_4 var63 = var10;
         Method var40 = var10003;

         try {
            var41 = (List)var40.invoke(var63, var10002);
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         var41.add(var9);
         var10001 = com.c.a(var14);
         var10003 = com.c.d(309720334529505891L);
         var10002 = var10001;
         tf_4 var65 = var9;
         Method var42 = var10003;

         try {
            var42.invoke(var65, var10002);
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }

         var10001 = com.c.f();
         var10003 = com.c.d(349405327249700630L);
         var10002 = var10001;
         tf_4 var67 = var10;
         Method var43 = var10003;

         try {
            var43.invoke(var67, var10002);
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         if (var3) {
            a3 var44 = this;
            if (var4 != null) {
               if (this.isExpanded(new TreePath(var6.getPath()))) {
                  var10001 = com.c.a(var5);
                  var10003 = com.c.d(325887470340955715L);
                  var10002 = var10001;
                  a3 var69 = this;
                  Method var45 = var10003;

                  try {
                     var45.invoke(var69, var10002);
                  } catch (InvocationTargetException var17) {
                     throw var17.getTargetException();
                  }

                  if (var4 != null) {
                     return;
                  }
               }

               var44 = this;
            }

            var10001 = com.c.a(var6);
            var10003 = com.c.d(325887470340955715L);
            var10002 = var10001;
            a3 var71 = var44;
            Method var46 = var10003;

            try {
               var46.invoke(var71, var10002);
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }

            if (var4 != null) {
               return;
            }
         }

         var38 = this;
      }

      var10000 = (int[])com.c.c(608688273536518013L).get(var38);
      var10001 = com.c.a(var11);
      var10003 = com.c.d(217942201414471271L);
      var10002 = var10001;
      var10001 = var10000;
      Method var48 = var10003;

      try {
         var48.invoke(var10001, var10002);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }
   }

   public void P(String var1, String var2, String var3) {
      Object[] var10000 = com.c.a(var1);
      Method var23 = com.c.d(405430188584561323L);
      Object[] var59 = var10000;
      Object var40 = null;

      try {
         var10000 = (String)var23.invoke(var40, var59);
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      String var4 = var10000;
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var4);
      tf_4 var6 = (tf_4)var5.getUserObject();
      var10000 = com.c.a(var2);
      Method var26 = com.c.d(159824902428932603L);
      var59 = var10000;
      var40 = null;

      try {
         var10000 = (String)var26.invoke(var40, var59);
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      String var7 = var10000;
      String var8 = var2 + var7 + var3;
      var40 = com.c.a(var1);
      Method var10003 = com.c.d(401199004121092607L);
      var59 = (Object[])var40;
      var40 = var6;
      Method var28 = var10003;

      try {
         var10000 = (ck_4)var28.invoke(var40, var59);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      ck_4 var9 = var10000;
      var40 = com.c.a(var8);
      var10003 = com.c.d(584136914483294074L);
      var59 = (Object[])var40;
      var40 = var9;
      Method var30 = var10003;

      try {
         var30.invoke(var40, var59);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      var40 = com.c.a(var3);
      var10003 = com.c.d(155850144873198620L);
      var59 = (Object[])var40;
      var40 = var9;
      Method var31 = var10003;

      try {
         var31.invoke(var40, var59);
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      var10000 = com.c.a(var8);
      Method var33 = com.c.d(405430188584561323L);
      var59 = var10000;
      var40 = null;

      try {
         var10000 = (String)var33.invoke(var40, var59);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      String var10 = var10000;
      DefaultMutableTreeNode var11 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var10);
      tf_4 var12 = (tf_4)var11.getUserObject();
      var40 = com.c.a(var9);
      var10003 = com.c.d(157463525259295599L);
      var59 = (Object[])var40;
      var40 = var12;
      Method var35 = var10003;

      try {
         var35.invoke(var40, var59);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      var40 = com.c.f();
      var10003 = com.c.d(360422804605248482L);
      var59 = (Object[])var40;
      var40 = var12;
      Method var36 = var10003;

      try {
         var36.invoke(var40, var59);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      var40 = com.c.a(var8);
      var10003 = com.c.d(548576199562161390L);
      var59 = (Object[])var40;
      var40 = var6;
      Method var37 = var10003;

      try {
         var37.invoke(var40, var59);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      var10000 = (Object[])com.c.c(608688273536518013L).get(this);
      var40 = com.c.a(var6);
      var10003 = com.c.d(217942201414471271L);
      var59 = (Object[])var40;
      var40 = var10000;
      Method var39 = var10003;

      try {
         var39.invoke(var40, var59);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }
   }

   public synchronized void d(MutableTreeNode var1, MutableTreeNode var2, int var3) {
      ((Fy_2)com.c.c(204612050171034220L).get(this)).insertNodeInto(var1, var2, var3);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void x(tf_4 var1) {
      int[] var10000 = I();
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(369380169373911815L);
      Object[] var10003 = var10002;
      tf_4 var173 = var1;
      Method var10001 = var10004;

      try {
         var102 = (List)var10001.invoke(var173, var10003);
      } catch (InvocationTargetException var47) {
         throw var47.getTargetException();
      }

      List var3 = var102;
      var10002 = com.c.f();
      var10004 = com.c.d(248698316749304686L);
      var10003 = var10002;
      tf_4 var175 = var1;
      var10001 = var10004;

      try {
         var104 = (List)var10001.invoke(var175, var10003);
      } catch (InvocationTargetException var46) {
         throw var46.getTargetException();
      }

      List var4 = var104;
      int[] var2 = var10000;
      HashMap var57 = (HashMap)com.c.c(159245943539531162L).get(this);
      var10002 = com.c.f();
      var10004 = com.c.d(498856411508641826L);
      var10003 = var10002;
      tf_4 var177 = var1;
      var10001 = var10004;

      try {
         var106 = (String)var10001.invoke(var177, var10003);
      } catch (InvocationTargetException var45) {
         throw var45.getTargetException();
      }

      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var57.get(var106);
      var10000 = (int[])var5;
      if (var2 != null) {
         if (var5 == null) {
            return;
         }

         var10000 = (int[])var5.getUserObject();
      }

      tf_4 var6 = (tf_4)var10000;
      ArrayList var7 = new ArrayList();
      Object[] var107 = com.c.f();
      Method var228 = com.c.d(369380169373911815L);
      var10002 = var107;
      tf_4 var108 = var6;
      Method var59 = var228;

      try {
         var60 = (List)var59.invoke(var108, var10002);
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      Iterator var8 = var60.iterator();

      while (true) {
         if (var8.hasNext()) {
            label415: {
               tf_4 var9 = (tf_4)var8.next();
               var10000 = (int[])var3;
               if (var2 != null) {
                  var10002 = com.c.f();
                  var10004 = com.c.d(498856411508641826L);
                  var10003 = var10002;
                  tf_4 var180 = var9;
                  var10001 = var10004;

                  try {
                     var110 = var10001.invoke(var180, var10003);
                  } catch (InvocationTargetException var40) {
                     throw var40.getTargetException();
                  }

                  Object[] var62 = com.c.a(var3, var110);
                  Method var63 = com.c.d(536028396857944776L);
                  var10002 = var62;
                  Method var112 = null;

                  try {
                     var64 = (Boolean)var63.invoke(var112, var10002);
                  } catch (InvocationTargetException var39) {
                     throw var39.getTargetException();
                  }

                  if (var2 == null) {
                     break;
                  }

                  if (var64) {
                     break label415;
                  }

                  HashMap var65 = (HashMap)com.c.c(159245943539531162L).get(this);
                  var10002 = com.c.f();
                  var10004 = com.c.d(498856411508641826L);
                  var10003 = var10002;
                  tf_4 var184 = var9;
                  var112 = var10004;

                  try {
                     var114 = (String)var112.invoke(var184, var10003);
                  } catch (InvocationTargetException var43) {
                     throw var43.getTargetException();
                  }

                  var10000 = (int[])var65.get(var114);
               }

               DefaultMutableTreeNode var10 = (DefaultMutableTreeNode)var10000;
               var10002 = com.c.f();
               var10004 = com.c.d(498856411508641826L);
               var10003 = var10002;
               tf_4 var186 = var9;
               var10001 = var10004;

               try {
                  var116 = (String)var10001.invoke(var186, var10003);
               } catch (InvocationTargetException var42) {
                  throw var42.getTargetException();
               }

               var7.add(var116);
               Object[] var117 = com.c.a(var10);
               Method var232 = com.c.d(123962211953866727L);
               var10002 = var117;
               a3 var118 = this;
               Method var66 = var232;

               try {
                  var66.invoke(var118, var10002);
               } catch (InvocationTargetException var41) {
                  throw var41.getTargetException();
               }
            }

            if (var2 != null) {
               continue;
            }
         }

         var8 = var7.iterator();
         var64 = var8.hasNext();
         break;
      }

      while (var64) {
         String var49 = (String)var8.next();
         Object[] var119 = com.c.a(var49);
         Method var233 = com.c.d(630828008397989993L);
         var10002 = var119;
         tf_4 var120 = var6;
         Method var67 = var233;

         try {
            var67.invoke(var120, var10002);
         } catch (InvocationTargetException var38) {
            throw var38.getTargetException();
         }

         if (var2 == null || var2 == null) {
            break;
         }

         var64 = var8.hasNext();
      }

      for (tf_4 var50 : var3) {
         Object[] var121 = com.c.f();
         Method var234 = com.c.d(369380169373911815L);
         var10002 = var121;
         tf_4 var122 = var6;
         Method var68 = var234;

         try {
            var10000 = (int[])var68.invoke(var122, var10002);
         } catch (InvocationTargetException var37) {
            throw var37.getTargetException();
         }

         var10002 = com.c.f();
         var10004 = com.c.d(498856411508641826L);
         var10003 = var10002;
         tf_4 var191 = var50;
         var10001 = var10004;

         try {
            var124 = var10001.invoke(var191, var10003);
         } catch (InvocationTargetException var36) {
            throw var36.getTargetException();
         }

         Object[] var70 = com.c.a(var10000, var124);
         Method var71 = com.c.d(536028396857944776L);
         var10002 = var70;
         Method var126 = null;

         try {
            var72 = (Boolean)var71.invoke(var126, var10002);
         } catch (InvocationTargetException var35) {
            throw var35.getTargetException();
         }

         if (!var72) {
            DefaultMutableTreeNode var53 = new DefaultMutableTreeNode(var50);
            var10002 = com.c.f();
            var10004 = com.c.d(498856411508641826L);
            var10003 = var10002;
            tf_4 var195 = var50;
            var126 = var10004;

            try {
               var126 = (Method)var126.invoke(var195, var10003);
            } catch (InvocationTargetException var34) {
               throw var34.getTargetException();
            }

            Object[] var129 = com.c.a(var126, var53);
            Method var237 = com.c.d(314737538622127353L);
            var10002 = var129;
            a3 var130 = this;
            Method var73 = var237;

            try {
               var73.invoke(var130, var10002);
            } catch (InvocationTargetException var33) {
               throw var33.getTargetException();
            }

            Object[] var131 = com.c.f();
            Method var238 = com.c.d(369380169373911815L);
            var10002 = var131;
            tf_4 var132 = var6;
            Method var74 = var238;

            try {
               var75 = (List)var74.invoke(var132, var10002);
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }

            var75.add(var50);
            Object[] var133 = com.c.f();
            Method var239 = com.c.d(349405327249700630L);
            var10002 = var133;
            tf_4 var134 = var6;
            Method var76 = var239;

            try {
               var76.invoke(var134, var10002);
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }

            Object[] var135 = com.c.f();
            Method var240 = com.c.d(369380169373911815L);
            var10002 = var135;
            tf_4 var136 = var6;
            Method var77 = var240;

            try {
               var10000 = (int[])var77.invoke(var136, var10002);
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }

            Object[] var79 = com.c.a(var10000, var50);
            Method var80 = com.c.d(604658843385035248L);
            var10002 = var79;
            var126 = null;

            try {
               var81 = (Integer)var80.invoke(var126, var10002);
            } catch (InvocationTargetException var29) {
               throw var29.getTargetException();
            }

            int var11 = var81;
            Object[] var139 = com.c.a(var53, var5, var11);
            Method var241 = com.c.d(158472919928157277L);
            var10002 = var139;
            a3 var140 = this;
            Method var82 = var241;

            try {
               var82.invoke(var140, var10002);
            } catch (InvocationTargetException var28) {
               throw var28.getTargetException();
            }
         }

         if (var2 == null) {
            break;
         }
      }

      ArrayList var48 = new ArrayList();
      Object[] var141 = com.c.f();
      Method var242 = com.c.d(248698316749304686L);
      var10002 = var141;
      tf_4 var142 = var6;
      Method var83 = var242;

      try {
         var84 = (List)var83.invoke(var142, var10002);
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      Iterator var51 = var84.iterator();

      label420: {
         while (true) {
            if (var51.hasNext()) {
               ck_4 var54 = (ck_4)var51.next();
               var10002 = com.c.f();
               var10004 = com.c.d(605430732347023634L);
               var10003 = var10002;
               ck_4 var205 = var54;
               var10001 = var10004;

               try {
                  var144 = var10001.invoke(var205, var10003);
               } catch (InvocationTargetException var25) {
                  throw var25.getTargetException();
               }

               Object[] var85 = com.c.a(var4, var144);
               Method var86 = com.c.d(486147290058226095L);
               var10002 = var85;
               Method var146 = null;

               try {
                  var87 = (Boolean)var86.invoke(var146, var10002);
               } catch (InvocationTargetException var24) {
                  throw var24.getTargetException();
               }

               if (var2 == null) {
                  break;
               }

               if (var2 != null) {
                  if (!var87) {
                     var10002 = com.c.f();
                     var10004 = com.c.d(605430732347023634L);
                     var10003 = var10002;
                     ck_4 var209 = var54;
                     var146 = var10004;

                     try {
                        var148 = (String)var146.invoke(var209, var10003);
                     } catch (InvocationTargetException var26) {
                        throw var26.getTargetException();
                     }

                     var48.add(var148);
                  }
               }

               if (var2 != null) {
                  continue;
               }
            }

            var51 = var48.iterator();
            var87 = var51.hasNext();
            break;
         }

         while (var87) {
            String var55 = (String)var51.next();
            Object[] var149 = com.c.a(var55);
            Method var245 = com.c.d(548576199562161390L);
            var10002 = var149;
            tf_4 var150 = var6;
            Method var88 = var245;

            try {
               var88.invoke(var150, var10002);
            } catch (InvocationTargetException var23) {
               throw var23.getTargetException();
            }

            if (var2 == null) {
               break label420;
            }

            if (var2 == null) {
               break;
            }

            var87 = var51.hasNext();
         }

         var51 = var4.iterator();
      }

      while (true) {
         if (var51.hasNext()) {
            ck_4 var56 = (ck_4)var51.next();
            var89 = var6;
            if (var2 == null) {
               break;
            }

            Object[] var151 = com.c.f();
            Method var246 = com.c.d(248698316749304686L);
            var10002 = var151;
            tf_4 var152 = var6;
            Method var90 = var246;

            try {
               var10000 = (int[])var90.invoke(var152, var10002);
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }

            var10002 = com.c.f();
            var10004 = com.c.d(605430732347023634L);
            var10003 = var10002;
            ck_4 var213 = var56;
            var10001 = var10004;

            try {
               var154 = var10001.invoke(var213, var10003);
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            Object[] var92 = com.c.a(var10000, var154);
            Method var93 = com.c.d(486147290058226095L);
            var10002 = var92;
            Object var156 = null;

            try {
               var94 = (Boolean)var93.invoke(var156, var10002);
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }

            label427: {
               if (var2 != null) {
                  if (var94) {
                     break label427;
                  }

                  var156 = com.c.f();
                  Method var248 = com.c.d(248698316749304686L);
                  var10002 = (Object[])var156;
                  var156 = var6;
                  Method var95 = var248;

                  try {
                     var96 = (List)var95.invoke(var156, var10002);
                  } catch (InvocationTargetException var19) {
                     throw var19.getTargetException();
                  }

                  var96.add(var56);
               }

               var156 = com.c.f();
               Method var249 = com.c.d(360422804605248482L);
               var10002 = (Object[])var156;
               var156 = var6;
               Method var97 = var249;

               try {
                  var97.invoke(var156, var10002);
               } catch (InvocationTargetException var18) {
                  throw var18.getTargetException();
               }
            }

            if (var2 != null) {
               continue;
            }
         }

         var10002 = com.c.f();
         var10004 = com.c.d(369380169373911815L);
         var10003 = var10002;
         tf_4 var219 = var1;
         var10001 = var10004;

         try {
            var162 = var10001.invoke(var219, var10003);
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         Object[] var163 = com.c.a(var162);
         Method var251 = com.c.d(407744580579201251L);
         var10002 = var163;
         tf_4 var164 = var6;
         Method var98 = var251;

         try {
            var98.invoke(var164, var10002);
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }

         var89 = var6;
         break;
      }

      var10002 = com.c.f();
      var10004 = com.c.d(248698316749304686L);
      var10003 = var10002;
      tf_4 var222 = var1;
      var10001 = var10004;

      try {
         var166 = var10001.invoke(var222, var10003);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Object[] var167 = com.c.a(var166);
      Method var253 = com.c.d(486938477933204520L);
      var10002 = var167;
      tf_4 var168 = var89;
      Method var99 = var253;

      try {
         var99.invoke(var168, var10002);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      uf_4 var52 = new uf_4(com.c.c(451440066276164151L).getInt(null));
      Object[] var169 = com.c.a(var1);
      Method var254 = com.c.d(558704810566468504L);
      var10002 = var169;
      uf_4 var170 = var52;
      Method var100 = var254;

      try {
         var100.invoke(var170, var10002);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      Object[] var171 = com.c.a(var52);
      Method var255 = com.c.d(161850615995031181L);
      var10002 = var171;
      a3 var172 = this;
      Method var101 = var255;

      try {
         var101.invoke(var172, var10002);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   public void W(td_4 var1) {
      ((ArrayList)com.c.c(499316983962981071L).get(this)).add(var1);
   }

   public void r(uf_4 var1) {
      SwingUtilities.invokeLater(new KI(this, var1));
   }

   void N(DefaultMutableTreeNode var1) {
      int[] var2 = I();
      Method var10000 = var1;
      if (var2 != null) {
         if (var1 == null) {
            return;
         }

         var10000 = (Method)var1.getUserObject();
      }

      Object var3 = var10000;
      byte var10 = var3.getClass().equals(tf_4.class);
      if (var2 != null) {
         if (var10 == 0) {
            return;
         }

         var10 = 0;
      }

      int var4 = var10;

      while (var4 < var1.getChildCount()) {
         DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var1.getChildAt(var4);
         Object[] var10001 = com.c.a(var5);
         Method var10003 = com.c.d(123962211953866727L);
         Object[] var10002 = var10001;
         a3 var14 = this;
         var10000 = var10003;

         try {
            var10000.invoke(var14, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var4++;
         if (var2 == null) {
            return;
         }

         if (var2 == null) {
            break;
         }
      }

      tf_4 var8 = (tf_4)var3;
      Object[] var15 = com.c.f();
      Method var18 = com.c.d(498856411508641826L);
      Object[] var17 = var15;
      tf_4 var16 = var8;
      var10000 = var18;

      try {
         var13 = (String)var10000.invoke(var16, var17);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      String var9 = var13;
      ((HashSet)com.c.c(490343386624486773L).get(this)).remove(var9);
      ((HashMap)com.c.c(159245943539531162L).get(this)).remove(var9);
      ((Fy_2)com.c.c(204612050171034220L).get(this)).removeNodeFromParent(var1);
   }

   public void H(tf_4 var1, String var2, String var3, boolean var4) {
      int[] var10000 = I();
      DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var2);
      tf_4 var7 = (tf_4)var6.getUserObject();
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(498856411508641826L);
      Object[] var10003 = var10002;
      tf_4 var99 = var7;
      Method var10001 = var10004;

      try {
         var62 = var10001.invoke(var99, var10003);
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      Object[] var63 = com.c.a(var62);
      var10001 = com.c.d(159824902428932603L);
      var10003 = var63;
      var10002 = null;

      try {
         var65 = (String)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      String var8 = var65;
      StringBuilder var66 = new StringBuilder();
      var10003 = com.c.f();
      Method var10005 = com.c.d(498856411508641826L);
      Object[] var142 = var10003;
      tf_4 var125 = var7;
      Method var102 = var10005;

      try {
         var10002 = (String)var102.invoke(var125, var142);
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      String var9 = var66.append((String)var10002).append(var8).append(var3).toString();
      int[] var5 = var10000;
      com.c.c(438003004996277190L).set(this, var9);
      Object var10 = null;
      HashSet var35 = (HashSet)com.c.c(490343386624486773L).get(this);
      var10002 = com.c.f();
      var10004 = com.c.d(498856411508641826L);
      var10003 = var10002;
      tf_4 var105 = var7;
      var10001 = var10004;

      try {
         var68 = (String)var10001.invoke(var105, var10003);
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      label200: {
         label195: {
            boolean var36 = var35.contains(var68);
            if (var5 != null) {
               if (!var36) {
                  break label195;
               }

               HashSet var37 = (HashSet)com.c.c(467542466021000295L).get(this);
               var10002 = com.c.f();
               var10004 = com.c.d(498856411508641826L);
               var10003 = var10002;
               tf_4 var107 = var7;
               var10001 = var10004;

               try {
                  var70 = (String)var10001.invoke(var107, var10003);
               } catch (InvocationTargetException var27) {
                  throw var27.getTargetException();
               }

               var36 = var37.contains(var70);
            }

            if (!var36) {
               tf_4 var32;
               label203: {
                  var32 = null;
                  tf_4 var38 = var1;
                  if (var5 != null) {
                     if (var1 != null) {
                        var32 = var1;
                        break label203;
                     }

                     var38 = new tf_4();
                  }

                  var32 = var38;
                  Object[] var71 = com.c.a(false);
                  Method var128 = com.c.d(239155702935749150L);
                  var10002 = var71;
                  tf_4 var72 = var32;
                  Method var39 = var128;

                  try {
                     var39.invoke(var72, var10002);
                  } catch (InvocationTargetException var26) {
                     throw var26.getTargetException();
                  }

                  Object[] var73 = com.c.a(var9);
                  Method var129 = com.c.d(309720334529505891L);
                  var10002 = var73;
                  tf_4 var74 = var32;
                  Method var40 = var129;

                  try {
                     var40.invoke(var74, var10002);
                  } catch (InvocationTargetException var25) {
                     throw var25.getTargetException();
                  }

                  Object[] var75 = com.c.a(var3);
                  Method var130 = com.c.d(268583885901814073L);
                  var10002 = var75;
                  tf_4 var76 = var32;
                  Method var41 = var130;

                  try {
                     var41.invoke(var76, var10002);
                  } catch (InvocationTargetException var24) {
                     throw var24.getTargetException();
                  }

                  Object[] var77 = com.c.e(System.currentTimeMillis());
                  Method var131 = com.c.d(181429069641073377L);
                  var10002 = var77;
                  tf_4 var78 = var32;
                  Method var42 = var131;

                  try {
                     var42.invoke(var78, var10002);
                  } catch (InvocationTargetException var23) {
                     throw var23.getTargetException();
                  }
               }

               Object[] var79 = com.c.a(var6, var32);
               Method var132 = com.c.d(377476817943649811L);
               var10002 = var79;
               a3 var80 = this;
               Method var43 = var132;

               try {
                  DefaultMutableTreeNode var44 = (DefaultMutableTreeNode)var43.invoke(var80, var10002);
               } catch (InvocationTargetException var22) {
                  throw var22.getTargetException();
               }

               Object[] var81 = com.c.f();
               Method var133 = com.c.d(369380169373911815L);
               var10002 = var81;
               tf_4 var82 = var7;
               Method var45 = var133;

               try {
                  var46 = (List)var45.invoke(var82, var10002);
               } catch (InvocationTargetException var21) {
                  throw var21.getTargetException();
               }

               var46.add(var32);
               if (var4) {
               }
               break label200;
            }
         }

         TreePath var33 = new TreePath(var6.getPath());
         Object[] var83 = com.c.a(var6, var7, var33, null, false, false);
         Method var134 = com.c.d(523405946948830526L);
         var10002 = var83;
         a3 var84 = this;
         Method var47 = var134;

         try {
            var47.invoke(var84, var10002);
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         if (var4) {
         }
      }

      tf_4 var48 = var7;
      if (var5 != null) {
         Object[] var85 = com.c.f();
         Method var135 = com.c.d(349405327249700630L);
         var10002 = var85;
         tf_4 var86 = var7;
         Method var49 = var135;

         try {
            var49.invoke(var86, var10002);
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }

         if (var4) {
            Object[] var87 = com.c.a(var6);
            Method var136 = com.c.d(325887470340955715L);
            var10002 = var87;
            a3 var88 = this;
            Method var50 = var136;

            try {
               var50.invoke(var88, var10002);
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }
         }

         var10000 = (int[])com.c.c(608688273536518013L).get(this);
         Object[] var89 = com.c.f();
         Method var137 = com.c.d(152919711700242153L);
         var10002 = var89;
         Object var90 = var10000;
         Method var52 = var137;

         try {
            var48 = (tf_4)var52.invoke(var90, var10002);
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }
      }

      Object[] var91 = com.c.f();
      Method var138 = com.c.d(498856411508641826L);
      var10002 = var91;
      tf_4 var92 = var48;
      Method var53 = var138;

      try {
         var54 = (String)var53.invoke(var92, var10002);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      String var34 = var54;
      int var55 = var2.equals(var34);
      if (var5 != null) {
         if (var55 == 0) {
            return;
         }

         var10000 = (int[])com.c.c(608688273536518013L).get(this);
         Object[] var93 = com.c.a(var7);
         Method var139 = com.c.d(217942201414471271L);
         var10002 = var93;
         Object var94 = var10000;
         Method var57 = var139;

         try {
            var57.invoke(var94, var10002);
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }

         var10000 = (int[])com.c.c(285663222664681848L).get(this);
         var94 = com.c.a(var9);
         Method var140 = com.c.d(343697430899942544L);
         var10002 = (Object[])var94;
         var94 = var10000;
         Method var59 = var140;

         try {
            var59.invoke(var94, var10002);
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         var55 = ((Km_2)com.c.c(285663222664681848L).get(this)).getSelectedRow();
      }

      int var12 = var55;
      if (var12 > -1) {
         var10000 = (int[])com.c.c(285663222664681848L).get(this);
         Object[] var97 = com.c.a(var12);
         Method var141 = com.c.d(442091497690345581L);
         var10002 = var97;
         Object var98 = var10000;
         Method var61 = var141;

         try {
            var61.invoke(var98, var10002);
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }
      }
   }

   public void P(YI var1, String var2) {
      int[] var10000 = I();
      Object[] var10001 = com.c.a(var2);
      Method var50 = com.c.d(405430188584561323L);
      Object[] var95 = var10001;
      Object var77 = null;

      try {
         var10001 = (String)var50.invoke(var77, var95);
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      String var4 = var10001;
      var10001 = com.c.a(var2);
      Method var53 = com.c.d(477969598131796924L);
      var95 = var10001;
      var77 = null;

      try {
         String var54 = (String)var53.invoke(var77, var95);
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      int[] var3 = var10000;
      DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)((HashMap)com.c.c(159245943539531162L).get(this)).get(var4);
      var10000 = (int[])var6;
      if (var3 != null) {
         if (var6 == null) {
            return;
         }

         var10000 = (int[])var6.getUserObject();
      }

      tf_4 var7 = (tf_4)var10000;
      var10001 = com.c.f();
      Method var98 = com.c.d(498856411508641826L);
      var77 = var10001;
      tf_4 var56 = var7;
      Method var29 = var98;

      try {
         var10000 = (int[])var29.invoke(var56, (Object[])var77);
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      Object[] var31 = com.c.a(var10000);
      Method var32 = com.c.d(159824902428932603L);
      var77 = var31;
      var10001 = null;

      try {
         String var33 = (String)var32.invoke(var10001, (Object[])var77);
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      var34 = this;
      label160:
      if (var3 != null) {
         HashSet var35 = (HashSet)com.c.c(490343386624486773L).get(this);
         var77 = com.c.f();
         Method var10004 = com.c.d(498856411508641826L);
         var95 = (Object[])var77;
         var77 = var7;
         Method var59 = var10004;

         try {
            var10001 = (String)var59.invoke(var77, var95);
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }

         if (var35.contains(var10001)) {
            var34 = this;
            if (var3 == null) {
               break label160;
            }

            HashSet var36 = (HashSet)com.c.c(467542466021000295L).get(this);
            var77 = com.c.f();
            var10004 = com.c.d(498856411508641826L);
            var95 = (Object[])var77;
            var77 = var7;
            Method var61 = var10004;

            try {
               var10001 = (String)var61.invoke(var77, var95);
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            if (!var36.contains(var10001)) {
               var10001 = com.c.f();
               Method var101 = com.c.d(619474355764320649L);
               var77 = var10001;
               YI var64 = var1;
               Method var37 = var101;

               try {
                  var38 = (ck_4)var37.invoke(var64, (Object[])var77);
               } catch (InvocationTargetException var20) {
                  throw var20.getTargetException();
               }

               ck_4 var9 = var38;
               var10001 = com.c.f();
               Method var102 = com.c.d(248698316749304686L);
               var77 = var10001;
               tf_4 var66 = var7;
               Method var39 = var102;

               try {
                  var40 = (List)var39.invoke(var66, (Object[])var77);
               } catch (InvocationTargetException var19) {
                  throw var19.getTargetException();
               }

               List var10 = var40;
               int var11 = -1;
               int var12 = 0;

               label152: {
                  while (var12 < var10.size()) {
                     ck_4 var13 = (ck_4)var10.get(var12);
                     if (var3 != null) {
                        var10001 = com.c.f();
                        Method var103 = com.c.d(396085629172753019L);
                        var77 = var10001;
                        ck_4 var68 = var13;
                        Method var41 = var103;

                        try {
                           var42 = (String)var41.invoke(var68, (Object[])var77);
                        } catch (InvocationTargetException var18) {
                           throw var18.getTargetException();
                        }

                        var77 = com.c.f();
                        var10004 = com.c.d(396085629172753019L);
                        var95 = (Object[])var77;
                        var77 = var9;
                        Method var69 = var10004;

                        try {
                           var10001 = (String)var69.invoke(var77, var95);
                        } catch (InvocationTargetException var17) {
                           throw var17.getTargetException();
                        }

                        var43 = var42.equals(var10001);
                        if (var3 == null) {
                           break label152;
                        }

                        if (var43 != 0) {
                           var11 = var12;
                        }

                        var12++;
                     }

                     if (var3 == null) {
                        break;
                     }
                  }

                  var43 = var11;
               }

               if (var3 != null) {
                  if (var43 > -1) {
                     var10.remove(var11);
                  }

                  var10.add(var9);
               }

               var10001 = com.c.f();
               Method var105 = com.c.d(360422804605248482L);
               var77 = var10001;
               tf_4 var72 = var7;
               Method var44 = var105;

               try {
                  var44.invoke(var72, (Object[])var77);
               } catch (InvocationTargetException var16) {
                  throw var16.getTargetException();
               }
            }
         }

         var34 = this;
      }

      var10000 = (int[])com.c.c(608688273536518013L).get(var34);
      var10001 = com.c.f();
      Method var106 = com.c.d(152919711700242153L);
      var77 = var10001;
      var10001 = var10000;
      Method var46 = var106;

      try {
         var10000 = (int[])var46.invoke(var10001, (Object[])var77);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      var10001 = com.c.f();
      Method var107 = com.c.d(498856411508641826L);
      var77 = var10001;
      var10001 = var10000;
      Method var48 = var107;

      try {
         var49 = (String)var48.invoke(var10001, (Object[])var77);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      String var27 = var49;
      if (var4.equals(var27)) {
         SwingUtilities.invokeLater(new ni_2(this, var7, var2));
      }
   }

   DefaultMutableTreeNode g(DefaultMutableTreeNode var1, tf_4 var2) {
      DefaultMutableTreeNode var3 = new DefaultMutableTreeNode(var2);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(498856411508641826L);
      Object[] var10003 = var10002;
      tf_4 var19 = var2;
      Method var10001 = var10004;

      try {
         var12 = var10001.invoke(var19, var10003);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Object[] var13 = com.c.a(var12, var3);
      Method var23 = com.c.d(314737538622127353L);
      var10002 = var13;
      a3 var14 = this;
      Method var10000 = var23;

      try {
         var10000.invoke(var14, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      Object[] var15 = com.c.a(var1, var2);
      Method var24 = com.c.d(490478023156050364L);
      var10002 = var15;
      a3 var16 = this;
      var10000 = var24;

      try {
         var10 = (Integer)var10000.invoke(var16, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      int var4 = var10;
      Object[] var17 = com.c.a(var3, var1, var4);
      Method var25 = com.c.d(158472919928157277L);
      var10002 = var17;
      a3 var18 = this;
      var10000 = var25;

      try {
         var10000.invoke(var18, var10002);
         return var3;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   int X(DefaultMutableTreeNode var1, tf_4 var2) {
      int[] var10000 = I();
      int var4 = var1.getChildCount();
      int[] var3 = var10000;
      int var8 = var1.getUserObject().getClass().equals(tf_4.class);
      if (var3 != null) {
         if (var8 != 0) {
            tf_4 var5 = (tf_4)var1.getUserObject();
            Object[] var10001 = com.c.f();
            Method var10003 = com.c.d(369380169373911815L);
            Object[] var10002 = var10001;
            tf_4 var14 = var5;
            Method var9 = var10003;

            try {
               var10000 = (int[])var9.invoke(var14, var10002);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            Object[] var11 = com.c.a(var10000, var2);
            Method var12 = com.c.d(604658843385035248L);
            var10002 = var11;
            var10001 = null;

            try {
               var13 = (Integer)var12.invoke(var10001, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            var4 = var13;
         }

         var8 = var4;
      }

      return var8;
   }

   boolean J(tf_4 var1) {
      int[] var10000 = I();
      boolean var3 = false;
      int[] var2 = var10000;
      tf_4 var6 = (tf_4)com.c.c(307767423934223271L).get(this);
      if (var2 != null) {
         if (var6 == null) {
            return var3;
         }

         var6 = var1;
      }

      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(498856411508641826L);
      Object[] var10002 = var10001;
      tf_4 var10 = var6;
      Method var7 = var10003;

      try {
         var8 = (String)var7.invoke(var10, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10001 = (Object[])com.c.c(307767423934223271L).get(this);
      var10002 = com.c.f();
      Method var10004 = com.c.d(498856411508641826L);
      Object[] var16 = var10002;
      var10002 = var10001;
      Method var12 = var10004;

      try {
         var10001 = (String)var12.invoke(var10002, var16);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      boolean var9 = var8.equals(var10001);
      if (var2 == null) {
         return var9;
      } else {
         if (var9) {
            var3 = true;
         }

         return var3;
      }
   }

   void H(String var1) {
      ((HashSet)com.c.c(490343386624486773L).get(this)).add(var1);
   }

   void v(String var1) {
      ((HashSet)com.c.c(467542466021000295L).get(this)).add(var1);
   }

   void w(tf_4 param1) throws Exception {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic a3.I ()[I
      // 003: aload 0
      // 004: aload 1
      // 005: invokestatic com/c.f ()[Ljava/lang/Object;
      // 008: ldc2_w 498856411508641826
      // 00b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 00e: dup_x2
      // 00f: pop
      // 010: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 013: goto 01a
      // 016: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 019: athrow
      // 01a: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 01d: ldc2_w 177354243147298003
      // 020: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 023: dup_x2
      // 024: pop
      // 025: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 028: pop
      // 029: goto 030
      // 02c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02f: athrow
      // 030: aload 0
      // 031: aload 1
      // 032: invokestatic com/c.f ()[Ljava/lang/Object;
      // 035: ldc2_w 498856411508641826
      // 038: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 03b: dup_x2
      // 03c: pop
      // 03d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 040: goto 047
      // 043: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 046: athrow
      // 047: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 04a: ldc2_w 496399544432301198
      // 04d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 050: dup_x2
      // 051: pop
      // 052: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 055: pop
      // 056: goto 05d
      // 059: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: astore 2
      // 05e: invokestatic java/lang/System.currentTimeMillis ()J
      // 061: lstore 3
      // 062: new java/util/Vector
      // 065: dup
      // 066: invokespecial java/util/Vector.<init> ()V
      // 069: astore 5
      // 06b: new java/util/Vector
      // 06e: dup
      // 06f: invokespecial java/util/Vector.<init> ()V
      // 072: astore 6
      // 074: bipush 1
      // 075: istore 7
      // 077: aload 1
      // 078: invokestatic com/c.f ()[Ljava/lang/Object;
      // 07b: ldc2_w 490764181082108623
      // 07e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 081: dup_x2
      // 082: pop
      // 083: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 086: checkcast java/lang/Boolean
      // 089: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 08c: goto 093
      // 08f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 092: athrow
      // 093: aload 2
      // 094: ifnull 0a2
      // 097: ifeq 337
      // 09a: goto 0a1
      // 09d: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: bipush 0
      // 0a2: istore 8
      // 0a4: aload 1
      // 0a5: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0a8: ldc2_w 242892459251541809
      // 0ab: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0ae: dup_x2
      // 0af: pop
      // 0b0: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0b3: checkcast java/lang/String
      // 0b6: goto 0bd
      // 0b9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: aload 2
      // 0be: ifnull 0eb
      // 0c1: ifnull 0f9
      // 0c4: goto 0cb
      // 0c7: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ca: athrow
      // 0cb: aload 1
      // 0cc: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0cf: ldc2_w 242892459251541809
      // 0d2: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0d5: dup_x2
      // 0d6: pop
      // 0d7: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0da: checkcast java/lang/String
      // 0dd: goto 0e4
      // 0e0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: goto 0eb
      // 0e7: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0ea: athrow
      // 0eb: sipush 5005
      // 0ee: sipush 26684
      // 0f1: invokestatic a3.a (II)Ljava/lang/String;
      // 0f4: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f7: istore 8
      // 0f9: iload 8
      // 0fb: aload 2
      // 0fc: ifnull 16f
      // 0ff: ifeq 143
      // 102: goto 109
      // 105: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 108: athrow
      // 109: aload 1
      // 10a: invokestatic com/c.f ()[Ljava/lang/Object;
      // 10d: ldc2_w 498856411508641826
      // 110: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 113: dup_x2
      // 114: pop
      // 115: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 118: checkcast java/lang/String
      // 11b: goto 122
      // 11e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 121: athrow
      // 122: sipush 5000
      // 125: sipush -25117
      // 128: invokestatic a3.a (II)Ljava/lang/String;
      // 12b: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 12e: aload 2
      // 12f: ifnull 16f
      // 132: goto 139
      // 135: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 138: athrow
      // 139: ifne 1b7
      // 13c: goto 143
      // 13f: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 142: athrow
      // 143: aload 1
      // 144: invokestatic com/c.f ()[Ljava/lang/Object;
      // 147: ldc2_w 498856411508641826
      // 14a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 14d: dup_x2
      // 14e: pop
      // 14f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 152: checkcast java/lang/String
      // 155: goto 15c
      // 158: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: sipush 5006
      // 15f: sipush -29775
      // 162: invokestatic a3.a (II)Ljava/lang/String;
      // 165: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 168: goto 16f
      // 16b: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16e: athrow
      // 16f: aload 2
      // 170: ifnull 1b4
      // 173: ifne 1b7
      // 176: goto 17d
      // 179: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17c: athrow
      // 17d: aload 1
      // 17e: aload 2
      // 17f: ifnull 1b9
      // 182: goto 189
      // 185: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 188: athrow
      // 189: invokestatic com/c.f ()[Ljava/lang/Object;
      // 18c: ldc2_w 498856411508641826
      // 18f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 192: dup_x2
      // 193: pop
      // 194: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 197: checkcast java/lang/String
      // 19a: goto 1a1
      // 19d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a0: athrow
      // 1a1: sipush 5002
      // 1a4: sipush 11409
      // 1a7: invokestatic a3.a (II)Ljava/lang/String;
      // 1aa: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1ad: goto 1b4
      // 1b0: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b3: athrow
      // 1b4: ifeq 1b8
      // 1b7: return
      // 1b8: aload 1
      // 1b9: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1bc: ldc2_w 543633160597441792
      // 1bf: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1c2: dup_x2
      // 1c3: pop
      // 1c4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1c7: checkcast java/io/File
      // 1ca: goto 1d1
      // 1cd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d0: athrow
      // 1d1: astore 9
      // 1d3: aload 1
      // 1d4: aload 9
      // 1d6: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1d9: ldc2_w 349593801287953443
      // 1dc: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1df: dup_x2
      // 1e0: pop
      // 1e1: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1e4: pop
      // 1e5: goto 1ec
      // 1e8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1eb: athrow
      // 1ec: aload 9
      // 1ee: invokevirtual java/io/File.listFiles ()[Ljava/io/File;
      // 1f1: astore 10
      // 1f3: aload 10
      // 1f5: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1f8: ldc2_w 190853263991371564
      // 1fb: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1fe: swap
      // 1ff: aconst_null
      // 200: swap
      // 201: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 204: checkcast java/util/ArrayList
      // 207: goto 20e
      // 20a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20d: athrow
      // 20e: astore 11
      // 210: aload 11
      // 212: aload 2
      // 213: ifnull 222
      // 216: ifnull 333
      // 219: goto 220
      // 21c: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21f: athrow
      // 220: aload 11
      // 222: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 225: astore 12
      // 227: aload 12
      // 229: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 22e: ifeq 333
      // 231: aload 12
      // 233: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 238: checkcast java/io/File
      // 23b: astore 13
      // 23d: aload 13
      // 23f: invokevirtual java/io/File.isDirectory ()Z
      // 242: aload 2
      // 243: ifnull 3f2
      // 246: aload 2
      // 247: ifnull 2ff
      // 24a: goto 251
      // 24d: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 250: athrow
      // 251: ifeq 2fa
      // 254: goto 25b
      // 257: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 25a: athrow
      // 25b: new tf_4
      // 25e: dup
      // 25f: invokespecial tf_4.<init> ()V
      // 262: astore 14
      // 264: aload 14
      // 266: aload 13
      // 268: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 26b: ldc2_w 349593801287953443
      // 26e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 271: dup_x2
      // 272: pop
      // 273: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 276: pop
      // 277: goto 27e
      // 27a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 27d: athrow
      // 27e: bipush 1
      // 27f: istore 15
      // 281: invokestatic com/c.f ()[Ljava/lang/Object;
      // 284: ldc2_w 253808553645062345
      // 287: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 28a: swap
      // 28b: aconst_null
      // 28c: swap
      // 28d: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 290: checkcast java/lang/Boolean
      // 293: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 296: goto 29d
      // 299: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 29c: athrow
      // 29d: aload 2
      // 29e: ifnull 2db
      // 2a1: ifeq 2d9
      // 2a4: goto 2ab
      // 2a7: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2aa: athrow
      // 2ab: aload 13
      // 2ad: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // 2b0: aload 0
      // 2b1: ldc2_w 159972400659094256
      // 2b4: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2b7: swap
      // 2b8: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2bb: checkcast java/lang/String
      // 2be: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2c1: aload 2
      // 2c2: ifnull 2db
      // 2c5: goto 2cc
      // 2c8: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2cb: athrow
      // 2cc: ifeq 2d9
      // 2cf: goto 2d6
      // 2d2: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d5: athrow
      // 2d6: bipush 0
      // 2d7: istore 15
      // 2d9: iload 15
      // 2db: aload 2
      // 2dc: ifnull 2ff
      // 2df: ifeq 2fa
      // 2e2: goto 2e9
      // 2e5: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2e8: athrow
      // 2e9: aload 5
      // 2eb: aload 14
      // 2ed: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2f2: pop
      // 2f3: goto 2fa
      // 2f6: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2f9: athrow
      // 2fa: aload 13
      // 2fc: invokevirtual java/io/File.isFile ()Z
      // 2ff: ifeq 32f
      // 302: new ck_4
      // 305: dup
      // 306: invokespecial ck_4.<init> ()V
      // 309: astore 14
      // 30b: aload 14
      // 30d: aload 13
      // 30f: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 312: ldc2_w 325634526741383265
      // 315: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 318: dup_x2
      // 319: pop
      // 31a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 31d: pop
      // 31e: goto 325
      // 321: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 324: athrow
      // 325: aload 6
      // 327: aload 14
      // 329: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 32e: pop
      // 32f: aload 2
      // 330: ifnonnull 227
      // 333: aload 2
      // 334: ifnonnull 3ba
      // 337: aconst_null
      // 338: astore 8
      // 33a: aload 0
      // 33b: ldc2_w 393220934160143516
      // 33e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 341: swap
      // 342: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 345: aload 1
      // 346: invokestatic com/c.f ()[Ljava/lang/Object;
      // 349: ldc2_w 498856411508641826
      // 34c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 34f: dup_x2
      // 350: pop
      // 351: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 354: goto 35b
      // 357: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 35a: athrow
      // 35b: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 35e: ldc2_w 276206147642460148
      // 361: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 364: dup_x2
      // 365: pop
      // 366: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 369: checkcast tf_4
      // 36c: goto 373
      // 36f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 372: athrow
      // 373: astore 8
      // 375: aload 8
      // 377: invokestatic com/c.f ()[Ljava/lang/Object;
      // 37a: ldc2_w 369380169373911815
      // 37d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 380: dup_x2
      // 381: pop
      // 382: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 385: checkcast java/util/List
      // 388: goto 38f
      // 38b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 38e: athrow
      // 38f: astore 5
      // 391: aload 8
      // 393: invokestatic com/c.f ()[Ljava/lang/Object;
      // 396: ldc2_w 248698316749304686
      // 399: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 39c: dup_x2
      // 39d: pop
      // 39e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3a1: checkcast java/util/List
      // 3a4: goto 3ab
      // 3a7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3aa: athrow
      // 3ab: astore 6
      // 3ad: goto 3ba
      // 3b0: astore 9
      // 3b2: aload 9
      // 3b4: invokevirtual java/lang/Exception.printStackTrace ()V
      // 3b7: bipush 0
      // 3b8: istore 7
      // 3ba: aload 0
      // 3bb: ldc2_w 467542466021000295
      // 3be: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 3c1: swap
      // 3c2: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3c5: checkcast java/util/HashSet
      // 3c8: aload 1
      // 3c9: invokestatic com/c.f ()[Ljava/lang/Object;
      // 3cc: ldc2_w 498856411508641826
      // 3cf: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 3d2: dup_x2
      // 3d3: pop
      // 3d4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d7: checkcast java/lang/String
      // 3da: goto 3e1
      // 3dd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3e0: athrow
      // 3e1: invokevirtual java/util/HashSet.remove (Ljava/lang/Object;)Z
      // 3e4: pop
      // 3e5: aload 2
      // 3e6: ifnull 45e
      // 3e9: iload 7
      // 3eb: goto 3f2
      // 3ee: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3f1: athrow
      // 3f2: ifeq 462
      // 3f5: aload 1
      // 3f6: aload 5
      // 3f8: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3fb: ldc2_w 407744580579201251
      // 3fe: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 401: dup_x2
      // 402: pop
      // 403: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 406: pop
      // 407: goto 40e
      // 40a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 40d: athrow
      // 40e: aload 1
      // 40f: aload 6
      // 411: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 414: ldc2_w 486938477933204520
      // 417: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 41a: dup_x2
      // 41b: pop
      // 41c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 41f: pop
      // 420: goto 427
      // 423: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 426: athrow
      // 427: aload 1
      // 428: bipush 1
      // 429: invokestatic com/c.a (Z)[Ljava/lang/Object;
      // 42c: ldc2_w 562551325043961401
      // 42f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 432: dup_x2
      // 433: pop
      // 434: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 437: pop
      // 438: goto 43f
      // 43b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 43e: athrow
      // 43f: aload 0
      // 440: aload 1
      // 441: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 444: ldc2_w 354921658348946569
      // 447: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 44a: dup_x2
      // 44b: pop
      // 44c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 44f: pop
      // 450: goto 457
      // 453: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 456: athrow
      // 457: goto 45e
      // 45a: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 45d: athrow
      // 45e: aload 2
      // 45f: ifnonnull 477
      // 462: new java/lang/Exception
      // 465: dup
      // 466: sipush 5007
      // 469: sipush 22155
      // 46c: invokestatic a3.a (II)Ljava/lang/String;
      // 46f: invokespecial java/lang/Exception.<init> (Ljava/lang/String;)V
      // 472: athrow
      // 473: invokestatic a3.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 476: athrow
      // 477: return
   }

   public HashMap c() {
      int[] var10000 = I();
      HashMap var2 = new HashMap();
      int[] var1 = var10000;
      Iterator var3 = ((HashMap)com.c.c(159245943539531162L).get(this)).keySet().iterator();

      label92:
      while (true) {
         if (var3.hasNext()) {
            String var4 = (String)var3.next();
            var16 = (HashMap)com.c.c(159245943539531162L).get(this);
            if (var1 == null) {
               break;
            }

            label97: {
               label98: {
                  DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var16.get(var4);
                  Object var6 = var5.getUserObject();
                  boolean var17 = var6.getClass().equals(ck_4.class);
                  if (var1 != null) {
                     if (var17) {
                        ck_4 var7 = (ck_4)var6;
                        var2.put(var4, var7);
                        if (var1 != null) {
                           break label97;
                        }
                     }

                     var10000 = (int[])var6.getClass();
                     if (var1 == null) {
                        break label98;
                     }

                     var17 = var10000.equals(tf_4.class);
                  }

                  if (!var17) {
                     break label97;
                  }

                  var10000 = (int[])var6;
               }

               tf_4 var14 = (tf_4)var10000;
               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(369380169373911815L);
               Object[] var10002 = var10001;
               tf_4 var23 = var14;
               Method var19 = var10003;

               try {
                  var20 = (List)var19.invoke(var23, var10002);
               } catch (InvocationTargetException var13) {
                  throw var13.getTargetException();
               }

               Iterator var8 = var20.iterator();

               while (true) {
                  if (var8.hasNext()) {
                     tf_4 var9 = (tf_4)var8.next();
                     var10002 = com.c.f();
                     Method var10004 = com.c.d(498856411508641826L);
                     Object[] var35 = var10002;
                     tf_4 var31 = var9;
                     Method var24 = var10004;

                     try {
                        var10001 = (String)var24.invoke(var31, var35);
                     } catch (InvocationTargetException var12) {
                        throw var12.getTargetException();
                     }

                     var2.put(var10001, var9);
                     if (var1 == null) {
                        break;
                     }

                     if (var1 != null) {
                        continue;
                     }
                  }

                  var10001 = com.c.f();
                  var10003 = com.c.d(248698316749304686L);
                  var10002 = var10001;
                  tf_4 var27 = var14;
                  Method var21 = var10003;

                  try {
                     var22 = (List)var21.invoke(var27, var10002);
                     break;
                  } catch (InvocationTargetException var11) {
                     throw var11.getTargetException();
                  }
               }

               for (ck_4 var15 : var22) {
                  var10002 = com.c.f();
                  Method var38 = com.c.d(605430732347023634L);
                  Object[] var37 = var10002;
                  ck_4 var34 = var15;
                  Method var28 = var38;

                  try {
                     var10001 = (String)var28.invoke(var34, var37);
                  } catch (InvocationTargetException var10) {
                     throw var10.getTargetException();
                  }

                  var2.put(var10001, var15);
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

         var16 = var2;
         break;
      }

      return var16;
   }

   public void W(TreeNode var1) {
      ((Fy_2)com.c.c(204612050171034220L).get(this)).removeNodeFromParent((MutableTreeNode)var1);
   }

   @Override
   public int getClosestRowForLocation(int var1, int var2) {
      return this.getRowForPath(this.getClosestPathForLocation(var1, var2));
   }

   int M() {
      a3 var1 = this;
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
      a3 var2 = this;
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
   public Rectangle f(DefaultMutableTreeNode var1) {
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(340222048447034407L);
      Object[] var10003 = var10002;
      a3 var4 = this;
      Method var10001 = var10004;

      try {
         var3 = (TreePath)var10001.invoke(var4, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      return this.getPathBounds(var3);
   }

   @Override
   public TreePath y(DefaultMutableTreeNode var1) {
      return var1 != null ? new TreePath(var1.getPath()) : null;
   }

   private void p(File var1) {
      File[] var3 = var1.listFiles();
      File[] var4 = var3;
      int var5 = var3.length;
      int[] var10000 = I();
      int var6 = 0;
      int[] var2 = var10000;

      while (var6 < var5) {
         File var7 = var4[var6];
         if (var7.isDirectory()) {
         }

         var6++;
         if (var2 == null) {
            break;
         }
      }
   }

   private void G() {
   }

   public boolean P() {
      return com.c.c(274780790290515243L).getBoolean(this);
   }

   public void s(boolean var1) {
      com.c.c(274780790290515243L).setBoolean(this, var1);
   }

   public zD N() {
      return (zD)com.c.c(393220934160143516L).get(this);
   }

   public void k(zD var1) {
      com.c.c(393220934160143516L).set(this, var1);
   }

   public kl_4 H() {
      return (kl_4)com.c.c(608688273536518013L).get(this);
   }

   public F6 R() {
      return (F6)com.c.c(592764144014982287L).get(this);
   }

   public void C(F6 var1) {
      com.c.c(592764144014982287L).set(this, var1);
   }

   public Km_2 a() {
      return (Km_2)com.c.c(285663222664681848L).get(this);
   }

   public void h(Km_2 var1) {
      com.c.c(285663222664681848L).set(this, var1);
   }

   public boolean u() {
      return com.c.c(218493194116849754L).getBoolean(this);
   }

   public void u(boolean var1) {
      com.c.c(218493194116849754L).setBoolean(this, var1);
   }

   public boolean n() {
      return com.c.c(257707175806650747L).getBoolean(this);
   }

   public void t(boolean var1) {
      com.c.c(257707175806650747L).setBoolean(this, var1);
   }

   public String f$String() {
      return (String)com.c.c(343160910034620817L).get(this);
   }

   public void P(String var1) {
      com.c.c(343160910034620817L).set(this, var1);
   }

   public static void h(int[] var0) {
      M = var0;
   }

   public static int[] I() {
      return M;
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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

   private static String a(int var0, int var1) {
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14460;
      if (C[var3] == null) {
         C[var3] = (int)(A[var3] ^ var1);
      }

      return C[var3];
   }

   private static long c(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 16899) & 32767;
      if (H[var3] == null) {
         H[var3] = G[var3] ^ var1;
      }

      return H[var3];
   }
}





