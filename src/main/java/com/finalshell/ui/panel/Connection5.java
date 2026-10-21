package com.finalshell.ui.panel;

import com.finalshell.core.D62_2;
import com.finalshell.core.DN;
import com.finalshell.core.Dv4;
import com.finalshell.core.File2;
import com.finalshell.core.LO3;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.Na2;
import com.finalshell.core.T32;
import com.finalshell.core.TM;
import com.finalshell.core.U62;
import com.finalshell.core.UC3;
import com.finalshell.core.UG;
import com.finalshell.core.Wa2;
import com.finalshell.core.Xv2_2;
import com.finalshell.core.Yo4;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.CW3;
import com.finalshell.task.G0;
import com.finalshell.task.Mb2;
import com.finalshell.task.OE;
import com.finalshell.ui.dialog.EditDialog2;
import com.finalshell.ui.dialog.KQ;
import com.finalshell.ui.listener.A7;
import com.finalshell.ui.listener.Af2;
import com.finalshell.ui.listener.Nu2;
import com.finalshell.ui.listener.OQ3;
import com.finalshell.ui.listener.Ok4;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Tf4;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.DropMode;
import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.JTree.DropLocation;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class Connection5 extends AA implements Xv2_2 {
   Na2 B;
   Yo4 j;
   Connection5 D;
   HashMap G;
   Tf4 E;
   DefaultMutableTreeNode p;
   FileSystemView h;
   As2 L;
   long S;
   boolean g;
   TreePath N;
   Object M;
   DefaultMutableTreeNode Z;
   int J;
   boolean w;
   int e;
   com.finalshell.config.File d;
   ShowDeletedPanel C;
   RouteTracePanel2 k;
   boolean K;
   String W;
   UG Y;
   boolean T;
   public D62_2 I;
   boolean x;
   String H;
   HashSet A;
   public static String[] a;
   public static String[] c;
   public static long[] f;
   public static Integer[] i;

   public Connection5(ShowDeletedPanel var1, boolean var2) {
      super(new DefaultMutableTreeNode(a(11179, 2780), true));
      AA.z();
      HashMap var10002 = new HashMap();
      long var7 = 604074053920059872L;
      HashMap var6 = var10002;
      Ref.s(604074053920059872L, var6, var7);
      long var9 = 357561646207134153L;
      Object var8 = null;
      Ref.s(357561646207134153L, var8, var9);
      Registry.lookupField(137395258222385003L).setBoolean(this, false);
      Registry.lookupField(281199022400540961L).setBoolean(this, false);
      Registry.lookupField(506455871704714368L).setInt(this, b(23977, 3387944876465546672L));
      long var11 = 486701759580007258L;
      Object var10 = null;
      Ref.s(486701759580007258L, var10, var11);
      Registry.lookupField(557374830394047111L).setBoolean(this, true);
      D62_2 var10005 = new D62_2();
      long var13 = 359637467035547923L;
      D62_2 var12 = var10005;
      Ref.s(359637467035547923L, var12, var13);
      Registry.lookupField(420994829726907422L).setBoolean(this, false);
      HashSet var10006 = new HashSet();
      long var15 = 418695849841340312L;
      HashSet var14 = var10006;
      Ref.s(418695849841340312L, var14, var15);
      Registry.lookupField(601768954800299943L).setBoolean(this, var2);
      long var17 = 310302490302373526L;
      Ref.s(310302490302373526L, var1, var17);
      Registry.emptyArgs();
      long var18 = 270389152141252877L;
      Object var10009 = Ref.h2(270389152141252877L, var18);
      Object[] var10010 = Registry.emptyArgs();
      long var21 = 362821904568389131L;
      Object[] var20 = var10010;
      var10010 = Ref.h(362821904568389131L, var20, var21);
      long var23 = 137186759430385204L;
      Object var22 = var10010;
      Ref.s(137186759430385204L, var22, var23);
      Object var3 = var10009;
      this.setBorder(null);
      this.setOpaque(false);
      long var25 = 593306439561595691L;
      Ref.s(593306439561595691L, this, var25);
      Object var10011 = Registry.lookupField(478301022169899080L).get(null);
      long var27 = 348708854043337366L;
      Object var26 = var10011;
      Ref.s(348708854043337366L, var26, var27);
      this.getSelectionModel().setSelectionMode(4);
      UC3 var10012 = new UC3(this);
      long var29 = 441139186211959448L;
      UC3 var28 = var10012;
      Ref.s(441139186211959448L, var28, var29);
      Object[] var10013 = Registry.emptyArgs();
      long var31 = 474998040866815030L;
      Object[] var30 = var10013;
      Ref.h(474998040866815030L, var30, var31);

      try {
         ;
      } catch (InvocationTargetException var55) {
         throw var55.getTargetException();
      }

      this.setRootVisible(false);
      Na2 var10014 = new Na2();
      long var33 = 278993162580331623L;
      Na2 var32 = var10014;
      Ref.s(278993162580331623L, var32, var33);
      Object var34 = 278993162580331623L;
      this.setCellRenderer((Na2)Ref.g(278993162580331623L, var34));
      this.setEditable(true);
      DN var4 = new DN(b(28117, 4288013608912016841L));
      TM var5 = new TM(this, var4, var1);
      this.setCellEditor(var5);
      this.setAutoscrolls(true);
      Object var36 = 593306439561595691L;
      ((Connection5)Ref.g(593306439561595691L, var36)).setDragEnabled(true);
      Object var38 = 593306439561595691L;
      ((Connection5)Ref.g(593306439561595691L, var38)).setDropMode(DropMode.ON_OR_INSERT);
      Object var40 = 593306439561595691L;
      Connection5 var10018 = (Connection5)Ref.g(593306439561595691L, var40);
      Wa2 var10019;
      Object var42 = 593306439561595691L;
      super((Connection5)Ref.g(593306439561595691L, var42));
      var10019.setTransferHandler(var10019);
      Object var44 = 593306439561595691L;
      ((Connection5)Ref.g(593306439561595691L, var44)).setEditable(true);
      this.getSelectionModel().addTreeSelectionListener(new Af2(this));
      this.addMouseListener(new OQ3(this, var1, var2));
      Object var46 = 593306439561595691L;
      ((Connection5)Ref.g(593306439561595691L, var46)).addTreeWillExpandListener(new A7(this));
      Object var48 = 593306439561595691L;
      ((Connection5)Ref.g(593306439561595691L, var48)).addMouseMotionListener(new Nu2(this));
      FileSystemView var10023 = FileSystemView.getFileSystemView();
      long var51 = 413236117521042559L;
      FileSystemView var50 = var10023;
      Ref.s(413236117521042559L, var50, var51);
      if (var3 == null) {
         if (var2) {
            this.setDragEnabled(false);
            this.setEditable(false);
         }

         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10024 = Registry.packArgs(new CW3(this));
         long var53 = 434592463220957006L;
         Object[] var52 = var10024;
         Ref.h(434592463220957006L, var52, var53);

         try {
            ;
         } catch (InvocationTargetException var54) {
            throw var54.getTargetException();
         }
      }

      if (var3 != null) {
         Ky4.K(new String[3]);
      }
   }

   public boolean p$boolean() {
      return Registry.lookupField(557374830394047111L).getBoolean(this);
   }

   void p$void() {
      DefaultMutableTreeNode var10001 = new DefaultMutableTreeNode(a(11169, -16171));
      long var2 = 312919167011526763L;
      DefaultMutableTreeNode var1 = var10001;
      Ref.s(312919167011526763L, var1, var2);
      Yo4 var10003;
      Object var3 = 312919167011526763L;
      super((DefaultMutableTreeNode)Ref.g(312919167011526763L, var3));
      long var6 = 571388131590801605L;
      Yo4 var5 = var10003;
      Ref.s(571388131590801605L, var5, var6);
      Object var7 = 571388131590801605L;
      this.setModel((Yo4)Ref.g(571388131590801605L, var7));
   }

   void Y() {
      AA.z();
      Tf4 var10002 = new Tf4();
      long var4 = 357561646207134153L;
      Tf4 var3 = var10002;
      Ref.s(357561646207134153L, var3, var4);
      java.io.File var2 = new java.io.File((String)Registry.lookupField(478301022169899080L).get(null));
      if (this == null) {
         if (!var2.exists()) {
            var2.mkdirs();
         }

         Object var5 = 357561646207134153L;
         Ref.g(357561646207134153L, var5);
         Object[] var10003 = Registry.packArgs(var2);
         long var8 = 349593801287953443L;
         Object[] var7 = var10003;
         Ref.h(349593801287953443L, var7, var8);

         try {
            ;
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         Object var9 = 357561646207134153L;
         Ref.g(357561646207134153L, var9);
         Object[] var10005 = Registry.packArgs(a(11171, -28131));
         long var12 = 124677196473982808L;
         Object[] var11 = var10005;
         Ref.h(124677196473982808L, var11, var12);

         try {
            ;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }
      }
   }

   @Override
   public Rectangle m(Point var1) {
      return null;
   }

   public RouteTracePanel2 v$l5_2() {
      Object var2 = 310302490302373526L;
      Ref.g(310302490302373526L, var2);
      KQ var10002 = (KQ)(Registry.emptyArgs());
      long var5 = 149160680229662748L;
      Object[] var4 = var10002;
      var10002 = Ref.h(149160680229662748L, var4, var5);

      try {
         var10002 = (KQ)var10002;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      KQ var1 = var10002;
      Object var6 = 593306439561595691L;
      Connection5 var10006 = (Connection5)Ref.g(593306439561595691L, var6);
      Object var8 = 213130010239103238L;
var10006 = new TreePath(this, (DefaultMutableTreeNode)Ref.g(213130010239103238L, var8), var1, true, Registry.lookupField(601768954800299943L).getBoolean(this));
      long var11 = 486701759580007258L;
      Ref.s(486701759580007258L, this, var11);
      Object[] var22 = Registry.packArgs(true);
      long var13 = 438941361784812150L;
      Object[] var12 = var22;
      Ref.h(438941361784812150L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Object var14 = 486701759580007258L;
      ((RouteTracePanel2)Ref.g(486701759580007258L, var14)).addPopupMenuListener(new Ok4(this, var1));
      Object var16 = 486701759580007258L;
      return (RouteTracePanel2)Ref.g(486701759580007258L, var16);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void k() {
      AA.z();
      Object var17 = 593306439561595691L;
      Object var10002 = Ref.g(593306439561595691L, var17);
      List var10003 = (List)(Registry.emptyArgs());
      long var20 = 447854232501987193L;
      Object[] var19 = var10003;
      var10003 = Ref.h(447854232501987193L, var19, var20);

      try {
         var10003 = (List)var10003;
      } catch (InvocationTargetException var109) {
         throw var109.getTargetException();
      }

      List var2 = var10003;
      boolean var3 = false;
      Object var1 = var10002;
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      ArrayList var6 = new ArrayList();
      Iterator var7 = var2.iterator();

      while (true) {
         if (var7.hasNext()) {
            DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var7.next();
            var10002 = var8.getUserObject().getClass().equals(Ck4.class);
            if (var1 != null) {
               break;
            }

            label406: {
               if (var1 == null) {
                  if (var10002 != false) {
                     Ck4 var9 = (Ck4)var8.getUserObject();
                     var4.add(var9);
                     if (var1 == null) {
                        break label406;
                     }
                  }

                  var10002 = var8.getUserObject().getClass().equals(Tf4.class);
               }

               if (var10002 != false) {
                  var10003 = Registry.packArgs(var8, var4);
                  long var22 = 363671406087219533L;
                  Object[] var21 = var10003;
                  Ref.h(363671406087219533L, var21, var22);

                  try {
                     ;
                  } catch (InvocationTargetException var108) {
                     throw var108.getTargetException();
                  }
               }
            }

            if (var1 == null) {
               continue;
            }
         }

         var7 = var4.iterator();
         var10002 = var7.hasNext();
         break;
      }

      while (var10002 != false) {
         Ck4 var110 = (Ck4)var7.next();
         var10002 = Registry.emptyArgs();
         long var23 = 270389152141252877L;
         Ref.h2(270389152141252877L, var23);
         Object[] var10004 = Registry.emptyArgs();
         long var26 = 410905379772103887L;
         Object[] var25 = var10004;
         Ref.h(410905379772103887L, var25, var26);
         Lv4_2 var10006 = (Lv4_2)(Registry.emptyArgs());
         long var28 = 605430732347023634L;
         Object[] var27 = var10006;
         var10006 = Registry.packArgs(Ref.h(605430732347023634L, var27, var28));
         long var30 = 489768706953623433L;
         Object[] var29 = var10006;
         var10006 = Ref.h(489768706953623433L, var29, var30);

         try {
            var10006 = (Lv4_2)var10006;
         } catch (InvocationTargetException var107) {
            throw var107.getTargetException();
         }

         Lv4_2 var112 = var10006;
         label394:
         if (var1 != null || var112 != null) {
            Integer var10007 = (Integer)(Registry.emptyArgs());
            long var32 = 402271797068414482L;
            Object[] var31 = var10007;
            var10007 = Ref.h(402271797068414482L, var31, var32);

            try {
               var10007 = (Integer)var10007;
            } catch (InvocationTargetException var106) {
               throw var106.getTargetException();
            }

            int var10008 = Registry.lookupField(590765520000496083L).getInt(null);
            if (var1 == null) {
               if (var10007 == var10008) {
                  var5.add(var112);
                  if (var1 == null) {
                     break label394;
                  }
               }

               var10007 = var112;
               Object[] var133 = Registry.emptyArgs();
               long var34 = 402271797068414482L;
               Object[] var33 = var133;
               Object var134 = Ref.h(402271797068414482L, var33, var34);

               try {
                  var10008 = (Integer)var134;
               } catch (InvocationTargetException var105) {
                  throw var105.getTargetException();
               }

               if (var1 != null) {
                  break label394;
               }

               Registry.lookupField(292712586650823274L).getInt(null);
            }

            if (var10007 == var10008) {
               var6.add(var112);
            }
         }

         if (var1 != null) {
            break;
         }

         var7.hasNext();
      }

      Object var35 = 310302490302373526L;
      Ref.g(310302490302373526L, var35);
      Object[] var123 = Registry.emptyArgs();
      long var38 = 149160680229662748L;
      Object[] var37 = var123;
      Ref.h(149160680229662748L, var37, var38);

      try {
         ;
      } catch (InvocationTargetException var104) {
         throw var104.getTargetException();
      }

      Object[] var10005 = Registry.emptyArgs();
      long var40 = 249886410317960768L;
      Object[] var39 = var10005;
      var10005 = Ref.h(249886410317960768L, var39, var40);

      try {
         var10005 = (com.finalshell.ui.frame.U)var10005;
      } catch (InvocationTargetException var103) {
         throw var103.getTargetException();
      }

      com.finalshell.ui.frame.U var111 = var10005;
      byte var113 = 0;
      Object[] var129 = Registry.emptyArgs();
      long var42 = 303756590022481369L;
      Object[] var41 = var129;
      Ref.h(303756590022481369L, var41, var42);
      Object[] var132 = Registry.emptyArgs();
      long var44 = 194560825135347400L;
      Object[] var43 = var132;
      Ref.h(194560825135347400L, var43, var44);
      F8 var135 = (F8)(Registry.emptyArgs());
      long var46 = 424156930953488367L;
      Object[] var45 = var135;
      var135 = Ref.h(424156930953488367L, var45, var46);

      try {
         var135 = (F8)var135;
      } catch (InvocationTargetException var102) {
         throw var102.getTargetException();
      }

      label368: {
         F8 var10 = var135;
         Object var11 = null;
         byte var138 = (var10 instanceof CL) ? 1 : 0;
         if (var1 == null) {
            if (var138 == 0) {
               break label368;
            }

            var138 = 1;
         }

         var113 = var138;
         var11 = (CL)var10;
      }

      Object[] var10009 = Registry.emptyArgs();
      long var48 = 303756590022481369L;
      Object[] var47 = var10009;
      Ref.h(303756590022481369L, var47, var48);
      ArrayList var10010 = Registry.emptyArgs();
      long var50 = 230171768324088030L;
      Object[] var49 = var10010;
      var10010 = Ref.h(230171768324088030L, var49, var50);

      try {
         var10010 = (ArrayList)var10010;
      } catch (InvocationTargetException var101) {
         throw var101.getTargetException();
      }

      int var12 = var10010.size();
      Object[] var10011 = Registry.emptyArgs();
      long var52 = 303756590022481369L;
      Object[] var51 = var10011;
      Ref.h(303756590022481369L, var51, var52);
      ArrayList var10012 = Registry.emptyArgs();
      long var54 = 230171768324088030L;
      Object[] var53 = var10012;
      var10012 = Ref.h(230171768324088030L, var53, var54);

      try {
         var10012 = (ArrayList)var10012;
      } catch (InvocationTargetException var100) {
         throw var100.getTargetException();
      }

      T32 var143 = (T32)var10012.get(var12 - 1);
      F8 var10013 = (F8)(Registry.emptyArgs());
      long var56 = 424156930953488367L;
      Object[] var55 = var10013;
      var10013 = Ref.h(424156930953488367L, var55, var56);

      try {
         var10013 = (F8)var10013;
      } catch (InvocationTargetException var99) {
         throw var99.getTargetException();
      }

      CL var14;
      label361: {
         F8 var13 = var10013;
         var14 = null;
         F8 var146 = var13;
         if (var1 == null) {
            if (!(var13 instanceof CL)) {
               break label361;
            }

            var146 = var13;
         }

         var14 = (CL)var146;
      }

      label440: {
         int var147 = var113;
         if (var1 == null) {
            if (var113 != 0) {
               var10013 = var5;
               label347:
               if (var1 == null) {
                  label337:
                  if (var5.size() > 0) {
                     if (var5.size() == 1) {
                        java.io.File var10015;
                        Lv4_2 var10016 = (Lv4_2)var5.get(0);
                        String var10017 = (String)(Registry.emptyArgs());
                        long var58 = 432693308750455264L;
                        Object[] var57 = var10017;
                        var10017 = Ref.h(432693308750455264L, var57, var58);

                        try {
                           var10017 = (String)var10017;
                        } catch (InvocationTargetException var98) {
                           throw var98.getTargetException();
                        }

new HashMap(var10017);
                        Object[] var150 = Registry.packArgs(var10015, var111);
                        long var60 = 298666565248176577L;
                        Object[] var59 = var150;
                        Ref.h(298666565248176577L, var59, var60);

                        try {
                           ;
                        } catch (InvocationTargetException var97) {
                           throw var97.getTargetException();
                        }

                        if (var1 == null) {
                           break label337;
                        }
                     }

                     if (var1 == null && var14 != null) {
                        java.io.File var151;
                        Lv4_2 var161 = (Lv4_2)var5.get(0);
                        String var165 = (String)(Registry.emptyArgs());
                        long var62 = 432693308750455264L;
                        Object[] var61 = var165;
                        var165 = Ref.h(432693308750455264L, var61, var62);

                        try {
                           var165 = (String)var165;
                        } catch (InvocationTargetException var96) {
                           throw var96.getTargetException();
                        }

new HashMap(var165);
                        Object[] var152 = Registry.packArgs(var151, var111);
                        long var64 = 298666565248176577L;
                        Object[] var63 = var152;
                        Ref.h(298666565248176577L, var63, var64);

                        try {
                           ;
                        } catch (InvocationTargetException var95) {
                           throw var95.getTargetException();
                        }

                        var5.remove(0);
                     }

                     for (Lv4_2 var16 : var5) {
                        java.io.File var153;
                        String var168 = (String)(Registry.emptyArgs());
                        long var66 = 432693308750455264L;
                        Object[] var65 = var168;
                        var168 = Ref.h(432693308750455264L, var65, var66);

                        try {
                           var168 = (String)var168;
                        } catch (InvocationTargetException var94) {
                           throw var94.getTargetException();
                        }

                        var16 = new Lv4_2(var168);
                        Object[] var154 = Registry.packArgs(var153, true);
                        long var68 = 392275651608919501L;
                        Object[] var67 = var154;
                        Ref.h(392275651608919501L, var67, var68);

                        try {
                           ;
                        } catch (InvocationTargetException var93) {
                           throw var93.getTargetException();
                        }

                        if (var1 != null) {
                           break label347;
                        }

                        if (var1 != null) {
                           break;
                        }
                     }
                  }

                  var10013 = var6;
               }

               for (Lv4_2 var116 : var10013) {
                  java.io.File var155;
                  String var171 = (String)(Registry.emptyArgs());
                  long var70 = 432693308750455264L;
                  Object[] var69 = var171;
                  var171 = Ref.h(432693308750455264L, var69, var70);

                  try {
                     var171 = (String)var171;
                  } catch (InvocationTargetException var92) {
                     throw var92.getTargetException();
                  }

new HashMap(var171);
                  Object[] var156 = Registry.packArgs(var155, true);
                  long var72 = 392275651608919501L;
                  Object[] var71 = var156;
                  Ref.h(392275651608919501L, var71, var72);

                  try {
                     ;
                  } catch (InvocationTargetException var91) {
                     throw var91.getTargetException();
                  }

                  if (var1 != null) {
                     return;
                  }

                  if (var1 != null) {
                     break;
                  }
               }

               if (var1 == null) {
                  return;
               }
            }

            var10013 = var5;
            if (var1 != null) {
               break label440;
            }

            var147 = var5.size();
         }

         if (var147 > 0) {
            if (var1 == null && var14 != null) {
               java.io.File var157;
               Lv4_2 var162 = (Lv4_2)var5.get(0);
               String var174 = (String)(Registry.emptyArgs());
               long var74 = 432693308750455264L;
               Object[] var73 = var174;
               var174 = Ref.h(432693308750455264L, var73, var74);

               try {
                  var174 = (String)var174;
               } catch (InvocationTargetException var90) {
                  throw var90.getTargetException();
               }

new HashMap(var174);
               Object[] var158 = Registry.packArgs(var157, var111);
               long var76 = 298666565248176577L;
               Object[] var75 = var158;
               Ref.h(298666565248176577L, var75, var76);

               try {
                  ;
               } catch (InvocationTargetException var89) {
                  throw var89.getTargetException();
               }

               var5.remove(0);
            }

            for (Lv4_2 var117 : var5) {
               java.io.File var159;
               String var177 = (String)(Registry.emptyArgs());
               long var78 = 432693308750455264L;
               Object[] var77 = var177;
               var177 = Ref.h(432693308750455264L, var77, var78);

               try {
                  var177 = (String)var177;
               } catch (InvocationTargetException var88) {
                  throw var88.getTargetException();
               }

               var117 = new Lv4_2(var177);
               Object[] var160 = Registry.packArgs(var159, true);
               long var80 = 392275651608919501L;
               Object[] var79 = var160;
               Ref.h(392275651608919501L, var79, var80);

               try {
                  ;
               } catch (InvocationTargetException var87) {
                  throw var87.getTargetException();
               }

               if (var1 != null) {
                  break label440;
               }

               if (var1 != null) {
                  break;
               }
            }
         }

         var10013 = var6;
      }

      for (Lv4_2 var118 : var10013) {
         java.io.File var180;
         String var10019 = (String)(Registry.emptyArgs());
         long var82 = 432693308750455264L;
         Object[] var81 = var10019;
         var10019 = Ref.h(432693308750455264L, var81, var82);

         try {
            var10019 = (String)var10019;
         } catch (InvocationTargetException var86) {
            throw var86.getTargetException();
         }

new HashMap(var10019);
         Object[] var181 = Registry.packArgs(var180, true);
         long var84 = 392275651608919501L;
         Object[] var83 = var181;
         Ref.h(392275651608919501L, var83, var84);

         try {
            ;
         } catch (InvocationTargetException var85) {
            throw var85.getTargetException();
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public void N() {
      AA.z();
      Object var17 = 348708854043337366L;
      String var2 = (String)Ref.g(348708854043337366L, var17);
      Registry.emptyArgs();
      long var19 = 270389152141252877L;
      Ref.h2(270389152141252877L, var19);
      U62 var10004 = (U62)(Registry.emptyArgs());
      long var22 = 306266403902896148L;
      Object[] var21 = var10004;
      var10004 = Ref.h(306266403902896148L, var21, var22);

      try {
         var10004 = (U62)var10004;
      } catch (InvocationTargetException var65) {
         throw var65.getTargetException();
      }

      U62 var3 = var10004;
      String var10005 = (String)(Registry.emptyArgs());
      long var24 = 441706210979477420L;
      Object[] var23 = var10005;
      var10005 = Ref.h(441706210979477420L, var23, var24);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var64) {
         throw var64.getTargetException();
      }

      U62 var1;
      String var4;
      label179: {
         var4 = var10005;
         var1 = var3;
         boolean var5 = false;
         int var68 = (var2.equals((String)Registry.lookupField(478301022169899080L).get(null))) ? 1 : 0;
         if (var3 == null) {
            if (var68 == 0) {
               break label179;
            }

            var68 = new java.io.File((String)Registry.lookupField(478301022169899080L).get(null)).listFiles().length;
         }

         if (var3 == null && var68 == 0) {
            boolean var69 = true;
         }
      }

      Object var25 = 310302490302373526L;
      Ref.g(310302490302373526L, var25);
      Object[] var10006 = Registry.emptyArgs();
      long var28 = 149160680229662748L;
      Object[] var27 = var10006;
      Ref.h(149160680229662748L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var63) {
         throw var63.getTargetException();
      }

      Object[] var10007 = Registry.emptyArgs();
      long var30 = 249886410317960768L;
      Object[] var29 = var10007;
      var10007 = Ref.h(249886410317960768L, var29, var30);

      try {
         var10007 = (com.finalshell.ui.frame.U)var10007;
      } catch (InvocationTargetException var62) {
         throw var62.getTargetException();
      }

      com.finalshell.ui.frame.U var7;
      U62 var10008;
      label180: {
         var7 = var10007;
         EditDialog2 var8 = new EditDialog2(Registry.lookupField(317162390314131527L).getInt(null), var7, a(11174, -30976), new Dv4(), false);
         if (var3 == null) {
            if (var4 != null) {
               boolean var74 = var4.equals((String)Registry.lookupField(149082991182987426L).get(null));
               var10008 = var3;
               if (var3 != null) {
                  break label180;
               }

               if (!var74) {
                  Object[] var75 = Registry.packArgs(var4, true, true);
                  long var32 = 206082969888821725L;
                  Object[] var31 = var75;
                  Ref.h(206082969888821725L, var31, var32);

                  try {
                     ;
                  } catch (InvocationTargetException var61) {
                     throw var61.getTargetException();
                  }
               }
            }

            var8.setSize(b(30930, 1570349893146755279L), b(20038, 8833900715546408542L));
            var8.setLocationRelativeTo(var7);
            var8.setVisible(true);
         }

         Object[] var76 = Registry.emptyArgs();
         long var34 = 418327897845479655L;
         Object[] var33 = var76;
         var10008 = (U62)Ref.h(418327897845479655L, var33, var34);

         try {
            var10008 = (Integer)var10008;
         } catch (InvocationTargetException var60) {
            throw var60.getTargetException();
         }
      }

      U62 var9 = var10008;
      if (var9 == Registry.lookupField(564170828581134815L).getInt(null)) {
         new ArrayList();
         ArrayList var10009 = (ArrayList)(Registry.emptyArgs());
         long var36 = 293270026918177010L;
         Object[] var35 = var10009;
         var10009 = Ref.h(293270026918177010L, var35, var36);

         try {
            var10009 = (ArrayList)var10009;
         } catch (InvocationTargetException var59) {
            throw var59.getTargetException();
         }

         label182: {
            ArrayList var11 = var10009;
            String var12 = null;
            if (var11.size() > 0) {
               File2 var13 = new File2();
               Object[] var10010 = Registry.packArgs(var7);
               long var38 = 222783555954803141L;
               Object[] var37 = var10010;
               Ref.h(222783555954803141L, var37, var38);

               try {
                  ;
               } catch (InvocationTargetException var58) {
                  throw var58.getTargetException();
               }

               Object var39 = 441139186211959448L;
               Object[] var10012 = Registry.packArgs(Ref.g(441139186211959448L, var39));
               long var42 = 611100388280232303L;
               Object[] var41 = var10012;
               Ref.h(611100388280232303L, var41, var42);

               try {
                  ;
               } catch (InvocationTargetException var57) {
                  throw var57.getTargetException();
               }

               for (Object var15 : var11) {
                  Registry.packArgs(var15);
                  long var43 = 492128056065034754L;
                  Object var10013 = Ref.h2(492128056065034754L, var43);

                  try {
                     var10013 = (java.io.File)var10013;
                  } catch (InvocationTargetException var55) {
                     throw var55.getTargetException();
                  }

                  java.io.File var16 = (java.io.File)var10013;
                  if (var1 != null) {
                     break label182;
                  }

                  label146: {
                     boolean var83 = var16.isFile();
                     if (var1 == null) {
                        if (var83) {
                           var12 = var16.getParent();
                           if (var1 == null) {
                              break label146;
                           }
                        }

                        var83 = var16.isDirectory();
                     }

                     if (var83) {
                     }
                  }

                  Object[] var10014 = Registry.packArgs(var16, var2);
                  long var46 = 260302370089021453L;
                  Object[] var45 = var10014;
                  Ref.h(260302370089021453L, var45, var46);

                  try {
                     ;
                  } catch (InvocationTargetException var56) {
                     throw var56.getTargetException();
                  }

                  if (var1 != null) {
                     break;
                  }
               }
            }

            SwingUtilities.invokeLater(new G0(this, var2));
            Object[] var80 = Registry.packArgs(var12);
            long var48 = 349581629171014440L;
            Object[] var47 = var80;
            Ref.h(349581629171014440L, var47, var48);

            try {
               ;
            } catch (InvocationTargetException var54) {
               throw var54.getTargetException();
            }
         }

         Registry.emptyArgs();
         long var49 = 270389152141252877L;
         Ref.h2(270389152141252877L, var49);
         Object[] var81 = Registry.emptyArgs();
         long var52 = 578864097947885485L;
         Object[] var51 = var81;
         Ref.h(578864097947885485L, var51, var52);

         try {
            ;
         } catch (InvocationTargetException var53) {
            throw var53.getTargetException();
         }
      }
   }

   public void a() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/ui/panel/AA.z ()Ljava/lang/String;
      // 003: new java/util/ArrayList
      // 006: dup
      // 007: invokespecial java/util/ArrayList.<init> ()V
      // 00a: astore 2
      // 00b: aload 0
      // 00c: ldc2_w 348708854043337366
      // 00f: astore 22
      // 011: ldc2_w 348708854043337366
      // 014: aload 22
      // 016: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 019: checkcast java/lang/String
      // 01c: astore 3
      // 01d: astore 1
      // 01e: aload 0
      // 01f: aload 1
      // 020: ifnonnull 22d
      // 023: ldc2_w 420994829726907422
      // 026: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 029: swap
      // 02a: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 02d: ifne 225
      // 030: goto 037
      // 033: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 036: athrow
      // 037: aload 0
      // 038: ldc2_w 359637467035547923
      // 03b: astore 24
      // 03d: ldc2_w 359637467035547923
      // 040: aload 24
      // 042: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 045: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 048: ldc2_w 442657485924266205
      // 04b: astore 27
      // 04d: astore 26
      // 04f: ldc2_w 442657485924266205
      // 052: aload 26
      // 054: aload 27
      // 056: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 059: checkcast java/util/ArrayList
      // 05c: goto 063
      // 05f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 062: athrow
      // 063: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 066: astore 4
      // 068: aload 4
      // 06a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 06f: ifeq 1b9
      // 072: aload 4
      // 074: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 079: checkcast java/lang/String
      // 07c: astore 5
      // 07e: aload 0
      // 07f: ldc2_w 604074053920059872
      // 082: astore 28
      // 084: ldc2_w 604074053920059872
      // 087: aload 28
      // 089: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 08c: checkcast java/util/HashMap
      // 08f: aload 5
      // 091: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 094: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 097: astore 6
      // 099: aload 6
      // 09b: aload 1
      // 09c: ifnonnull 1d1
      // 09f: ifnull 0b9
      // 0a2: goto 0a9
      // 0a5: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: aload 2
      // 0aa: aload 6
      // 0ac: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0b1: pop
      // 0b2: goto 0b9
      // 0b5: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0b8: athrow
      // 0b9: new com/finalshell/core/Lv4_2
      // 0bc: dup
      // 0bd: invokespecial com/finalshell/core/Lv4_2.<init> ()V
      // 0c0: astore 7
      // 0c2: aload 7
      // 0c4: aload 5
      // 0c6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0c9: ldc2_w 574053907803002361
      // 0cc: astore 31
      // 0ce: astore 30
      // 0d0: ldc2_w 574053907803002361
      // 0d3: aload 30
      // 0d5: aload 31
      // 0d7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0da: pop
      // 0db: goto 0e2
      // 0de: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: aload 7
      // 0e4: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0e7: ldc2_w 540969864624467425
      // 0ea: astore 33
      // 0ec: astore 32
      // 0ee: ldc2_w 540969864624467425
      // 0f1: aload 32
      // 0f3: aload 33
      // 0f5: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0f8: pop
      // 0f9: goto 100
      // 0fc: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: goto 10a
      // 103: astore 8
      // 105: aload 8
      // 107: invokevirtual java/lang/Exception.printStackTrace ()V
      // 10a: aload 7
      // 10c: aload 3
      // 10d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 110: ldc2_w 189603700854791470
      // 113: astore 35
      // 115: astore 34
      // 117: ldc2_w 189603700854791470
      // 11a: aload 34
      // 11c: aload 35
      // 11e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 121: pop
      // 122: goto 129
      // 125: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 128: athrow
      // 129: aload 7
      // 12b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 12e: ldc2_w 236040230540929068
      // 131: astore 36
      // 133: ldc2_w 236040230540929068
      // 136: aload 36
      // 138: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 13b: goto 142
      // 13e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 141: athrow
      // 142: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 145: ldc2_w 611820767281823807
      // 148: astore 39
      // 14a: astore 38
      // 14c: ldc2_w 611820767281823807
      // 14f: aload 38
      // 151: aload 39
      // 153: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 156: pop
      // 157: goto 15e
      // 15a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: invokestatic java/lang/System.currentTimeMillis ()J
      // 161: lstore 8
      // 163: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 166: ldc2_w 270389152141252877
      // 169: astore 40
      // 16b: ldc2_w 270389152141252877
      // 16e: aload 40
      // 170: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 173: goto 17a
      // 176: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 179: athrow
      // 17a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 17d: ldc2_w 410905379772103887
      // 180: astore 43
      // 182: astore 42
      // 184: ldc2_w 410905379772103887
      // 187: aload 42
      // 189: aload 43
      // 18b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 18e: goto 195
      // 191: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 194: athrow
      // 195: aload 7
      // 197: bipush 0
      // 198: bipush 0
      // 199: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;IZ)[Ljava/lang/Object;
      // 19c: ldc2_w 425640194583900456
      // 19f: astore 45
      // 1a1: astore 44
      // 1a3: ldc2_w 425640194583900456
      // 1a6: aload 44
      // 1a8: aload 45
      // 1aa: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ad: pop
      // 1ae: goto 1b5
      // 1b1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b4: athrow
      // 1b5: aload 1
      // 1b6: ifnull 068
      // 1b9: aload 0
      // 1ba: ldc2_w 604074053920059872
      // 1bd: astore 46
      // 1bf: ldc2_w 604074053920059872
      // 1c2: aload 46
      // 1c4: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 1c7: checkcast java/util/HashMap
      // 1ca: aload 3
      // 1cb: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1ce: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 1d1: astore 4
      // 1d3: aload 0
      // 1d4: aload 4
      // 1d6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1d9: ldc2_w 276002133797788160
      // 1dc: astore 49
      // 1de: astore 48
      // 1e0: ldc2_w 276002133797788160
      // 1e3: aload 48
      // 1e5: aload 49
      // 1e7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1ea: pop
      // 1eb: goto 1f2
      // 1ee: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f1: athrow
      // 1f2: aload 0
      // 1f3: ldc2_w 359637467035547923
      // 1f6: astore 50
      // 1f8: ldc2_w 359637467035547923
      // 1fb: aload 50
      // 1fd: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 200: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 203: ldc2_w 442657485924266205
      // 206: astore 53
      // 208: astore 52
      // 20a: ldc2_w 442657485924266205
      // 20d: aload 52
      // 20f: aload 53
      // 211: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 214: checkcast java/util/ArrayList
      // 217: goto 21e
      // 21a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 21d: athrow
      // 21e: invokevirtual java/util/ArrayList.clear ()V
      // 221: aload 1
      // 222: ifnull 6f8
      // 225: aload 0
      // 226: goto 22d
      // 229: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 22c: athrow
      // 22d: ldc2_w 359637467035547923
      // 230: astore 54
      // 232: ldc2_w 359637467035547923
      // 235: aload 54
      // 237: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 23a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 23d: ldc2_w 442657485924266205
      // 240: astore 57
      // 242: astore 56
      // 244: ldc2_w 442657485924266205
      // 247: aload 56
      // 249: aload 57
      // 24b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 24e: checkcast java/util/ArrayList
      // 251: goto 258
      // 254: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 257: athrow
      // 258: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 25b: astore 4
      // 25d: aload 4
      // 25f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 264: ifeq 2de
      // 267: aload 4
      // 269: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 26e: checkcast java/lang/String
      // 271: astore 5
      // 273: bipush 0
      // 274: istore 6
      // 276: new java/io/File
      // 279: dup
      // 27a: aload 5
      // 27c: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 27f: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 282: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 285: aload 1
      // 286: ifnonnull 2f3
      // 289: aload 3
      // 28a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 28d: aload 1
      // 28e: ifnonnull 2a7
      // 291: goto 298
      // 294: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 297: athrow
      // 298: ifeq 2a5
      // 29b: goto 2a2
      // 29e: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2a1: athrow
      // 2a2: bipush 1
      // 2a3: istore 6
      // 2a5: iload 6
      // 2a7: ifne 2da
      // 2aa: aload 0
      // 2ab: ldc2_w 604074053920059872
      // 2ae: astore 58
      // 2b0: ldc2_w 604074053920059872
      // 2b3: aload 58
      // 2b5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2b8: checkcast java/util/HashMap
      // 2bb: aload 5
      // 2bd: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c0: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 2c3: astore 7
      // 2c5: aload 7
      // 2c7: ifnull 2da
      // 2ca: aload 2
      // 2cb: aload 7
      // 2cd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2d2: pop
      // 2d3: goto 2da
      // 2d6: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2d9: athrow
      // 2da: aload 1
      // 2db: ifnull 25d
      // 2de: aload 0
      // 2df: ldc2_w 604074053920059872
      // 2e2: astore 60
      // 2e4: ldc2_w 604074053920059872
      // 2e7: aload 60
      // 2e9: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2ec: checkcast java/util/HashMap
      // 2ef: aload 3
      // 2f0: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2f3: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 2f6: astore 4
      // 2f8: aload 0
      // 2f9: aload 4
      // 2fb: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2fe: ldc2_w 276002133797788160
      // 301: astore 63
      // 303: astore 62
      // 305: ldc2_w 276002133797788160
      // 308: aload 62
      // 30a: aload 63
      // 30c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 30f: pop
      // 310: goto 317
      // 313: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 316: athrow
      // 317: aload 0
      // 318: ldc2_w 359637467035547923
      // 31b: astore 64
      // 31d: ldc2_w 359637467035547923
      // 320: aload 64
      // 322: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 325: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 328: ldc2_w 442657485924266205
      // 32b: astore 67
      // 32d: astore 66
      // 32f: ldc2_w 442657485924266205
      // 332: aload 66
      // 334: aload 67
      // 336: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 339: checkcast java/util/ArrayList
      // 33c: goto 343
      // 33f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 342: athrow
      // 343: invokevirtual java/util/ArrayList.clear ()V
      // 346: aload 2
      // 347: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 34c: astore 5
      // 34e: aload 5
      // 350: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 355: ifeq 6f8
      // 358: aload 5
      // 35a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 35f: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 362: astore 6
      // 364: aload 6
      // 366: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 369: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 36c: ldc_w com/finalshell/ui/model/Ck4
      // 36f: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 372: aload 1
      // 373: ifnonnull 6f1
      // 376: ifeq 6dc
      // 379: goto 380
      // 37c: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37f: athrow
      // 380: aload 6
      // 382: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 385: checkcast com/finalshell/ui/model/Ck4
      // 388: astore 7
      // 38a: aload 7
      // 38c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 38f: ldc2_w 272998330038223631
      // 392: astore 69
      // 394: astore 68
      // 396: ldc2_w 272998330038223631
      // 399: aload 68
      // 39b: aload 69
      // 39d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3a0: checkcast java/io/File
      // 3a3: goto 3aa
      // 3a6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a9: athrow
      // 3aa: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 3ad: astore 8
      // 3af: aload 7
      // 3b1: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 3b4: ldc2_w 272998330038223631
      // 3b7: astore 71
      // 3b9: astore 70
      // 3bb: ldc2_w 272998330038223631
      // 3be: aload 70
      // 3c0: aload 71
      // 3c2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3c5: checkcast java/io/File
      // 3c8: goto 3cf
      // 3cb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3ce: athrow
      // 3cf: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 3d2: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 3d5: astore 9
      // 3d7: aconst_null
      // 3d8: astore 10
      // 3da: aload 0
      // 3db: ldc2_w 604074053920059872
      // 3de: astore 72
      // 3e0: ldc2_w 604074053920059872
      // 3e3: aload 72
      // 3e5: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 3e8: checkcast java/util/HashMap
      // 3eb: aload 3
      // 3ec: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 3ef: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 3f2: astore 11
      // 3f4: aload 11
      // 3f6: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 3f9: checkcast com/finalshell/ui/model/Tf4
      // 3fc: astore 10
      // 3fe: new java/lang/StringBuilder
      // 401: dup
      // 402: invokespecial java/lang/StringBuilder.<init> ()V
      // 405: aload 10
      // 407: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 40a: ldc2_w 543633160597441792
      // 40d: astore 75
      // 40f: astore 74
      // 411: ldc2_w 543633160597441792
      // 414: aload 74
      // 416: aload 75
      // 418: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 41b: checkcast java/io/File
      // 41e: goto 425
      // 421: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 424: athrow
      // 425: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 428: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 42b: getstatic java/io/File.separator Ljava/lang/String;
      // 42e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 431: aload 7
      // 433: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 436: ldc2_w 272998330038223631
      // 439: astore 77
      // 43b: astore 76
      // 43d: ldc2_w 272998330038223631
      // 440: aload 76
      // 442: aload 77
      // 444: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 447: checkcast java/io/File
      // 44a: goto 451
      // 44d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 450: athrow
      // 451: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 454: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 457: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 45a: astore 12
      // 45c: new java/io/File
      // 45f: dup
      // 460: aload 12
      // 462: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 465: astore 13
      // 467: bipush 1
      // 468: istore 14
      // 46a: aload 7
      // 46c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 46f: ldc2_w 272998330038223631
      // 472: astore 79
      // 474: astore 78
      // 476: ldc2_w 272998330038223631
      // 479: aload 78
      // 47b: aload 79
      // 47d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 480: checkcast java/io/File
      // 483: goto 48a
      // 486: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 489: athrow
      // 48a: aload 13
      // 48c: invokestatic org/apache/commons/io/FileUtils.moveFile (Ljava/io/File;Ljava/io/File;)V
      // 48f: goto 49c
      // 492: astore 15
      // 494: aload 15
      // 496: invokevirtual java/io/IOException.printStackTrace ()V
      // 499: bipush 0
      // 49a: istore 14
      // 49c: iload 14
      // 49e: ifeq 6d8
      // 4a1: aload 0
      // 4a2: ldc2_w 593306439561595691
      // 4a5: astore 80
      // 4a7: ldc2_w 593306439561595691
      // 4aa: aload 80
      // 4ac: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4af: aload 9
      // 4b1: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4b4: ldc2_w 509874190727776741
      // 4b7: astore 83
      // 4b9: astore 82
      // 4bb: ldc2_w 509874190727776741
      // 4be: aload 82
      // 4c0: aload 83
      // 4c2: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4c5: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 4c8: goto 4cf
      // 4cb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4ce: athrow
      // 4cf: astore 15
      // 4d1: aload 0
      // 4d2: ldc2_w 571388131590801605
      // 4d5: astore 84
      // 4d7: ldc2_w 571388131590801605
      // 4da: aload 84
      // 4dc: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 4df: checkcast com/finalshell/core/Yo4
      // 4e2: aload 6
      // 4e4: invokevirtual com/finalshell/core/Yo4.removeNodeFromParent (Ljavax/swing/tree/MutableTreeNode;)V
      // 4e7: aload 15
      // 4e9: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 4ec: checkcast com/finalshell/ui/model/Tf4
      // 4ef: astore 16
      // 4f1: aload 16
      // 4f3: aload 8
      // 4f5: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4f8: ldc2_w 548576199562161390
      // 4fb: astore 87
      // 4fd: astore 86
      // 4ff: ldc2_w 548576199562161390
      // 502: aload 86
      // 504: aload 87
      // 506: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 509: pop
      // 50a: goto 511
      // 50d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 510: athrow
      // 511: aload 0
      // 512: ldc2_w 593306439561595691
      // 515: astore 88
      // 517: ldc2_w 593306439561595691
      // 51a: aload 88
      // 51c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 51f: aload 8
      // 521: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 524: ldc2_w 387993827549279839
      // 527: astore 91
      // 529: astore 90
      // 52b: ldc2_w 387993827549279839
      // 52e: aload 90
      // 530: aload 91
      // 532: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 535: pop
      // 536: goto 53d
      // 539: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 53c: athrow
      // 53d: new com/finalshell/ui/model/Ck4
      // 540: dup
      // 541: invokespecial com/finalshell/ui/model/Ck4.<init> ()V
      // 544: astore 17
      // 546: aload 17
      // 548: aload 13
      // 54a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 54d: ldc2_w 325634526741383265
      // 550: astore 93
      // 552: astore 92
      // 554: ldc2_w 325634526741383265
      // 557: aload 92
      // 559: aload 93
      // 55b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 55e: pop
      // 55f: goto 566
      // 562: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 565: athrow
      // 566: aload 17
      // 568: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 56b: ldc2_w 336419247910974761
      // 56e: astore 94
      // 570: ldc2_w 336419247910974761
      // 573: aload 94
      // 575: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 578: pop
      // 579: goto 580
      // 57c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 57f: athrow
      // 580: aload 10
      // 582: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 585: ldc2_w 248698316749304686
      // 588: astore 97
      // 58a: astore 96
      // 58c: ldc2_w 248698316749304686
      // 58f: aload 96
      // 591: aload 97
      // 593: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 596: checkcast java/util/List
      // 599: goto 5a0
      // 59c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 59f: athrow
      // 5a0: aload 17
      // 5a2: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 5a7: pop
      // 5a8: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5ab: ldc2_w 270389152141252877
      // 5ae: astore 98
      // 5b0: ldc2_w 270389152141252877
      // 5b3: aload 98
      // 5b5: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 5b8: goto 5bf
      // 5bb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5be: athrow
      // 5bf: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5c2: ldc2_w 410905379772103887
      // 5c5: astore 101
      // 5c7: astore 100
      // 5c9: ldc2_w 410905379772103887
      // 5cc: aload 100
      // 5ce: aload 101
      // 5d0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5d3: goto 5da
      // 5d6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5d9: athrow
      // 5da: aload 7
      // 5dc: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 5df: ldc2_w 605430732347023634
      // 5e2: astore 103
      // 5e4: astore 102
      // 5e6: ldc2_w 605430732347023634
      // 5e9: aload 102
      // 5eb: aload 103
      // 5ed: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5f0: goto 5f7
      // 5f3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5f6: athrow
      // 5f7: aload 12
      // 5f9: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 5fc: ldc2_w 120242074362177751
      // 5ff: astore 105
      // 601: astore 104
      // 603: ldc2_w 120242074362177751
      // 606: aload 104
      // 608: aload 105
      // 60a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 60d: pop
      // 60e: goto 615
      // 611: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 614: athrow
      // 615: new javax/swing/tree/DefaultMutableTreeNode
      // 618: dup
      // 619: aload 17
      // 61b: invokespecial javax/swing/tree/DefaultMutableTreeNode.<init> (Ljava/lang/Object;)V
      // 61e: astore 18
      // 620: aload 0
      // 621: ldc2_w 593306439561595691
      // 624: astore 106
      // 626: ldc2_w 593306439561595691
      // 629: aload 106
      // 62b: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 62e: aload 18
      // 630: aload 17
      // 632: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 635: ldc2_w 148501163140533206
      // 638: astore 109
      // 63a: astore 108
      // 63c: ldc2_w 148501163140533206
      // 63f: aload 108
      // 641: aload 109
      // 643: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 646: pop
      // 647: goto 64e
      // 64a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 64d: athrow
      // 64e: bipush 0
      // 64f: istore 19
      // 651: aload 0
      // 652: ldc2_w 571388131590801605
      // 655: astore 110
      // 657: ldc2_w 571388131590801605
      // 65a: aload 110
      // 65c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 65f: checkcast com/finalshell/core/Yo4
      // 662: aload 18
      // 664: aload 11
      // 666: iload 19
      // 668: invokevirtual com/finalshell/core/Yo4.insertNodeInto (Ljavax/swing/tree/MutableTreeNode;Ljavax/swing/tree/MutableTreeNode;I)V
      // 66b: new java/io/File
      // 66e: dup
      // 66f: aload 12
      // 671: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 674: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 677: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 67a: astore 20
      // 67c: aload 0
      // 67d: ldc2_w 593306439561595691
      // 680: astore 112
      // 682: ldc2_w 593306439561595691
      // 685: aload 112
      // 687: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 68a: aload 20
      // 68c: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 68f: ldc2_w 509874190727776741
      // 692: astore 115
      // 694: astore 114
      // 696: ldc2_w 509874190727776741
      // 699: aload 114
      // 69b: aload 115
      // 69d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6a0: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 6a3: goto 6aa
      // 6a6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6a9: athrow
      // 6aa: astore 21
      // 6ac: aload 0
      // 6ad: ldc2_w 593306439561595691
      // 6b0: astore 116
      // 6b2: ldc2_w 593306439561595691
      // 6b5: aload 116
      // 6b7: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 6ba: aload 21
      // 6bc: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 6bf: ldc2_w 276002133797788160
      // 6c2: astore 119
      // 6c4: astore 118
      // 6c6: ldc2_w 276002133797788160
      // 6c9: aload 118
      // 6cb: aload 119
      // 6cd: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 6d0: pop
      // 6d1: goto 6d8
      // 6d4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 6d7: athrow
      // 6d8: aload 1
      // 6d9: ifnull 6f4
      // 6dc: aload 6
      // 6de: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 6e1: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 6e4: ldc_w com/finalshell/ui/model/Tf4
      // 6e7: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 6ea: goto 6f1
      // 6ed: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 6f0: athrow
      // 6f1: ifeq 6f4
      // 6f4: aload 1
      // 6f5: ifnull 34e
      // 6f8: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void a(java.io.File var1, String var2) {
      String var3 = AA.z();

      boolean var10000;
      label196: {
         label186: {
            try {
               var10000 = var1.isFile();
               if (var3 != null) {
                  break label196;
               }

               if (!var10000) {
                  break label186;
               }
            } catch (Exception var71) {
               throw a(var71);
            }

            Lv4_2 var4 = new Lv4_2();
            Object[] var10001 = Registry.packArgs(var1.getAbsolutePath());
            long var15 = 574053907803002361L;
            Object[] var14 = var10001;
            Ref.h(574053907803002361L, var14, var15);

            try {
               ;
            } catch (InvocationTargetException var67) {
               throw var67.getTargetException();
            }

            try {
               Object[] var10002 = Registry.emptyArgs();
               long var17 = 540969864624467425L;
               Object[] var16 = var10002;
               Ref.h(540969864624467425L, var16, var17);

               try {
                  ;
               } catch (InvocationTargetException var65) {
                  throw var65.getTargetException();
               }
            } catch (Exception var66) {
               var66.printStackTrace();
            }

            var10001 = Registry.packArgs(var2);
            long var19 = 189603700854791470L;
            Object[] var18 = var10001;
            Ref.h(189603700854791470L, var18, var19);

            try {
               ;
            } catch (InvocationTargetException var64) {
               throw var64.getTargetException();
            }

            Registry.emptyArgs();
            long var20 = 236040230540929068L;
            Object[] var10003 = Registry.packArgs(Ref.h2(236040230540929068L, var20));
            long var23 = 611820767281823807L;
            Object[] var22 = var10003;
            Ref.h(611820767281823807L, var22, var23);

            try {
               ;
            } catch (InvocationTargetException var63) {
               throw var63.getTargetException();
            }

            long var5 = System.currentTimeMillis();
            Object[] var10004 = Registry.e(var5);
            long var25 = 448034136929726083L;
            Object[] var24 = var10004;
            Ref.h(448034136929726083L, var24, var25);

            try {
               ;
            } catch (InvocationTargetException var62) {
               throw var62.getTargetException();
            }

            Object[] var10005 = Registry.e(var5);
            long var27 = 632174181210947576L;
            Object[] var26 = var10005;
            Ref.h(632174181210947576L, var26, var27);

            try {
               ;
            } catch (InvocationTargetException var61) {
               throw var61.getTargetException();
            }

            Registry.emptyArgs();
            long var28 = 270389152141252877L;
            Ref.h2(270389152141252877L, var28);
            Object[] var10007 = Registry.emptyArgs();
            long var31 = 410905379772103887L;
            Object[] var30 = var10007;
            Ref.h(410905379772103887L, var30, var31);
            Object[] var10008 = Registry.packArgs(var4, 0, false);
            long var33 = 425640194583900456L;
            Object[] var32 = var10008;
            Ref.h(425640194583900456L, var32, var33);

            try {
               ;
            } catch (InvocationTargetException var60) {
               throw var60.getTargetException();
            }

            Object var34 = 604074053920059872L;
            DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)((HashMap)Ref.g(604074053920059872L, var34)).get(var2);

            try {
               Object[] var10010 = Registry.packArgs(var7);
               long var37 = 276002133797788160L;
               Object[] var36 = var10010;
               Ref.h(276002133797788160L, var36, var37);

               try {
                  ;
               } catch (InvocationTargetException var59) {
                  throw var59.getTargetException();
               }

               if (var3 == null) {
                  return;
               }
            } catch (Exception var70) {
               boolean var76 = false;
               throw a(var70);
            }
         }

         try {
            var10000 = var1.isDirectory();
         } catch (Exception var69) {
            boolean var77 = false;
            throw a(var69);
         }
      }

      if (var10000) {
         Registry.emptyArgs();
         long var38 = 270389152141252877L;
         Ref.h2(270389152141252877L, var38);
         Object[] var78 = Registry.emptyArgs();
         long var41 = 410905379772103887L;
         Object[] var40 = var78;
         Ref.h(410905379772103887L, var40, var41);
         LO3 var79 = (LO3)(Registry.packArgs(var2, var1.getName()));
         long var43 = 416293356817081351L;
         Object[] var42 = var79;
         var79 = Ref.h(416293356817081351L, var42, var43);

         try {
            var79 = (LO3)var79;
         } catch (InvocationTargetException var58) {
            throw var58.getTargetException();
         }

         LO3 var72 = var79;
         new StringBuilder().append(var2).append(java.io.File.separator);
         String var82 = (String)(Registry.emptyArgs());
         long var45 = 194080076253066315L;
         Object[] var44 = var82;
         var82 = Ref.h(194080076253066315L, var44, var45);

         try {
            var82 = (String)var82;
         } catch (InvocationTargetException var57) {
            throw var57.getTargetException();
         }

         String var6 = var72.append((String)var82).toString();
         var82 = Registry.packArgs(var6, 0, false, false);
         long var47 = 139844880563692307L;
         Object[] var46 = var82;
         Ref.h(139844880563692307L, var46, var47);

         try {
            ;
         } catch (InvocationTargetException var56) {
            throw var56.getTargetException();
         }

         Object var48 = 604074053920059872L;
         DefaultMutableTreeNode var73 = (DefaultMutableTreeNode)((HashMap)Ref.g(604074053920059872L, var48)).get(var6);
         java.io.File[] var8 = var1.listFiles();
         java.io.File[] var9 = var8;
         int var10 = var8.length;
         int var11 = 0;

         while (var11 < var10) {
            java.io.File var12 = var9[var11];
            new StringBuilder().append(var2).append(java.io.File.separator);
            String var86 = (String)(Registry.emptyArgs());
            long var51 = 194080076253066315L;
            Object[] var50 = var86;
            var86 = Ref.h(194080076253066315L, var50, var51);

            try {
               var86 = (String)var86;
            } catch (InvocationTargetException var55) {
               throw var55.getTargetException();
            }

            String var13 = var72.append((String)var86).toString();

            try {
               var86 = Registry.packArgs(var12, var13);
               long var53 = 260302370089021453L;
               Object[] var52 = var86;
               Ref.h(260302370089021453L, var52, var53);

               try {
                  ;
               } catch (InvocationTargetException var54) {
                  throw var54.getTargetException();
               }

               var11++;
               if (var3 != null) {
                  return;
               }

               if (var3 != null) {
                  break;
               }
            } catch (Exception var68) {
               throw a(var68);
            }
         }

         SwingUtilities.invokeLater(new OE(this, var73));
      }
   }

   public void N(JTree var1) {
      TreeNode var2 = (TreeNode)var1.getModel().getRoot();
      Object[] var10001 = Registry.packArgs(var1, new TreePath(var2));
      long var4 = 579460881298592137L;
      Object[] var3 = var10001;
      Ref.h(579460881298592137L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void e(JTree var1, TreePath var2) {
      String var10000 = AA.z();
      TreeNode var4 = (TreeNode)var2.getLastPathComponent();
      String var3 = var10000;
      if (var3 == null) {
         if (var4.getChildCount() >= 0) {
            Enumeration var5 = var4.children();

            while (var5.hasMoreElements()) {
               TreeNode var6 = (TreeNode)var5.nextElement();
               TreePath var7 = var2.pathByAddingChild(var6);
               Object[] var10001 = Registry.packArgs(var1, var7);
               long var9 = 579460881298592137L;
               Object[] var8 = var10001;
               Ref.h(579460881298592137L, var8, var9);

               try {
                  ;
               } catch (InvocationTargetException var10) {
                  throw var10.getTargetException();
               }

               if (var3 != null) {
                  return;
               }

               if (var3 != null) {
                  break;
               }
            }
         }

         var1.collapsePath(var2);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void L() {
      AA.z();
      new File2();
      Object var10 = 593306439561595691L;
      Object var10002 = Ref.g(593306439561595691L, var10);
      List var10003 = (List)(Registry.emptyArgs());
      long var13 = 447854232501987193L;
      Object[] var12 = var10003;
      var10003 = Ref.h(447854232501987193L, var12, var13);

      try {
         var10003 = (List)var10003;
      } catch (InvocationTargetException var61) {
         throw var61.getTargetException();
      }

      List var3 = var10003;
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      Iterator var6 = var3.iterator();
      Object var1 = var10002;

      label192:
      while (true) {
         var10002 = var6.hasNext();

         label188:
         while (true) {
            if (var10002 != false) {
               DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)var6.next();
               var68 = var5.add(var7);
               if (var1 != null) {
                  break;
               }

               do {
                  TreeNode var8 = var7.getParent();
                  if (var8 == null) {
                     break;
                  }

                  DefaultMutableTreeNode var9 = (DefaultMutableTreeNode)var8;
                  var10002 = var9;
                  Object var14 = 312919167011526763L;
                  boolean var73 = this.equals((DefaultMutableTreeNode)Ref.g(312919167011526763L, var14));
                  if (var1 != null) {
                     continue label188;
                  }

                  if (var1 == null) {
                     if (var73) {
                        break;
                     }

                     var73 = var5.contains(var9);
                  }

                  if (var1 == null) {
                     if (!var73) {
                        var5.add(var9);
                     }
                  }

                  var7 = (DefaultMutableTreeNode)var8;
               } while (var1 == null);

               if (var1 == null) {
                  continue label192;
               }
            }

            var6 = var5.iterator();
            var68 = var6.hasNext();
            break;
         }

         while (var68) {
            DefaultMutableTreeNode var62 = (DefaultMutableTreeNode)var6.next();
            if (var1 != null) {
               return;
            }

            label201: {
               label202: {
                  boolean var69 = var62.getUserObject().getClass().equals(Ck4.class);
                  if (var1 == null) {
                     if (var69) {
                        Ck4 var63 = (Ck4)var62.getUserObject();
                        var4.add(var63);
                        Registry.emptyArgs();
                        long var16 = 270389152141252877L;
                        Ref.h2(270389152141252877L, var16);
                        Object[] var10004 = Registry.emptyArgs();
                        long var19 = 410905379772103887L;
                        Object[] var18 = var10004;
                        Ref.h(410905379772103887L, var18, var19);
                        Lv4_2 var10006 = (Lv4_2)(Registry.emptyArgs());
                        long var21 = 605430732347023634L;
                        Object[] var20 = var10006;
                        var10006 = Registry.packArgs(Ref.h(605430732347023634L, var20, var21));
                        long var23 = 489768706953623433L;
                        Object[] var22 = var10006;
                        var10006 = Ref.h(489768706953623433L, var22, var23);

                        try {
                           var10006 = (Lv4_2)var10006;
                        } catch (InvocationTargetException var60) {
                           throw var60.getTargetException();
                        }

                        Lv4_2 var65 = var10006;
                        Registry.packArgs(var65);
                        long var24 = 366543685241882690L;
                        Object var10007 = Ref.h2(366543685241882690L, var24);

                        try {
                           var80 = (Boolean)var10007;
                        } catch (InvocationTargetException var59) {
                           throw var59.getTargetException();
                        }

                        if (var80) {
                           Registry.emptyArgs();
                           long var26 = 270389152141252877L;
                           Ref.h2(270389152141252877L, var26);
                           Object[] var10009 = Registry.emptyArgs();
                           long var29 = 410905379772103887L;
                           Object[] var28 = var10009;
                           Ref.h(410905379772103887L, var28, var29);
                           Object[] var10011 = Registry.emptyArgs();
                           long var31 = 605430732347023634L;
                           Object[] var30 = var10011;
                           var10011 = Registry.packArgs(Ref.h(605430732347023634L, var30, var31));
                           long var33 = 373726052298989731L;
                           Object[] var32 = var10011;
                           Ref.h(373726052298989731L, var32, var33);

                           try {
                              ;
                           } catch (InvocationTargetException var58) {
                              throw var58.getTargetException();
                           }
                        }

                        if (var1 == null) {
                           break label201;
                        }
                     }

                     var10002 = var62.getUserObject().getClass();
                     if (var1 != null) {
                        break label202;
                     }

                     var69 = var10002.equals(Tf4.class);
                  }

                  if (!var69) {
                     break label201;
                  }

                  var10002 = var62.getUserObject();
               }

               Tf4 var64 = (Tf4)var10002;
               var10003 = Registry.emptyArgs();
               long var35 = 498856411508641826L;
               Object[] var34 = var10003;
               var10003 = Ref.h(498856411508641826L, var34, var35);

               try {
                  var10003 = (String)var10003;
               } catch (InvocationTargetException var57) {
                  throw var57.getTargetException();
               }

               if (!var10003.equals(new java.io.File((String)Registry.lookupField(478301022169899080L).get(null)).getAbsolutePath())) {
                  Registry.emptyArgs();
                  long var36 = 270389152141252877L;
                  Ref.h2(270389152141252877L, var36);
                  Object[] var10005 = Registry.emptyArgs();
                  long var39 = 410905379772103887L;
                  Object[] var38 = var10005;
                  Ref.h(410905379772103887L, var38, var39);
                  LO3 var81 = (LO3)(Registry.emptyArgs());
                  long var41 = 179612178163941306L;
                  Object[] var40 = var81;
                  var81 = Registry.packArgs(Ref.h(179612178163941306L, var40, var41));
                  long var43 = 133273064107181210L;
                  Object[] var42 = var81;
                  var81 = Ref.h(133273064107181210L, var42, var43);

                  try {
                     var81 = (LO3)var81;
                  } catch (InvocationTargetException var56) {
                     throw var56.getTargetException();
                  }

                  LO3 var66 = var81;
                  Registry.packArgs(var66);
                  long var44 = 366543685241882690L;
                  Object var10008 = Ref.h2(366543685241882690L, var44);

                  try {
                     var85 = (Boolean)var10008;
                  } catch (InvocationTargetException var55) {
                     throw var55.getTargetException();
                  }

                  if (var85) {
                     Registry.emptyArgs();
                     long var46 = 270389152141252877L;
                     Ref.h2(270389152141252877L, var46);
                     Object[] var10010 = Registry.emptyArgs();
                     long var49 = 410905379772103887L;
                     Object[] var48 = var10010;
                     Ref.h(410905379772103887L, var48, var49);
                     Object[] var10012 = Registry.emptyArgs();
                     long var51 = 498856411508641826L;
                     Object[] var50 = var10012;
                     var10012 = Registry.packArgs(Ref.h(498856411508641826L, var50, var51));
                     long var53 = 251878287014406503L;
                     Object[] var52 = var10012;
                     Ref.h(251878287014406503L, var52, var53);

                     try {
                        ;
                     } catch (InvocationTargetException var54) {
                        throw var54.getTargetException();
                     }
                  }
               }
            }

            if (var1 != null) {
               break;
            }

            var68 = var6.hasNext();
         }

         this.repaint();
         return;
      }
   }

   public void d() {
      new File2();
      AA.z();
      Object var8 = 593306439561595691L;
      Object var10002 = Ref.g(593306439561595691L, var8);
      List var10003 = (List)(Registry.emptyArgs());
      long var11 = 447854232501987193L;
      Object[] var10 = var10003;
      var10003 = Ref.h(447854232501987193L, var10, var11);

      try {
         var10003 = (List)var10003;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      List var3 = var10003;
      Object var1 = var10002;
      ArrayList var4 = new ArrayList();

      for (DefaultMutableTreeNode var6 : var3) {
         label89: {
            label90: {
               boolean var35 = var6.getUserObject().getClass().equals(Ck4.class);
               if (var1 == null) {
                  if (var35) {
                     Ck4 var7 = (Ck4)var6.getUserObject();
                     var4.add(var7);
                     Registry.emptyArgs();
                     long var12 = 270389152141252877L;
                     Ref.h2(270389152141252877L, var12);
                     Object[] var10004 = Registry.emptyArgs();
                     long var15 = 410905379772103887L;
                     Object[] var14 = var10004;
                     Ref.h(410905379772103887L, var14, var15);
                     Object[] var10006 = Registry.emptyArgs();
                     long var17 = 605430732347023634L;
                     Object[] var16 = var10006;
                     var10006 = Registry.packArgs(Ref.h(605430732347023634L, var16, var17));
                     long var19 = 541791179729053061L;
                     Object[] var18 = var10006;
                     Ref.h(541791179729053061L, var18, var19);

                     try {
                        ;
                     } catch (InvocationTargetException var32) {
                        throw var32.getTargetException();
                     }

                     if (var1 == null) {
                        break label89;
                     }
                  }

                  var10002 = var6.getUserObject().getClass();
                  if (var1 != null) {
                     break label90;
                  }

                  var35 = var10002.equals(Tf4.class);
               }

               if (!var35) {
                  break label89;
               }

               var10002 = var6.getUserObject();
            }

            Tf4 var34 = (Tf4)var10002;
            var10003 = Registry.emptyArgs();
            long var21 = 498856411508641826L;
            Object[] var20 = var10003;
            var10003 = Ref.h(498856411508641826L, var20, var21);

            try {
               var10003 = (String)var10003;
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }

            if (!var10003.equals(new java.io.File((String)Registry.lookupField(478301022169899080L).get(null)).getAbsolutePath())) {
               Registry.emptyArgs();
               long var22 = 270389152141252877L;
               Ref.h2(270389152141252877L, var22);
               Object[] var10005 = Registry.emptyArgs();
               long var25 = 410905379772103887L;
               Object[] var24 = var10005;
               Ref.h(410905379772103887L, var24, var25);
               Object[] var10007 = Registry.emptyArgs();
               long var27 = 498856411508641826L;
               Object[] var26 = var10007;
               var10007 = Registry.packArgs(Ref.h(498856411508641826L, var26, var27));
               long var29 = 271495086509363259L;
               Object[] var28 = var10007;
               Ref.h(271495086509363259L, var28, var29);

               try {
                  ;
               } catch (InvocationTargetException var30) {
                  throw var30.getTargetException();
               }
            }
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public D62_2 n(boolean var1) {
      AA.z();
      Registry.lookupField(420994829726907422L).setBoolean(this, var1);
      D62_2 var3 = new D62_2();
      new File2();
      Object var10 = 593306439561595691L;
      Object var10002 = Ref.g(593306439561595691L, var10);
      List var10003 = (List)(Registry.emptyArgs());
      long var13 = 447854232501987193L;
      Object[] var12 = var10003;
      var10003 = Ref.h(447854232501987193L, var12, var13);

      try {
         var10003 = (List)var10003;
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      List var5 = var10003;
      Object var2 = var10002;
      ArrayList var6 = new ArrayList();

      for (DefaultMutableTreeNode var8 : var5) {
         label47: {
            boolean var21 = var8.getUserObject().getClass().equals(Ck4.class);
            if (var2 == null) {
               if (var21) {
                  Ck4 var9 = (Ck4)var8.getUserObject();
                  var6.add(var9);
                  var10003 = Registry.emptyArgs();
                  long var15 = 442657485924266205L;
                  Object[] var14 = var10003;
                  Ref.h(442657485924266205L, var14, var15);

                  try {
                     ;
                  } catch (InvocationTargetException var19) {
                     throw var19.getTargetException();
                  }

                  String var10005 = (String)(Registry.emptyArgs());
                  long var17 = 605430732347023634L;
                  Object[] var16 = var10005;
                  var10005 = Ref.h(605430732347023634L, var16, var17);

                  try {
                     var10005 = (String)var10005;
                  } catch (InvocationTargetException var18) {
                     throw var18.getTargetException();
                  }

                  var9.add(var10005);
                  if (var2 == null) {
                     break label47;
                  }
               }

               var21 = var8.getUserObject().getClass().equals(Tf4.class);
            }

            if (var21) {
            }
         }

         if (var2 != null) {
            break;
         }
      }

      return var3;
   }

   public boolean X() {
      String var10000 = AA.z();
      new File2();
      String var1 = var10000;
      Object var8 = 593306439561595691L;
      Ref.g(593306439561595691L, var8);
      List var10002 = (List)(Registry.emptyArgs());
      long var11 = 447854232501987193L;
      Object[] var10 = var10002;
      var10002 = Ref.h(447854232501987193L, var10, var11);

      try {
         var10002 = (List)var10002;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      List var3 = var10002;
      new ArrayList();
      boolean var5 = false;
      Iterator var6 = var3.iterator();

      while (true) {
         label36:
         if (var6.hasNext()) {
            DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)var6.next();
            var15 = var7.getUserObject().getClass().equals(Ck4.class);
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               if (var15) {
                  var5 = true;
                  if (var1 == null) {
                     break label36;
                  }
               }

               var15 = var7.getUserObject().getClass().equals(Tf4.class);
            }

            if (var15) {
            }

            if (var1 == null) {
      TM var15;
      TM var15;
               continue;
            }
         }

         var15 = var5;
         break;
      }

      return var15;
   }

   public void Y(boolean param1) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 003: ldc2_w 270389152141252877
      // 006: astore 24
      // 008: ldc2_w 270389152141252877
      // 00b: aload 24
      // 00d: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 010: goto 017
      // 013: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 016: athrow
      // 017: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 01a: ldc2_w 306266403902896148
      // 01d: astore 27
      // 01f: astore 26
      // 021: ldc2_w 306266403902896148
      // 024: aload 26
      // 026: aload 27
      // 028: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 02b: checkcast com/finalshell/core/U62
      // 02e: goto 035
      // 031: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 034: athrow
      // 035: astore 3
      // 036: invokestatic com/finalshell/ui/panel/AA.z ()Ljava/lang/String;
      // 039: aload 3
      // 03a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 03d: ldc2_w 568345952398155457
      // 040: astore 29
      // 042: astore 28
      // 044: ldc2_w 568345952398155457
      // 047: aload 28
      // 049: aload 29
      // 04b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 04e: checkcast java/lang/String
      // 051: goto 058
      // 054: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 057: athrow
      // 058: astore 4
      // 05a: aload 0
      // 05b: ldc2_w 310302490302373526
      // 05e: astore 30
      // 060: ldc2_w 310302490302373526
      // 063: aload 30
      // 065: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 068: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 06b: ldc2_w 149160680229662748
      // 06e: astore 33
      // 070: astore 32
      // 072: ldc2_w 149160680229662748
      // 075: aload 32
      // 077: aload 33
      // 079: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 07c: checkcast com/finalshell/ui/dialog/KQ
      // 07f: goto 086
      // 082: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 085: athrow
      // 086: astore 5
      // 088: aload 5
      // 08a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 08d: ldc2_w 249886410317960768
      // 090: astore 35
      // 092: astore 34
      // 094: ldc2_w 249886410317960768
      // 097: aload 34
      // 099: aload 35
      // 09b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 09e: checkcast com/finalshell/ui/frame/U
      // 0a1: goto 0a8
      // 0a4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0a7: athrow
      // 0a8: astore 6
      // 0aa: astore 2
      // 0ab: new com/finalshell/ui/dialog/EditDialog2
      // 0ae: dup
      // 0af: ldc2_w 243490669497898236
      // 0b2: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0b5: aconst_null
      // 0b6: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0b9: aload 6
      // 0bb: sipush 11168
      // 0be: sipush -18772
      // 0c1: invokestatic com/finalshell/ui/panel/Connection5.a (II)Ljava/lang/String;
      // 0c4: bipush 0
      // 0c5: invokespecial com/finalshell/ui/dialog/EditDialog2.<init> (ILjava/awt/Window;Ljava/lang/String;Z)V
      // 0c8: astore 7
      // 0ca: aload 2
      // 0cb: ifnonnull 14e
      // 0ce: aload 4
      // 0d0: ifnull 12a
      // 0d3: goto 0da
      // 0d6: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0d9: athrow
      // 0da: aload 4
      // 0dc: ldc2_w 149082991182987426
      // 0df: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 0e2: aconst_null
      // 0e3: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0e6: checkcast java/lang/String
      // 0e9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ec: aload 2
      // 0ed: ifnonnull 171
      // 0f0: goto 0f7
      // 0f3: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0f6: athrow
      // 0f7: ifne 12a
      // 0fa: goto 101
      // 0fd: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 100: athrow
      // 101: aload 7
      // 103: aload 4
      // 105: bipush 1
      // 106: bipush 1
      // 107: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 10a: ldc2_w 206082969888821725
      // 10d: astore 37
      // 10f: astore 36
      // 111: ldc2_w 206082969888821725
      // 114: aload 36
      // 116: aload 37
      // 118: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 11b: pop
      // 11c: goto 123
      // 11f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 122: athrow
      // 123: goto 12a
      // 126: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 129: athrow
      // 12a: aload 7
      // 12c: sipush 30263
      // 12f: ldc2_w 1611283600550907437
      // 132: invokestatic com/finalshell/ui/panel/Connection5.b (IJ)I
      // 135: sipush 30211
      // 138: ldc2_w 2770556333707709976
      // 13b: invokestatic com/finalshell/ui/panel/Connection5.b (IJ)I
      // 13e: invokevirtual com/finalshell/ui/dialog/EditDialog2.setSize (II)V
      // 141: aload 7
      // 143: aload 6
      // 145: invokevirtual com/finalshell/ui/dialog/EditDialog2.setLocationRelativeTo (Ljava/awt/Component;)V
      // 148: aload 7
      // 14a: bipush 1
      // 14b: invokevirtual com/finalshell/ui/dialog/EditDialog2.setVisible (Z)V
      // 14e: aload 7
      // 150: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 153: ldc2_w 418327897845479655
      // 156: astore 39
      // 158: astore 38
      // 15a: ldc2_w 418327897845479655
      // 15d: aload 38
      // 15f: aload 39
      // 161: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 164: checkcast java/lang/Integer
      // 167: invokevirtual java/lang/Integer.intValue ()I
      // 16a: goto 171
      // 16d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 170: athrow
      // 171: istore 8
      // 173: iload 8
      // 175: ldc2_w 564170828581134815
      // 178: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 17b: aconst_null
      // 17c: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 17f: if_icmpne 5f1
      // 182: aload 7
      // 184: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 187: ldc2_w 191095475795927576
      // 18a: astore 41
      // 18c: astore 40
      // 18e: ldc2_w 191095475795927576
      // 191: aload 40
      // 193: aload 41
      // 195: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 198: checkcast java/lang/String
      // 19b: goto 1a2
      // 19e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1a1: athrow
      // 1a2: astore 9
      // 1a4: aload 2
      // 1a5: ifnonnull 20d
      // 1a8: aload 9
      // 1aa: ifnull 5f1
      // 1ad: goto 1b4
      // 1b0: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b3: athrow
      // 1b4: aload 3
      // 1b5: aload 9
      // 1b7: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1ba: ldc2_w 170404728891717875
      // 1bd: astore 43
      // 1bf: astore 42
      // 1c1: ldc2_w 170404728891717875
      // 1c4: aload 42
      // 1c6: aload 43
      // 1c8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1cb: pop
      // 1cc: goto 1d3
      // 1cf: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d2: athrow
      // 1d3: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1d6: ldc2_w 270389152141252877
      // 1d9: astore 44
      // 1db: ldc2_w 270389152141252877
      // 1de: aload 44
      // 1e0: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 1e3: goto 1ea
      // 1e6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1e9: athrow
      // 1ea: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1ed: ldc2_w 578864097947885485
      // 1f0: astore 47
      // 1f2: astore 46
      // 1f4: ldc2_w 578864097947885485
      // 1f7: aload 46
      // 1f9: aload 47
      // 1fb: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1fe: pop
      // 1ff: goto 206
      // 202: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 205: athrow
      // 206: goto 20d
      // 209: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20c: athrow
      // 20d: new com/finalshell/core/File2
      // 210: dup
      // 211: invokespecial com/finalshell/core/File2.<init> ()V
      // 214: astore 10
      // 216: aload 10
      // 218: aload 6
      // 21a: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 21d: ldc2_w 222783555954803141
      // 220: astore 49
      // 222: astore 48
      // 224: ldc2_w 222783555954803141
      // 227: aload 48
      // 229: aload 49
      // 22b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 22e: pop
      // 22f: goto 236
      // 232: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 235: athrow
      // 236: new java/util/ArrayList
      // 239: dup
      // 23a: invokespecial java/util/ArrayList.<init> ()V
      // 23d: astore 11
      // 23f: iload 1
      // 240: aload 2
      // 241: ifnonnull 27d
      // 244: ifne 283
      // 247: goto 24e
      // 24a: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24d: athrow
      // 24e: aload 0
      // 24f: ldc2_w 593306439561595691
      // 252: astore 50
      // 254: ldc2_w 593306439561595691
      // 257: aload 50
      // 259: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 25c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 25f: ldc2_w 447854232501987193
      // 262: astore 53
      // 264: astore 52
      // 266: ldc2_w 447854232501987193
      // 269: aload 52
      // 26b: aload 53
      // 26d: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 270: goto 277
      // 273: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 276: athrow
      // 277: checkcast java/util/ArrayList
      // 27a: astore 11
      // 27c: bipush 0
      // 27d: istore 12
      // 27f: aload 2
      // 280: ifnull 2c2
      // 283: aload 0
      // 284: ldc2_w 213130010239103238
      // 287: astore 54
      // 289: ldc2_w 213130010239103238
      // 28c: aload 54
      // 28e: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 291: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 294: invokevirtual javax/swing/tree/DefaultMutableTreeNode.children ()Ljava/util/Enumeration;
      // 297: astore 12
      // 299: aload 12
      // 29b: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 2a0: ifeq 2c2
      // 2a3: aload 11
      // 2a5: aload 12
      // 2a7: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 2ac: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 2af: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 2b2: pop
      // 2b3: aload 2
      // 2b4: ifnonnull 5f1
      // 2b7: aload 2
      // 2b8: ifnull 299
      // 2bb: goto 2c2
      // 2be: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2c1: athrow
      // 2c2: aload 11
      // 2c4: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 2c7: astore 12
      // 2c9: aload 12
      // 2cb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2d0: ifeq 5f1
      // 2d3: aload 12
      // 2d5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2da: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 2dd: astore 13
      // 2df: aload 13
      // 2e1: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 2e4: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2e7: ldc_w com/finalshell/ui/model/Ck4
      // 2ea: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 2ed: aload 2
      // 2ee: ifnonnull 3d5
      // 2f1: ifeq 3b5
      // 2f4: goto 2fb
      // 2f7: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fa: athrow
      // 2fb: aload 13
      // 2fd: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 300: checkcast com/finalshell/ui/model/Ck4
      // 303: astore 14
      // 305: aload 13
      // 307: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getParent ()Ljavax/swing/tree/TreeNode;
      // 30a: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 30d: astore 15
      // 30f: aload 0
      // 310: aload 15
      // 312: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 315: ldc2_w 475965765537616140
      // 318: astore 57
      // 31a: astore 56
      // 31c: ldc2_w 475965765537616140
      // 31f: aload 56
      // 321: aload 57
      // 323: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 326: checkcast java/lang/String
      // 329: goto 330
      // 32c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 32f: athrow
      // 330: astore 16
      // 332: aload 0
      // 333: aload 13
      // 335: aload 16
      // 337: aload 9
      // 339: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 33c: ldc2_w 574970396159174620
      // 33f: astore 59
      // 341: astore 58
      // 343: ldc2_w 574970396159174620
      // 346: aload 58
      // 348: aload 59
      // 34a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 34d: checkcast java/lang/String
      // 350: goto 357
      // 353: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 356: athrow
      // 357: astore 17
      // 359: aload 10
      // 35b: new java/io/File
      // 35e: dup
      // 35f: aload 14
      // 361: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 364: ldc2_w 605430732347023634
      // 367: astore 61
      // 369: astore 60
      // 36b: ldc2_w 605430732347023634
      // 36e: aload 60
      // 370: aload 61
      // 372: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 375: checkcast java/lang/String
      // 378: goto 37f
      // 37b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 37e: athrow
      // 37f: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 382: new java/io/File
      // 385: dup
      // 386: aload 17
      // 388: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 38b: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 38e: ldc2_w 172839385836868030
      // 391: astore 63
      // 393: astore 62
      // 395: ldc2_w 172839385836868030
      // 398: aload 62
      // 39a: aload 63
      // 39c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 39f: pop
      // 3a0: goto 3a7
      // 3a3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a6: athrow
      // 3a7: goto 3b1
      // 3aa: astore 18
      // 3ac: aload 18
      // 3ae: invokevirtual java/io/IOException.printStackTrace ()V
      // 3b1: aload 2
      // 3b2: ifnull 5ed
      // 3b5: aload 13
      // 3b7: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 3ba: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 3bd: aload 2
      // 3be: ifnonnull 3e4
      // 3c1: goto 3c8
      // 3c4: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3c7: athrow
      // 3c8: ldc_w com/finalshell/ui/model/Tf4
      // 3cb: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 3ce: goto 3d5
      // 3d1: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3d4: athrow
      // 3d5: ifeq 5ed
      // 3d8: aload 13
      // 3da: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 3dd: goto 3e4
      // 3e0: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 3e3: athrow
      // 3e4: checkcast com/finalshell/ui/model/Tf4
      // 3e7: astore 14
      // 3e9: aload 13
      // 3eb: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getParent ()Ljavax/swing/tree/TreeNode;
      // 3ee: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 3f1: astore 15
      // 3f3: aload 0
      // 3f4: aload 15
      // 3f6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3f9: ldc2_w 475965765537616140
      // 3fc: astore 65
      // 3fe: astore 64
      // 400: ldc2_w 475965765537616140
      // 403: aload 64
      // 405: aload 65
      // 407: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 40a: checkcast java/lang/String
      // 40d: goto 414
      // 410: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 413: athrow
      // 414: astore 16
      // 416: new java/util/ArrayList
      // 419: dup
      // 41a: invokespecial java/util/ArrayList.<init> ()V
      // 41d: astore 17
      // 41f: new java/util/ArrayList
      // 422: dup
      // 423: invokespecial java/util/ArrayList.<init> ()V
      // 426: astore 18
      // 428: aload 0
      // 429: aload 13
      // 42b: aload 17
      // 42d: aload 18
      // 42f: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 432: ldc2_w 231525833342023300
      // 435: astore 67
      // 437: astore 66
      // 439: ldc2_w 231525833342023300
      // 43c: aload 66
      // 43e: aload 67
      // 440: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 443: pop
      // 444: goto 44b
      // 447: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 44a: athrow
      // 44b: aload 18
      // 44d: aload 13
      // 44f: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 452: checkcast com/finalshell/ui/model/Tf4
      // 455: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 458: pop
      // 459: aload 18
      // 45b: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 45e: astore 19
      // 460: aload 19
      // 462: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 467: ifeq 510
      // 46a: aload 19
      // 46c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 471: checkcast com/finalshell/ui/model/Tf4
      // 474: astore 20
      // 476: aload 0
      // 477: ldc2_w 604074053920059872
      // 47a: astore 68
      // 47c: ldc2_w 604074053920059872
      // 47f: aload 68
      // 481: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 484: checkcast java/util/HashMap
      // 487: aload 20
      // 489: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 48c: ldc2_w 498856411508641826
      // 48f: astore 71
      // 491: astore 70
      // 493: ldc2_w 498856411508641826
      // 496: aload 70
      // 498: aload 71
      // 49a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 49d: checkcast java/lang/String
      // 4a0: goto 4a7
      // 4a3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4a6: athrow
      // 4a7: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 4aa: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 4ad: astore 21
      // 4af: aload 0
      // 4b0: aload 21
      // 4b2: aload 16
      // 4b4: aload 9
      // 4b6: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 4b9: ldc2_w 574970396159174620
      // 4bc: astore 73
      // 4be: astore 72
      // 4c0: ldc2_w 574970396159174620
      // 4c3: aload 72
      // 4c5: aload 73
      // 4c7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 4ca: checkcast java/lang/String
      // 4cd: goto 4d4
      // 4d0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4d3: athrow
      // 4d4: astore 22
      // 4d6: new java/io/File
      // 4d9: dup
      // 4da: aload 22
      // 4dc: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 4df: astore 23
      // 4e1: aload 23
      // 4e3: invokevirtual java/io/File.exists ()Z
      // 4e6: aload 2
      // 4e7: ifnonnull 51e
      // 4ea: aload 2
      // 4eb: ifnonnull 50b
      // 4ee: goto 4f5
      // 4f1: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4f4: athrow
      // 4f5: ifne 50c
      // 4f8: goto 4ff
      // 4fb: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4fe: athrow
      // 4ff: aload 23
      // 501: invokevirtual java/io/File.mkdirs ()Z
      // 504: goto 50b
      // 507: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 50a: athrow
      // 50b: pop
      // 50c: aload 2
      // 50d: ifnull 460
      // 510: aload 17
      // 512: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 515: astore 19
      // 517: aload 19
      // 519: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 51e: ifeq 5ed
      // 521: aload 19
      // 523: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 528: checkcast com/finalshell/ui/model/Ck4
      // 52b: astore 20
      // 52d: aload 0
      // 52e: ldc2_w 604074053920059872
      // 531: astore 74
      // 533: ldc2_w 604074053920059872
      // 536: aload 74
      // 538: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 53b: checkcast java/util/HashMap
      // 53e: aload 20
      // 540: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 543: ldc2_w 605430732347023634
      // 546: astore 77
      // 548: astore 76
      // 54a: ldc2_w 605430732347023634
      // 54d: aload 76
      // 54f: aload 77
      // 551: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 554: checkcast java/lang/String
      // 557: goto 55e
      // 55a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 55d: athrow
      // 55e: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 561: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 564: astore 21
      // 566: aload 0
      // 567: aload 21
      // 569: aload 16
      // 56b: aload 9
      // 56d: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 570: ldc2_w 574970396159174620
      // 573: astore 79
      // 575: astore 78
      // 577: ldc2_w 574970396159174620
      // 57a: aload 78
      // 57c: aload 79
      // 57e: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 581: checkcast java/lang/String
      // 584: goto 58b
      // 587: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 58a: athrow
      // 58b: astore 22
      // 58d: aload 10
      // 58f: new java/io/File
      // 592: dup
      // 593: aload 20
      // 595: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 598: ldc2_w 605430732347023634
      // 59b: astore 81
      // 59d: astore 80
      // 59f: ldc2_w 605430732347023634
      // 5a2: aload 80
      // 5a4: aload 81
      // 5a6: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5a9: checkcast java/lang/String
      // 5ac: goto 5b3
      // 5af: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5b2: athrow
      // 5b3: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 5b6: new java/io/File
      // 5b9: dup
      // 5ba: aload 22
      // 5bc: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 5bf: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 5c2: ldc2_w 172839385836868030
      // 5c5: astore 83
      // 5c7: astore 82
      // 5c9: ldc2_w 172839385836868030
      // 5cc: aload 82
      // 5ce: aload 83
      // 5d0: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 5d3: pop
      // 5d4: goto 5db
      // 5d7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5da: athrow
      // 5db: aload 2
      // 5dc: ifnonnull 2c9
      // 5df: goto 5e9
      // 5e2: astore 23
      // 5e4: aload 23
      // 5e6: invokevirtual java/io/IOException.printStackTrace ()V
      // 5e9: aload 2
      // 5ea: ifnull 517
      // 5ed: aload 2
      // 5ee: ifnull 2c9
      // 5f1: return
   }

   void a(DefaultMutableTreeNode var1, ArrayList var2, ArrayList var3) {
      String var10000 = AA.z();
      int var5 = 0;
      String var4 = var10000;

      while (var5 < var1.getChildCount()) {
         label39: {
            label47: {
               DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)var1.getChildAt(var5);
               boolean var12 = var6.getUserObject().getClass().equals(Tf4.class);
               if (var4 == null) {
                  if (var12) {
                     Tf4 var7 = (Tf4)var6.getUserObject();
                     var3.add(var7);
                     Object[] var10001 = Registry.packArgs(var6, var2, var3);
                     long var9 = 231525833342023300L;
                     Object[] var8 = var10001;
                     Ref.h(231525833342023300L, var8, var9);

                     try {
                        ;
                     } catch (InvocationTargetException var10) {
                        throw var10.getTargetException();
                     }

                     if (var4 == null) {
                        break label39;
                     }
                  }

                  var10000 = var6.getUserObject().getClass();
                  if (var4 != null) {
                     break label47;
                  }

                  var12 = var10000.equals(Ck4.class);
               }

               if (!var12) {
                  break label39;
               }

               var10000 = (String)var6.getUserObject();
            }

            Ck4 var11 = (Ck4)var10000;
            var2.add(var11);
         }

         var5++;
         if (var4 != null) {
            break;
         }
      }
   }

   public String c(DefaultMutableTreeNode var1) {
      String var2;
      Object var3;
      label159: {
         Object var58;
         label160: {
            var58 = AA.z();
            var3 = null;
            var2 = (String)var58;
            Object var4 = null;
            boolean var57 = var1.getUserObject().getClass().equals(Ck4.class);
            if (var2 == null) {
               if (var57) {
                  Ck4 var53 = (Ck4)var1.getUserObject();
                  Registry.emptyArgs();
                  long var9 = 270389152141252877L;
                  Ref.h2(270389152141252877L, var9);
                  Object[] var66 = Registry.emptyArgs();
                  long var12 = 410905379772103887L;
                  Object[] var11 = var66;
                  Ref.h(410905379772103887L, var11, var12);
                  Object[] var10004 = Registry.emptyArgs();
                  long var14 = 605430732347023634L;
                  Object[] var13 = var10004;
                  var10004 = Registry.packArgs(Ref.h(605430732347023634L, var13, var14));
                  long var16 = 489768706953623433L;
                  Object[] var15 = var10004;
                  var10004 = Ref.h(489768706953623433L, var15, var16);

                  try {
                     var10004 = (Lv4_2)var10004;
                  } catch (InvocationTargetException var51) {
                     throw var51.getTargetException();
                  }

                  Lv4_2 var6 = var10004;
                  new StringBuilder();
                  Object[] var78 = Registry.emptyArgs();
                  long var18 = 286931176286176762L;
                  Object[] var17 = var78;
                  var78 = Ref.h(286931176286176762L, var17, var18);

                  try {
                     var78 = (String)var78;
                  } catch (InvocationTargetException var50) {
                     throw var50.getTargetException();
                  }

                  var3 = var6.append((String)var78).append(a(11178, -20119)).toString();
                  break label159;
               }

               var58 = var1.getUserObject().getClass();
               if (var2 != null) {
                  break label160;
               }

               var57 = var58.equals(Tf4.class);
            }

            if (!var57) {
               break label159;
            }

            var58 = var1.getUserObject();
         }

         Tf4 var5 = (Tf4)var58;
         Object[] var10001 = Registry.emptyArgs();
         long var20 = 498856411508641826L;
         Object[] var19 = var10001;
         var10001 = Ref.h(498856411508641826L, var19, var20);

         try {
            var10001 = (String)var10001;
         } catch (InvocationTargetException var49) {
            throw var49.getTargetException();
         }

         if (var2 == null) {
            if (!var10001.equals((String)Registry.lookupField(478301022169899080L).get(null))) {
               Registry.emptyArgs();
               long var23 = 270389152141252877L;
               Ref.h2(270389152141252877L, var23);
               Object[] var10003 = Registry.emptyArgs();
               long var26 = 410905379772103887L;
               Object[] var25 = var10003;
               Ref.h(410905379772103887L, var25, var26);
               Object[] var10005 = Registry.emptyArgs();
               long var28 = 179612178163941306L;
               Object[] var27 = var10005;
               var10005 = Registry.packArgs(Ref.h(179612178163941306L, var27, var28));
               long var30 = 133273064107181210L;
               Object[] var29 = var10005;
               Ref.h(133273064107181210L, var29, var30);

               try {
                  ;
               } catch (InvocationTargetException var47) {
                  throw var47.getTargetException();
               }

               Object[] var10006 = Registry.emptyArgs();
               long var32 = 286931176286176762L;
               Object[] var31 = var10006;
               var10006 = Ref.h(286931176286176762L, var31, var32);

               try {
                  var10006 = (String)var10006;
               } catch (InvocationTargetException var46) {
                  throw var46.getTargetException();
               }

               var3 = var10006;
               break label159;
            }

            var10001 = var5;
            Object[] var10002 = Registry.emptyArgs();
            long var22 = 179612178163941306L;
            Object[] var21 = var10002;
            Ref.h(179612178163941306L, var21, var22);

            try {
               ;
            } catch (InvocationTargetException var48) {
               throw var48.getTargetException();
            }
         }

         var3 = var10001;
      }

      DefaultMutableTreeNode var52;
      while ((var52 = (DefaultMutableTreeNode)var1.getParent()) != null) {
         DefaultMutableTreeNode var59 = var52;
         if (var2 == null) {
            if (var52.getUserObject() instanceof Tf4) {
               Tf4 var54 = (Tf4)var52.getUserObject();
               java.io.File var62 = Registry.emptyArgs();
               long var34 = 543633160597441792L;
               Object[] var33 = var62;
               var62 = Ref.h(543633160597441792L, var33, var34);

               try {
                  var62 = (java.io.File)var62;
               } catch (InvocationTargetException var45) {
                  throw var45.getTargetException();
               }

               String var56;
               label131: {
                  String var55 = var62.getName();
                  var56 = null;
                  String var65 = var55;
                  if (var2 == null) {
                     if (!var55.equals(a(11176, 23966))) {
                        Registry.emptyArgs();
                        long var35 = 270389152141252877L;
                        Ref.h2(270389152141252877L, var35);
                        Object[] var67 = Registry.emptyArgs();
                        long var38 = 410905379772103887L;
                        Object[] var37 = var67;
                        Ref.h(410905379772103887L, var37, var38);
                        Object[] var71 = Registry.packArgs(var55);
                        long var40 = 133273064107181210L;
                        Object[] var39 = var71;
                        Ref.h(133273064107181210L, var39, var40);

                        try {
                           ;
                        } catch (InvocationTargetException var44) {
                           throw var44.getTargetException();
                        }

                        Object[] var73 = Registry.emptyArgs();
                        long var42 = 286931176286176762L;
                        Object[] var41 = var73;
                        var73 = Ref.h(286931176286176762L, var41, var42);

                        try {
                           var73 = (String)var73;
                        } catch (InvocationTargetException var43) {
                           throw var43.getTargetException();
                        }

                        var56 = var73;
                        break label131;
                     }

                     var65 = var55;
                  }

                  var56 = var65;
               }

               var3 = var56 + java.io.File.separator + var3;
            }

            var59 = var52;
         }

         var1 = var59;
         if (var2 != null) {
            break;
         }
      }

      return (String)var3;
   }

   public String H(DefaultMutableTreeNode var1, String var2, String var3) {
      String var4 = null;
      Object[] var10001 = Registry.packArgs(var1);
      long var6 = 475965765537616140L;
      Object[] var5 = var10001;
      var10001 = Ref.h(475965765537616140L, var5, var6);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var4 = var10001;
      var4 = var4.substring(var2.length() + 1);
      return var3 + java.io.File.separator + var4;
   }

   void h(DefaultMutableTreeNode var1, ArrayList var2) {
      String var10000 = AA.z();
      int var4 = 0;
      String var3 = var10000;

      while (var4 < var1.getChildCount()) {
         label39: {
            label47: {
               DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var1.getChildAt(var4);
               boolean var10 = var5.getUserObject().getClass().equals(Tf4.class);
               if (var3 == null) {
                  if (var10) {
                     Object[] var10001 = Registry.packArgs(var5, var2);
                     long var8 = 363671406087219533L;
                     Object[] var7 = var10001;
                     Ref.h(363671406087219533L, var7, var8);

                     try {
                        ;
                     } catch (InvocationTargetException var9) {
                        throw var9.getTargetException();
                     }

                     if (var3 == null) {
                        break label39;
                     }
                  }

                  var10000 = var5.getUserObject().getClass();
                  if (var3 != null) {
                     break label47;
                  }

                  var10 = var10000.equals(Ck4.class);
               }

               if (!var10) {
                  break label39;
               }

               var10000 = (String)var5.getUserObject();
            }

            Ck4 var6 = (Ck4)var10000;
            var2.add(var6);
         }

         var4++;
         if (var3 != null) {
            break;
         }
      }
   }

   public int U(Point var1) {
      Object[] var10001 = Registry.packArgs(var1, true);
      long var3 = 288802925847106722L;
      Object[] var2 = var10001;
      var10001 = Ref.h(288802925847106722L, var2, var3);

      try {
         return (Integer)var10001;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public int P(Point var1, boolean var2) {
      String var3 = AA.z();
      Object var6 = 593306439561595691L;
      if ((Connection5)Ref.g(593306439561595691L, var6) != null) {
         int var4 = 0;

         do {
            Object var8 = 593306439561595691L;
            if (!(this < ((Connection5)Ref.g(593306439561595691L, var8)).getRowCount())) {
               break;
            }

            Object[] var10003 = Registry.packArgs(var4, var2);
            long var11 = 261109182212811950L;
            Object[] var10 = var10003;
            var10003 = Ref.h(261109182212811950L, var10, var11);

            try {
               var10003 = (Rectangle)var10003;
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            Rectangle var5 = var10003;
            if (var3 == null) {
               boolean var15 = var5.contains(var1);
               if (var3 != null) {
                  return var4;
               }

               if (var15) {
                  return var4;
               }

               var4++;
            }
         } while (var3 == null);
      }

      return -1;
   }

   public Rectangle F(int var1, boolean var2) {
      Rectangle var9;
      if (var2) {
         Object[] var10001 = Registry.packArgs(var1);
         long var4 = 118140723583981003L;
         Object[] var3 = var10001;
         Object var8 = Ref.h(118140723583981003L, var3, var4);

         try {
            var9 = (Rectangle)var8;
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }
      } else {
         Object var5 = 593306439561595691L;
         var9 = ((Connection5)Ref.g(593306439561595691L, var5)).getRowBounds(var1);
      }

      return var9;
   }

   public Rectangle G(DefaultMutableTreeNode var1) {
      Object[] var10002 = Registry.packArgs(var1);
      long var3 = 243179421387863563L;
      Object[] var2 = var10002;
      var10002 = Ref.h(243179421387863563L, var2, var3);

      try {
         var9 = (Integer)var10002;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var10002 = Registry.packArgs(var9);
      long var5 = 118140723583981003L;
      Object[] var4 = var10002;
      var10002 = Ref.h(118140723583981003L, var4, var5);

      try {
         return (Rectangle)var10002;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public int I(DefaultMutableTreeNode var1) {
      Object[] var10002 = Registry.packArgs(var1);
      long var3 = 263865946362642439L;
      Object[] var2 = var10002;
      var10002 = Ref.h(263865946362642439L, var2, var3);

      try {
         var10002 = (TreePath)var10002;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      return this.getRowForPath(var10002);
   }

   public Rectangle g(int var1) {
      AA.z();
      Object var5 = 593306439561595691L;
      Rectangle var3 = ((Connection5)Ref.g(593306439561595691L, var5)).getRowBounds(var1);
      Rectangle var10001 = var3;
      if (this == null) {
         if (var3 != null) {
            Object var7 = 593306439561595691L;
            Insets var4 = ((Connection5)Ref.g(593306439561595691L, var7)).getInsets();
            var3.x = var4.left;
            Object var9 = 593306439561595691L;
            super.width = ((Connection5)Ref.g(593306439561595691L, var9)).getWidth() - var4.left - var4.right;
         }

         var10001 = var3;
      }

      return var10001;
   }

   public As2 p$as_2() {
      Object var1 = 624888273314831754L;
      return (As2)Ref.g(624888273314831754L, var1);
   }

   public void b(As2 var1) {
      long var3 = 624888273314831754L;
      Ref.s(624888273314831754L, var1, var3);
   }

   public void M() {
      Object var1 = 213130010239103238L;
      Object[] var10002 = Registry.packArgs(Ref.g(213130010239103238L, var1));
      long var4 = 592526597199428069L;
      Object[] var3 = var10002;
      Ref.h(592526597199428069L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   @Override
   public void A(DefaultMutableTreeNode var1) {
      Object[] var10001 = Registry.packArgs(var1);
      long var4 = 263865946362642439L;
      Object[] var3 = var10001;
      var10001 = Ref.h(263865946362642439L, var3, var4);

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

   public DefaultMutableTreeNode r(String var1) {
      Object var2 = 604074053920059872L;
      return (DefaultMutableTreeNode)((HashMap)Ref.g(604074053920059872L, var2)).get(var1);
   }

   public void A(String var1, int var2) {
      Object var5;
      label38: {
         AA.z();
         String var4 = new java.io.File(var1).getParentFile().getAbsolutePath();
         Object var8 = 604074053920059872L;
         var5 = (DefaultMutableTreeNode)((HashMap)Ref.g(604074053920059872L, var8)).get(var4);
         Object var10001 = var5;
         if (this == null) {
            if (var5 != null) {
               break label38;
            }

            var10001 = this;
            Object[] var10002 = Registry.packArgs(var4, 0);
            long var11 = 295612812222941676L;
            Object[] var10 = var10002;
            Ref.h(295612812222941676L, var10, var11);

            try {
               ;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }

            Object var12 = 604074053920059872L;
            DefaultMutableTreeNode var10003 = (DefaultMutableTreeNode)((HashMap)Ref.g(604074053920059872L, var12)).get(var4);
         }

         var5 = var10001;
      }

      Ck4 var6 = new Ck4(new java.io.File(var1));
      Registry.packArgs(var6);
      long var14 = 336419247910974761L;
      Ref.h2(336419247910974761L, var14);

      try {
         ;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      DefaultMutableTreeNode var7 = new DefaultMutableTreeNode(var6);
      Object var16 = 604074053920059872L;
      ((HashMap)Ref.g(604074053920059872L, var16)).put(var1, var7);
      Object var18 = 571388131590801605L;
      ((Yo4)Ref.g(571388131590801605L, var18)).insertNodeInto(var7, (MutableTreeNode)var5, var2);
      Object[] var10005 = Registry.packArgs(var7);
      long var21 = 592526597199428069L;
      Object[] var20 = var10005;
      Ref.h(592526597199428069L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      SwingUtilities.invokeLater(new Mb2(this, var7));
   }

   public void q(String var1) {
      AA.z();
      Object var4 = 593306439561595691L;
      Connection5 var10002 = (Connection5)Ref.g(593306439561595691L, var4);
      Object[] var10003 = Registry.packArgs(var1);
      long var7 = 509874190727776741L;
      Object[] var6 = var10003;
      var10003 = Ref.h(509874190727776741L, var6, var7);

      try {
         var10003 = (DefaultMutableTreeNode)var10003;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      DefaultMutableTreeNode var3 = var10003;
      Object var2 = var10002;
      var10002 = this;
      if (var2 == null) {
         if (Registry.lookupField(557374830394047111L).getBoolean(this)) {
            var10002 = var3;
            if (var2 == null) {
               if (var3 == null) {
                  return;
               }

               var10002 = var3.getParent();
            }

            if (var10002 == null) {
               return;
            }

            Object var8 = 571388131590801605L;
            ((Yo4)Ref.g(571388131590801605L, var8)).removeNodeFromParent(var3);
            if (var2 == null) {
               return;
            }
         }

         var10002 = this;
      }

      var10002.repaint();
   }

   public void W(String var1) {
      String var2 = AA.z();
      Connection5 var10000 = this;
      if (var2 == null) {
         if (Registry.lookupField(557374830394047111L).getBoolean(this)) {
            Object var4 = 593306439561595691L;
            Ref.g(593306439561595691L, var4);
            Object[] var10002 = Registry.packArgs(var1);
            long var7 = 509874190727776741L;
            Object[] var6 = var10002;
            var10002 = Ref.h(509874190727776741L, var6, var7);

            try {
               var10002 = (DefaultMutableTreeNode)var10002;
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            label33: {
               DefaultMutableTreeNode var3 = var10002;
               var10002 = var3;
               if (var2 == null) {
                  if (var3 == null) {
                     break label33;
                  }

                  var10002 = var3.getParent();
               }

               if (var10002 != null) {
                  Object var8 = 571388131590801605L;
                  ((Yo4)Ref.g(571388131590801605L, var8)).removeNodeFromParent(var3);
               }
            }

            if (var2 == null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.repaint();
   }

   public Tf4 j(String var1, String var2, boolean var3) {
      Tf4 var4 = null;
      Object var6 = 604074053920059872L;
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)Ref.g(604074053920059872L, var6)).get(var1);
      Object var8 = 604074053920059872L;
      ((HashMap)Ref.g(604074053920059872L, var8)).remove(var1);
      Object var10 = 604074053920059872L;
      ((HashMap)Ref.g(604074053920059872L, var10)).put(var2, var5);
      var4 = new Tf4(new java.io.File(var2));
      var5.setUserObject(var4);
      Object var12 = 571388131590801605L;
      ((Yo4)Ref.g(571388131590801605L, var12)).nodeChanged(var5);
      Object[] var10005 = Registry.packArgs(var5, var2, var1);
      long var15 = 367427149268021673L;
      Object[] var14 = var10005;
      Ref.h(367427149268021673L, var14, var15);

      try {
         return var4;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }

   public void j(String var1) {
      AA.z();
      Object var4 = 604074053920059872L;
      DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)((HashMap)Ref.g(604074053920059872L, var4)).get(var1);
      if (this != null) {
         Object[] var12 = Registry.packArgs(var3);
         long var9 = 592526597199428069L;
         Object[] var8 = var12;
         Ref.h(592526597199428069L, var8, var9);

         try {
            ;
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }
      } else if (var3 != null) {
         Object[] var10002 = Registry.packArgs((DefaultMutableTreeNode)var3.getParent());
         long var7 = 276002133797788160L;
         Object[] var6 = var10002;
         Ref.h(276002133797788160L, var6, var7);

         label20:
         try {
            break label20;
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }
      }
   }

   public Ck4 x(String var1, String var2, boolean var3) {
      Ck4 var4 = null;
      Object var6 = 604074053920059872L;
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)Ref.g(604074053920059872L, var6)).get(var1);
      Object var8 = 604074053920059872L;
      ((HashMap)Ref.g(604074053920059872L, var8)).remove(var1);
      Object var10 = 604074053920059872L;
      ((HashMap)Ref.g(604074053920059872L, var10)).put(var2, var5);
      var4 = new Ck4(new java.io.File(var2));
      Registry.packArgs(var4);
      long var12 = 336419247910974761L;
      Ref.h2(336419247910974761L, var12);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      var5.setUserObject(var4);
      Object var14 = 571388131590801605L;
      ((Yo4)Ref.g(571388131590801605L, var14)).nodeChanged(var5);
      return var4;
   }

   void V(DefaultMutableTreeNode var1, String var2, String var3) {
      String var10000 = AA.z();
      int var5 = 0;
      String var4 = var10000;

      while (var5 < var1.getChildCount()) {
         DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)var1.getChildAt(var5);
         Object[] var10001 = Registry.packArgs(var6, var2, var3);
         long var8 = 197935296004442692L;
         Object[] var7 = var10001;
         Ref.h(197935296004442692L, var7, var8);

         try {
            ;
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         var5++;
         if (var4 != null) {
            break;
         }
      }
   }

   void J(DefaultMutableTreeNode var1, String var2, String var3) {
      Object var52;
      label111: {
         var52 = AA.z();
         Object var5 = var1.getUserObject();
         String var4 = (String)var52;
         boolean var51 = var5.getClass().equals(Tf4.class);
         if (var4 == null) {
            if (var51) {
               Tf4 var6 = (Tf4)var5;
               Object[] var10001 = Registry.emptyArgs();
               long var12 = 498856411508641826L;
               Object[] var11 = var10001;
               var10001 = Ref.h(498856411508641826L, var11, var12);

               try {
                  var10001 = (String)var10001;
               } catch (InvocationTargetException var46) {
                  throw var46.getTargetException();
               }

               String var7 = var10001;
               String var8 = var2 + var7.substring(var3.length());
               Object[] var10002 = Registry.packArgs(var8);
               long var14 = 309720334529505891L;
               Object[] var13 = var10002;
               Ref.h(309720334529505891L, var13, var14);

               try {
                  ;
               } catch (InvocationTargetException var45) {
                  throw var45.getTargetException();
               }

               Object[] var10003 = Registry.packArgs(new java.io.File(var8));
               long var16 = 349593801287953443L;
               Object[] var15 = var10003;
               Ref.h(349593801287953443L, var15, var16);

               try {
                  ;
               } catch (InvocationTargetException var44) {
                  throw var44.getTargetException();
               }

               Object var17 = 604074053920059872L;
               ((HashMap)Ref.g(604074053920059872L, var17)).remove(var7);
               Object var19 = 604074053920059872L;
               ((HashMap)Ref.g(604074053920059872L, var19)).put(var8, var1);
               int var9 = 0;

               while (var9 < var1.getChildCount()) {
                  DefaultMutableTreeNode var10 = (DefaultMutableTreeNode)var1.getChildAt(var9);
                  Object[] var10006 = Registry.packArgs(var10, var2, var3);
                  long var22 = 197935296004442692L;
                  Object[] var21 = var10006;
                  Ref.h(197935296004442692L, var21, var22);

                  try {
                     ;
                  } catch (InvocationTargetException var43) {
                     throw var43.getTargetException();
                  }

                  var9++;
                  if (var4 != null) {
                     return;
                  }

                  if (var4 != null) {
                     break;
                  }
               }

               if (var4 == null) {
                  return;
               }
            }

            var52 = var5.getClass();
            if (var4 != null) {
               break label111;
            }

            var51 = var52.equals(Ck4.class);
         }

         if (!var51) {
            return;
         }

         var52 = var5;
      }

      Ck4 var47 = (Ck4)var52;
      Object[] var55 = Registry.emptyArgs();
      long var24 = 605430732347023634L;
      Object[] var23 = var55;
      var55 = Ref.h(605430732347023634L, var23, var24);

      try {
         var55 = (String)var55;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      String var48 = var55;
      var48 = var2 + var48.substring(var3.length());
      Object[] var58 = Registry.packArgs(var48);
      long var26 = 584136914483294074L;
      Object[] var25 = var58;
      Ref.h(584136914483294074L, var25, var26);

      try {
         ;
      } catch (InvocationTargetException var41) {
         throw var41.getTargetException();
      }

      Object[] var59 = Registry.packArgs(new java.io.File(var48));
      long var28 = 325634526741383265L;
      Object[] var27 = var59;
      Ref.h(325634526741383265L, var27, var28);

      try {
         ;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      Object var29 = 604074053920059872L;
      ((HashMap)Ref.g(604074053920059872L, var29)).remove(var48);
      Object var31 = 604074053920059872L;
      ((HashMap)Ref.g(604074053920059872L, var31)).put(var48, var1);
      Registry.emptyArgs();
      long var33 = 270389152141252877L;
      Ref.h2(270389152141252877L, var33);
      Object[] var10007 = Registry.emptyArgs();
      long var36 = 410905379772103887L;
      Object[] var35 = var10007;
      Ref.h(410905379772103887L, var35, var36);
      Object[] var10008 = Registry.packArgs(var48, var48, true);
      long var38 = 453428243328379077L;
      Object[] var37 = var10008;
      Ref.h(453428243328379077L, var37, var38);

      try {
         ;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }
   }

   @Override
   public void scrollRectToVisible(Rectangle var1) {
   }

   @Override
   public String convertValueToText(Object var1, boolean var2, boolean var3, boolean var4, int var5, boolean var6) {
      String var7 = AA.z();
      Object var10000 = var1;
      if (var7 == null) {
         if (var1 == null) {
            return "";
         }

         var10000 = var1;
      }

      String var8 = var10000.toString();
      if (var7 != null) {
         return var8;
      } else {
         return var8 != null ? var8 : "";
      }
   }

   public void B() {
      ArrayList var2 = new ArrayList();
      String var10000 = AA.z();
      int var3 = 0;
      String var1 = var10000;

      while (var3 < this.getRowCount() - 1) {
         TreePath var4 = this.getPathForRow(var3);
         if (var1 == null) {
            TreePath var5 = this.getPathForRow(var3 + 1);
            label144:
            if (var1 == null) {
               if (var4.isDescendant(var5)) {
                  DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)var4.getLastPathComponent();
                  if (var1 != null) {
                     break label144;
                  }

                  if (var6.getUserObject().getClass().equals(Tf4.class)) {
                     Tf4 var7 = (Tf4)var6.getUserObject();
                     Object[] var10002 = Registry.emptyArgs();
                     long var9 = 498856411508641826L;
                     Object[] var8 = var10002;
                     var10002 = Ref.h(498856411508641826L, var8, var9);

                     try {
                        var10002 = (String)var10002;
                     } catch (InvocationTargetException var37) {
                        throw var37.getTargetException();
                     }

                     var7.add(var10002);
                  }
               }

               var3++;
            }

            if (var1 == null) {
               continue;
            }
         }
         break;
      }

      Object[] var10001 = Registry.emptyArgs();
      long var11 = 148691699844242618L;
      Object[] var10 = var10001;
      var10001 = Ref.h(148691699844242618L, var10, var11);

      try {
         var10001 = (DefaultMutableTreeNode)var10001;
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      String var39;
      label157: {
         DefaultMutableTreeNode var38 = var10001;
         var39 = null;
         var10001 = var38;
         if (var1 == null) {
            if (var38 == null) {
               break label157;
            }

            var10001 = (Object[])var38.getUserObject();
         }

         label158: {
            boolean var49 = var10001.getClass().equals(Tf4.class);
            if (var1 == null) {
               if (var49) {
                  Tf4 var41 = (Tf4)var38.getUserObject();
                  Object[] var56 = Registry.emptyArgs();
                  long var13 = 498856411508641826L;
                  Object[] var12 = var56;
                  var56 = Ref.h(498856411508641826L, var12, var13);

                  try {
                     var56 = (String)var56;
                  } catch (InvocationTargetException var35) {
                     throw var35.getTargetException();
                  }

                  var39 = var56;
                  break label157;
               }

               var10001 = var38.getUserObject().getClass();
               if (var1 != null) {
                  break label158;
               }

               var49 = var10001.equals(Ck4.class);
            }

            if (!var49) {
               break label157;
            }

            var10001 = (Object[])var38.getUserObject();
         }

         Ck4 var40 = (Ck4)var10001;
         Object[] var53 = Registry.emptyArgs();
         long var15 = 605430732347023634L;
         Object[] var14 = var53;
         var53 = Ref.h(605430732347023634L, var14, var15);

         try {
            var53 = (String)var53;
         } catch (InvocationTargetException var34) {
            throw var34.getTargetException();
         }

         var39 = var53;
      }

      Object var16 = 604074053920059872L;
      ((HashMap)Ref.g(604074053920059872L, var16)).clear();
      Object[] var10003 = Registry.emptyArgs();
      long var19 = 574561945876230577L;
      Object[] var18 = var10003;
      Ref.h(574561945876230577L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      Object[] var10004 = Registry.emptyArgs();
      long var21 = 474998040866815030L;
      Object[] var20 = var10004;
      Ref.h(474998040866815030L, var20, var21);

      try {
         ;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      Object[] var10005 = Registry.emptyArgs();
      long var23 = 459754285193734469L;
      Object[] var22 = var10005;
      Ref.h(459754285193734469L, var22, var23);

      try {
         ;
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      Iterator var42 = var2.iterator();

      while (true) {
         if (var42.hasNext()) {
            String var44 = (String)var42.next();
            var10005 = this;
            Object var24 = 604074053920059872L;
            DefaultMutableTreeNode var45 = (DefaultMutableTreeNode)((HashMap)Ref.g(604074053920059872L, var24)).get(var44);
            if (var1 != null) {
               break;
            }

            if (var45 != null) {
               this.expandPath(new TreePath(var45.getPath()));
            }

            if (var1 == null) {
               continue;
            }
         }

         var10005 = var39;
         if (var1 == null) {
            if (var39 == null) {
               return;
            }

            var10005 = this;
            Object var26 = 604074053920059872L;
            ((HashMap)Ref.g(604074053920059872L, var26)).get(var39);
         }

         var10005 = (DefaultMutableTreeNode)var10005;
         break;
      }

      Object var43 = var10005;
      Object[] var10006 = Registry.packArgs(var43);
      long var29 = 592526597199428069L;
      Object[] var28 = var10006;
      Ref.h(592526597199428069L, var28, var29);

      try {
         ;
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }
   }

   public void D() {
      Object var1 = 357561646207134153L;
      Object[] var10002 = Registry.packArgs(Ref.g(357561646207134153L, var1));
      long var4 = 593150792091308133L;
      Object[] var3 = var10002;
      Ref.h(593150792091308133L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      Object var5 = 312919167011526763L;
      Ref.g(312919167011526763L, var5);
      Object var7 = 357561646207134153L;
      Object[] var10005 = Registry.packArgs(this, Ref.g(357561646207134153L, var7), 0);
      long var10 = 485298920737977777L;
      Object[] var9 = var10005;
      Ref.h(485298920737977777L, var9, var10);
      TreePath var10006;
      Object var11 = 213130010239103238L;
      super(((DefaultMutableTreeNode)Ref.g(213130010239103238L, var11)).getPath());
      var10006.expandPath(var10006);
   }

   public synchronized void U(String var1) {
      String var10001 = var1.toLowerCase();
      long var3 = 119358758450406151L;
      String var2 = var10001;
      Ref.s(119358758450406151L, var2, var3);
      Object var4 = 357561646207134153L;
      Ref.g(357561646207134153L, var4);
      List var10003 = Registry.emptyArgs();
      long var7 = 369380169373911815L;
      Object[] var6 = var10003;
      var10003 = Ref.h(369380169373911815L, var6, var7);

      try {
         var10003 = (List)var10003;
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      var10003.clear();
      Object var8 = 357561646207134153L;
      Ref.g(357561646207134153L, var8);
      List var10005 = Registry.emptyArgs();
      long var11 = 369380169373911815L;
      Object[] var10 = var10005;
      var10005 = Ref.h(369380169373911815L, var10, var11);

      try {
         var10005 = (List)var10005;
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      var10005.clear();
      Object var12 = 312919167011526763L;
      ((DefaultMutableTreeNode)Ref.g(312919167011526763L, var12)).removeAllChildren();
      DefaultMutableTreeNode var10007 = new DefaultMutableTreeNode(a(11170, -7559));
      long var15 = 312919167011526763L;
      DefaultMutableTreeNode var14 = var10007;
      Ref.s(312919167011526763L, var14, var15);
      Yo4 var10009;
      Object var16 = 312919167011526763L;
      super((DefaultMutableTreeNode)Ref.g(312919167011526763L, var16));
      long var19 = 571388131590801605L;
      Yo4 var18 = var10009;
      Ref.s(571388131590801605L, var18, var19);
      Object var20 = 571388131590801605L;
      this.setModel((Yo4)Ref.g(571388131590801605L, var20));
      Object var22 = 357561646207134153L;
      Object[] var10012 = Registry.packArgs(Ref.g(357561646207134153L, var22));
      long var25 = 593150792091308133L;
      Object[] var24 = var10012;
      Ref.h(593150792091308133L, var24, var25);

      try {
         ;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      Object var26 = 357561646207134153L;
      Object[] var10014 = Registry.packArgs(Ref.g(357561646207134153L, var26));
      long var29 = 374559552802805888L;
      Object[] var28 = var10014;
      Ref.h(374559552802805888L, var28, var29);
      Object var30 = 312919167011526763L;
      Ref.g(312919167011526763L, var30);
      Object var32 = 357561646207134153L;
      Object[] var10017 = Registry.packArgs(this, Ref.g(357561646207134153L, var32), 0);
      long var35 = 485298920737977777L;
      Object[] var34 = var10017;
      Ref.h(485298920737977777L, var34, var35);
      TreePath var10018;
      Object var36 = 213130010239103238L;
      super(((DefaultMutableTreeNode)Ref.g(213130010239103238L, var36)).getPath());
      var10018.expandPath(var10018);
   }

   public void h(String var1, int var2) {
      Object[] var10001 = Registry.packArgs(var1, var2, true, true);
      long var4 = 139844880563692307L;
      Object[] var3 = var10001;
      Ref.h(139844880563692307L, var3, var4);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }
   }

   public void N(String var1, int var2, boolean var3, boolean var4) {
      String var6 = new java.io.File(var1).getParentFile().getAbsolutePath();
      AA.z();
      Object var12 = 604074053920059872L;
      DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)((HashMap)Ref.g(604074053920059872L, var12)).get(var6);
      Object var10001 = var7;
      if (this == null) {
         if (var7 == null) {
            Object[] var10002 = Registry.packArgs(var6, 0);
            long var15 = 295612812222941676L;
            Object[] var14 = var10002;
            Ref.h(295612812222941676L, var14, var15);

            try {
               ;
            } catch (InvocationTargetException var29) {
               throw var29.getTargetException();
            }

            Object var16 = 604074053920059872L;
            var7 = (DefaultMutableTreeNode)((HashMap)Ref.g(604074053920059872L, var16)).get(var6);
         }

         var10001 = var7.getUserObject();
      }

      Tf4 var8 = (Tf4)var10001;
      Tf4 var9 = new Tf4(new java.io.File(var1));
      List var30 = Registry.emptyArgs();
      long var19 = 369380169373911815L;
      Object[] var18 = var30;
      var30 = Ref.h(369380169373911815L, var18, var19);

      try {
         var30 = (List)var30;
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      var30.add(var9);
      DefaultMutableTreeNode var10 = new DefaultMutableTreeNode(var9);
      Object var20 = 604074053920059872L;
      ((HashMap)Ref.g(604074053920059872L, var20)).put(var1, var10);
      var7.insert(var10, 0);
      Object var22 = 571388131590801605L;
      ((Yo4)Ref.g(571388131590801605L, var22)).insertNodeInto(var10, var7, var2);
      TreePath var11 = new TreePath(var10.getPath());
      boolean var10004 = var3;
      if (this == null) {
         if (var3) {
            Object var24 = 593306439561595691L;
            ((Connection5)Ref.g(593306439561595691L, var24)).setSelectionPath(var11);
         }

         var10004 = var4;
      }

      if (var10004) {
         Object var26 = 593306439561595691L;
         ((Connection5)Ref.g(593306439561595691L, var26)).startEditingAtPath(var11);
      }
   }

   public DefaultMutableTreeNode E(DefaultMutableTreeNode param1, Tf4 param2, int param3) {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new javax/swing/tree/DefaultMutableTreeNode
      // 003: dup
      // 004: aload 2
      // 005: invokespecial javax/swing/tree/DefaultMutableTreeNode.<init> (Ljava/lang/Object;)V
      // 008: astore 5
      // 00a: invokestatic com/finalshell/ui/panel/AA.z ()Ljava/lang/String;
      // 00d: aload 0
      // 00e: ldc2_w 604074053920059872
      // 011: astore 15
      // 013: ldc2_w 604074053920059872
      // 016: aload 15
      // 018: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 01b: checkcast java/util/HashMap
      // 01e: aload 2
      // 01f: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 022: ldc2_w 543633160597441792
      // 025: astore 18
      // 027: astore 17
      // 029: ldc2_w 543633160597441792
      // 02c: aload 17
      // 02e: aload 18
      // 030: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 033: checkcast java/io/File
      // 036: goto 03d
      // 039: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 040: aload 5
      // 042: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 045: pop
      // 046: astore 4
      // 048: aload 0
      // 049: aload 4
      // 04b: ifnonnull 0a9
      // 04e: ldc2_w 571388131590801605
      // 051: astore 19
      // 053: ldc2_w 571388131590801605
      // 056: aload 19
      // 058: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 05b: checkcast com/finalshell/core/Yo4
      // 05e: aload 5
      // 060: aload 1
      // 061: iload 3
      // 062: invokevirtual com/finalshell/core/Yo4.insertNodeInto (Ljavax/swing/tree/MutableTreeNode;Ljavax/swing/tree/MutableTreeNode;I)V
      // 065: aload 2
      // 066: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 069: ldc2_w 543633160597441792
      // 06c: astore 22
      // 06e: astore 21
      // 070: ldc2_w 543633160597441792
      // 073: aload 21
      // 075: aload 22
      // 077: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 07a: checkcast java/io/File
      // 07d: goto 084
      // 080: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 083: athrow
      // 084: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // 087: ldc2_w 478301022169899080
      // 08a: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 08d: aconst_null
      // 08e: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 091: checkcast java/lang/String
      // 094: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 097: ifeq 0bc
      // 09a: goto 0a1
      // 09d: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: goto 0a9
      // 0a5: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a8: athrow
      // 0a9: aload 5
      // 0ab: ldc2_w 213130010239103238
      // 0ae: astore 24
      // 0b0: astore 23
      // 0b2: ldc2_w 213130010239103238
      // 0b5: aload 23
      // 0b7: aload 24
      // 0b9: invokestatic com/finalshell/reflect/Ref.s (Ljava/lang/Object;Ljava/lang/Object;J)V
      // 0bc: new java/util/ArrayList
      // 0bf: dup
      // 0c0: invokespecial java/util/ArrayList.<init> ()V
      // 0c3: astore 6
      // 0c5: aload 2
      // 0c6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 0c9: ldc2_w 369380169373911815
      // 0cc: astore 26
      // 0ce: astore 25
      // 0d0: ldc2_w 369380169373911815
      // 0d3: aload 25
      // 0d5: aload 26
      // 0d7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 0da: checkcast java/util/List
      // 0dd: goto 0e4
      // 0e0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0e9: astore 7
      // 0eb: aload 7
      // 0ed: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0f2: ifeq 11a
      // 0f5: aload 7
      // 0f7: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0fc: checkcast com/finalshell/ui/model/Tf4
      // 0ff: astore 8
      // 101: aload 6
      // 103: aload 8
      // 105: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 108: pop
      // 109: aload 4
      // 10b: ifnonnull 140
      // 10e: aload 4
      // 110: ifnull 0eb
      // 113: goto 11a
      // 116: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 119: athrow
      // 11a: aload 2
      // 11b: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 11e: ldc2_w 248698316749304686
      // 121: astore 28
      // 123: astore 27
      // 125: ldc2_w 248698316749304686
      // 128: aload 27
      // 12a: aload 28
      // 12c: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 12f: checkcast java/util/List
      // 132: goto 139
      // 135: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 138: athrow
      // 139: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 13e: astore 7
      // 140: aload 7
      // 142: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 147: ifeq 16f
      // 14a: aload 7
      // 14c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 151: checkcast com/finalshell/ui/model/Ck4
      // 154: astore 8
      // 156: aload 6
      // 158: aload 8
      // 15a: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 15d: pop
      // 15e: aload 4
      // 160: ifnonnull 176
      // 163: aload 4
      // 165: ifnull 140
      // 168: goto 16f
      // 16b: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 16e: athrow
      // 16f: aload 6
      // 171: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 174: astore 7
      // 176: aload 7
      // 178: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 17d: ifeq 3b8
      // 180: aload 7
      // 182: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 187: astore 8
      // 189: ldc_w ""
      // 18c: astore 9
      // 18e: aload 4
      // 190: ifnonnull 3d7
      // 193: aload 8
      // 195: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 198: ldc_w com/finalshell/ui/model/Ck4
      // 19b: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 19e: aload 4
      // 1a0: ifnonnull 35e
      // 1a3: goto 1aa
      // 1a6: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1a9: athrow
      // 1aa: ifeq 340
      // 1ad: goto 1b4
      // 1b0: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b3: athrow
      // 1b4: aload 8
      // 1b6: checkcast com/finalshell/ui/model/Ck4
      // 1b9: astore 10
      // 1bb: aload 10
      // 1bd: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 1c0: ldc2_w 272998330038223631
      // 1c3: astore 30
      // 1c5: astore 29
      // 1c7: ldc2_w 272998330038223631
      // 1ca: aload 29
      // 1cc: aload 30
      // 1ce: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 1d1: checkcast java/io/File
      // 1d4: goto 1db
      // 1d7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1da: athrow
      // 1db: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 1de: astore 11
      // 1e0: aload 11
      // 1e2: sipush 11172
      // 1e5: sipush 14353
      // 1e8: invokestatic com/finalshell/ui/panel/Connection5.a (II)Ljava/lang/String;
      // 1eb: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 1ee: aload 4
      // 1f0: ifnonnull 20a
      // 1f3: ifne 209
      // 1f6: goto 1fd
      // 1f9: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1fc: athrow
      // 1fd: aload 4
      // 1ff: ifnull 176
      // 202: goto 209
      // 205: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 208: athrow
      // 209: bipush 0
      // 20a: istore 12
      // 20c: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 20f: ldc2_w 270389152141252877
      // 212: astore 31
      // 214: ldc2_w 270389152141252877
      // 217: aload 31
      // 219: invokestatic com/finalshell/reflect/Ref.h2 ([Ljava/lang/Object;J)Ljava/lang/Object;
      // 21c: goto 223
      // 21f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 222: athrow
      // 223: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 226: ldc2_w 410905379772103887
      // 229: astore 34
      // 22b: astore 33
      // 22d: ldc2_w 410905379772103887
      // 230: aload 33
      // 232: aload 34
      // 234: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 237: goto 23e
      // 23a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 23d: athrow
      // 23e: aload 11
      // 240: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 243: ldc2_w 489768706953623433
      // 246: astore 36
      // 248: astore 35
      // 24a: ldc2_w 489768706953623433
      // 24d: aload 35
      // 24f: aload 36
      // 251: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 254: checkcast com/finalshell/core/Lv4_2
      // 257: goto 25e
      // 25a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 25d: athrow
      // 25e: astore 13
      // 260: aload 13
      // 262: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 265: ldc2_w 402271797068414482
      // 268: astore 38
      // 26a: astore 37
      // 26c: ldc2_w 402271797068414482
      // 26f: aload 37
      // 271: aload 38
      // 273: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 276: checkcast java/lang/Integer
      // 279: invokevirtual java/lang/Integer.intValue ()I
      // 27c: goto 283
      // 27f: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 282: athrow
      // 283: istore 12
      // 285: aload 10
      // 287: iload 12
      // 289: invokestatic com/finalshell/reflect/Registry.packArgs (I)[Ljava/lang/Object;
      // 28c: ldc2_w 268719418863796583
      // 28f: astore 40
      // 291: astore 39
      // 293: ldc2_w 268719418863796583
      // 296: aload 39
      // 298: aload 40
      // 29a: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 29d: pop
      // 29e: goto 2a5
      // 2a1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2a4: athrow
      // 2a5: goto 2b4
      // 2a8: astore 14
      // 2aa: aload 14
      // 2ac: invokevirtual java/lang/Exception.printStackTrace ()V
      // 2af: aload 4
      // 2b1: ifnull 176
      // 2b4: aload 10
      // 2b6: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 2b9: ldc2_w 272998330038223631
      // 2bc: astore 42
      // 2be: astore 41
      // 2c0: ldc2_w 272998330038223631
      // 2c3: aload 41
      // 2c5: aload 42
      // 2c7: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 2ca: checkcast java/io/File
      // 2cd: goto 2d4
      // 2d0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2d3: athrow
      // 2d4: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 2d7: astore 9
      // 2d9: new javax/swing/tree/DefaultMutableTreeNode
      // 2dc: dup
      // 2dd: aload 10
      // 2df: invokespecial javax/swing/tree/DefaultMutableTreeNode.<init> (Ljava/lang/Object;)V
      // 2e2: astore 14
      // 2e4: aload 0
      // 2e5: ldc2_w 571388131590801605
      // 2e8: astore 43
      // 2ea: ldc2_w 571388131590801605
      // 2ed: aload 43
      // 2ef: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 2f2: checkcast com/finalshell/core/Yo4
      // 2f5: aload 14
      // 2f7: aload 5
      // 2f9: aload 5
      // 2fb: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getChildCount ()I
      // 2fe: invokevirtual com/finalshell/core/Yo4.insertNodeInto (Ljavax/swing/tree/MutableTreeNode;Ljavax/swing/tree/MutableTreeNode;I)V
      // 301: aload 0
      // 302: ldc2_w 604074053920059872
      // 305: astore 45
      // 307: ldc2_w 604074053920059872
      // 30a: aload 45
      // 30c: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 30f: checkcast java/util/HashMap
      // 312: aload 10
      // 314: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 317: ldc2_w 272998330038223631
      // 31a: astore 48
      // 31c: astore 47
      // 31e: ldc2_w 272998330038223631
      // 321: aload 47
      // 323: aload 48
      // 325: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 328: checkcast java/io/File
      // 32b: goto 332
      // 32e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 331: athrow
      // 332: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 335: aload 14
      // 337: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 33a: pop
      // 33b: aload 4
      // 33d: ifnull 3b3
      // 340: aload 8
      // 342: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 345: aload 4
      // 347: ifnonnull 363
      // 34a: goto 351
      // 34d: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 350: athrow
      // 351: ldc_w com/finalshell/ui/model/Tf4
      // 354: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 357: goto 35e
      // 35a: invokestatic com/finalshell/ui/panel/Connection5.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 35d: athrow
      // 35e: ifeq 3b3
      // 361: aload 8
      // 363: checkcast com/finalshell/ui/model/Tf4
      // 366: astore 10
      // 368: aload 10
      // 36a: invokestatic com/finalshell/reflect/Registry.emptyArgs ()[Ljava/lang/Object;
      // 36d: ldc2_w 543633160597441792
      // 370: astore 50
      // 372: astore 49
      // 374: ldc2_w 543633160597441792
      // 377: aload 49
      // 379: aload 50
      // 37b: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 37e: checkcast java/io/File
      // 381: goto 388
      // 384: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 387: athrow
      // 388: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 38b: astore 9
      // 38d: aload 0
      // 38e: aload 5
      // 390: aload 10
      // 392: aload 5
      // 394: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getChildCount ()I
      // 397: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;Ljava/lang/Object;I)[Ljava/lang/Object;
      // 39a: ldc2_w 485298920737977777
      // 39d: astore 52
      // 39f: astore 51
      // 3a1: ldc2_w 485298920737977777
      // 3a4: aload 51
      // 3a6: aload 52
      // 3a8: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3ab: goto 3b2
      // 3ae: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3b1: athrow
      // 3b2: pop
      // 3b3: aload 4
      // 3b5: ifnull 176
      // 3b8: aload 0
      // 3b9: aload 5
      // 3bb: invokestatic com/finalshell/reflect/Registry.packArgs (Ljava/lang/Object;)[Ljava/lang/Object;
      // 3be: ldc2_w 276002133797788160
      // 3c1: astore 54
      // 3c3: astore 53
      // 3c5: ldc2_w 276002133797788160
      // 3c8: aload 53
      // 3ca: aload 54
      // 3cc: invokestatic com/finalshell/reflect/Ref.h (Ljava/lang/Object;Ljava/lang/Object;J)Ljava/lang/Object;
      // 3cf: pop
      // 3d0: goto 3d7
      // 3d3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3d6: athrow
      // 3d7: aload 5
      // 3d9: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void J(DefaultMutableTreeNode var1) {
      Registry.packArgs(var1);
      long var7 = 560417790764258986L;
      Object var10001 = Ref.h2(560417790764258986L, var7);

      try {
         var10001 = (ArrayList)var10001;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      ArrayList var3 = (ArrayList)var10001;
      var10001 = AA.z();
      ArrayList var4 = new ArrayList();
      String var2 = (String)var10001;
      Iterator var5 = var3.iterator();

      String var10003;
      while (true) {
         if (var5.hasNext()) {
            DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)var5.next();
            Object[] var10002 = Registry.packArgs(var6);
            long var10 = 201726770406369370L;
            Object[] var9 = var10002;
            var10002 = Ref.h(201726770406369370L, var9, var10);

            try {
               var22 = (Boolean)var10002;
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }

            var10003 = var2;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               if (var22) {
                  var4.add(var6);
               }
            }

            if (var2 == null) {
               continue;
            }
         }

         Registry.packArgs(var1);
         long var11 = 206118038016110794L;
         Ref.h2(206118038016110794L, var11);

         try {
            ;
         } catch (InvocationTargetException var15) {
            throw var15.getTargetException();
         }

         Object var13 = 571388131590801605L;
         ((Yo4)Ref.g(571388131590801605L, var13)).nodeStructureChanged(var1);
         var5 = var4.iterator();
         var10003 = var5.hasNext();
         break;
      }

      while (var10003 != false) {
         DefaultMutableTreeNode var18 = (DefaultMutableTreeNode)var5.next();
         this.expandPath(new TreePath(var18.getPath()));
         if (var2 != null) {
            break;
         }

         var10003 = var5.hasNext();
      }
   }

   public void h() {
      Registry.packArgs(this, false);
      long var1 = 548485169707074459L;
      Ref.h2(548485169707074459L, var1);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      TreePath var10002;
      Object var3 = 213130010239103238L;
      super(((DefaultMutableTreeNode)Ref.g(213130010239103238L, var3)).getPath());
      var10002.expandPath(var10002);
   }

   void E(DefaultMutableTreeNode var1) {
      String var2 = AA.z();
      Object var3 = 310302490302373526L;
      ShowDeletedPanel var10001 = (ShowDeletedPanel)Ref.g(310302490302373526L, var3);
      if (var2 == null) {
         if (var10001 == null) {
            return;
         }

         Object var5 = 310302490302373526L;
         ShowDeletedPanel var10002 = (ShowDeletedPanel)Ref.g(310302490302373526L, var5);
      }

      Object[] var12 = Registry.emptyArgs();
      long var8 = 149160680229662748L;
      Object[] var7 = var12;
      Ref.h(149160680229662748L, var7, var8);
      Object[] var10003 = Registry.packArgs(true);
      long var10 = 438941361784812150L;
      Object[] var9 = var10003;
      Ref.h(438941361784812150L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   int y(Object var1) {
      String var10000 = AA.z();
      int var3 = 0;
      String var2 = var10000;
      byte var32 = var1.getClass().equals(Ck4.class);
      if (var2 == null) {
         if (var32 != 0) {
            Ck4 var4 = (Ck4)var1;
            Object var5 = 137186759430385204L;
            Ref.g(137186759430385204L, var5);
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
            if (var2 == null) {
               return var3;
            }
         }

         var32 = var1.getClass().equals(Tf4.class);
      }

      if (var2 != null) {
         return var32;
      } else {
         if (var32 != 0) {
            Tf4 var31 = (Tf4)var1;
            Object var15 = 137186759430385204L;
            Ref.g(137186759430385204L, var15);
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

   public void V(DefaultMutableTreeNode var1, Ck4 var2) {
      Object var3 = 604074053920059872L;
      HashMap var10001 = (HashMap)Ref.g(604074053920059872L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 272998330038223631L;
      Object[] var5 = var10003;
      var10003 = Ref.h(272998330038223631L, var5, var6);

      try {
         var10003 = (java.io.File)var10003;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var2.put(var10003.getAbsolutePath(), var1);
   }

   public void C(DefaultMutableTreeNode var1, Tf4 var2) {
      Object var3 = 604074053920059872L;
      HashMap var10001 = (HashMap)Ref.g(604074053920059872L, var3);
      Object[] var10003 = Registry.emptyArgs();
      long var6 = 543633160597441792L;
      Object[] var5 = var10003;
      var10003 = Ref.h(543633160597441792L, var5, var6);

      try {
         var10003 = (java.io.File)var10003;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var2.put(var10003.getAbsolutePath(), var1);
   }

   public void G(String var1) {
      Object var2 = 604074053920059872L;
      ((HashMap)Ref.g(604074053920059872L, var2)).remove(var1);
   }

   public void I(Tf4 var1) {
   }

   public boolean o(Tf4 var1) {
      AA.z();
      Object[] var10002 = Registry.emptyArgs();
      long var12 = 543633160597441792L;
      Object[] var11 = var10002;
      var10002 = Ref.h(543633160597441792L, var11, var12);

      try {
         var10002 = (java.io.File)var10002;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      java.io.File var3 = var10002;
      Tf4 var2 = var1;
      var10002 = Registry.packArgs(var3);
      long var14 = 349593801287953443L;
      Object[] var13 = var10002;
      Ref.h(349593801287953443L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var16 = 369380169373911815L;
      Object[] var15 = var10003;
      Vector var4 = (Vector)Ref.h(369380169373911815L, var15, var16);
      Z var10004 = Registry.emptyArgs();
      long var18 = 248698316749304686L;
      Object[] var17 = var10004;
      Vector var5 = (Vector)Ref.h(248698316749304686L, var17, var18);
      Object var6 = false;
      var10004 = var5;
      if (var1 == null) {
         if (var5.size() > 0) {
            var6 = true;
         }

         var10004 = (List)var4.clone();
      }

      Object var7 = var10004;
      Iterator var8 = var7.iterator();

      while (true) {
         if (var8.hasNext()) {
            Tf4 var9 = (Tf4)var8.next();
            var10004 = this;
            Object[] var10005 = Registry.packArgs(var9);
            long var20 = 374559552802805888L;
            Object[] var19 = var10005;
            var10005 = Ref.h(374559552802805888L, var19, var20);

            try {
               var30 = (Boolean)var10005;
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            boolean var10 = var30;
            if (var2 != null) {
               break;
            }

            label61:
            if (var2 == null) {
               if (var10) {
                  var6 = true;
                  if (var2 == null) {
                     break label61;
                  }
               }

               var4.remove(var9);
            }

            if (var2 == null) {
               continue;
            }
         }

         var10004 = (Z)var6;
         break;
      }

      return (boolean)var10004;
   }

   public void Q(boolean var1) {
      Registry.lookupField(557374830394047111L).setBoolean(this, var1);
      Object[] var10001 = Registry.emptyArgs();
      long var3 = 483594750475642076L;
      Object[] var2 = var10001;
      Ref.h(483594750475642076L, var2, var3);

      try {
         ;
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   public void n(Tf4 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var18 = 543633160597441792L;
      Object[] var17 = var10001;
      var10001 = Ref.h(543633160597441792L, var17, var18);

      try {
         var10001 = (java.io.File)var10001;
      } catch (InvocationTargetException var115) {
         throw var115.getTargetException();
      }

      java.io.File var3 = var10001;
      AA.z();
      Object[] var10003 = Registry.packArgs(var3);
      long var20 = 349593801287953443L;
      Object[] var19 = var10003;
      Ref.h(349593801287953443L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var114) {
         throw var114.getTargetException();
      }

      Tf4 var2 = var1;
      java.io.File[] var4 = var3.listFiles();
      Vector var5 = new Vector();
      Vector var6 = new Vector();
      if (var1 == null) {
         if (var4 != null) {
            for (java.io.File var10 : var4) {
               if (var2 != null) {
                  return;
               }

               label458: {
                  boolean var10002 = var10.isDirectory();
                  if (var2 == null) {
                     if (var10002) {
                        Tf4 var11 = new Tf4();
                        var10003 = Registry.packArgs(var10);
                        long var22 = 349593801287953443L;
                        Object[] var21 = var10003;
                        Ref.h(349593801287953443L, var21, var22);

                        try {
                           ;
                        } catch (InvocationTargetException var113) {
                           throw var113.getTargetException();
                        }

                        boolean var12;
                        label439: {
                           var12 = false;
                           boolean var123 = Registry.lookupField(557374830394047111L).getBoolean(this);
                           if (var2 == null) {
                              if (var123) {
                                 Registry.emptyArgs();
                                 long var23 = 270389152141252877L;
                                 Ref.h2(270389152141252877L, var23);
                                 Object[] var10005 = Registry.emptyArgs();
                                 long var26 = 410905379772103887L;
                                 Object[] var25 = var10005;
                                 Ref.h(410905379772103887L, var25, var26);
                                 Object[] var10006 = Registry.packArgs(var10.getName());
                                 long var28 = 133273064107181210L;
                                 Object[] var27 = var10006;
                                 var10006 = Ref.h(133273064107181210L, var27, var28);

                                 try {
                                    var10006 = (LO3)var10006;
                                 } catch (InvocationTargetException var112) {
                                    throw var112.getTargetException();
                                 }

                                 label461: {
                                    LO3 var13 = var10006;
                                    LO3 var130 = var13;
                                    if (var2 == null) {
                                       if (var13 == null) {
                                          break label461;
                                       }

                                       var130 = var13;
                                    }

                                    Registry.packArgs(var130);
                                    long var29 = 366543685241882690L;
                                    Object var10007 = Ref.h2(366543685241882690L, var29);

                                    try {
                                       var135 = (Boolean)var10007;
                                    } catch (InvocationTargetException var111) {
                                       throw var111.getTargetException();
                                    }

                                    if (var2 == null) {
                                       var135 = !var135;
                                    }

                                    var12 = var135;
                                 }

                                 if (var2 == null) {
                                    break label439;
                                 }
                              }

                              var123 = true;
                           }

                           var12 = var123;
                        }

                        label462: {
                           if (var2 == null) {
                              if (!var12) {
                                 break label462;
                              }

                              var5.add(var11);
                           }

                           Object[] var10004 = Registry.packArgs(var11);
                           long var32 = 593150792091308133L;
                           Object[] var31 = var10004;
                           Ref.h(593150792091308133L, var31, var32);

                           try {
                              ;
                           } catch (InvocationTargetException var110) {
                              throw var110.getTargetException();
                           }
                        }

                        if (var2 == null) {
                           break label458;
                        }
                     }

                     var10002 = var10.isFile();
                  }

                  if (var2 == null) {
                     if (!var10002) {
                        break label458;
                     }

                     var10002 = var10.getName().endsWith(a(11172, 14353));
                  }

                  if (var10002) {
                     Ck4 var116 = new Ck4();
                     var10003 = Registry.packArgs(var10);
                     long var34 = 325634526741383265L;
                     Object[] var33 = var10003;
                     Ref.h(325634526741383265L, var33, var34);

                     try {
                        ;
                     } catch (InvocationTargetException var109) {
                        throw var109.getTargetException();
                     }

                     Registry.emptyArgs();
                     long var35 = 270389152141252877L;
                     Ref.h2(270389152141252877L, var35);
                     Object[] var127 = Registry.emptyArgs();
                     long var38 = 410905379772103887L;
                     Object[] var37 = var127;
                     Ref.h(410905379772103887L, var37, var38);
                     Object[] var131 = Registry.packArgs(var10.getAbsolutePath());
                     long var40 = 489768706953623433L;
                     Object[] var39 = var131;
                     var131 = Ref.h(489768706953623433L, var39, var40);

                     try {
                        var131 = (Lv4_2)var131;
                     } catch (InvocationTargetException var108) {
                        throw var108.getTargetException();
                     }

                     Lv4_2 var117;
                     boolean var119;
                     label405: {
                        var117 = var131;
                        var119 = false;
                        boolean var134 = Registry.lookupField(557374830394047111L).getBoolean(this);
                        if (var2 == null) {
                           if (var134) {
                              Registry.packArgs(var117);
                              long var41 = 366543685241882690L;
                              Object var136 = Ref.h2(366543685241882690L, var41);

                              try {
                                 var137 = (Boolean)var136;
                              } catch (InvocationTargetException var107) {
                                 throw var107.getTargetException();
                              }

                              if (var2 == null) {
                                 var137 = !var137;
                              }

                              var119 = var137;
                              if (var2 == null) {
                                 break label405;
                              }
                           }

                           var134 = true;
                        }

                        var119 = var134;
                     }

                     label398:
                     if (var119) {
                        label396: {
                           label395: {
                              label466: {
                                 Object var43 = 119358758450406151L;
                                 Object var138 = (String)Ref.g(119358758450406151L, var43);
                                 if (var2 == null) {
                                    if (var138 == null) {
                                       break label466;
                                    }

                                    var138 = this;
                                    Object var45 = 119358758450406151L;
                                    String var10008 = (String)Ref.g(119358758450406151L, var45);
                                 }

                                 boolean var139 = var138.equals("");
                                 if (var2 != null) {
                                    break label395;
                                 }

                                 if (!var139) {
                                    break label396;
                                 }
                              }

                              var6.add(var116);
                           }

                           if (var2 == null) {
                              break label398;
                           }
                        }

                        if (var117 == null) {
                           return;
                        }

                        new StringBuilder();
                        Object[] var10009 = Registry.emptyArgs();
                        long var48 = 255354522009994316L;
                        Object[] var47 = var10009;
                        var10009 = Ref.h(255354522009994316L, var47, var48);

                        try {
                           var141 = (Integer)var10009;
                        } catch (InvocationTargetException var106) {
                           throw var106.getTargetException();
                        }

                        String var14 = var117.append(var141).append("").toString();
                        Registry.emptyArgs();
                        long var49 = 270389152141252877L;
                        Ref.h2(270389152141252877L, var49);
                        Object[] var10010 = Registry.emptyArgs();
                        long var52 = 306266403902896148L;
                        Object[] var51 = var10010;
                        Ref.h(306266403902896148L, var51, var52);
                        Object[] var10011 = Registry.emptyArgs();
                        long var54 = 512419353738146707L;
                        Object[] var53 = var10011;
                        var10011 = Ref.h(512419353738146707L, var53, var54);

                        try {
                           var10011 = (Integer)var10011;
                        } catch (InvocationTargetException var105) {
                           throw var105.getTargetException();
                        }

                        label380: {
                           Lv4_2 var16;
                           label467: {
                              Object var15 = var10011;
                              var16 = false;
                              var10011 = (Object[])var15;
                              int var10012 = Registry.lookupField(304719506057429442L).getInt(null);
                              if (var2 == null) {
                                 if (var15 == var10012) {
                                    var10011 = var117;
                                    Object[] var145 = Registry.emptyArgs();
                                    long var56 = 380415140795833934L;
                                    Object[] var55 = var145;
                                    Object var146 = Ref.h(380415140795833934L, var55, var56);

                                    try {
                                       var147 = (String)var146;
                                    } catch (InvocationTargetException var104) {
                                       throw var104.getTargetException();
                                    }

                                    Lv4_2 var10013;
                                    var147.toLowerCase();
                                    Object var57 = 119358758450406151L;
                                    var10013 = this.contains((String)Ref.g(119358758450406151L, var57));
                                    label374:
                                    if (var2 == null) {
                                       if (var10013 == false) {
                                          var10013 = var117;
                                          String var10014 = Registry.emptyArgs();
                                          long var60 = 286931176286176762L;
                                          Object[] var59 = var10014;
                                          var10014 = Ref.h(286931176286176762L, var59, var60);

                                          try {
                                             var10014 = (String)var10014;
                                          } catch (InvocationTargetException var103) {
                                             throw var103.getTargetException();
                                          }

                                          var10014.toLowerCase();
                                          Object var61 = 119358758450406151L;
                                          boolean var10015 = this.contains((String)Ref.g(119358758450406151L, var61));
                                          if (var2 != null) {
                                             break label374;
                                          }

                                          if (!var10015) {
                                             String var10016 = Registry.emptyArgs();
                                             long var64 = 255973732097233937L;
                                             Object[] var63 = var10016;
                                             var10016 = Ref.h(255973732097233937L, var63, var64);

                                             try {
                                                var10016 = (String)var10016;
                                             } catch (InvocationTargetException var102) {
                                                throw var102.getTargetException();
                                             }

                                             var10016.toLowerCase();
                                             Object var65 = 119358758450406151L;
                                             boolean var10017 = this.contains((String)Ref.g(119358758450406151L, var65));
                                             if (var2 != null) {
                                                break label374;
                                             }

                                             if (!var10017) {
                                                var14.toLowerCase();
                                                Object var67 = 119358758450406151L;
                                                boolean var10018 = this.contains((String)Ref.g(119358758450406151L, var67));
                                                if (var2 != null) {
                                                   break label374;
                                                }

                                                if (!var10018) {
                                                   Object[] var10019 = Registry.emptyArgs();
                                                   long var70 = 218711337515318169L;
                                                   Object[] var69 = var10019;
                                                   Ref.h(218711337515318169L, var69, var70);

                                                   try {
                                                      ;
                                                   } catch (InvocationTargetException var101) {
                                                      throw var101.getTargetException();
                                                   }

                                                   Object var71 = 119358758450406151L;
                                                   boolean var10020 = this.contains((String)Ref.g(119358758450406151L, var71));
                                                   if (var2 != null) {
                                                      break label380;
                                                   }

                                                   if (!var10020) {
                                                      break label467;
                                                   }
                                                }
                                             }
                                          }
                                       }

                                       var10013 = true;
                                    }

                                    var16 = var10013;
                                    if (var2 == null) {
                                       break label467;
                                    }
                                 }

                                 var10011 = (Object[])var15;
                                 var10012 = Registry.lookupField(387101562873018885L).getInt(null);
                              }

                              if (var2 == null) {
                                 if (var10011 == var10012) {
                                    var10011 = var117;
                                    Object[] var148 = Registry.emptyArgs();
                                    long var74 = 286931176286176762L;
                                    Object[] var73 = var148;
                                    Object var149 = Ref.h(286931176286176762L, var73, var74);

                                    try {
                                       var150 = (String)var149;
                                    } catch (InvocationTargetException var100) {
                                       throw var100.getTargetException();
                                    }

                                    var150.toLowerCase();
                                    Object var75 = 119358758450406151L;
                                    boolean var161 = this.contains((String)Ref.g(119358758450406151L, var75));
                                    if (var2 != null) {
                                       break label380;
                                    }

                                    if (!var161) {
                                       break label467;
                                    }

                                    var16 = true;
                                    if (var2 == null) {
                                       break label467;
                                    }
                                 }

                                 var10011 = (Object[])var15;
                                 var10012 = Registry.lookupField(243306902745055487L).getInt(null);
                              }

                              if (var2 == null) {
                                 if (var10011 == var10012) {
                                    var10011 = var117;
                                    Object[] var151 = Registry.emptyArgs();
                                    long var78 = 380415140795833934L;
                                    Object[] var77 = var151;
                                    Object var152 = Ref.h(380415140795833934L, var77, var78);

                                    try {
                                       var153 = (String)var152;
                                    } catch (InvocationTargetException var99) {
                                       throw var99.getTargetException();
                                    }

                                    var153.toLowerCase();
                                    Object var79 = 119358758450406151L;
                                    boolean var162 = this.contains((String)Ref.g(119358758450406151L, var79));
                                    if (var2 != null) {
                                       break label380;
                                    }

                                    if (!var162) {
                                       break label467;
                                    }

                                    var16 = true;
                                    if (var2 == null) {
                                       break label467;
                                    }
                                 }

                                 var10011 = (Object[])var15;
                                 var10012 = Registry.lookupField(346595405273673113L).getInt(null);
                              }

                              if (var2 == null) {
                                 if (var10011 == var10012) {
                                    var10011 = var14.toLowerCase();
                                    Object var81 = 119358758450406151L;
                                    boolean var154 = this.contains((String)Ref.g(119358758450406151L, var81));
                                    if (var2 != null) {
                                       break label380;
                                    }

                                    if (!var154) {
                                       break label467;
                                    }

                                    var16 = true;
                                    if (var2 == null) {
                                       break label467;
                                    }
                                 }

                                 var10011 = (Object[])var15;
                                 var10012 = Registry.lookupField(238917600523772047L).getInt(null);
                              }

                              if (var2 == null) {
                                 if (var10011 == var10012) {
                                    var10011 = var117;
                                    Object[] var155 = Registry.emptyArgs();
                                    long var84 = 218711337515318169L;
                                    Object[] var83 = var155;
                                    Object var156 = Ref.h(218711337515318169L, var83, var84);

                                    try {
                                       var157 = (String)var156;
                                    } catch (InvocationTargetException var98) {
                                       throw var98.getTargetException();
                                    }

                                    var157.toLowerCase();
                                    Object var85 = 119358758450406151L;
                                    boolean var163 = this.contains((String)Ref.g(119358758450406151L, var85));
                                    if (var2 != null) {
                                       break label380;
                                    }

                                    if (!var163) {
                                       break label467;
                                    }

                                    var16 = true;
                                    if (var2 == null) {
                                       break label467;
                                    }
                                 }

                                 var10011 = (Object[])var15;
                                 if (var2 != null) {
                                    break label380;
                                 }

                                 var10012 = Registry.lookupField(478586759941923574L).getInt(null);
                              }

                              if (var10011 == var10012) {
                                 var10011 = var117;
                                 Object[] var158 = Registry.emptyArgs();
                                 long var88 = 255973732097233937L;
                                 Object[] var87 = var158;
                                 Object var159 = Ref.h(255973732097233937L, var87, var88);

                                 try {
                                    var160 = (String)var159;
                                 } catch (InvocationTargetException var97) {
                                    throw var97.getTargetException();
                                 }

                                 var160.toLowerCase();
                                 Object var89 = 119358758450406151L;
                                 boolean var164 = this.contains((String)Ref.g(119358758450406151L, var89));
                                 if (var2 != null) {
                                    break label380;
                                 }

                                 if (var164) {
                                    var16 = true;
                                 }
                              }
                           }

                           var10011 = var16;
                        }

                        if (var2 == null && var10011 != false) {
                           var6.add(var116);
                        }
                     }
                  }
               }

               if (var2 != null) {
                  break;
               }
            }
         }

         var10003 = Registry.packArgs(var5);
         long var92 = 407744580579201251L;
         Object[] var91 = var10003;
         Ref.h(407744580579201251L, var91, var92);

         try {
            ;
         } catch (InvocationTargetException var96) {
            throw var96.getTargetException();
         }

         Object[] var126 = Registry.packArgs(var6);
         long var94 = 486938477933204520L;
         Object[] var93 = var126;
         Ref.h(486938477933204520L, var93, var94);

         try {
            ;
         } catch (InvocationTargetException var95) {
            throw var95.getTargetException();
         }
      }
   }

   public void p(TreeNode var1) {
      Object var2 = 571388131590801605L;
      ((Yo4)Ref.g(571388131590801605L, var2)).removeNodeFromParent((MutableTreeNode)var1);
   }

   @Override
   public int getClosestRowForLocation(int var1, int var2) {
      return this.getRowForPath(this.getClosestPathForLocation(var1, var2));
   }

   int v$int() {
      Connection5 var1 = this;
      int var2 = 0;

      try {
         Field var3 = DropLocation.class.getDeclaredField(a(11173, 30853));
         var3.setAccessible(true);
         var2 = var3.getInt(var1);
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      return var2;
   }

   int u(int var1) {
      Connection5 var2 = this;
      byte var3 = 0;

      try {
         Field var4 = DropLocation.class.getDeclaredField(a(11175, -2272));
         var4.setAccessible(true);
         var4.setInt(var2, var1);
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      return var3;
   }

   DropLocation e(Point var1, TreePath var2, int var3) {
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

   void l(DefaultMutableTreeNode var1) {
   }

   public void j(java.io.File var1) {
      java.io.File[] var3 = var1.listFiles();
      java.io.File[] var4 = var3;
      int var5 = var3.length;
      String var10000 = AA.z();
      int var6 = 0;
      String var2 = var10000;

      while (var6 < var5) {
         java.io.File var7 = var4[var6];
         if (var7.isDirectory()) {
         }

         var6++;
         if (var2 != null) {
            break;
         }
      }
   }

   public void i() {
   }

   @Override
   public JComponent K() {
      return null;
   }

   static void o(Connection5 var0) {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 459754285193734469L;
      Object[] var1 = var10001;
      Ref.h(459754285193734469L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public static Exception a(Exception var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 11170) & 65535;
      if (c[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 58;
               break;
            case 1:
               var10000 = 245;
               break;
            case 2:
               var10000 = 248;
               break;
            case 3:
               var10000 = 31;
               break;
            case 4:
               var10000 = 109;
               break;
            case 5:
               var10000 = 50;
               break;
            case 6:
               var10000 = 21;
               break;
            case 7:
               var10000 = 79;
               break;
            case 8:
               var10000 = 179;
               break;
            case 9:
               var10000 = 112;
               break;
            case 10:
               var10000 = 12;
               break;
            case 11:
               var10000 = 234;
               break;
            case 12:
               var10000 = 133;
               break;
            case 13:
               var10000 = 184;
               break;
            case 14:
               var10000 = 28;
               break;
            case 15:
               var10000 = 252;
               break;
            case 16:
               var10000 = 222;
               break;
            case 17:
               var10000 = 237;
               break;
            case 18:
               var10000 = 24;
               break;
            case 19:
               var10000 = 62;
               break;
            case 20:
               var10000 = 215;
               break;
            case 21:
               var10000 = 57;
               break;
            case 22:
               var10000 = 72;
               break;
            case 23:
               var10000 = 115;
               break;
            case 24:
               var10000 = 254;
               break;
            case 25:
               var10000 = 98;
               break;
            case 26:
               var10000 = 45;
               break;
            case 27:
               var10000 = 197;
               break;
            case 28:
               var10000 = 231;
               break;
            case 29:
               var10000 = 123;
               break;
            case 30:
               var10000 = 201;
               break;
            case 31:
               var10000 = 162;
               break;
            case 32:
               var10000 = 131;
               break;
            case 33:
               var10000 = 118;
               break;
            case 34:
               var10000 = 106;
               break;
            case 35:
               var10000 = 107;
               break;
            case 36:
               var10000 = 186;
               break;
            case 37:
               var10000 = 243;
               break;
            case 38:
               var10000 = 147;
               break;
            case 39:
               var10000 = 200;
               break;
            case 40:
               var10000 = 250;
               break;
            case 41:
               var10000 = 226;
               break;
            case 42:
               var10000 = 239;
               break;
            case 43:
               var10000 = 207;
               break;
            case 44:
               var10000 = 19;
               break;
            case 45:
               var10000 = 16;
               break;
            case 46:
               var10000 = 217;
               break;
            case 47:
               var10000 = 203;
               break;
            case 48:
               var10000 = 204;
               break;
            case 49:
               var10000 = 159;
               break;
            case 50:
               var10000 = 77;
               break;
            case 51:
               var10000 = 103;
               break;
            case 52:
               var10000 = 140;
               break;
            case 53:
               var10000 = 93;
               break;
            case 54:
               var10000 = 27;
               break;
            case 55:
               var10000 = 39;
               break;
            case 56:
               var10000 = 120;
               break;
            case 57:
               var10000 = 20;
               break;
            case 58:
               var10000 = 232;
               break;
            case 59:
               var10000 = 126;
               break;
            case 60:
               var10000 = 59;
               break;
            case 61:
               var10000 = 148;
               break;
            case 62:
               var10000 = 117;
               break;
            case 63:
               var10000 = 9;
               break;
            case 64:
               var10000 = 143;
               break;
            case 65:
               var10000 = 104;
               break;
            case 66:
               var10000 = 191;
               break;
            case 67:
               var10000 = 174;
               break;
            case 68:
               var10000 = 114;
               break;
            case 69:
               var10000 = 158;
               break;
            case 70:
               var10000 = 208;
               break;
            case 71:
               var10000 = 193;
               break;
            case 72:
               var10000 = 108;
               break;
            case 73:
               var10000 = 246;
               break;
            case 74:
               var10000 = 180;
               break;
            case 75:
               var10000 = 253;
               break;
            case 76:
               var10000 = 227;
               break;
            case 77:
               var10000 = 43;
               break;
            case 78:
               var10000 = 49;
               break;
            case 79:
               var10000 = 185;
               break;
            case 80:
               var10000 = 44;
               break;
            case 81:
               var10000 = 74;
               break;
            case 82:
               var10000 = 223;
               break;
            case 83:
               var10000 = 152;
               break;
            case 84:
               var10000 = 235;
               break;
            case 85:
               var10000 = 220;
               break;
            case 86:
               var10000 = 242;
               break;
            case 87:
               var10000 = 55;
               break;
            case 88:
               var10000 = 63;
               break;
            case 89:
               var10000 = 228;
               break;
            case 90:
               var10000 = 213;
               break;
            case 91:
               var10000 = 94;
               break;
            case 92:
               var10000 = 41;
               break;
            case 93:
               var10000 = 3;
               break;
            case 94:
               var10000 = 37;
               break;
            case 95:
               var10000 = 15;
               break;
            case 96:
               var10000 = 214;
               break;
            case 97:
               var10000 = 30;
               break;
            case 98:
               var10000 = 83;
               break;
            case 99:
               var10000 = 52;
               break;
            case 100:
               var10000 = 26;
               break;
            case 101:
               var10000 = 66;
               break;
            case 102:
               var10000 = 18;
               break;
            case 103:
               var10000 = 182;
               break;
            case 104:
               var10000 = 40;
               break;
            case 105:
               var10000 = 168;
               break;
            case 106:
               var10000 = 178;
               break;
            case 107:
               var10000 = 173;
               break;
            case 108:
               var10000 = 91;
               break;
            case 109:
               var10000 = 155;
               break;
            case 110:
               var10000 = 128;
               break;
            case 111:
               var10000 = 4;
               break;
            case 112:
               var10000 = 89;
               break;
            case 113:
               var10000 = 36;
               break;
            case 114:
               var10000 = 100;
               break;
            case 115:
               var10000 = 105;
               break;
            case 116:
               var10000 = 85;
               break;
            case 117:
               var10000 = 216;
               break;
            case 118:
               var10000 = 135;
               break;
            case 119:
               var10000 = 240;
               break;
            case 120:
               var10000 = 199;
               break;
            case 121:
               var10000 = 221;
               break;
            case 122:
               var10000 = 136;
               break;
            case 123:
               var10000 = 121;
               break;
            case 124:
               var10000 = 33;
               break;
            case 125:
               var10000 = 75;
               break;
            case 126:
               var10000 = 171;
               break;
            case 127:
               var10000 = 251;
               break;
            case 128:
               var10000 = 6;
               break;
            case 129:
               var10000 = 99;
               break;
            case 130:
               var10000 = 65;
               break;
            case 131:
               var10000 = 116;
               break;
            case 132:
               var10000 = 177;
               break;
            case 133:
               var10000 = 153;
               break;
            case 134:
               var10000 = 64;
               break;
            case 135:
               var10000 = 70;
               break;
            case 136:
               var10000 = 170;
               break;
            case 137:
               var10000 = 60;
               break;
            case 138:
               var10000 = 150;
               break;
            case 139:
               var10000 = 48;
               break;
            case 140:
               var10000 = 206;
               break;
            case 141:
               var10000 = 163;
               break;
            case 142:
               var10000 = 67;
               break;
            case 143:
               var10000 = 154;
               break;
            case 144:
               var10000 = 190;
               break;
            case 145:
               var10000 = 212;
               break;
            case 146:
               var10000 = 241;
               break;
            case 147:
               var10000 = 35;
               break;
            case 148:
               var10000 = 7;
               break;
            case 149:
               var10000 = 169;
               break;
            case 150:
               var10000 = 53;
               break;
            case 151:
               var10000 = 211;
               break;
            case 152:
               var10000 = 90;
               break;
            case 153:
               var10000 = 76;
               break;
            case 154:
               var10000 = 198;
               break;
            case 155:
               var10000 = 210;
               break;
            case 156:
               var10000 = 244;
               break;
            case 157:
               var10000 = 1;
               break;
            case 158:
               var10000 = 238;
               break;
            case 159:
               var10000 = 97;
               break;
            case 160:
               var10000 = 187;
               break;
            case 161:
               var10000 = 119;
               break;
            case 162:
               var10000 = 229;
               break;
            case 163:
               var10000 = 102;
               break;
            case 164:
               var10000 = 47;
               break;
            case 165:
               var10000 = 110;
               break;
            case 166:
               var10000 = 183;
               break;
            case 167:
               var10000 = 130;
               break;
            case 168:
               var10000 = 92;
               break;
            case 169:
               var10000 = 124;
               break;
            case 170:
               var10000 = 96;
               break;
            case 171:
               var10000 = 82;
               break;
            case 172:
               var10000 = 194;
               break;
            case 173:
               var10000 = 138;
               break;
            case 174:
               var10000 = 144;
               break;
            case 175:
               var10000 = 101;
               break;
            case 176:
               var10000 = 122;
               break;
            case 177:
               var10000 = 166;
               break;
            case 178:
               var10000 = 142;
               break;
            case 179:
               var10000 = 69;
               break;
            case 180:
               var10000 = 129;
               break;
            case 181:
               var10000 = 2;
               break;
            case 182:
               var10000 = 84;
               break;
            case 183:
               var10000 = 202;
               break;
            case 184:
               var10000 = 225;
               break;
            case 185:
               var10000 = 54;
               break;
            case 186:
               var10000 = 87;
               break;
            case 187:
               var10000 = 218;
               break;
            case 188:
               var10000 = 23;
               break;
            case 189:
               var10000 = 88;
               break;
            case 190:
               var10000 = 247;
               break;
            case 191:
               var10000 = 134;
               break;
            case 192:
               var10000 = 146;
               break;
            case 193:
               var10000 = 195;
               break;
            case 194:
               var10000 = 25;
               break;
            case 195:
               var10000 = 157;
               break;
            case 196:
               var10000 = 161;
               break;
            case 197:
               var10000 = 95;
               break;
            case 198:
               var10000 = 42;
               break;
            case 199:
               var10000 = 0;
               break;
            case 200:
               var10000 = 14;
               break;
            case 201:
               var10000 = 71;
               break;
            case 202:
               var10000 = 224;
               break;
            case 203:
               var10000 = 205;
               break;
            case 204:
               var10000 = 172;
               break;
            case 205:
               var10000 = 165;
               break;
            case 206:
               var10000 = 10;
               break;
            case 207:
               var10000 = 8;
               break;
            case 208:
               var10000 = 151;
               break;
            case 209:
               var10000 = 188;
               break;
            case 210:
               var10000 = 46;
               break;
            case 211:
               var10000 = 145;
               break;
            case 212:
               var10000 = 5;
               break;
            case 213:
               var10000 = 68;
               break;
            case 214:
               var10000 = 38;
               break;
            case 215:
               var10000 = 189;
               break;
            case 216:
               var10000 = 249;
               break;
            case 217:
               var10000 = 160;
               break;
            case 218:
               var10000 = 192;
               break;
            case 219:
               var10000 = 175;
               break;
            case 220:
               var10000 = 32;
               break;
            case 221:
               var10000 = 167;
               break;
            case 222:
               var10000 = 81;
               break;
            case 223:
               var10000 = 164;
               break;
            case 224:
               var10000 = 11;
               break;
            case 225:
               var10000 = 17;
               break;
            case 226:
               var10000 = 233;
               break;
            case 227:
               var10000 = 125;
               break;
            case 228:
               var10000 = 141;
               break;
            case 229:
               var10000 = 61;
               break;
            case 230:
               var10000 = 196;
               break;
            case 231:
               var10000 = 111;
               break;
            case 232:
               var10000 = 73;
               break;
            case 233:
               var10000 = 176;
               break;
            case 234:
               var10000 = 29;
               break;
            case 235:
               var10000 = 137;
               break;
            case 236:
               var10000 = 51;
               break;
            case 237:
               var10000 = 209;
               break;
            case 238:
               var10000 = 181;
               break;
            case 239:
               var10000 = 113;
               break;
            case 240:
               var10000 = 219;
               break;
            case 241:
               var10000 = 236;
               break;
            case 242:
               var10000 = 80;
               break;
            case 243:
               var10000 = 230;
               break;
            case 244:
               var10000 = 86;
               break;
            case 245:
               var10000 = 13;
               break;
            case 246:
               var10000 = 139;
               break;
            case 247:
               var10000 = 22;
               break;
            case 248:
               var10000 = 56;
               break;
            case 249:
               var10000 = 149;
               break;
            case 250:
               var10000 = 127;
               break;
            case 251:
               var10000 = 78;
               break;
            case 252:
               var10000 = 132;
               break;
            case 253:
               var10000 = 34;
               break;
            case 254:
               var10000 = 255;
               break;
            default:
               var10000 = 156;
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

         c[var2] = new String(var3).intern();
      }

      return c[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14360;
      if (i[var3] == null) {
         i[var3] = (int)(f[var3] ^ var1);
      }

      return i[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[11];
      int var11 = 0;
      String var10 = "jÒ»é\u0002輺揈\b逦拠宵具侐孜侟网\u0004Cw\u009e]\u0006逨扽孴兛旲丛\t\u000b}}ü'ù³_'\u0014Mb×h\u008e\u0084·Ê\u0098e\u008dU\u001aÆi\u008ciLýµ\t\u0005\u001b¼0\u001f`´lÇ\u00149ñY\u001a_Ê\u008d\u0003ß\\er\u0007\"Ê\u0010\u001dßsÇ";
      int var12 = "jÒ»é\u0002輺揈\b逦拠宵具侐孜侟网\u0004Cw\u009e]\u0006逨扽孴兛旲丛\t\u000b}}ü'ù³_'\u0014Mb×h\u008e\u0084·Ê\u0098e\u008dU\u001aÆi\u008ciLýµ\t\u0005\u001b¼0\u001f`´lÇ\u00149ñY\u001a_Ê\u008d\u0003ß\\er\u0007\"Ê\u0010\u001dßsÇ"
         .length();
      char var9 = 4;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 108;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 106;
                        break;
                     case 1:
                        var65 = 86;
                        break;
                     case 2:
                        var65 = 9;
                        break;
                     case 3:
                        var65 = 110;
                        break;
                     case 4:
                        var65 = 88;
                        break;
                     case 5:
                        var65 = 99;
                        break;
                     default:
                        var65 = 76;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     c = new String[11];
                     long var0 = 8775940994058784566L;
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "_®\u0083\u000bÃ\u009fø\u009c.D´ñ\u0010üëª¹\u0091Du\u0083\u0096C§Õfù^$rÀÚ";
                     int var5 = "_®\u0083\u000bÃ\u009fø\u009c.D´ñ\u0010üëª¹\u0091Du\u0083\u0096C§Õfù^$rÀÚ".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    f = var6;
                                    i = new Integer[6];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "²+}\u0089ß\u0094Zðî\u0085\u001aÒ2¼ME";
                                 var5 = "²+}\u0089ß\u0094Zðî\u0085\u001aÒ2¼ME".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "Ð¸2\u0019wØ\t\u0018\u0004$UR\u0011";
                  var12 = "Ð¸2\u0019wØ\t\u0018\u0004$UR\u0011".length();
                  var9 = '\b';
                  var17 = -1;
            }

            var10000 = 124;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}






