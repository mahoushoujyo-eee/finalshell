import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

public class aJ extends aA implements xv_2 {
   na_2 B;
   yo_4 j;
   aJ D;
   HashMap G;
   tf_4 E;
   DefaultMutableTreeNode p;
   FileSystemView h;
   as_2 L;
   long S;
   boolean g;
   TreePath N;
   Object M;
   DefaultMutableTreeNode Z;
   int J;
   boolean w;
   int e;
   lu_4 d;
   nj_2 C;
   l5_2 k;
   boolean K;
   String W;
   UG Y;
   boolean T;
   public d6_2 I;
   boolean x;
   String H;
   HashSet A;
   private static final String[] a;
   private static final String[] c;
   private static final long[] f;
   private static final Integer[] i;

   public aJ(nj_2 var1, boolean var2) {
      super(new DefaultMutableTreeNode(a(11179, 2780), true));
      String var10000 = aA.z();
      com.c.c(604074053920059872L).set(this, new HashMap());
      com.c.c(357561646207134153L).set(this, null);
      com.c.c(137395258222385003L).setBoolean(this, false);
      com.c.c(281199022400540961L).setBoolean(this, false);
      com.c.c(506455871704714368L).setInt(this, b(23977, 3387944876465546672L));
      com.c.c(486701759580007258L).set(this, null);
      com.c.c(557374830394047111L).setBoolean(this, true);
      com.c.c(359637467035547923L).set(this, new d6_2());
      com.c.c(420994829726907422L).setBoolean(this, false);
      com.c.c(418695849841340312L).set(this, new HashSet());
      com.c.c(601768954800299943L).setBoolean(this, var2);
      com.c.c(310302490302373526L).set(this, var1);
      Object[] var10002 = com.c.f();
      Method var16 = com.c.d(270389152141252877L);
      Object[] var27 = var10002;
      Object var22 = null;

      try {
         var10002 = (Object[])var16.invoke(var22, var27);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var22 = com.c.f();
      Method var10005 = com.c.d(362821904568389131L);
      var27 = (Object[])var22;
      var22 = var10002;
      Method var18 = var10005;

      try {
         var10002 = (Object[])var18.invoke(var22, var27);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      com.c.c(137186759430385204L).set(this, var10002);
      String var3 = var10000;
      this.setBorder(null);
      this.setOpaque(false);
      com.c.c(593306439561595691L).set(this, this);
      com.c.c(348708854043337366L).set(this, com.c.c(478301022169899080L).get(null));
      this.getSelectionModel().setSelectionMode(4);
      com.c.c(441139186211959448L).set(this, new uC_3(this));
      Object[] var10001 = com.c.f();
      var22 = com.c.d(474998040866815030L);
      var10002 = var10001;
      aJ var13 = this;
      Method var10 = (Method)var22;

      try {
         var10.invoke(var13, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      this.setRootVisible(false);
      com.c.c(278993162580331623L).set(this, new na_2());
      this.setCellRenderer((na_2)com.c.c(278993162580331623L).get(this));
      this.setEditable(true);
      DN var4 = new DN(b(28117, 4288013608912016841L));
      TM var5 = new TM(this, var4, var1);
      this.setCellEditor(var5);
      this.setAutoscrolls(true);
      ((aJ)com.c.c(593306439561595691L).get(this)).setDragEnabled(true);
      ((aJ)com.c.c(593306439561595691L).get(this)).setDropMode(DropMode.ON_OR_INSERT);
      ((aJ)com.c.c(593306439561595691L).get(this)).setTransferHandler(new Wa_2((aJ)com.c.c(593306439561595691L).get(this)));
      ((aJ)com.c.c(593306439561595691L).get(this)).setEditable(true);
      this.getSelectionModel().addTreeSelectionListener(new af_2(this));
      this.addMouseListener(new oQ_3(this, var1, var2));
      ((aJ)com.c.c(593306439561595691L).get(this)).addTreeWillExpandListener(new a7(this));
      ((aJ)com.c.c(593306439561595691L).get(this)).addMouseMotionListener(new nu_2(this));
      com.c.c(413236117521042559L).set(this, FileSystemView.getFileSystemView());
      if (var3 == null) {
         if (var2) {
            this.setDragEnabled(false);
            this.setEditable(false);
         }

         var10000 = (String)com.c.c(388376917454860932L).get(null);
         var10001 = com.c.a(new cW_3(this));
         var22 = com.c.d(434592463220957006L);
         var10002 = var10001;
         var10001 = var10000;
         Method var12 = (Method)var22;

         try {
            var12.invoke(var10001, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }

      if (var3 != null) {
         com.ky_4.K(new String[3]);
      }
   }

   public boolean p() {
      return com.c.c(557374830394047111L).getBoolean(this);
   }

   void p$void() {
      com.c.c(312919167011526763L).set(this, new DefaultMutableTreeNode(a(11169, -16171)));
      com.c.c(571388131590801605L).set(this, new yo_4((DefaultMutableTreeNode)com.c.c(312919167011526763L).get(this)));
      this.setModel((yo_4)com.c.c(571388131590801605L).get(this));
   }

   void Y() {
      String var10000 = aA.z();
      com.c.c(357561646207134153L).set(this, new tf_4());
      String var1 = var10000;
      File var2 = new File((String)com.c.c(478301022169899080L).get(null));
      if (var1 == null) {
         if (!var2.exists()) {
            var2.mkdirs();
         }

         var10000 = (String)com.c.c(357561646207134153L).get(this);
         Object[] var10001 = com.c.a(var2);
         Method var10003 = com.c.d(349593801287953443L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         Method var6 = var10003;

         try {
            var6.invoke(var10001, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }

         var10000 = (String)com.c.c(357561646207134153L).get(this);
         var10001 = com.c.a(a(11171, -28131));
         var10003 = com.c.d(124677196473982808L);
         var10002 = var10001;
         var10001 = var10000;
         Method var8 = var10003;

         try {
            var8.invoke(var10001, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      }
   }

   @Override
   public Rectangle m(Point var1) {
      return null;
   }

   public l5_2 v() {
      Method var10000 = (Method)com.c.c(310302490302373526L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(149160680229662748L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var5 = (KQ)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      KQ var1 = var5;
      com.c.c(486701759580007258L)
         .set(
            this,
            new l5_2(
               (aJ)com.c.c(593306439561595691L).get(this),
               (DefaultMutableTreeNode)com.c.c(213130010239103238L).get(this),
               var1,
               true,
               com.c.c(601768954800299943L).getBoolean(this)
            )
         );
      var10001 = com.c.a(true);
      var10003 = com.c.d(438941361784812150L);
      var10002 = var10001;
      KQ var9 = var1;
      var10000 = var10003;

      try {
         var10000.invoke(var9, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      ((l5_2)com.c.c(486701759580007258L).get(this)).addPopupMenuListener(new ok_4(this, var1));
      return (l5_2)com.c.c(486701759580007258L).get(this);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void k() {
      String var10000 = aA.z();
      Method var10001 = (Method)com.c.c(593306439561595691L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(447854232501987193L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var106 = (List)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var48) {
         throw var48.getTargetException();
      }

      List var2 = var106;
      boolean var3 = false;
      String var1 = var10000;
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      ArrayList var6 = new ArrayList();
      Iterator var7 = var2.iterator();

      while (true) {
         if (var7.hasNext()) {
            DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var7.next();
            var58 = var8.getUserObject().getClass().equals(ck_4.class);
            if (var1 != null) {
               break;
            }

            label441: {
               if (var1 == null) {
                  if (var58) {
                     ck_4 var9 = (ck_4)var8.getUserObject();
                     var4.add(var9);
                     if (var1 == null) {
                        break label441;
                     }
                  }

                  var58 = var8.getUserObject().getClass().equals(tf_4.class);
               }

               if (var58) {
                  Object[] var107 = com.c.a(var8, var4);
                  Method var190 = com.c.d(363671406087219533L);
                  var10002 = var107;
                  aJ var108 = this;
                  Method var59 = var190;

                  try {
                     var59.invoke(var108, var10002);
                  } catch (InvocationTargetException var47) {
                     throw var47.getTargetException();
                  }
               }
            }

            if (var1 == null) {
               continue;
            }
         }

         var7 = var4.iterator();
         var58 = var7.hasNext();
         break;
      }

      while (var58) {
         ck_4 var50 = (ck_4)var7.next();
         Object[] var60 = com.c.f();
         Method var61 = com.c.d(270389152141252877L);
         var10002 = var60;
         var10001 = null;

         try {
            var10000 = (String)var61.invoke(var10001, var10002);
         } catch (InvocationTargetException var46) {
            throw var46.getTargetException();
         }

         Object[] var111 = com.c.f();
         Method var191 = com.c.d(410905379772103887L);
         var10002 = var111;
         var10001 = var10000;
         Method var63 = var191;

         try {
            var10000 = (String)var63.invoke(var10001, var10002);
         } catch (InvocationTargetException var45) {
            throw var45.getTargetException();
         }

         var10002 = com.c.f();
         var10004 = com.c.d(605430732347023634L);
         var10003 = var10002;
         ck_4 var169 = var50;
         var10001 = var10004;

         try {
            var10001 = (Method)var10001.invoke(var169, var10003);
         } catch (InvocationTargetException var44) {
            throw var44.getTargetException();
         }

         Object[] var115 = com.c.a(var10001);
         Method var193 = com.c.d(489768706953623433L);
         var10002 = var115;
         var10001 = var10000;
         Method var65 = var193;

         try {
            var66 = (lv_4)var65.invoke(var10001, var10002);
         } catch (InvocationTargetException var43) {
            throw var43.getTargetException();
         }

         label454: {
            lv_4 var52 = var66;
            lv_4 var67 = var52;
            if (var1 == null) {
               if (var52 == null) {
                  break label454;
               }

               var67 = var52;
            }

            Object[] var117 = com.c.f();
            Method var194 = com.c.d(402271797068414482L);
            var10002 = var117;
            lv_4 var118 = var67;
            Method var68 = var194;

            try {
               var69 = (Integer)var68.invoke(var118, var10002);
            } catch (InvocationTargetException var42) {
               throw var42.getTargetException();
            }

            int var119 = com.c.c(590765520000496083L).getInt(null);
            if (var1 == null) {
               if (var69 == var119) {
                  var5.add(var52);
                  if (var1 == null) {
                     break label454;
                  }
               }

               Object[] var120 = com.c.f();
               Method var195 = com.c.d(402271797068414482L);
               var10002 = var120;
               lv_4 var121 = var52;
               Method var70 = var195;

               try {
                  var69 = (Integer)var70.invoke(var121, var10002);
               } catch (InvocationTargetException var41) {
                  throw var41.getTargetException();
               }

               if (var1 != null) {
                  break label454;
               }

               var119 = com.c.c(292712586650823274L).getInt(null);
            }

            if (var69 == var119) {
               var6.add(var52);
            }
         }

         if (var1 != null) {
            break;
         }

         var58 = var7.hasNext();
      }

      var10000 = (String)com.c.c(310302490302373526L).get(this);
      Object[] var122 = com.c.f();
      Method var196 = com.c.d(149160680229662748L);
      var10002 = var122;
      var10001 = var10000;
      Method var72 = var196;

      try {
         var73 = (KQ)var72.invoke(var10001, var10002);
      } catch (InvocationTargetException var40) {
         throw var40.getTargetException();
      }

      KQ var49 = var73;
      Object[] var124 = com.c.f();
      Method var197 = com.c.d(249886410317960768L);
      var10002 = var124;
      KQ var125 = var49;
      Method var74 = var197;

      try {
         var75 = (U)var74.invoke(var125, var10002);
      } catch (InvocationTargetException var39) {
         throw var39.getTargetException();
      }

      U var51 = var75;
      byte var53 = 0;
      Object[] var126 = com.c.f();
      Method var198 = com.c.d(303756590022481369L);
      var10002 = var126;
      U var127 = var51;
      Method var76 = var198;

      try {
         var10000 = (String)var76.invoke(var127, var10002);
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      Object[] var128 = com.c.f();
      Method var199 = com.c.d(194560825135347400L);
      var10002 = var128;
      var10001 = var10000;
      Method var78 = var199;

      try {
         var10000 = (String)var78.invoke(var10001, var10002);
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      Object[] var130 = com.c.f();
      Method var200 = com.c.d(424156930953488367L);
      var10002 = var130;
      var10001 = var10000;
      Method var80 = var200;

      try {
         var81 = (F8)var80.invoke(var10001, var10002);
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      CL var11;
      label403: {
         F8 var10 = var81;
         var11 = null;
         byte var82 = var10 instanceof CL;
         if (var1 == null) {
            if (var82 == 0) {
               break label403;
            }

            var82 = 1;
         }

         var53 = var82;
         var11 = (CL)var10;
      }

      Object[] var132 = com.c.f();
      Method var201 = com.c.d(303756590022481369L);
      var10002 = var132;
      U var133 = var51;
      Method var83 = var201;

      try {
         var10000 = (String)var83.invoke(var133, var10002);
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      Object[] var134 = com.c.f();
      Method var202 = com.c.d(230171768324088030L);
      var10002 = var134;
      var10001 = var10000;
      Method var85 = var202;

      try {
         var86 = (ArrayList)var85.invoke(var10001, var10002);
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      int var12 = var86.size();
      Object[] var136 = com.c.f();
      Method var203 = com.c.d(303756590022481369L);
      var10002 = var136;
      U var137 = var51;
      Method var87 = var203;

      try {
         var10000 = (String)var87.invoke(var137, var10002);
      } catch (InvocationTargetException var33) {
         throw var33.getTargetException();
      }

      Object[] var138 = com.c.f();
      Method var204 = com.c.d(230171768324088030L);
      var10002 = var138;
      var10001 = var10000;
      Method var89 = var204;

      try {
         var90 = (ArrayList)var89.invoke(var10001, var10002);
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      t3_2 var91 = (t3_2)var90.get(var12 - 1);
      Object[] var140 = com.c.f();
      Method var205 = com.c.d(424156930953488367L);
      var10002 = var140;
      t3_2 var141 = var91;
      Method var92 = var205;

      try {
         var93 = (F8)var92.invoke(var141, var10002);
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      CL var14;
      label396: {
         F8 var13 = var93;
         var14 = null;
         F8 var94 = var13;
         if (var1 == null) {
            if (!(var13 instanceof CL)) {
               break label396;
            }

            var94 = var13;
         }

         var14 = (CL)var94;
      }

      label475: {
         int var95 = var53;
         if (var1 == null) {
            if (var53 != 0) {
               var96 = var5;
               label382:
               if (var1 == null) {
                  label372:
                  if (var5.size() > 0) {
                     if (var5.size() == 1) {
                        File var142;
                        lv_4 var206 = (lv_4)var5.get(0);
                        Object[] var231 = com.c.f();
                        Method var10006 = com.c.d(432693308750455264L);
                        Object[] var10005 = var231;
                        lv_4 var232 = var206;
                        Method var207 = var10006;

                        try {
                           var10003 = (String)var207.invoke(var232, var10005);
                        } catch (InvocationTargetException var30) {
                           throw var30.getTargetException();
                        }

                        var142 = new File(var10003);
                        Object[] var143 = com.c.a(var142, var51);
                        Method var209 = com.c.d(298666565248176577L);
                        var10002 = var143;
                        CL var144 = var11;
                        Method var97 = var209;

                        try {
                           var97.invoke(var144, var10002);
                        } catch (InvocationTargetException var29) {
                           throw var29.getTargetException();
                        }

                        if (var1 == null) {
                           break label372;
                        }
                     }

                     if (var1 == null && var14 != null) {
                        File var145;
                        lv_4 var210 = (lv_4)var5.get(0);
                        Object[] var233 = com.c.f();
                        Method var251 = com.c.d(432693308750455264L);
                        Object[] var245 = var233;
                        lv_4 var234 = var210;
                        Method var211 = var251;

                        try {
                           var10003 = (String)var211.invoke(var234, var245);
                        } catch (InvocationTargetException var28) {
                           throw var28.getTargetException();
                        }

                        var145 = new File(var10003);
                        Object[] var146 = com.c.a(var145, var51);
                        Method var213 = com.c.d(298666565248176577L);
                        var10002 = var146;
                        CL var147 = var14;
                        Method var98 = var213;

                        try {
                           var98.invoke(var147, var10002);
                        } catch (InvocationTargetException var27) {
                           throw var27.getTargetException();
                        }

                        var5.remove(0);
                     }

                     for (lv_4 var16 : var5) {
                        File var148;
                        Object[] var235 = com.c.f();
                        Method var252 = com.c.d(432693308750455264L);
                        Object[] var246 = var235;
                        lv_4 var236 = var16;
                        Method var214 = var252;

                        try {
                           var10003 = (String)var214.invoke(var236, var246);
                        } catch (InvocationTargetException var26) {
                           throw var26.getTargetException();
                        }

                        var148 = new File(var10003);
                        Object[] var149 = com.c.a(var148, true);
                        Method var216 = com.c.d(392275651608919501L);
                        var10002 = var149;
                        U var150 = var51;
                        Method var99 = var216;

                        try {
                           var99.invoke(var150, var10002);
                        } catch (InvocationTargetException var25) {
                           throw var25.getTargetException();
                        }

                        if (var1 != null) {
                           break label382;
                        }

                        if (var1 != null) {
                           break;
                        }
                     }
                  }

                  var96 = var6;
               }

               for (lv_4 var55 : var96) {
                  File var151;
                  Object[] var237 = com.c.f();
                  Method var253 = com.c.d(432693308750455264L);
                  Object[] var247 = var237;
                  lv_4 var238 = var55;
                  Method var217 = var253;

                  try {
                     var10003 = (String)var217.invoke(var238, var247);
                  } catch (InvocationTargetException var24) {
                     throw var24.getTargetException();
                  }

                  var151 = new File(var10003);
                  Object[] var152 = com.c.a(var151, true);
                  Method var219 = com.c.d(392275651608919501L);
                  var10002 = var152;
                  U var153 = var51;
                  Method var100 = var219;

                  try {
                     var100.invoke(var153, var10002);
                  } catch (InvocationTargetException var23) {
                     throw var23.getTargetException();
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

            var101 = var5;
            if (var1 != null) {
               break label475;
            }

            var95 = var5.size();
         }

         if (var95 > 0) {
            if (var1 == null && var14 != null) {
               File var154;
               lv_4 var220 = (lv_4)var5.get(0);
               Object[] var239 = com.c.f();
               Method var254 = com.c.d(432693308750455264L);
               Object[] var248 = var239;
               lv_4 var240 = var220;
               Method var221 = var254;

               try {
                  var10003 = (String)var221.invoke(var240, var248);
               } catch (InvocationTargetException var22) {
                  throw var22.getTargetException();
               }

               var154 = new File(var10003);
               Object[] var155 = com.c.a(var154, var51);
               Method var223 = com.c.d(298666565248176577L);
               var10002 = var155;
               CL var156 = var14;
               Method var102 = var223;

               try {
                  var102.invoke(var156, var10002);
               } catch (InvocationTargetException var21) {
                  throw var21.getTargetException();
               }

               var5.remove(0);
            }

            for (lv_4 var56 : var5) {
               File var157;
               Object[] var241 = com.c.f();
               Method var255 = com.c.d(432693308750455264L);
               Object[] var249 = var241;
               lv_4 var242 = var56;
               Method var224 = var255;

               try {
                  var10003 = (String)var224.invoke(var242, var249);
               } catch (InvocationTargetException var20) {
                  throw var20.getTargetException();
               }

               var157 = new File(var10003);
               Object[] var158 = com.c.a(var157, true);
               Method var226 = com.c.d(392275651608919501L);
               var10002 = var158;
               U var159 = var51;
               Method var103 = var226;

               try {
                  var103.invoke(var159, var10002);
               } catch (InvocationTargetException var19) {
                  throw var19.getTargetException();
               }

               if (var1 != null) {
                  break label475;
               }

               if (var1 != null) {
                  break;
               }
            }
         }

         var101 = var6;
      }

      for (lv_4 var57 : var101) {
         File var160;
         Object[] var243 = com.c.f();
         Method var256 = com.c.d(432693308750455264L);
         Object[] var250 = var243;
         lv_4 var244 = var57;
         Method var227 = var256;

         try {
            var10003 = (String)var227.invoke(var244, var250);
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         var160 = new File(var10003);
         Object[] var161 = com.c.a(var160, true);
         Method var229 = com.c.d(392275651608919501L);
         var10002 = var161;
         U var162 = var51;
         Method var104 = var229;

         try {
            var104.invoke(var162, var10002);
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public void N() {
      String var10000 = aA.z();
      String var2 = (String)com.c.c(348708854043337366L).get(this);
      Object[] var10001 = com.c.f();
      Method var56 = com.c.d(270389152141252877L);
      Object[] var105 = var10001;
      Object var86 = null;

      try {
         var10001 = (Object[])var56.invoke(var86, var105);
      } catch (InvocationTargetException var31) {
         throw var31.getTargetException();
      }

      var86 = com.c.f();
      Method var10004 = com.c.d(306266403902896148L);
      var105 = (Object[])var86;
      var86 = var10001;
      Method var58 = var10004;

      try {
         var10001 = (u6_2)var58.invoke(var86, var105);
      } catch (InvocationTargetException var30) {
         throw var30.getTargetException();
      }

      u6_2 var3 = var10001;
      var86 = com.c.f();
      var10004 = com.c.d(441706210979477420L);
      var105 = (Object[])var86;
      var86 = var3;
      Method var60 = var10004;

      try {
         var10001 = (String)var60.invoke(var86, var105);
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      String var1;
      String var4;
      label189: {
         var4 = var10001;
         var1 = var10000;
         boolean var5 = false;
         int var32 = var2.equals((String)com.c.c(478301022169899080L).get(null));
         if (var1 == null) {
            if (var32 == 0) {
               break label189;
            }

            var32 = new File((String)com.c.c(478301022169899080L).get(null)).listFiles().length;
         }

         if (var1 == null && var32 == 0) {
            boolean var33 = true;
         }
      }

      var10000 = (String)com.c.c(310302490302373526L).get(this);
      var10001 = com.c.f();
      Method var108 = com.c.d(149160680229662748L);
      var86 = var10001;
      var10001 = var10000;
      Method var35 = var108;

      try {
         var36 = (KQ)var35.invoke(var10001, (Object[])var86);
      } catch (InvocationTargetException var28) {
         throw var28.getTargetException();
      }

      KQ var6 = var36;
      var10001 = com.c.f();
      Method var109 = com.c.d(249886410317960768L);
      var86 = var10001;
      KQ var65 = var6;
      Method var37 = var109;

      try {
         var38 = (U)var37.invoke(var65, (Object[])var86);
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      U var7;
      YB var8;
      label190: {
         var7 = var38;
         var8 = new YB(com.c.c(317162390314131527L).getInt(null), var7, a(11174, -30976), new dv_4(), false);
         if (var1 == null) {
            if (var4 != null) {
               var39 = var4.equals((String)com.c.c(149082991182987426L).get(null));
               if (var1 != null) {
                  break label190;
               }

               if (var39 == 0) {
                  var10001 = com.c.a(var4, true, true);
                  Method var110 = com.c.d(206082969888821725L);
                  var86 = var10001;
                  YB var67 = var8;
                  Method var40 = var110;

                  try {
                     var40.invoke(var67, (Object[])var86);
                  } catch (InvocationTargetException var26) {
                     throw var26.getTargetException();
                  }
               }
            }

            var8.setSize(b(30930, 1570349893146755279L), b(20038, 8833900715546408542L));
            var8.setLocationRelativeTo(var7);
            var8.setVisible(true);
         }

         var10001 = com.c.f();
         Method var111 = com.c.d(418327897845479655L);
         var86 = var10001;
         YB var69 = var8;
         Method var41 = var111;

         try {
            var39 = (Integer)var41.invoke(var69, (Object[])var86);
         } catch (InvocationTargetException var25) {
            throw var25.getTargetException();
         }
      }

      int var9 = var39;
      if (var9 == com.c.c(564170828581134815L).getInt(null)) {
         new ArrayList();
         var10001 = com.c.f();
         Method var112 = com.c.d(293270026918177010L);
         var86 = var10001;
         YB var71 = var8;
         Method var42 = var112;

         try {
            var43 = (ArrayList)var42.invoke(var71, (Object[])var86);
         } catch (InvocationTargetException var24) {
            throw var24.getTargetException();
         }

         label192: {
            ArrayList var11 = var43;
            String var12 = null;
            if (var11.size() > 0) {
               J7 var13 = new J7();
               var10001 = com.c.a(var7);
               Method var113 = com.c.d(222783555954803141L);
               var86 = var10001;
               J7 var73 = var13;
               Method var44 = var113;

               try {
                  var44.invoke(var73, (Object[])var86);
               } catch (InvocationTargetException var23) {
                  throw var23.getTargetException();
               }

               var10001 = com.c.a(com.c.c(441139186211959448L).get(this));
               Method var114 = com.c.d(611100388280232303L);
               var86 = var10001;
               J7 var75 = var13;
               Method var45 = var114;

               try {
                  var45.invoke(var75, (Object[])var86);
               } catch (InvocationTargetException var22) {
                  throw var22.getTargetException();
               }

               for (Object var15 : var11) {
                  Object[] var46 = com.c.a(var15);
                  Method var47 = com.c.d(492128056065034754L);
                  var86 = var46;
                  var10001 = null;

                  try {
                     var48 = (File)var47.invoke(var10001, (Object[])var86);
                  } catch (InvocationTargetException var20) {
                     throw var20.getTargetException();
                  }

                  File var16 = var48;
                  if (var1 != null) {
                     break label192;
                  }

                  label156: {
                     boolean var49 = var16.isFile();
                     if (var1 == null) {
                        if (var49) {
                           var12 = var16.getParent();
                           if (var1 == null) {
                              break label156;
                           }
                        }

                        var49 = var16.isDirectory();
                     }

                     if (var49) {
                     }
                  }

                  var10001 = com.c.a(var16, var2);
                  Method var115 = com.c.d(260302370089021453L);
                  var86 = var10001;
                  aJ var79 = this;
                  Method var50 = var115;

                  try {
                     var50.invoke(var79, (Object[])var86);
                  } catch (InvocationTargetException var21) {
                     throw var21.getTargetException();
                  }

                  if (var1 != null) {
                     break;
                  }
               }
            }

            SwingUtilities.invokeLater(new g0(this, var2));
            var10001 = com.c.a(var12);
            Method var116 = com.c.d(349581629171014440L);
            var86 = var10001;
            u6_2 var81 = var3;
            Method var51 = var116;

            try {
               var51.invoke(var81, (Object[])var86);
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }
         }

         Object[] var52 = com.c.f();
         Method var53 = com.c.d(270389152141252877L);
         var86 = var52;
         var10001 = null;

         try {
            var10000 = (String)var53.invoke(var10001, (Object[])var86);
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         var10001 = com.c.f();
         Method var117 = com.c.d(578864097947885485L);
         var86 = var10001;
         var10001 = var10000;
         Method var55 = var117;

         try {
            var55.invoke(var10001, (Object[])var86);
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
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
      // 000: invokestatic aA.z ()Ljava/lang/String;
      // 003: new java/util/ArrayList
      // 006: dup
      // 007: invokespecial java/util/ArrayList.<init> ()V
      // 00a: astore 2
      // 00b: aload 0
      // 00c: ldc2_w 348708854043337366
      // 00f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 012: swap
      // 013: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 016: checkcast java/lang/String
      // 019: astore 3
      // 01a: astore 1
      // 01b: aload 0
      // 01c: aload 1
      // 01d: ifnonnull 1e6
      // 020: ldc2_w 420994829726907422
      // 023: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 026: swap
      // 027: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 02a: ifne 1de
      // 02d: goto 034
      // 030: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 033: athrow
      // 034: aload 0
      // 035: ldc2_w 359637467035547923
      // 038: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 03b: swap
      // 03c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 03f: invokestatic com/c.f ()[Ljava/lang/Object;
      // 042: ldc2_w 442657485924266205
      // 045: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 048: dup_x2
      // 049: pop
      // 04a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 04d: checkcast java/util/ArrayList
      // 050: goto 057
      // 053: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 056: athrow
      // 057: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 05a: astore 4
      // 05c: aload 4
      // 05e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 063: ifeq 184
      // 066: aload 4
      // 068: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 06d: checkcast java/lang/String
      // 070: astore 5
      // 072: aload 0
      // 073: ldc2_w 604074053920059872
      // 076: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 079: swap
      // 07a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 07d: checkcast java/util/HashMap
      // 080: aload 5
      // 082: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 085: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 088: astore 6
      // 08a: aload 6
      // 08c: aload 1
      // 08d: ifnonnull 199
      // 090: ifnull 0aa
      // 093: goto 09a
      // 096: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 099: athrow
      // 09a: aload 2
      // 09b: aload 6
      // 09d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0a2: pop
      // 0a3: goto 0aa
      // 0a6: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a9: athrow
      // 0aa: new lv_4
      // 0ad: dup
      // 0ae: invokespecial lv_4.<init> ()V
      // 0b1: astore 7
      // 0b3: aload 7
      // 0b5: aload 5
      // 0b7: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0ba: ldc2_w 574053907803002361
      // 0bd: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0c0: dup_x2
      // 0c1: pop
      // 0c2: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0c5: pop
      // 0c6: goto 0cd
      // 0c9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0cc: athrow
      // 0cd: aload 7
      // 0cf: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0d2: ldc2_w 540969864624467425
      // 0d5: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0d8: dup_x2
      // 0d9: pop
      // 0da: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0dd: pop
      // 0de: goto 0e5
      // 0e1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: goto 0ef
      // 0e8: astore 8
      // 0ea: aload 8
      // 0ec: invokevirtual java/lang/Exception.printStackTrace ()V
      // 0ef: aload 7
      // 0f1: aload 3
      // 0f2: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 0f5: ldc2_w 189603700854791470
      // 0f8: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0fb: dup_x2
      // 0fc: pop
      // 0fd: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 100: pop
      // 101: goto 108
      // 104: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 107: athrow
      // 108: aload 7
      // 10a: invokestatic com/c.f ()[Ljava/lang/Object;
      // 10d: ldc2_w 236040230540929068
      // 110: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 113: swap
      // 114: aconst_null
      // 115: swap
      // 116: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 119: goto 120
      // 11c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 11f: athrow
      // 120: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 123: ldc2_w 611820767281823807
      // 126: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 129: dup_x2
      // 12a: pop
      // 12b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 12e: pop
      // 12f: goto 136
      // 132: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 135: athrow
      // 136: invokestatic java/lang/System.currentTimeMillis ()J
      // 139: lstore 8
      // 13b: invokestatic com/c.f ()[Ljava/lang/Object;
      // 13e: ldc2_w 270389152141252877
      // 141: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 144: swap
      // 145: aconst_null
      // 146: swap
      // 147: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 14a: goto 151
      // 14d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 150: athrow
      // 151: invokestatic com/c.f ()[Ljava/lang/Object;
      // 154: ldc2_w 410905379772103887
      // 157: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 15a: dup_x2
      // 15b: pop
      // 15c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 15f: goto 166
      // 162: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 165: athrow
      // 166: aload 7
      // 168: bipush 0
      // 169: bipush 0
      // 16a: invokestatic com/c.a (Ljava/lang/Object;IZ)[Ljava/lang/Object;
      // 16d: ldc2_w 425640194583900456
      // 170: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 173: dup_x2
      // 174: pop
      // 175: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 178: pop
      // 179: goto 180
      // 17c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 17f: athrow
      // 180: aload 1
      // 181: ifnull 05c
      // 184: aload 0
      // 185: ldc2_w 604074053920059872
      // 188: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 18b: swap
      // 18c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 18f: checkcast java/util/HashMap
      // 192: aload 3
      // 193: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 196: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 199: astore 4
      // 19b: aload 0
      // 19c: aload 4
      // 19e: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1a1: ldc2_w 276002133797788160
      // 1a4: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1a7: dup_x2
      // 1a8: pop
      // 1a9: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1ac: pop
      // 1ad: goto 1b4
      // 1b0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: ldc2_w 359637467035547923
      // 1b8: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1bb: swap
      // 1bc: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1bf: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1c2: ldc2_w 442657485924266205
      // 1c5: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1c8: dup_x2
      // 1c9: pop
      // 1ca: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1cd: checkcast java/util/ArrayList
      // 1d0: goto 1d7
      // 1d3: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1d6: athrow
      // 1d7: invokevirtual java/util/ArrayList.clear ()V
      // 1da: aload 1
      // 1db: ifnull 619
      // 1de: aload 0
      // 1df: goto 1e6
      // 1e2: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1e5: athrow
      // 1e6: ldc2_w 359637467035547923
      // 1e9: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 1ec: swap
      // 1ed: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1f0: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1f3: ldc2_w 442657485924266205
      // 1f6: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1f9: dup_x2
      // 1fa: pop
      // 1fb: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1fe: checkcast java/util/ArrayList
      // 201: goto 208
      // 204: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 207: athrow
      // 208: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 20b: astore 4
      // 20d: aload 4
      // 20f: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 214: ifeq 28b
      // 217: aload 4
      // 219: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 21e: checkcast java/lang/String
      // 221: astore 5
      // 223: bipush 0
      // 224: istore 6
      // 226: new java/io/File
      // 229: dup
      // 22a: aload 5
      // 22c: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 22f: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 232: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 235: aload 1
      // 236: ifnonnull 29d
      // 239: aload 3
      // 23a: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 23d: aload 1
      // 23e: ifnonnull 257
      // 241: goto 248
      // 244: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 247: athrow
      // 248: ifeq 255
      // 24b: goto 252
      // 24e: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 251: athrow
      // 252: bipush 1
      // 253: istore 6
      // 255: iload 6
      // 257: ifne 287
      // 25a: aload 0
      // 25b: ldc2_w 604074053920059872
      // 25e: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 261: swap
      // 262: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 265: checkcast java/util/HashMap
      // 268: aload 5
      // 26a: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 26d: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 270: astore 7
      // 272: aload 7
      // 274: ifnull 287
      // 277: aload 2
      // 278: aload 7
      // 27a: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 27f: pop
      // 280: goto 287
      // 283: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 286: athrow
      // 287: aload 1
      // 288: ifnull 20d
      // 28b: aload 0
      // 28c: ldc2_w 604074053920059872
      // 28f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 292: swap
      // 293: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 296: checkcast java/util/HashMap
      // 299: aload 3
      // 29a: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 29d: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 2a0: astore 4
      // 2a2: aload 0
      // 2a3: aload 4
      // 2a5: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2a8: ldc2_w 276002133797788160
      // 2ab: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2ae: dup_x2
      // 2af: pop
      // 2b0: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2b3: pop
      // 2b4: goto 2bb
      // 2b7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2ba: athrow
      // 2bb: aload 0
      // 2bc: ldc2_w 359637467035547923
      // 2bf: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2c2: swap
      // 2c3: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c6: invokestatic com/c.f ()[Ljava/lang/Object;
      // 2c9: ldc2_w 442657485924266205
      // 2cc: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2cf: dup_x2
      // 2d0: pop
      // 2d1: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2d4: checkcast java/util/ArrayList
      // 2d7: goto 2de
      // 2da: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2dd: athrow
      // 2de: invokevirtual java/util/ArrayList.clear ()V
      // 2e1: aload 2
      // 2e2: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2e7: astore 5
      // 2e9: aload 5
      // 2eb: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2f0: ifeq 619
      // 2f3: aload 5
      // 2f5: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2fa: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 2fd: astore 6
      // 2ff: aload 6
      // 301: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 304: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 307: ldc_w ck_4
      // 30a: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 30d: aload 1
      // 30e: ifnonnull 612
      // 311: ifeq 5fd
      // 314: goto 31b
      // 317: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31a: athrow
      // 31b: aload 6
      // 31d: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 320: checkcast ck_4
      // 323: astore 7
      // 325: aload 7
      // 327: invokestatic com/c.f ()[Ljava/lang/Object;
      // 32a: ldc2_w 272998330038223631
      // 32d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 330: dup_x2
      // 331: pop
      // 332: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 335: checkcast java/io/File
      // 338: goto 33f
      // 33b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 33e: athrow
      // 33f: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 342: astore 8
      // 344: aload 7
      // 346: invokestatic com/c.f ()[Ljava/lang/Object;
      // 349: ldc2_w 272998330038223631
      // 34c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 34f: dup_x2
      // 350: pop
      // 351: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 354: checkcast java/io/File
      // 357: goto 35e
      // 35a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 35d: athrow
      // 35e: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 361: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 364: astore 9
      // 366: aconst_null
      // 367: astore 10
      // 369: aload 0
      // 36a: ldc2_w 604074053920059872
      // 36d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 370: swap
      // 371: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 374: checkcast java/util/HashMap
      // 377: aload 3
      // 378: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 37b: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 37e: astore 11
      // 380: aload 11
      // 382: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 385: checkcast tf_4
      // 388: astore 10
      // 38a: new java/lang/StringBuilder
      // 38d: dup
      // 38e: invokespecial java/lang/StringBuilder.<init> ()V
      // 391: aload 10
      // 393: invokestatic com/c.f ()[Ljava/lang/Object;
      // 396: ldc2_w 543633160597441792
      // 399: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 39c: dup_x2
      // 39d: pop
      // 39e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3a1: checkcast java/io/File
      // 3a4: goto 3ab
      // 3a7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3aa: athrow
      // 3ab: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 3ae: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b1: getstatic java/io/File.separator Ljava/lang/String;
      // 3b4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3b7: aload 7
      // 3b9: invokestatic com/c.f ()[Ljava/lang/Object;
      // 3bc: ldc2_w 272998330038223631
      // 3bf: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 3c2: dup_x2
      // 3c3: pop
      // 3c4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3c7: checkcast java/io/File
      // 3ca: goto 3d1
      // 3cd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3d0: athrow
      // 3d1: invokevirtual java/io/File.getName ()Ljava/lang/String;
      // 3d4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3da: astore 12
      // 3dc: new java/io/File
      // 3df: dup
      // 3e0: aload 12
      // 3e2: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 3e5: astore 13
      // 3e7: bipush 1
      // 3e8: istore 14
      // 3ea: aload 7
      // 3ec: invokestatic com/c.f ()[Ljava/lang/Object;
      // 3ef: ldc2_w 272998330038223631
      // 3f2: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 3f5: dup_x2
      // 3f6: pop
      // 3f7: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3fa: checkcast java/io/File
      // 3fd: goto 404
      // 400: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 403: athrow
      // 404: aload 13
      // 406: invokestatic org/apache/commons/io/FileUtils.moveFile (Ljava/io/File;Ljava/io/File;)V
      // 409: goto 416
      // 40c: astore 15
      // 40e: aload 15
      // 410: invokevirtual java/io/IOException.printStackTrace ()V
      // 413: bipush 0
      // 414: istore 14
      // 416: iload 14
      // 418: ifeq 5f9
      // 41b: aload 0
      // 41c: ldc2_w 593306439561595691
      // 41f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 422: swap
      // 423: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 426: aload 9
      // 428: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 42b: ldc2_w 509874190727776741
      // 42e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 431: dup_x2
      // 432: pop
      // 433: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 436: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 439: goto 440
      // 43c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 43f: athrow
      // 440: astore 15
      // 442: aload 0
      // 443: ldc2_w 571388131590801605
      // 446: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 449: swap
      // 44a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 44d: checkcast yo_4
      // 450: aload 6
      // 452: invokevirtual yo_4.removeNodeFromParent (Ljavax/swing/tree/MutableTreeNode;)V
      // 455: aload 15
      // 457: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 45a: checkcast tf_4
      // 45d: astore 16
      // 45f: aload 16
      // 461: aload 8
      // 463: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 466: ldc2_w 548576199562161390
      // 469: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 46c: dup_x2
      // 46d: pop
      // 46e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 471: pop
      // 472: goto 479
      // 475: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 478: athrow
      // 479: aload 0
      // 47a: ldc2_w 593306439561595691
      // 47d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 480: swap
      // 481: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 484: aload 8
      // 486: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 489: ldc2_w 387993827549279839
      // 48c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 48f: dup_x2
      // 490: pop
      // 491: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 494: pop
      // 495: goto 49c
      // 498: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 49b: athrow
      // 49c: new ck_4
      // 49f: dup
      // 4a0: invokespecial ck_4.<init> ()V
      // 4a3: astore 17
      // 4a5: aload 17
      // 4a7: aload 13
      // 4a9: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4ac: ldc2_w 325634526741383265
      // 4af: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4b2: dup_x2
      // 4b3: pop
      // 4b4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4b7: pop
      // 4b8: goto 4bf
      // 4bb: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4be: athrow
      // 4bf: aload 17
      // 4c1: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 4c4: ldc2_w 336419247910974761
      // 4c7: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4ca: swap
      // 4cb: aconst_null
      // 4cc: swap
      // 4cd: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4d0: pop
      // 4d1: goto 4d8
      // 4d4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4d7: athrow
      // 4d8: aload 10
      // 4da: invokestatic com/c.f ()[Ljava/lang/Object;
      // 4dd: ldc2_w 248698316749304686
      // 4e0: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4e3: dup_x2
      // 4e4: pop
      // 4e5: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4e8: checkcast java/util/List
      // 4eb: goto 4f2
      // 4ee: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4f1: athrow
      // 4f2: aload 17
      // 4f4: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 4f9: pop
      // 4fa: invokestatic com/c.f ()[Ljava/lang/Object;
      // 4fd: ldc2_w 270389152141252877
      // 500: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 503: swap
      // 504: aconst_null
      // 505: swap
      // 506: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 509: goto 510
      // 50c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 50f: athrow
      // 510: invokestatic com/c.f ()[Ljava/lang/Object;
      // 513: ldc2_w 410905379772103887
      // 516: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 519: dup_x2
      // 51a: pop
      // 51b: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 51e: goto 525
      // 521: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 524: athrow
      // 525: aload 7
      // 527: invokestatic com/c.f ()[Ljava/lang/Object;
      // 52a: ldc2_w 605430732347023634
      // 52d: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 530: dup_x2
      // 531: pop
      // 532: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 535: goto 53c
      // 538: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 53b: athrow
      // 53c: aload 12
      // 53e: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 541: ldc2_w 120242074362177751
      // 544: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 547: dup_x2
      // 548: pop
      // 549: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 54c: pop
      // 54d: goto 554
      // 550: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 553: athrow
      // 554: new javax/swing/tree/DefaultMutableTreeNode
      // 557: dup
      // 558: aload 17
      // 55a: invokespecial javax/swing/tree/DefaultMutableTreeNode.<init> (Ljava/lang/Object;)V
      // 55d: astore 18
      // 55f: aload 0
      // 560: ldc2_w 593306439561595691
      // 563: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 566: swap
      // 567: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 56a: aload 18
      // 56c: aload 17
      // 56e: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 571: ldc2_w 148501163140533206
      // 574: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 577: dup_x2
      // 578: pop
      // 579: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 57c: pop
      // 57d: goto 584
      // 580: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 583: athrow
      // 584: bipush 0
      // 585: istore 19
      // 587: aload 0
      // 588: ldc2_w 571388131590801605
      // 58b: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 58e: swap
      // 58f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 592: checkcast yo_4
      // 595: aload 18
      // 597: aload 11
      // 599: iload 19
      // 59b: invokevirtual yo_4.insertNodeInto (Ljavax/swing/tree/MutableTreeNode;Ljavax/swing/tree/MutableTreeNode;I)V
      // 59e: new java/io/File
      // 5a1: dup
      // 5a2: aload 12
      // 5a4: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 5a7: invokevirtual java/io/File.getParentFile ()Ljava/io/File;
      // 5aa: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 5ad: astore 20
      // 5af: aload 0
      // 5b0: ldc2_w 593306439561595691
      // 5b3: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 5b6: swap
      // 5b7: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 5ba: aload 20
      // 5bc: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 5bf: ldc2_w 509874190727776741
      // 5c2: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 5c5: dup_x2
      // 5c6: pop
      // 5c7: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5ca: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 5cd: goto 5d4
      // 5d0: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5d3: athrow
      // 5d4: astore 21
      // 5d6: aload 0
      // 5d7: ldc2_w 593306439561595691
      // 5da: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 5dd: swap
      // 5de: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 5e1: aload 21
      // 5e3: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 5e6: ldc2_w 276002133797788160
      // 5e9: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 5ec: dup_x2
      // 5ed: pop
      // 5ee: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 5f1: pop
      // 5f2: goto 5f9
      // 5f5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 5f8: athrow
      // 5f9: aload 1
      // 5fa: ifnull 615
      // 5fd: aload 6
      // 5ff: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 602: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 605: ldc_w tf_4
      // 608: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 60b: goto 612
      // 60e: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 611: athrow
      // 612: ifeq 615
      // 615: aload 1
      // 616: ifnull 2e9
      // 619: return
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void a(File var1, String var2) {
      String var3 = aA.z();

      boolean var10000;
      label221: {
         label211: {
            try {
               var10000 = var1.isFile();
               if (var3 != null) {
                  break label221;
               }

               if (!var10000) {
                  break label211;
               }
            } catch (Exception var36) {
               throw a(var36);
            }

            lv_4 var4 = new lv_4();
            Object[] var10001 = com.c.a(var1.getAbsolutePath());
            Method var10003 = com.c.d(574053907803002361L);
            Object[] var10002 = var10001;
            lv_4 var64 = var4;
            Method var39 = var10003;

            try {
               var39.invoke(var64, var10002);
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }

            try {
               var10001 = com.c.f();
               var10003 = com.c.d(540969864624467425L);
               var10002 = var10001;
               lv_4 var66 = var4;
               Method var40 = var10003;

               try {
                  var40.invoke(var66, var10002);
               } catch (InvocationTargetException var30) {
                  throw var30.getTargetException();
               }
            } catch (Exception var31) {
               var31.printStackTrace();
            }

            var10001 = com.c.a(var2);
            var10003 = com.c.d(189603700854791470L);
            var10002 = var10001;
            lv_4 var68 = var4;
            Method var41 = var10003;

            try {
               var41.invoke(var68, var10002);
            } catch (InvocationTargetException var29) {
               throw var29.getTargetException();
            }

            var10001 = com.c.f();
            Method var70 = com.c.d(236040230540929068L);
            Object[] var127 = var10001;
            var10002 = null;

            try {
               var10001 = (Object[])var70.invoke(var10002, var127);
            } catch (InvocationTargetException var28) {
               throw var28.getTargetException();
            }

            var10001 = com.c.a(var10001);
            var10003 = com.c.d(611820767281823807L);
            var10002 = var10001;
            lv_4 var73 = var4;
            Method var42 = var10003;

            try {
               var42.invoke(var73, var10002);
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            long var5 = System.currentTimeMillis();
            var10001 = com.c.e(var5);
            var10003 = com.c.d(448034136929726083L);
            var10002 = var10001;
            lv_4 var75 = var4;
            Method var43 = var10003;

            try {
               var43.invoke(var75, var10002);
            } catch (InvocationTargetException var26) {
               throw var26.getTargetException();
            }

            var10001 = com.c.e(var5);
            var10003 = com.c.d(632174181210947576L);
            var10002 = var10001;
            lv_4 var77 = var4;
            Method var44 = var10003;

            try {
               var44.invoke(var77, var10002);
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }

            Object[] var45 = com.c.f();
            Method var46 = com.c.d(270389152141252877L);
            var10002 = var45;
            var10001 = null;

            try {
               var47 = var46.invoke(var10001, var10002);
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
            }

            var10001 = com.c.f();
            var10003 = com.c.d(410905379772103887L);
            var10002 = var10001;
            var10001 = (Object[])var47;
            Method var48 = var10003;

            try {
               var49 = var48.invoke(var10001, var10002);
            } catch (InvocationTargetException var23) {
               throw var23.getTargetException();
            }

            var10001 = com.c.a(var4, 0, false);
            var10003 = com.c.d(425640194583900456L);
            var10002 = var10001;
            var10001 = (Object[])var49;
            Method var50 = var10003;

            try {
               var50.invoke(var10001, var10002);
            } catch (InvocationTargetException var22) {
               throw var22.getTargetException();
            }

            DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)((HashMap)com.c.c(604074053920059872L).get(this)).get(var2);

            try {
               var10001 = com.c.a(var7);
               var10003 = com.c.d(276002133797788160L);
               var10002 = var10001;
               aJ var86 = this;
               Method var52 = var10003;

               try {
                  var52.invoke(var86, var10002);
               } catch (InvocationTargetException var21) {
                  throw var21.getTargetException();
               }

               if (var3 == null) {
                  return;
               }
            } catch (Exception var35) {
               boolean var84 = false;
               throw a(var35);
            }
         }

         try {
            var10000 = var1.isDirectory();
         } catch (Exception var34) {
            boolean var87 = false;
            throw a(var34);
         }
      }

      if (var10000) {
         Object[] var53 = com.c.f();
         Method var54 = com.c.d(270389152141252877L);
         Object[] var115 = var53;
         Method var89 = null;

         try {
            var55 = var54.invoke(var89, var115);
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         var89 = com.c.f();
         Method var134 = com.c.d(410905379772103887L);
         var115 = (Object[])var89;
         var89 = var55;
         Method var56 = var134;

         try {
            var57 = var56.invoke(var89, var115);
         } catch (InvocationTargetException var19) {
            throw var19.getTargetException();
         }

         var89 = com.c.a(var2, var1.getName());
         var134 = com.c.d(416293356817081351L);
         var115 = (Object[])var89;
         var89 = var57;
         Method var58 = var134;

         try {
            var59 = (lO_3)var58.invoke(var89, var115);
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         lO_3 var37 = var59;
         StringBuilder var60 = new StringBuilder().append(var2).append(File.separator);
         var115 = com.c.f();
         Method var10004 = com.c.d(194080076253066315L);
         Object[] var136 = var115;
         lO_3 var119 = var37;
         var89 = var10004;

         try {
            var95 = (String)var89.invoke(var119, var136);
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         String var6 = var60.append(var95).toString();
         Object[] var96 = com.c.a(var6, 0, false, false);
         var134 = com.c.d(139844880563692307L);
         var115 = var96;
         aJ var97 = this;
         Method var61 = var134;

         try {
            var61.invoke(var97, var115);
         } catch (InvocationTargetException var16) {
            throw var16.getTargetException();
         }

         DefaultMutableTreeNode var38 = (DefaultMutableTreeNode)((HashMap)com.c.c(604074053920059872L).get(this)).get(var6);
         File[] var8 = var1.listFiles();
         File[] var9 = var8;
         int var10 = var8.length;
         int var11 = 0;

         while (var11 < var10) {
            File var12 = var9[var11];
            StringBuilder var62 = new StringBuilder().append(var2).append(File.separator);
            var115 = com.c.f();
            var10004 = com.c.d(194080076253066315L);
            Object[] var138 = var115;
            lO_3 var122 = var37;
            var89 = var10004;

            try {
               var99 = (String)var89.invoke(var122, var138);
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            String var13 = var62.append(var99).toString();

            try {
               Object[] var100 = com.c.a(var12, var13);
               var134 = com.c.d(260302370089021453L);
               var115 = var100;
               aJ var101 = this;
               Method var63 = var134;

               try {
                  var63.invoke(var101, var115);
               } catch (InvocationTargetException var14) {
                  throw var14.getTargetException();
               }

               var11++;
               if (var3 != null) {
                  return;
               }

               if (var3 != null) {
                  break;
               }
            } catch (Exception var33) {
               throw a(var33);
            }
         }

         SwingUtilities.invokeLater(new OE(this, var38));
      }
   }

   public void N(JTree var1) {
      TreeNode var2 = (TreeNode)var1.getModel().getRoot();
      Object[] var10001 = com.c.a(var1, new TreePath(var2));
      Method var10003 = com.c.d(579460881298592137L);
      Object[] var10002 = var10001;
      aJ var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   private void e(JTree var1, TreePath var2) {
      String var10000 = aA.z();
      TreeNode var4 = (TreeNode)var2.getLastPathComponent();
      String var3 = var10000;
      if (var3 == null) {
         if (var4.getChildCount() >= 0) {
            Enumeration var5 = var4.children();

            while (var5.hasMoreElements()) {
               TreeNode var6 = (TreeNode)var5.nextElement();
               TreePath var7 = var2.pathByAddingChild(var6);
               Object[] var10001 = com.c.a(var1, var7);
               Method var10003 = com.c.d(579460881298592137L);
               Object[] var10002 = var10001;
               aJ var10 = this;
               Method var9 = var10003;

               try {
                  var9.invoke(var10, var10002);
               } catch (InvocationTargetException var8) {
                  throw var8.getTargetException();
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
      String var10000 = aA.z();
      new J7();
      Method var10001 = (Method)com.c.c(593306439561595691L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(447854232501987193L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var74 = (List)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var29) {
         throw var29.getTargetException();
      }

      List var3 = var74;
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      Iterator var6 = var3.iterator();
      String var1 = var10000;

      label252:
      while (true) {
         boolean var35 = var6.hasNext();

         label248:
         while (true) {
            if (var35) {
               DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)var6.next();
               var36 = var5.add(var7);
               if (var1 != null) {
                  break;
               }

               do {
                  TreeNode var8 = var7.getParent();
                  if (var8 == null) {
                     break;
                  }

                  DefaultMutableTreeNode var9 = (DefaultMutableTreeNode)var8;
                  var35 = var9.equals((DefaultMutableTreeNode)com.c.c(312919167011526763L).get(this));
                  if (var1 != null) {
                     continue label248;
                  }

                  if (var1 == null) {
                     if (var35) {
                        break;
                     }

                     var35 = var5.contains(var9);
                  }

                  if (var1 == null) {
                     if (!var35) {
                        var5.add(var9);
                     }
                  }

                  var7 = (DefaultMutableTreeNode)var8;
               } while (var1 == null);

               if (var1 == null) {
                  continue label252;
               }
            }

            var6 = var5.iterator();
            var36 = var6.hasNext();
            break;
         }

         while (var36) {
            DefaultMutableTreeNode var30 = (DefaultMutableTreeNode)var6.next();
            if (var1 != null) {
               return;
            }

            label261: {
               label262: {
                  boolean var37 = var30.getUserObject().getClass().equals(ck_4.class);
                  if (var1 == null) {
                     if (var37) {
                        ck_4 var31 = (ck_4)var30.getUserObject();
                        var4.add(var31);
                        Object[] var38 = com.c.f();
                        Method var39 = com.c.d(270389152141252877L);
                        var10002 = var38;
                        var10001 = null;

                        try {
                           var10000 = (String)var39.invoke(var10001, var10002);
                        } catch (InvocationTargetException var28) {
                           throw var28.getTargetException();
                        }

                        Object[] var77 = com.c.f();
                        Method var143 = com.c.d(410905379772103887L);
                        var10002 = var77;
                        var10001 = var10000;
                        Method var41 = var143;

                        try {
                           var10000 = (String)var41.invoke(var10001, var10002);
                        } catch (InvocationTargetException var27) {
                           throw var27.getTargetException();
                        }

                        var10002 = com.c.f();
                        var10004 = com.c.d(605430732347023634L);
                        var10003 = var10002;
                        ck_4 var118 = var31;
                        var10001 = var10004;

                        try {
                           var10001 = (Method)var10001.invoke(var118, var10003);
                        } catch (InvocationTargetException var26) {
                           throw var26.getTargetException();
                        }

                        Object[] var81 = com.c.a(var10001);
                        Method var145 = com.c.d(489768706953623433L);
                        var10002 = var81;
                        var10001 = var10000;
                        Method var43 = var145;

                        try {
                           var44 = (lv_4)var43.invoke(var10001, var10002);
                        } catch (InvocationTargetException var25) {
                           throw var25.getTargetException();
                        }

                        lv_4 var33 = var44;
                        Object[] var45 = com.c.a(var33);
                        Method var46 = com.c.d(366543685241882690L);
                        var10002 = var45;
                        var10001 = null;

                        try {
                           var47 = (Boolean)var46.invoke(var10001, var10002);
                        } catch (InvocationTargetException var24) {
                           throw var24.getTargetException();
                        }

                        if (var47) {
                           Object[] var48 = com.c.f();
                           Method var49 = com.c.d(270389152141252877L);
                           var10002 = var48;
                           var10001 = null;

                           try {
                              var10000 = (String)var49.invoke(var10001, var10002);
                           } catch (InvocationTargetException var23) {
                              throw var23.getTargetException();
                           }

                           Object[] var87 = com.c.f();
                           Method var146 = com.c.d(410905379772103887L);
                           var10002 = var87;
                           var10001 = var10000;
                           Method var51 = var146;

                           try {
                              var10000 = (String)var51.invoke(var10001, var10002);
                           } catch (InvocationTargetException var22) {
                              throw var22.getTargetException();
                           }

                           var10002 = com.c.f();
                           var10004 = com.c.d(605430732347023634L);
                           var10003 = var10002;
                           ck_4 var126 = var31;
                           var10001 = var10004;

                           try {
                              var10001 = (Method)var10001.invoke(var126, var10003);
                           } catch (InvocationTargetException var21) {
                              throw var21.getTargetException();
                           }

                           Object[] var91 = com.c.a(var10001);
                           Method var148 = com.c.d(373726052298989731L);
                           var10002 = var91;
                           var10001 = var10000;
                           Method var53 = var148;

                           try {
                              var53.invoke(var10001, var10002);
                           } catch (InvocationTargetException var20) {
                              throw var20.getTargetException();
                           }
                        }

                        if (var1 == null) {
                           break label261;
                        }
                     }

                     var10000 = var30.getUserObject().getClass();
                     if (var1 != null) {
                        break label262;
                     }

                     var37 = var10000.equals(tf_4.class);
                  }

                  if (!var37) {
                     break label261;
                  }

                  var10000 = (String)var30.getUserObject();
               }

               tf_4 var32 = (tf_4)var10000;
               Object[] var93 = com.c.f();
               Method var149 = com.c.d(498856411508641826L);
               var10002 = var93;
               tf_4 var94 = var32;
               Method var55 = var149;

               try {
                  var10000 = (String)var55.invoke(var94, var10002);
               } catch (InvocationTargetException var19) {
                  throw var19.getTargetException();
               }

               if (!var10000.equals(new File((String)com.c.c(478301022169899080L).get(null)).getAbsolutePath())) {
                  Object[] var57 = com.c.f();
                  Method var58 = com.c.d(270389152141252877L);
                  var10002 = var57;
                  var10001 = null;

                  try {
                     var10000 = (String)var58.invoke(var10001, var10002);
                  } catch (InvocationTargetException var18) {
                     throw var18.getTargetException();
                  }

                  Object[] var97 = com.c.f();
                  Method var150 = com.c.d(410905379772103887L);
                  var10002 = var97;
                  var10001 = var10000;
                  Method var60 = var150;

                  try {
                     var10000 = (String)var60.invoke(var10001, var10002);
                  } catch (InvocationTargetException var17) {
                     throw var17.getTargetException();
                  }

                  var10002 = com.c.f();
                  var10004 = com.c.d(179612178163941306L);
                  var10003 = var10002;
                  tf_4 var133 = var32;
                  var10001 = var10004;

                  try {
                     var10001 = (Method)var10001.invoke(var133, var10003);
                  } catch (InvocationTargetException var16) {
                     throw var16.getTargetException();
                  }

                  Object[] var101 = com.c.a(var10001);
                  Method var152 = com.c.d(133273064107181210L);
                  var10002 = var101;
                  var10001 = var10000;
                  Method var62 = var152;

                  try {
                     var63 = (lO_3)var62.invoke(var10001, var10002);
                  } catch (InvocationTargetException var15) {
                     throw var15.getTargetException();
                  }

                  lO_3 var34 = var63;
                  Object[] var64 = com.c.a(var34);
                  Method var65 = com.c.d(366543685241882690L);
                  var10002 = var64;
                  var10001 = null;

                  try {
                     var66 = (Boolean)var65.invoke(var10001, var10002);
                  } catch (InvocationTargetException var14) {
                     throw var14.getTargetException();
                  }

                  if (var66) {
                     Object[] var67 = com.c.f();
                     Method var68 = com.c.d(270389152141252877L);
                     var10002 = var67;
                     var10001 = null;

                     try {
                        var10000 = (String)var68.invoke(var10001, var10002);
                     } catch (InvocationTargetException var13) {
                        throw var13.getTargetException();
                     }

                     Object[] var107 = com.c.f();
                     Method var153 = com.c.d(410905379772103887L);
                     var10002 = var107;
                     var10001 = var10000;
                     Method var70 = var153;

                     try {
                        var10000 = (String)var70.invoke(var10001, var10002);
                     } catch (InvocationTargetException var12) {
                        throw var12.getTargetException();
                     }

                     var10002 = com.c.f();
                     var10004 = com.c.d(498856411508641826L);
                     var10003 = var10002;
                     tf_4 var141 = var32;
                     var10001 = var10004;

                     try {
                        var10001 = (Method)var10001.invoke(var141, var10003);
                     } catch (InvocationTargetException var11) {
                        throw var11.getTargetException();
                     }

                     Object[] var111 = com.c.a(var10001);
                     Method var155 = com.c.d(251878287014406503L);
                     var10002 = var111;
                     var10001 = var10000;
                     Method var72 = var155;

                     try {
                        var72.invoke(var10001, var10002);
                     } catch (InvocationTargetException var10) {
                        throw var10.getTargetException();
                     }
                  }
               }
            }

            if (var1 != null) {
               break;
            }

            var36 = var6.hasNext();
         }

         this.repaint();
         return;
      }
   }

   public void d() {
      new J7();
      String var10000 = aA.z();
      Method var10001 = (Method)com.c.c(593306439561595691L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(447854232501987193L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var36 = (List)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      List var3 = var36;
      String var1 = var10000;
      ArrayList var4 = new ArrayList();

      for (DefaultMutableTreeNode var6 : var3) {
         label119: {
            label120: {
               boolean var19 = var6.getUserObject().getClass().equals(ck_4.class);
               if (var1 == null) {
                  if (var19) {
                     ck_4 var7 = (ck_4)var6.getUserObject();
                     var4.add(var7);
                     Object[] var20 = com.c.f();
                     Method var21 = com.c.d(270389152141252877L);
                     var10002 = var20;
                     var10001 = null;

                     try {
                        var10000 = (String)var21.invoke(var10001, var10002);
                     } catch (InvocationTargetException var16) {
                        throw var16.getTargetException();
                     }

                     Object[] var39 = com.c.f();
                     Method var69 = com.c.d(410905379772103887L);
                     var10002 = var39;
                     var10001 = var10000;
                     Method var23 = var69;

                     try {
                        var10000 = (String)var23.invoke(var10001, var10002);
                     } catch (InvocationTargetException var15) {
                        throw var15.getTargetException();
                     }

                     var10002 = com.c.f();
                     var10004 = com.c.d(605430732347023634L);
                     var10003 = var10002;
                     ck_4 var60 = var7;
                     var10001 = var10004;

                     try {
                        var10001 = (Method)var10001.invoke(var60, var10003);
                     } catch (InvocationTargetException var14) {
                        throw var14.getTargetException();
                     }

                     Object[] var43 = com.c.a(var10001);
                     Method var71 = com.c.d(541791179729053061L);
                     var10002 = var43;
                     var10001 = var10000;
                     Method var25 = var71;

                     try {
                        var25.invoke(var10001, var10002);
                     } catch (InvocationTargetException var13) {
                        throw var13.getTargetException();
                     }

                     if (var1 == null) {
                        break label119;
                     }
                  }

                  var10000 = var6.getUserObject().getClass();
                  if (var1 != null) {
                     break label120;
                  }

                  var19 = var10000.equals(tf_4.class);
               }

               if (!var19) {
                  break label119;
               }

               var10000 = (String)var6.getUserObject();
            }

            tf_4 var18 = (tf_4)var10000;
            Object[] var45 = com.c.f();
            Method var72 = com.c.d(498856411508641826L);
            var10002 = var45;
            tf_4 var46 = var18;
            Method var27 = var72;

            try {
               var10000 = (String)var27.invoke(var46, var10002);
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            if (!var10000.equals(new File((String)com.c.c(478301022169899080L).get(null)).getAbsolutePath())) {
               Object[] var29 = com.c.f();
               Method var30 = com.c.d(270389152141252877L);
               var10002 = var29;
               var10001 = null;

               try {
                  var10000 = (String)var30.invoke(var10001, var10002);
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               Object[] var49 = com.c.f();
               Method var73 = com.c.d(410905379772103887L);
               var10002 = var49;
               var10001 = var10000;
               Method var32 = var73;

               try {
                  var10000 = (String)var32.invoke(var10001, var10002);
               } catch (InvocationTargetException var10) {
                  throw var10.getTargetException();
               }

               var10002 = com.c.f();
               var10004 = com.c.d(498856411508641826L);
               var10003 = var10002;
               tf_4 var67 = var18;
               var10001 = var10004;

               try {
                  var10001 = (Method)var10001.invoke(var67, var10003);
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }

               Object[] var53 = com.c.a(var10001);
               Method var75 = com.c.d(271495086509363259L);
               var10002 = var53;
               var10001 = var10000;
               Method var34 = var75;

               try {
                  var34.invoke(var10001, var10002);
               } catch (InvocationTargetException var8) {
                  throw var8.getTargetException();
               }
            }
         }

         if (var1 != null) {
            break;
         }
      }
   }

   public d6_2 n(boolean var1) {
      String var10000 = aA.z();
      com.c.c(420994829726907422L).setBoolean(this, var1);
      d6_2 var3 = new d6_2();
      new J7();
      Method var10001 = (Method)com.c.c(593306439561595691L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(447854232501987193L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var17 = (List)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      List var5 = var17;
      String var2 = var10000;
      ArrayList var6 = new ArrayList();

      for (DefaultMutableTreeNode var8 : var5) {
         label47: {
            boolean var13 = var8.getUserObject().getClass().equals(ck_4.class);
            if (var2 == null) {
               if (var13) {
                  ck_4 var9 = (ck_4)var8.getUserObject();
                  var6.add(var9);
                  Object[] var18 = com.c.f();
                  Method var26 = com.c.d(442657485924266205L);
                  var10002 = var18;
                  d6_2 var19 = var3;
                  Method var14 = var26;

                  try {
                     var15 = (ArrayList)var14.invoke(var19, var10002);
                  } catch (InvocationTargetException var11) {
                     throw var11.getTargetException();
                  }

                  var10002 = com.c.f();
                  var10004 = com.c.d(605430732347023634L);
                  var10003 = var10002;
                  ck_4 var25 = var9;
                  var10001 = var10004;

                  try {
                     var21 = (String)var10001.invoke(var25, var10003);
                  } catch (InvocationTargetException var10) {
                     throw var10.getTargetException();
                  }

                  var15.add(var21);
                  if (var2 == null) {
                     break label47;
                  }
               }

               var13 = var8.getUserObject().getClass().equals(tf_4.class);
            }

            if (var13) {
            }
         }

         if (var2 != null) {
            break;
         }
      }

      return var3;
   }

   public boolean X() {
      String var10000 = aA.z();
      new J7();
      String var1 = var10000;
      var10000 = (String)com.c.c(593306439561595691L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(447854232501987193L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      Method var10 = var10003;

      try {
         var11 = (List)var10.invoke(var10001, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      List var3 = var11;
      new ArrayList();
      boolean var5 = false;
      Iterator var6 = var3.iterator();

      while (true) {
         label36:
         if (var6.hasNext()) {
            DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)var6.next();
            var12 = var7.getUserObject().getClass().equals(ck_4.class);
            if (var1 != null) {
               break;
            }

            if (var1 == null) {
               if (var12) {
                  var5 = true;
                  if (var1 == null) {
                     break label36;
                  }
               }

               var12 = var7.getUserObject().getClass().equals(tf_4.class);
            }

            if (var12) {
            }

            if (var1 == null) {
               continue;
            }
         }

         var12 = var5;
         break;
      }

      return var12;
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
      // 000: invokestatic com/c.f ()[Ljava/lang/Object;
      // 003: ldc2_w 270389152141252877
      // 006: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 009: swap
      // 00a: aconst_null
      // 00b: swap
      // 00c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 00f: goto 016
      // 012: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 015: athrow
      // 016: invokestatic com/c.f ()[Ljava/lang/Object;
      // 019: ldc2_w 306266403902896148
      // 01c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 01f: dup_x2
      // 020: pop
      // 021: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 024: checkcast u6_2
      // 027: goto 02e
      // 02a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 02d: athrow
      // 02e: astore 3
      // 02f: invokestatic aA.z ()Ljava/lang/String;
      // 032: aload 3
      // 033: invokestatic com/c.f ()[Ljava/lang/Object;
      // 036: ldc2_w 568345952398155457
      // 039: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 03c: dup_x2
      // 03d: pop
      // 03e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 041: checkcast java/lang/String
      // 044: goto 04b
      // 047: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 04a: athrow
      // 04b: astore 4
      // 04d: aload 0
      // 04e: ldc2_w 310302490302373526
      // 051: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 054: swap
      // 055: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 058: invokestatic com/c.f ()[Ljava/lang/Object;
      // 05b: ldc2_w 149160680229662748
      // 05e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 061: dup_x2
      // 062: pop
      // 063: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 066: checkcast KQ
      // 069: goto 070
      // 06c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 06f: athrow
      // 070: astore 5
      // 072: aload 5
      // 074: invokestatic com/c.f ()[Ljava/lang/Object;
      // 077: ldc2_w 249886410317960768
      // 07a: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 07d: dup_x2
      // 07e: pop
      // 07f: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 082: checkcast U
      // 085: goto 08c
      // 088: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 08b: athrow
      // 08c: astore 6
      // 08e: astore 2
      // 08f: new YB
      // 092: dup
      // 093: ldc2_w 243490669497898236
      // 096: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 099: aconst_null
      // 09a: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 09d: aload 6
      // 09f: sipush 11168
      // 0a2: sipush -18772
      // 0a5: invokestatic aJ.a (II)Ljava/lang/String;
      // 0a8: bipush 0
      // 0a9: invokespecial YB.<init> (ILjava/awt/Window;Ljava/lang/String;Z)V
      // 0ac: astore 7
      // 0ae: aload 2
      // 0af: ifnonnull 12c
      // 0b2: aload 4
      // 0b4: ifnull 108
      // 0b7: goto 0be
      // 0ba: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0bd: athrow
      // 0be: aload 4
      // 0c0: ldc2_w 149082991182987426
      // 0c3: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 0c6: aconst_null
      // 0c7: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 0ca: checkcast java/lang/String
      // 0cd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0d0: aload 2
      // 0d1: ifnonnull 149
      // 0d4: goto 0db
      // 0d7: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0da: athrow
      // 0db: ifne 108
      // 0de: goto 0e5
      // 0e1: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e4: athrow
      // 0e5: aload 7
      // 0e7: aload 4
      // 0e9: bipush 1
      // 0ea: bipush 1
      // 0eb: invokestatic com/c.a (Ljava/lang/Object;ZZ)[Ljava/lang/Object;
      // 0ee: ldc2_w 206082969888821725
      // 0f1: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0f4: dup_x2
      // 0f5: pop
      // 0f6: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0f9: pop
      // 0fa: goto 101
      // 0fd: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 100: athrow
      // 101: goto 108
      // 104: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 107: athrow
      // 108: aload 7
      // 10a: sipush 30263
      // 10d: ldc2_w 1611283600550907437
      // 110: invokestatic aJ.b (IJ)I
      // 113: sipush 30211
      // 116: ldc2_w 2770556333707709976
      // 119: invokestatic aJ.b (IJ)I
      // 11c: invokevirtual YB.setSize (II)V
      // 11f: aload 7
      // 121: aload 6
      // 123: invokevirtual YB.setLocationRelativeTo (Ljava/awt/Component;)V
      // 126: aload 7
      // 128: bipush 1
      // 129: invokevirtual YB.setVisible (Z)V
      // 12c: aload 7
      // 12e: invokestatic com/c.f ()[Ljava/lang/Object;
      // 131: ldc2_w 418327897845479655
      // 134: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 137: dup_x2
      // 138: pop
      // 139: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 13c: checkcast java/lang/Integer
      // 13f: invokevirtual java/lang/Integer.intValue ()I
      // 142: goto 149
      // 145: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 148: athrow
      // 149: istore 8
      // 14b: iload 8
      // 14d: ldc2_w 564170828581134815
      // 150: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 153: aconst_null
      // 154: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 157: if_icmpne 556
      // 15a: aload 7
      // 15c: invokestatic com/c.f ()[Ljava/lang/Object;
      // 15f: ldc2_w 191095475795927576
      // 162: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 165: dup_x2
      // 166: pop
      // 167: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 16a: checkcast java/lang/String
      // 16d: goto 174
      // 170: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 173: athrow
      // 174: astore 9
      // 176: aload 2
      // 177: ifnonnull 1d2
      // 17a: aload 9
      // 17c: ifnull 556
      // 17f: goto 186
      // 182: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 185: athrow
      // 186: aload 3
      // 187: aload 9
      // 189: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 18c: ldc2_w 170404728891717875
      // 18f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 192: dup_x2
      // 193: pop
      // 194: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 197: pop
      // 198: goto 19f
      // 19b: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 19e: athrow
      // 19f: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1a2: ldc2_w 270389152141252877
      // 1a5: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1a8: swap
      // 1a9: aconst_null
      // 1aa: swap
      // 1ab: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1ae: goto 1b5
      // 1b1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b4: athrow
      // 1b5: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1b8: ldc2_w 578864097947885485
      // 1bb: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1be: dup_x2
      // 1bf: pop
      // 1c0: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1c3: pop
      // 1c4: goto 1cb
      // 1c7: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1ca: athrow
      // 1cb: goto 1d2
      // 1ce: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d1: athrow
      // 1d2: new J7
      // 1d5: dup
      // 1d6: invokespecial J7.<init> ()V
      // 1d9: astore 10
      // 1db: aload 10
      // 1dd: aload 6
      // 1df: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 1e2: ldc2_w 222783555954803141
      // 1e5: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1e8: dup_x2
      // 1e9: pop
      // 1ea: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1ed: pop
      // 1ee: goto 1f5
      // 1f1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f4: athrow
      // 1f5: new java/util/ArrayList
      // 1f8: dup
      // 1f9: invokespecial java/util/ArrayList.<init> ()V
      // 1fc: astore 11
      // 1fe: iload 1
      // 1ff: aload 2
      // 200: ifnonnull 233
      // 203: ifne 239
      // 206: goto 20d
      // 209: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 20c: athrow
      // 20d: aload 0
      // 20e: ldc2_w 593306439561595691
      // 211: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 214: swap
      // 215: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 218: invokestatic com/c.f ()[Ljava/lang/Object;
      // 21b: ldc2_w 447854232501987193
      // 21e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 221: dup_x2
      // 222: pop
      // 223: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 226: goto 22d
      // 229: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 22c: athrow
      // 22d: checkcast java/util/ArrayList
      // 230: astore 11
      // 232: bipush 0
      // 233: istore 12
      // 235: aload 2
      // 236: ifnull 275
      // 239: aload 0
      // 23a: ldc2_w 213130010239103238
      // 23d: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 240: swap
      // 241: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 244: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 247: invokevirtual javax/swing/tree/DefaultMutableTreeNode.children ()Ljava/util/Enumeration;
      // 24a: astore 12
      // 24c: aload 12
      // 24e: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 253: ifeq 275
      // 256: aload 11
      // 258: aload 12
      // 25a: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 25f: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 262: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 265: pop
      // 266: aload 2
      // 267: ifnonnull 556
      // 26a: aload 2
      // 26b: ifnull 24c
      // 26e: goto 275
      // 271: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 274: athrow
      // 275: aload 11
      // 277: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 27a: astore 12
      // 27c: aload 12
      // 27e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 283: ifeq 556
      // 286: aload 12
      // 288: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 28d: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 290: astore 13
      // 292: aload 13
      // 294: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 297: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 29a: ldc_w ck_4
      // 29d: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 2a0: aload 2
      // 2a1: ifnonnull 370
      // 2a4: ifeq 350
      // 2a7: goto 2ae
      // 2aa: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2ad: athrow
      // 2ae: aload 13
      // 2b0: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 2b3: checkcast ck_4
      // 2b6: astore 14
      // 2b8: aload 13
      // 2ba: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getParent ()Ljavax/swing/tree/TreeNode;
      // 2bd: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 2c0: astore 15
      // 2c2: aload 0
      // 2c3: aload 15
      // 2c5: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 2c8: ldc2_w 475965765537616140
      // 2cb: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2ce: dup_x2
      // 2cf: pop
      // 2d0: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2d3: checkcast java/lang/String
      // 2d6: goto 2dd
      // 2d9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2dc: athrow
      // 2dd: astore 16
      // 2df: aload 0
      // 2e0: aload 13
      // 2e2: aload 16
      // 2e4: aload 9
      // 2e6: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 2e9: ldc2_w 574970396159174620
      // 2ec: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2ef: dup_x2
      // 2f0: pop
      // 2f1: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2f4: checkcast java/lang/String
      // 2f7: goto 2fe
      // 2fa: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2fd: athrow
      // 2fe: astore 17
      // 300: aload 10
      // 302: new java/io/File
      // 305: dup
      // 306: aload 14
      // 308: invokestatic com/c.f ()[Ljava/lang/Object;
      // 30b: ldc2_w 605430732347023634
      // 30e: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 311: dup_x2
      // 312: pop
      // 313: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 316: checkcast java/lang/String
      // 319: goto 320
      // 31c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 31f: athrow
      // 320: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 323: new java/io/File
      // 326: dup
      // 327: aload 17
      // 329: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 32c: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 32f: ldc2_w 172839385836868030
      // 332: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 335: dup_x2
      // 336: pop
      // 337: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 33a: pop
      // 33b: goto 342
      // 33e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 341: athrow
      // 342: goto 34c
      // 345: astore 18
      // 347: aload 18
      // 349: invokevirtual java/io/IOException.printStackTrace ()V
      // 34c: aload 2
      // 34d: ifnull 552
      // 350: aload 13
      // 352: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 355: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 358: aload 2
      // 359: ifnonnull 37f
      // 35c: goto 363
      // 35f: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 362: athrow
      // 363: ldc_w tf_4
      // 366: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 369: goto 370
      // 36c: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 36f: athrow
      // 370: ifeq 552
      // 373: aload 13
      // 375: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 378: goto 37f
      // 37b: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 37e: athrow
      // 37f: checkcast tf_4
      // 382: astore 14
      // 384: aload 13
      // 386: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getParent ()Ljavax/swing/tree/TreeNode;
      // 389: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 38c: astore 15
      // 38e: aload 0
      // 38f: aload 15
      // 391: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 394: ldc2_w 475965765537616140
      // 397: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 39a: dup_x2
      // 39b: pop
      // 39c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 39f: checkcast java/lang/String
      // 3a2: goto 3a9
      // 3a5: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3a8: athrow
      // 3a9: astore 16
      // 3ab: new java/util/ArrayList
      // 3ae: dup
      // 3af: invokespecial java/util/ArrayList.<init> ()V
      // 3b2: astore 17
      // 3b4: new java/util/ArrayList
      // 3b7: dup
      // 3b8: invokespecial java/util/ArrayList.<init> ()V
      // 3bb: astore 18
      // 3bd: aload 0
      // 3be: aload 13
      // 3c0: aload 17
      // 3c2: aload 18
      // 3c4: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 3c7: ldc2_w 231525833342023300
      // 3ca: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 3cd: dup_x2
      // 3ce: pop
      // 3cf: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 3d2: pop
      // 3d3: goto 3da
      // 3d6: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 3d9: athrow
      // 3da: aload 18
      // 3dc: aload 13
      // 3de: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getUserObject ()Ljava/lang/Object;
      // 3e1: checkcast tf_4
      // 3e4: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 3e7: pop
      // 3e8: aload 18
      // 3ea: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 3ed: astore 19
      // 3ef: aload 19
      // 3f1: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3f6: ifeq 490
      // 3f9: aload 19
      // 3fb: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 400: checkcast tf_4
      // 403: astore 20
      // 405: aload 0
      // 406: ldc2_w 604074053920059872
      // 409: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 40c: swap
      // 40d: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 410: checkcast java/util/HashMap
      // 413: aload 20
      // 415: invokestatic com/c.f ()[Ljava/lang/Object;
      // 418: ldc2_w 498856411508641826
      // 41b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 41e: dup_x2
      // 41f: pop
      // 420: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 423: checkcast java/lang/String
      // 426: goto 42d
      // 429: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 42c: athrow
      // 42d: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 430: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 433: astore 21
      // 435: aload 0
      // 436: aload 21
      // 438: aload 16
      // 43a: aload 9
      // 43c: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 43f: ldc2_w 574970396159174620
      // 442: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 445: dup_x2
      // 446: pop
      // 447: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 44a: checkcast java/lang/String
      // 44d: goto 454
      // 450: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 453: athrow
      // 454: astore 22
      // 456: new java/io/File
      // 459: dup
      // 45a: aload 22
      // 45c: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 45f: astore 23
      // 461: aload 23
      // 463: invokevirtual java/io/File.exists ()Z
      // 466: aload 2
      // 467: ifnonnull 49e
      // 46a: aload 2
      // 46b: ifnonnull 48b
      // 46e: goto 475
      // 471: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 474: athrow
      // 475: ifne 48c
      // 478: goto 47f
      // 47b: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 47e: athrow
      // 47f: aload 23
      // 481: invokevirtual java/io/File.mkdirs ()Z
      // 484: goto 48b
      // 487: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 48a: athrow
      // 48b: pop
      // 48c: aload 2
      // 48d: ifnull 3ef
      // 490: aload 17
      // 492: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 495: astore 19
      // 497: aload 19
      // 499: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 49e: ifeq 552
      // 4a1: aload 19
      // 4a3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4a8: checkcast ck_4
      // 4ab: astore 20
      // 4ad: aload 0
      // 4ae: ldc2_w 604074053920059872
      // 4b1: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 4b4: swap
      // 4b5: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 4b8: checkcast java/util/HashMap
      // 4bb: aload 20
      // 4bd: invokestatic com/c.f ()[Ljava/lang/Object;
      // 4c0: ldc2_w 605430732347023634
      // 4c3: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4c6: dup_x2
      // 4c7: pop
      // 4c8: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4cb: checkcast java/lang/String
      // 4ce: goto 4d5
      // 4d1: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4d4: athrow
      // 4d5: invokevirtual java/util/HashMap.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 4d8: checkcast javax/swing/tree/DefaultMutableTreeNode
      // 4db: astore 21
      // 4dd: aload 0
      // 4de: aload 21
      // 4e0: aload 16
      // 4e2: aload 9
      // 4e4: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 4e7: ldc2_w 574970396159174620
      // 4ea: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 4ed: dup_x2
      // 4ee: pop
      // 4ef: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 4f2: checkcast java/lang/String
      // 4f5: goto 4fc
      // 4f8: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 4fb: athrow
      // 4fc: astore 22
      // 4fe: aload 10
      // 500: new java/io/File
      // 503: dup
      // 504: aload 20
      // 506: invokestatic com/c.f ()[Ljava/lang/Object;
      // 509: ldc2_w 605430732347023634
      // 50c: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 50f: dup_x2
      // 510: pop
      // 511: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 514: checkcast java/lang/String
      // 517: goto 51e
      // 51a: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 51d: athrow
      // 51e: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 521: new java/io/File
      // 524: dup
      // 525: aload 22
      // 527: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 52a: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
      // 52d: ldc2_w 172839385836868030
      // 530: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 533: dup_x2
      // 534: pop
      // 535: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 538: pop
      // 539: goto 540
      // 53c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 53f: athrow
      // 540: aload 2
      // 541: ifnonnull 27c
      // 544: goto 54e
      // 547: astore 23
      // 549: aload 23
      // 54b: invokevirtual java/io/IOException.printStackTrace ()V
      // 54e: aload 2
      // 54f: ifnull 497
      // 552: aload 2
      // 553: ifnull 27c
      // 556: return
   }

   void a(DefaultMutableTreeNode var1, ArrayList var2, ArrayList var3) {
      String var10000 = aA.z();
      int var5 = 0;
      String var4 = var10000;

      while (var5 < var1.getChildCount()) {
         label39: {
            label47: {
               DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)var1.getChildAt(var5);
               boolean var10 = var6.getUserObject().getClass().equals(tf_4.class);
               if (var4 == null) {
                  if (var10) {
                     tf_4 var7 = (tf_4)var6.getUserObject();
                     var3.add(var7);
                     Object[] var10001 = com.c.a(var6, var2, var3);
                     Method var10003 = com.c.d(231525833342023300L);
                     Object[] var10002 = var10001;
                     aJ var13 = this;
                     Method var11 = var10003;

                     try {
                        var11.invoke(var13, var10002);
                     } catch (InvocationTargetException var8) {
                        throw var8.getTargetException();
                     }

                     if (var4 == null) {
                        break label39;
                     }
                  }

                  var10000 = var6.getUserObject().getClass();
                  if (var4 != null) {
                     break label47;
                  }

                  var10 = var10000.equals(ck_4.class);
               }

               if (!var10) {
                  break label39;
               }

               var10000 = (String)var6.getUserObject();
            }

            ck_4 var9 = (ck_4)var10000;
            var2.add(var9);
         }

         var5++;
         if (var4 != null) {
            break;
         }
      }
   }

   public String c(DefaultMutableTreeNode var1) {
      String var2;
      String var3;
      label199: {
         Method var33;
         label200: {
            var33 = aA.z();
            var3 = null;
            var2 = (String)var33;
            Object var4 = null;
            boolean var32 = var1.getUserObject().getClass().equals(ck_4.class);
            if (var2 == null) {
               if (var32) {
                  ck_4 var27 = (ck_4)var1.getUserObject();
                  var33 = com.c.f();
                  Method var47 = com.c.d(270389152141252877L);
                  Object[] var109 = (Object[])var33;
                  Method var81 = null;

                  try {
                     var33 = var47.invoke(var81, var109);
                  } catch (InvocationTargetException var25) {
                     throw var25.getTargetException();
                  }

                  var81 = com.c.f();
                  Method var127 = com.c.d(410905379772103887L);
                  var109 = (Object[])var81;
                  var81 = var33;
                  var33 = var127;

                  try {
                     var33 = (Method)var33.invoke(var81, var109);
                  } catch (InvocationTargetException var24) {
                     throw var24.getTargetException();
                  }

                  var109 = com.c.f();
                  Method var135 = com.c.d(605430732347023634L);
                  Object[] var128 = var109;
                  ck_4 var112 = var27;
                  var81 = var135;

                  try {
                     var81 = (Method)var81.invoke(var112, var128);
                  } catch (InvocationTargetException var23) {
                     throw var23.getTargetException();
                  }

                  Object[] var86 = com.c.a(var81);
                  var127 = com.c.d(489768706953623433L);
                  var109 = var86;
                  var81 = var33;
                  var33 = var127;

                  try {
                     var52 = (lv_4)var33.invoke(var81, var109);
                  } catch (InvocationTargetException var22) {
                     throw var22.getTargetException();
                  }

                  lv_4 var29 = var52;
                  StringBuilder var53 = new StringBuilder();
                  var109 = com.c.f();
                  var135 = com.c.d(286931176286176762L);
                  Object[] var130 = var109;
                  lv_4 var115 = var29;
                  var81 = var135;

                  try {
                     var89 = (String)var81.invoke(var115, var130);
                  } catch (InvocationTargetException var21) {
                     throw var21.getTargetException();
                  }

                  var3 = var53.append(var89).append(a(11178, -20119)).toString();
                  break label199;
               }

               var33 = var1.getUserObject().getClass();
               if (var2 != null) {
                  break label200;
               }

               var32 = var33.equals(tf_4.class);
            }

            if (!var32) {
               break label199;
            }

            var33 = (Method)var1.getUserObject();
         }

         tf_4 var5 = (tf_4)var33;
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(498856411508641826L);
         Object[] var10002 = var10001;
         tf_4 var67 = var5;
         var33 = var10003;

         try {
            var35 = (String)var33.invoke(var67, var10002);
         } catch (InvocationTargetException var20) {
            throw var20.getTargetException();
         }

         if (var2 == null) {
            if (!var35.equals((String)com.c.c(478301022169899080L).get(null))) {
               Object[] var37 = com.c.f();
               var33 = com.c.d(270389152141252877L);
               var10002 = var37;
               var10001 = null;

               try {
                  var33 = (Method)var33.invoke(var10001, var10002);
               } catch (InvocationTargetException var18) {
                  throw var18.getTargetException();
               }

               var10001 = com.c.f();
               var10003 = com.c.d(410905379772103887L);
               var10002 = var10001;
               var10001 = var33;
               var33 = var10003;

               try {
                  var33 = (Method)var33.invoke(var10001, var10002);
               } catch (InvocationTargetException var17) {
                  throw var17.getTargetException();
               }

               var10002 = com.c.f();
               Method var10004 = com.c.d(179612178163941306L);
               Object[] var124 = var10002;
               tf_4 var105 = var5;
               Method var74 = var10004;

               try {
                  var10001 = (Object[])var74.invoke(var105, var124);
               } catch (InvocationTargetException var16) {
                  throw var16.getTargetException();
               }

               var10001 = com.c.a(var10001);
               var10003 = com.c.d(133273064107181210L);
               var10002 = var10001;
               var10001 = var33;
               var33 = var10003;

               try {
                  var43 = (lO_3)var33.invoke(var10001, var10002);
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }

               lO_3 var6 = var43;
               var10001 = com.c.f();
               var10003 = com.c.d(286931176286176762L);
               var10002 = var10001;
               lO_3 var79 = var6;
               var33 = var10003;

               try {
                  var45 = (String)var33.invoke(var79, var10002);
               } catch (InvocationTargetException var14) {
                  throw var14.getTargetException();
               }

               var3 = var45;
               break label199;
            }

            var10001 = com.c.f();
            var10003 = com.c.d(179612178163941306L);
            var10002 = var10001;
            tf_4 var69 = var5;
            var33 = var10003;

            try {
               var35 = (String)var33.invoke(var69, var10002);
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }
         }

         var3 = var35;
      }

      DefaultMutableTreeNode var26;
      while ((var26 = (DefaultMutableTreeNode)var1.getParent()) != null) {
         DefaultMutableTreeNode var54 = var26;
         if (var2 == null) {
            if (var26.getUserObject() instanceof tf_4) {
               tf_4 var28 = (tf_4)var26.getUserObject();
               Object[] var90 = com.c.f();
               Method var131 = com.c.d(543633160597441792L);
               Object[] var116 = var90;
               tf_4 var91 = var28;
               Method var55 = var131;

               try {
                  var56 = (File)var55.invoke(var91, var116);
               } catch (InvocationTargetException var13) {
                  throw var13.getTargetException();
               }

               String var31;
               label171: {
                  String var30 = var56.getName();
                  var31 = null;
                  String var57 = var30;
                  if (var2 == null) {
                     if (!var30.equals(a(11176, 23966))) {
                        Object[] var58 = com.c.f();
                        Method var59 = com.c.d(270389152141252877L);
                        var116 = var58;
                        var90 = null;

                        try {
                           var54 = (DefaultMutableTreeNode)var59.invoke(var90, var116);
                        } catch (InvocationTargetException var12) {
                           throw var12.getTargetException();
                        }

                        var90 = com.c.f();
                        var131 = com.c.d(410905379772103887L);
                        var116 = var90;
                        var90 = var54;
                        Method var61 = var131;

                        try {
                           var54 = (DefaultMutableTreeNode)var61.invoke(var90, var116);
                        } catch (InvocationTargetException var11) {
                           throw var11.getTargetException();
                        }

                        var90 = com.c.a(var30);
                        var131 = com.c.d(133273064107181210L);
                        var116 = var90;
                        var90 = var54;
                        Method var63 = var131;

                        try {
                           var64 = (lO_3)var63.invoke(var90, var116);
                        } catch (InvocationTargetException var10) {
                           throw var10.getTargetException();
                        }

                        lO_3 var8 = var64;
                        var90 = com.c.f();
                        var131 = com.c.d(286931176286176762L);
                        var116 = var90;
                        lO_3 var99 = var8;
                        Method var65 = var131;

                        try {
                           var66 = (String)var65.invoke(var99, var116);
                        } catch (InvocationTargetException var9) {
                           throw var9.getTargetException();
                        }

                        var31 = var66;
                        break label171;
                     }

                     var57 = var30;
                  }

                  var31 = var57;
               }

               var3 = var31 + File.separator + var3;
            }

            var54 = var26;
         }

         var1 = var54;
         if (var2 != null) {
            break;
         }
      }

      return var3;
   }

   public String H(DefaultMutableTreeNode var1, String var2, String var3) {
      String var4 = null;
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(475965765537616140L);
      Object[] var10002 = var10001;
      aJ var9 = this;
      Method var10000 = var10003;

      try {
         var8 = (String)var10000.invoke(var9, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var4 = var8;
      var4 = var4.substring(var2.length() + 1);
      return var3 + File.separator + var4;
   }

   void h(DefaultMutableTreeNode var1, ArrayList var2) {
      String var10000 = aA.z();
      int var4 = 0;
      String var3 = var10000;

      while (var4 < var1.getChildCount()) {
         label39: {
            label47: {
               DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var1.getChildAt(var4);
               boolean var8 = var5.getUserObject().getClass().equals(tf_4.class);
               if (var3 == null) {
                  if (var8) {
                     Object[] var10001 = com.c.a(var5, var2);
                     Method var10003 = com.c.d(363671406087219533L);
                     Object[] var10002 = var10001;
                     aJ var11 = this;
                     Method var9 = var10003;

                     try {
                        var9.invoke(var11, var10002);
                     } catch (InvocationTargetException var7) {
                        throw var7.getTargetException();
                     }

                     if (var3 == null) {
                        break label39;
                     }
                  }

                  var10000 = var5.getUserObject().getClass();
                  if (var3 != null) {
                     break label47;
                  }

                  var8 = var10000.equals(ck_4.class);
               }

               if (!var8) {
                  break label39;
               }

               var10000 = (String)var5.getUserObject();
            }

            ck_4 var6 = (ck_4)var10000;
            var2.add(var6);
         }

         var4++;
         if (var3 != null) {
            break;
         }
      }
   }

   public int U(Point var1) {
      Object[] var10001 = com.c.a(var1, true);
      Method var10003 = com.c.d(288802925847106722L);
      Object[] var10002 = var10001;
      aJ var3 = this;
      Method var10000 = var10003;

      try {
         return (Integer)var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public int P(Point var1, boolean var2) {
      String var3 = aA.z();
      if ((aJ)com.c.c(593306439561595691L).get(this) != null) {
         int var4 = 0;

         while (var4 < ((aJ)com.c.c(593306439561595691L).get(this)).getRowCount()) {
            Object[] var10001 = com.c.a(var4, var2);
            Method var10003 = com.c.d(261109182212811950L);
            Object[] var10002 = var10001;
            aJ var9 = this;
            Method var10000 = var10003;

            try {
               var7 = (Rectangle)var10000.invoke(var9, var10002);
            } catch (InvocationTargetException var6) {
               throw var6.getTargetException();
            }

            Rectangle var5 = var7;
            if (var3 == null) {
               byte var8 = var5.contains(var1);
               if (var3 != null) {
                  return var8;
               }

               if (var8 != 0) {
                  return var4;
               }

               var4++;
            }

            if (var3 != null) {
               break;
            }
         }
      }

      return -1;
   }

   public Rectangle F(int var1, boolean var2) {
      Rectangle var4;
      if (var2) {
         Object[] var10001 = com.c.a(var1);
         Method var10003 = com.c.d(118140723583981003L);
         Object[] var10002 = var10001;
         aJ var5 = this;
         Method var10000 = var10003;

         try {
            var4 = (Rectangle)var10000.invoke(var5, var10002);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }
      } else {
         var4 = ((aJ)com.c.c(593306439561595691L).get(this)).getRowBounds(var1);
      }

      return var4;
   }

   public Rectangle G(DefaultMutableTreeNode var1) {
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(243179421387863563L);
      Object[] var10003 = var10002;
      aJ var7 = this;
      Method var10001 = var10004;

      try {
         var4 = (Integer)var10001.invoke(var7, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      Object[] var5 = com.c.a(var4);
      Method var9 = com.c.d(118140723583981003L);
      var10002 = var5;
      aJ var6 = this;
      Method var10000 = var9;

      try {
         return (Rectangle)var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public int I(DefaultMutableTreeNode var1) {
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(263865946362642439L);
      Object[] var10003 = var10002;
      aJ var4 = this;
      Method var10001 = var10004;

      try {
         var3 = (TreePath)var10001.invoke(var4, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      return this.getRowForPath(var3);
   }

   public Rectangle g(int var1) {
      String var10000 = aA.z();
      Rectangle var3 = ((aJ)com.c.c(593306439561595691L).get(this)).getRowBounds(var1);
      String var2 = var10000;
      Rectangle var5 = var3;
      if (var2 == null) {
         if (var3 != null) {
            Insets var4 = ((aJ)com.c.c(593306439561595691L).get(this)).getInsets();
            var3.x = var4.left;
            var3.width = ((aJ)com.c.c(593306439561595691L).get(this)).getWidth() - var4.left - var4.right;
         }

         var5 = var3;
      }

      return var5;
   }

   public as_2 p$as_2() {
      return (as_2)com.c.c(624888273314831754L).get(this);
   }

   public void b(as_2 var1) {
      com.c.c(624888273314831754L).set(this, var1);
   }

   public void M() {
      Object[] var10001 = com.c.a(com.c.c(213130010239103238L).get(this));
      Method var10003 = com.c.d(592526597199428069L);
      Object[] var10002 = var10001;
      aJ var2 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   @Override
   public void A(DefaultMutableTreeNode var1) {
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(263865946362642439L);
      Object[] var10002 = var10001;
      aJ var5 = this;
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

   public DefaultMutableTreeNode r(String var1) {
      return (DefaultMutableTreeNode)((HashMap)com.c.c(604074053920059872L).get(this)).get(var1);
   }

   public void A(String var1, int var2) {
      DefaultMutableTreeNode var5;
      label38: {
         String var10000 = aA.z();
         String var4 = new File(var1).getParentFile().getAbsolutePath();
         var5 = (DefaultMutableTreeNode)((HashMap)com.c.c(604074053920059872L).get(this)).get(var4);
         String var3 = var10000;
         DefaultMutableTreeNode var11 = var5;
         if (var3 == null) {
            if (var5 != null) {
               break label38;
            }

            Object[] var10001 = com.c.a(var4, 0);
            Method var10003 = com.c.d(295612812222941676L);
            Object[] var10002 = var10001;
            aJ var16 = this;
            Method var12 = var10003;

            try {
               var12.invoke(var16, var10002);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            var11 = (DefaultMutableTreeNode)((HashMap)com.c.c(604074053920059872L).get(this)).get(var4);
         }

         var5 = var11;
      }

      ck_4 var6 = new ck_4(new File(var1));
      Object[] var13 = com.c.a(var6);
      Method var14 = com.c.d(336419247910974761L);
      Object[] var22 = var13;
      Object var18 = null;

      try {
         var14.invoke(var18, var22);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      DefaultMutableTreeNode var7 = new DefaultMutableTreeNode(var6);
      ((HashMap)com.c.c(604074053920059872L).get(this)).put(var1, var7);
      ((yo_4)com.c.c(571388131590801605L).get(this)).insertNodeInto(var7, var5, var2);
      var18 = com.c.a(var7);
      Method var24 = com.c.d(592526597199428069L);
      var22 = (Object[])var18;
      var18 = this;
      Method var15 = var24;

      try {
         var15.invoke(var18, var22);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      SwingUtilities.invokeLater(new mb_2(this, var7));
   }

   public void q(String var1) {
      String var10000 = aA.z();
      Method var10001 = (Method)com.c.c(593306439561595691L).get(this);
      Object[] var10002 = com.c.a(var1);
      Method var10004 = com.c.d(509874190727776741L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var8 = (DefaultMutableTreeNode)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      DefaultMutableTreeNode var3 = var8;
      String var2 = var10000;
      aJ var5 = this;
      if (var2 == null) {
         if (com.c.c(557374830394047111L).getBoolean(this)) {
            var10000 = var3;
            if (var2 == null) {
               if (var3 == null) {
                  return;
               }

               var10000 = var3.getParent();
            }

            if (var10000 == null) {
               return;
            }

            ((yo_4)com.c.c(571388131590801605L).get(this)).removeNodeFromParent(var3);
            if (var2 == null) {
               return;
            }
         }

         var5 = this;
      }

      var5.repaint();
   }

   public void W(String var1) {
      String var2 = aA.z();
      aJ var10000 = this;
      if (var2 == null) {
         if (com.c.c(557374830394047111L).getBoolean(this)) {
            Method var5 = (Method)com.c.c(593306439561595691L).get(this);
            Object[] var10001 = com.c.a(var1);
            Method var10003 = com.c.d(509874190727776741L);
            Object[] var10002 = var10001;
            var10001 = var5;
            var5 = var10003;

            try {
               var7 = (DefaultMutableTreeNode)var5.invoke(var10001, var10002);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }

            label33: {
               DefaultMutableTreeNode var3 = var7;
               var5 = var3;
               if (var2 == null) {
                  if (var3 == null) {
                     break label33;
                  }

                  var5 = var3.getParent();
               }

               if (var5 != null) {
                  ((yo_4)com.c.c(571388131590801605L).get(this)).removeNodeFromParent(var3);
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

   public tf_4 j(String var1, String var2, boolean var3) {
      tf_4 var4 = null;
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)com.c.c(604074053920059872L).get(this)).get(var1);
      ((HashMap)com.c.c(604074053920059872L).get(this)).remove(var1);
      ((HashMap)com.c.c(604074053920059872L).get(this)).put(var2, var5);
      var4 = new tf_4(new File(var2));
      var5.setUserObject(var4);
      ((yo_4)com.c.c(571388131590801605L).get(this)).nodeChanged(var5);
      Object[] var10001 = com.c.a(var5, var2, var1);
      Method var10003 = com.c.d(367427149268021673L);
      Object[] var10002 = var10001;
      aJ var8 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
         return var4;
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }
   }

   public void j(String var1) {
      String var10000 = aA.z();
      DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)((HashMap)com.c.c(604074053920059872L).get(this)).get(var1);
      String var2 = var10000;
      if (var2 != null) {
         Object[] var9 = com.c.a(var3);
         Method var12 = com.c.d(592526597199428069L);
         Object[] var11 = var9;
         aJ var10 = this;
         Method var7 = var12;

         try {
            var7.invoke(var10, var11);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      } else if (var3 != null) {
         Object[] var10001 = com.c.a((DefaultMutableTreeNode)var3.getParent());
         Method var10003 = com.c.d(276002133797788160L);
         Object[] var10002 = var10001;
         aJ var8 = this;
         Method var6 = var10003;

         label20:
         try {
            var6.invoke(var8, var10002);
            break label20;
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }
      }
   }

   public ck_4 x(String var1, String var2, boolean var3) {
      ck_4 var4 = null;
      DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)((HashMap)com.c.c(604074053920059872L).get(this)).get(var1);
      ((HashMap)com.c.c(604074053920059872L).get(this)).remove(var1);
      ((HashMap)com.c.c(604074053920059872L).get(this)).put(var2, var5);
      var4 = new ck_4(new File(var2));
      Object[] var10000 = com.c.a(var4);
      Method var8 = com.c.d(336419247910974761L);
      Object[] var10 = var10000;
      Object var9 = null;

      try {
         var8.invoke(var9, var10);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var5.setUserObject(var4);
      ((yo_4)com.c.c(571388131590801605L).get(this)).nodeChanged(var5);
      return var4;
   }

   void V(DefaultMutableTreeNode var1, String var2, String var3) {
      String var10000 = aA.z();
      int var5 = 0;
      String var4 = var10000;

      while (var5 < var1.getChildCount()) {
         DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)var1.getChildAt(var5);
         Object[] var10001 = com.c.a(var6, var2, var3);
         Method var10003 = com.c.d(197935296004442692L);
         Object[] var10002 = var10001;
         aJ var9 = this;
         Method var8 = var10003;

         try {
            var8.invoke(var9, var10002);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var5++;
         if (var4 != null) {
            break;
         }
      }
   }

   void J(DefaultMutableTreeNode var1, String var2, String var3) {
      Method var31;
      label121: {
         var31 = aA.z();
         Object var5 = var1.getUserObject();
         String var4 = (String)var31;
         boolean var25 = var5.getClass().equals(tf_4.class);
         if (var4 == null) {
            if (var25) {
               tf_4 var6 = (tf_4)var5;
               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(498856411508641826L);
               Object[] var10002 = var10001;
               tf_4 var42 = var6;
               var31 = var10003;

               try {
                  var27 = (String)var31.invoke(var42, var10002);
               } catch (InvocationTargetException var20) {
                  throw var20.getTargetException();
               }

               String var7 = var27;
               String var8 = var2 + var7.substring(var3.length());
               var10001 = com.c.a(var8);
               var10003 = com.c.d(309720334529505891L);
               var10002 = var10001;
               tf_4 var44 = var6;
               var31 = var10003;

               try {
                  var31.invoke(var44, var10002);
               } catch (InvocationTargetException var19) {
                  throw var19.getTargetException();
               }

               var10001 = com.c.a(new File(var8));
               var10003 = com.c.d(349593801287953443L);
               var10002 = var10001;
               tf_4 var46 = var6;
               var31 = var10003;

               try {
                  var31.invoke(var46, var10002);
               } catch (InvocationTargetException var18) {
                  throw var18.getTargetException();
               }

               ((HashMap)com.c.c(604074053920059872L).get(this)).remove(var7);
               ((HashMap)com.c.c(604074053920059872L).get(this)).put(var8, var1);
               int var9 = 0;

               while (var9 < var1.getChildCount()) {
                  DefaultMutableTreeNode var10 = (DefaultMutableTreeNode)var1.getChildAt(var9);
                  var10001 = com.c.a(var10, var2, var3);
                  var10003 = com.c.d(197935296004442692L);
                  var10002 = var10001;
                  aJ var48 = this;
                  var31 = var10003;

                  try {
                     var31.invoke(var48, var10002);
                  } catch (InvocationTargetException var17) {
                     throw var17.getTargetException();
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

            var31 = var5.getClass();
            if (var4 != null) {
               break label121;
            }

            var25 = var31.equals(ck_4.class);
         }

         if (!var25) {
            return;
         }

         var31 = (Method)var5;
      }

      ck_4 var21 = (ck_4)var31;
      Object[] var49 = com.c.f();
      Method var74 = com.c.d(605430732347023634L);
      Object[] var64 = var49;
      ck_4 var50 = var21;
      var31 = var74;

      try {
         var33 = (String)var31.invoke(var50, var64);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      String var22 = var33;
      var22 = var2 + var22.substring(var3.length());
      var49 = com.c.a(var22);
      var74 = com.c.d(584136914483294074L);
      var64 = var49;
      ck_4 var52 = var21;
      var31 = var74;

      try {
         var31.invoke(var52, var64);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      var49 = com.c.a(new File(var22));
      var74 = com.c.d(325634526741383265L);
      var64 = var49;
      ck_4 var54 = var21;
      var31 = var74;

      try {
         var31.invoke(var54, var64);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      ((HashMap)com.c.c(604074053920059872L).get(this)).remove(var22);
      ((HashMap)com.c.c(604074053920059872L).get(this)).put(var22, var1);
      Object[] var36 = com.c.f();
      var31 = com.c.d(270389152141252877L);
      var64 = var36;
      var49 = null;

      try {
         var31 = (Method)var31.invoke(var49, var64);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      var49 = com.c.f();
      var74 = com.c.d(410905379772103887L);
      var64 = var49;
      var49 = var31;
      var31 = var74;

      try {
         var31 = (Method)var31.invoke(var49, var64);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var49 = com.c.a(var22, var22, true);
      var74 = com.c.d(453428243328379077L);
      var64 = var49;
      var49 = var31;
      var31 = var74;

      try {
         var31.invoke(var49, var64);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   @Override
   public void scrollRectToVisible(Rectangle var1) {
   }

   @Override
   public String convertValueToText(Object var1, boolean var2, boolean var3, boolean var4, int var5, boolean var6) {
      String var7 = aA.z();
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
      String var10000 = aA.z();
      int var3 = 0;
      String var1 = var10000;

      while (true) {
         if (var3 < this.getRowCount() - 1) {
            TreePath var4 = this.getPathForRow(var3);
            var24 = this;
            if (var1 != null) {
               break;
            }

            TreePath var5 = this.getPathForRow(var3 + 1);
            label144:
            if (var1 == null) {
               if (var4.isDescendant(var5)) {
                  DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)var4.getLastPathComponent();
                  if (var1 != null) {
                     break label144;
                  }

                  if (var6.getUserObject().getClass().equals(tf_4.class)) {
                     tf_4 var7 = (tf_4)var6.getUserObject();
                     Object[] var10002 = com.c.f();
                     Method var10004 = com.c.d(498856411508641826L);
                     Object[] var10003 = var10002;
                     tf_4 var55 = var7;
                     Method var10001 = var10004;

                     try {
                        var40 = (String)var10001.invoke(var55, var10003);
                     } catch (InvocationTargetException var15) {
                        throw var15.getTargetException();
                     }

                     var2.add(var40);
                  }
               }

               var3++;
            }

            if (var1 == null) {
               continue;
            }
         }

         var24 = this;
         break;
      }

      Object[] var41 = com.c.f();
      Method var63 = com.c.d(148691699844242618L);
      Object[] var56 = var41;
      aJ var42 = var24;
      Method var25 = var63;

      try {
         var26 = (DefaultMutableTreeNode)var25.invoke(var42, var56);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      String var17;
      label157: {
         DefaultMutableTreeNode var16 = var26;
         var17 = null;
         var10000 = var16;
         if (var1 == null) {
            if (var16 == null) {
               break label157;
            }

            var10000 = (String)var16.getUserObject();
         }

         label158: {
            boolean var28 = var10000.getClass().equals(tf_4.class);
            if (var1 == null) {
               if (var28) {
                  tf_4 var19 = (tf_4)var16.getUserObject();
                  var41 = com.c.f();
                  var63 = com.c.d(498856411508641826L);
                  var56 = var41;
                  tf_4 var46 = var19;
                  Method var32 = var63;

                  try {
                     var10000 = (String)var32.invoke(var46, var56);
                  } catch (InvocationTargetException var13) {
                     throw var13.getTargetException();
                  }

                  var17 = var10000;
                  break label157;
               }

               var10000 = var16.getUserObject().getClass();
               if (var1 != null) {
                  break label158;
               }

               var28 = var10000.equals(ck_4.class);
            }

            if (!var28) {
               break label157;
            }

            var10000 = (String)var16.getUserObject();
         }

         ck_4 var18 = (ck_4)var10000;
         var41 = com.c.f();
         var63 = com.c.d(605430732347023634L);
         var56 = var41;
         ck_4 var44 = var18;
         Method var30 = var63;

         try {
            var10000 = (String)var30.invoke(var44, var56);
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }

         var17 = var10000;
      }

      ((HashMap)com.c.c(604074053920059872L).get(this)).clear();
      var41 = com.c.f();
      var63 = com.c.d(574561945876230577L);
      var56 = var41;
      aJ var48 = this;
      Method var34 = var63;

      try {
         var34.invoke(var48, var56);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var41 = com.c.f();
      var63 = com.c.d(474998040866815030L);
      var56 = var41;
      aJ var50 = this;
      Method var35 = var63;

      try {
         var35.invoke(var50, var56);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var41 = com.c.f();
      var63 = com.c.d(459754285193734469L);
      var56 = var41;
      aJ var52 = this;
      Method var36 = var63;

      try {
         var36.invoke(var52, var56);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      Iterator var20 = var2.iterator();

      while (true) {
         if (var20.hasNext()) {
            String var22 = (String)var20.next();
            DefaultMutableTreeNode var23 = (DefaultMutableTreeNode)((HashMap)com.c.c(604074053920059872L).get(this)).get(var22);
            var37 = var23;
            if (var1 != null) {
               break;
            }

            if (var23 != null) {
               this.expandPath(new TreePath(var23.getPath()));
            }

            if (var1 == null) {
               continue;
            }
         }

         var10000 = var17;
         if (var1 == null) {
            if (var17 == null) {
               return;
            }

            var10000 = (String)((HashMap)com.c.c(604074053920059872L).get(this)).get(var17);
         }

         var37 = (DefaultMutableTreeNode)var10000;
         break;
      }

      DefaultMutableTreeNode var21 = var37;
      var41 = com.c.a(var21);
      var63 = com.c.d(592526597199428069L);
      var56 = var41;
      aJ var54 = this;
      Method var39 = var63;

      try {
         var39.invoke(var54, var56);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   private void D() {
      Object[] var10001 = com.c.a(com.c.c(357561646207134153L).get(this));
      Method var10003 = com.c.d(593150792091308133L);
      Object[] var10002 = var10001;
      aJ var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10001 = com.c.a(com.c.c(312919167011526763L).get(this), com.c.c(357561646207134153L).get(this), 0);
      var10003 = com.c.d(485298920737977777L);
      var10002 = var10001;
      aJ var6 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      this.expandPath(new TreePath(((DefaultMutableTreeNode)com.c.c(213130010239103238L).get(this)).getPath()));
   }

   public synchronized void U(String var1) {
      com.c.c(119358758450406151L).set(this, var1.toLowerCase());
      Method var10000 = (Method)com.c.c(357561646207134153L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(369380169373911815L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var8 = (List)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var8.clear();
      var10000 = (Method)com.c.c(357561646207134153L).get(this);
      var10001 = com.c.f();
      var10003 = com.c.d(369380169373911815L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var11 = (List)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var11.clear();
      ((DefaultMutableTreeNode)com.c.c(312919167011526763L).get(this)).removeAllChildren();
      com.c.c(312919167011526763L).set(this, new DefaultMutableTreeNode(a(11170, -7559)));
      com.c.c(571388131590801605L).set(this, new yo_4((DefaultMutableTreeNode)com.c.c(312919167011526763L).get(this)));
      this.setModel((yo_4)com.c.c(571388131590801605L).get(this));
      var10001 = com.c.a(com.c.c(357561646207134153L).get(this));
      var10003 = com.c.d(593150792091308133L);
      var10002 = var10001;
      aJ var19 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var19, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10001 = com.c.a(com.c.c(357561646207134153L).get(this));
      var10003 = com.c.d(374559552802805888L);
      var10002 = var10001;
      aJ var21 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var21, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.a(com.c.c(312919167011526763L).get(this), com.c.c(357561646207134153L).get(this), 0);
      var10003 = com.c.d(485298920737977777L);
      var10002 = var10001;
      aJ var23 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var23, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      this.expandPath(new TreePath(((DefaultMutableTreeNode)com.c.c(213130010239103238L).get(this)).getPath()));
   }

   public void h(String var1, int var2) {
      Object[] var10001 = com.c.a(var1, var2, true, true);
      Method var10003 = com.c.d(139844880563692307L);
      Object[] var10002 = var10001;
      aJ var4 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var4, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void N(String var1, int var2, boolean var3, boolean var4) {
      String var6 = new File(var1).getParentFile().getAbsolutePath();
      String var10000 = aA.z();
      DefaultMutableTreeNode var7 = (DefaultMutableTreeNode)((HashMap)com.c.c(604074053920059872L).get(this)).get(var6);
      String var5 = var10000;
      var10000 = var7;
      if (var5 == null) {
         if (var7 == null) {
            Object[] var10001 = com.c.a(var6, 0);
            Method var10003 = com.c.d(295612812222941676L);
            Object[] var10002 = var10001;
            aJ var19 = this;
            Method var15 = var10003;

            try {
               var15.invoke(var19, var10002);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            var7 = (DefaultMutableTreeNode)((HashMap)com.c.c(604074053920059872L).get(this)).get(var6);
         }

         var10000 = (String)var7.getUserObject();
      }

      tf_4 var8 = (tf_4)var10000;
      tf_4 var9 = new tf_4(new File(var1));
      Object[] var20 = com.c.f();
      Method var23 = com.c.d(369380169373911815L);
      Object[] var22 = var20;
      tf_4 var21 = var8;
      Method var16 = var23;

      try {
         var17 = (List)var16.invoke(var21, var22);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var17.add(var9);
      DefaultMutableTreeNode var10 = new DefaultMutableTreeNode(var9);
      ((HashMap)com.c.c(604074053920059872L).get(this)).put(var1, var10);
      var7.insert(var10, 0);
      ((yo_4)com.c.c(571388131590801605L).get(this)).insertNodeInto(var10, var7, var2);
      TreePath var11 = new TreePath(var10.getPath());
      boolean var18 = var3;
      if (var5 == null) {
         if (var3) {
            ((aJ)com.c.c(593306439561595691L).get(this)).setSelectionPath(var11);
         }

         var18 = var4;
      }

      if (var18) {
         ((aJ)com.c.c(593306439561595691L).get(this)).startEditingAtPath(var11);
      }
   }

   public DefaultMutableTreeNode E(DefaultMutableTreeNode param1, tf_4 param2, int param3) {
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
      // 00a: invokestatic aA.z ()Ljava/lang/String;
      // 00d: aload 0
      // 00e: ldc2_w 604074053920059872
      // 011: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 014: swap
      // 015: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 018: checkcast java/util/HashMap
      // 01b: aload 2
      // 01c: invokestatic com/c.f ()[Ljava/lang/Object;
      // 01f: ldc2_w 543633160597441792
      // 022: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 025: dup_x2
      // 026: pop
      // 027: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 02a: checkcast java/io/File
      // 02d: goto 034
      // 030: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 033: athrow
      // 034: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 037: aload 5
      // 039: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 03c: pop
      // 03d: astore 4
      // 03f: aload 0
      // 040: aload 4
      // 042: ifnonnull 097
      // 045: ldc2_w 571388131590801605
      // 048: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 04b: swap
      // 04c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 04f: checkcast yo_4
      // 052: aload 5
      // 054: aload 1
      // 055: iload 3
      // 056: invokevirtual yo_4.insertNodeInto (Ljavax/swing/tree/MutableTreeNode;Ljavax/swing/tree/MutableTreeNode;I)V
      // 059: aload 2
      // 05a: invokestatic com/c.f ()[Ljava/lang/Object;
      // 05d: ldc2_w 543633160597441792
      // 060: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 063: dup_x2
      // 064: pop
      // 065: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 068: checkcast java/io/File
      // 06b: goto 072
      // 06e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 071: athrow
      // 072: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // 075: ldc2_w 478301022169899080
      // 078: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 07b: aconst_null
      // 07c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 07f: checkcast java/lang/String
      // 082: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 085: ifeq 0a4
      // 088: goto 08f
      // 08b: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 08e: athrow
      // 08f: aload 0
      // 090: goto 097
      // 093: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 096: athrow
      // 097: aload 5
      // 099: ldc2_w 213130010239103238
      // 09c: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 09f: dup_x2
      // 0a0: pop
      // 0a1: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 0a4: new java/util/ArrayList
      // 0a7: dup
      // 0a8: invokespecial java/util/ArrayList.<init> ()V
      // 0ab: astore 6
      // 0ad: aload 2
      // 0ae: invokestatic com/c.f ()[Ljava/lang/Object;
      // 0b1: ldc2_w 369380169373911815
      // 0b4: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 0b7: dup_x2
      // 0b8: pop
      // 0b9: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0bc: checkcast java/util/List
      // 0bf: goto 0c6
      // 0c2: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0cb: astore 7
      // 0cd: aload 7
      // 0cf: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0d4: ifeq 0fc
      // 0d7: aload 7
      // 0d9: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0de: checkcast tf_4
      // 0e1: astore 8
      // 0e3: aload 6
      // 0e5: aload 8
      // 0e7: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 0ea: pop
      // 0eb: aload 4
      // 0ed: ifnonnull 11c
      // 0f0: aload 4
      // 0f2: ifnull 0cd
      // 0f5: goto 0fc
      // 0f8: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0fb: athrow
      // 0fc: aload 2
      // 0fd: invokestatic com/c.f ()[Ljava/lang/Object;
      // 100: ldc2_w 248698316749304686
      // 103: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 106: dup_x2
      // 107: pop
      // 108: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 10b: checkcast java/util/List
      // 10e: goto 115
      // 111: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 114: athrow
      // 115: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11a: astore 7
      // 11c: aload 7
      // 11e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 123: ifeq 14b
      // 126: aload 7
      // 128: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 12d: checkcast ck_4
      // 130: astore 8
      // 132: aload 6
      // 134: aload 8
      // 136: invokevirtual java/util/ArrayList.add (Ljava/lang/Object;)Z
      // 139: pop
      // 13a: aload 4
      // 13c: ifnonnull 152
      // 13f: aload 4
      // 141: ifnull 11c
      // 144: goto 14b
      // 147: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14a: athrow
      // 14b: aload 6
      // 14d: invokevirtual java/util/ArrayList.iterator ()Ljava/util/Iterator;
      // 150: astore 7
      // 152: aload 7
      // 154: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 159: ifeq 357
      // 15c: aload 7
      // 15e: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 163: astore 8
      // 165: ldc_w ""
      // 168: astore 9
      // 16a: aload 4
      // 16c: ifnonnull 370
      // 16f: aload 8
      // 171: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 174: ldc_w ck_4
      // 177: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 17a: aload 4
      // 17c: ifnonnull 309
      // 17f: goto 186
      // 182: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 185: athrow
      // 186: ifeq 2eb
      // 189: goto 190
      // 18c: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 18f: athrow
      // 190: aload 8
      // 192: checkcast ck_4
      // 195: astore 10
      // 197: aload 10
      // 199: invokestatic com/c.f ()[Ljava/lang/Object;
      // 19c: ldc2_w 272998330038223631
      // 19f: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1a2: dup_x2
      // 1a3: pop
      // 1a4: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1a7: checkcast java/io/File
      // 1aa: goto 1b1
      // 1ad: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1b0: athrow
      // 1b1: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 1b4: astore 11
      // 1b6: aload 11
      // 1b8: sipush 11172
      // 1bb: sipush 14353
      // 1be: invokestatic aJ.a (II)Ljava/lang/String;
      // 1c1: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 1c4: aload 4
      // 1c6: ifnonnull 1e0
      // 1c9: ifne 1df
      // 1cc: goto 1d3
      // 1cf: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1d2: athrow
      // 1d3: aload 4
      // 1d5: ifnull 152
      // 1d8: goto 1df
      // 1db: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1de: athrow
      // 1df: bipush 0
      // 1e0: istore 12
      // 1e2: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1e5: ldc2_w 270389152141252877
      // 1e8: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 1eb: swap
      // 1ec: aconst_null
      // 1ed: swap
      // 1ee: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1f1: goto 1f8
      // 1f4: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 1f7: athrow
      // 1f8: invokestatic com/c.f ()[Ljava/lang/Object;
      // 1fb: ldc2_w 410905379772103887
      // 1fe: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 201: dup_x2
      // 202: pop
      // 203: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 206: goto 20d
      // 209: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 20c: athrow
      // 20d: aload 11
      // 20f: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 212: ldc2_w 489768706953623433
      // 215: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 218: dup_x2
      // 219: pop
      // 21a: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 21d: checkcast lv_4
      // 220: goto 227
      // 223: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 226: athrow
      // 227: astore 13
      // 229: aload 13
      // 22b: invokestatic com/c.f ()[Ljava/lang/Object;
      // 22e: ldc2_w 402271797068414482
      // 231: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 234: dup_x2
      // 235: pop
      // 236: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 239: checkcast java/lang/Integer
      // 23c: invokevirtual java/lang/Integer.intValue ()I
      // 23f: goto 246
      // 242: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 245: athrow
      // 246: istore 12
      // 248: aload 10
      // 24a: iload 12
      // 24c: invokestatic com/c.a (I)[Ljava/lang/Object;
      // 24f: ldc2_w 268719418863796583
      // 252: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 255: dup_x2
      // 256: pop
      // 257: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 25a: pop
      // 25b: goto 262
      // 25e: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 261: athrow
      // 262: goto 271
      // 265: astore 14
      // 267: aload 14
      // 269: invokevirtual java/lang/Exception.printStackTrace ()V
      // 26c: aload 4
      // 26e: ifnull 152
      // 271: aload 10
      // 273: invokestatic com/c.f ()[Ljava/lang/Object;
      // 276: ldc2_w 272998330038223631
      // 279: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 27c: dup_x2
      // 27d: pop
      // 27e: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 281: checkcast java/io/File
      // 284: goto 28b
      // 287: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 28a: athrow
      // 28b: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 28e: astore 9
      // 290: new javax/swing/tree/DefaultMutableTreeNode
      // 293: dup
      // 294: aload 10
      // 296: invokespecial javax/swing/tree/DefaultMutableTreeNode.<init> (Ljava/lang/Object;)V
      // 299: astore 14
      // 29b: aload 0
      // 29c: ldc2_w 571388131590801605
      // 29f: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2a2: swap
      // 2a3: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2a6: checkcast yo_4
      // 2a9: aload 14
      // 2ab: aload 5
      // 2ad: aload 5
      // 2af: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getChildCount ()I
      // 2b2: invokevirtual yo_4.insertNodeInto (Ljavax/swing/tree/MutableTreeNode;Ljavax/swing/tree/MutableTreeNode;I)V
      // 2b5: aload 0
      // 2b6: ldc2_w 604074053920059872
      // 2b9: invokestatic com/c.c (J)Ljava/lang/reflect/Field;
      // 2bc: swap
      // 2bd: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2c0: checkcast java/util/HashMap
      // 2c3: aload 10
      // 2c5: invokestatic com/c.f ()[Ljava/lang/Object;
      // 2c8: ldc2_w 272998330038223631
      // 2cb: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 2ce: dup_x2
      // 2cf: pop
      // 2d0: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 2d3: checkcast java/io/File
      // 2d6: goto 2dd
      // 2d9: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 2dc: athrow
      // 2dd: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 2e0: aload 14
      // 2e2: invokevirtual java/util/HashMap.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 2e5: pop
      // 2e6: aload 4
      // 2e8: ifnull 352
      // 2eb: aload 8
      // 2ed: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2f0: aload 4
      // 2f2: ifnonnull 30e
      // 2f5: goto 2fc
      // 2f8: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 2fb: athrow
      // 2fc: ldc_w tf_4
      // 2ff: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 302: goto 309
      // 305: invokestatic aJ.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 308: athrow
      // 309: ifeq 352
      // 30c: aload 8
      // 30e: checkcast tf_4
      // 311: astore 10
      // 313: aload 10
      // 315: invokestatic com/c.f ()[Ljava/lang/Object;
      // 318: ldc2_w 543633160597441792
      // 31b: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 31e: dup_x2
      // 31f: pop
      // 320: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 323: checkcast java/io/File
      // 326: goto 32d
      // 329: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 32c: athrow
      // 32d: invokevirtual java/io/File.getAbsolutePath ()Ljava/lang/String;
      // 330: astore 9
      // 332: aload 0
      // 333: aload 5
      // 335: aload 10
      // 337: aload 5
      // 339: invokevirtual javax/swing/tree/DefaultMutableTreeNode.getChildCount ()I
      // 33c: invokestatic com/c.a (Ljava/lang/Object;Ljava/lang/Object;I)[Ljava/lang/Object;
      // 33f: ldc2_w 485298920737977777
      // 342: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 345: dup_x2
      // 346: pop
      // 347: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 34a: goto 351
      // 34d: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 350: athrow
      // 351: pop
      // 352: aload 4
      // 354: ifnull 152
      // 357: aload 0
      // 358: aload 5
      // 35a: invokestatic com/c.a (Ljava/lang/Object;)[Ljava/lang/Object;
      // 35d: ldc2_w 276002133797788160
      // 360: invokestatic com/c.d (J)Ljava/lang/reflect/Method;
      // 363: dup_x2
      // 364: pop
      // 365: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 368: pop
      // 369: goto 370
      // 36c: invokevirtual java/lang/reflect/InvocationTargetException.getTargetException ()Ljava/lang/Throwable;
      // 36f: athrow
      // 370: aload 5
      // 372: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void J(DefaultMutableTreeNode var1) {
      Object[] var10000 = com.c.a(var1);
      Method var11 = com.c.d(560417790764258986L);
      Object[] var23 = var10000;
      Object var18 = null;

      try {
         var10000 = (ArrayList)var11.invoke(var18, var23);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      ArrayList var3 = var10000;
      String var13 = aA.z();
      ArrayList var4 = new ArrayList();
      String var2 = var13;
      Iterator var5 = var3.iterator();

      while (true) {
         if (var5.hasNext()) {
            DefaultMutableTreeNode var6 = (DefaultMutableTreeNode)var5.next();
            var18 = com.c.a(var6);
            Method var10003 = com.c.d(201726770406369370L);
            var23 = (Object[])var18;
            var18 = this;
            Method var14 = var10003;

            try {
               var15 = (Boolean)var14.invoke(var18, var23);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               if (var15) {
                  var4.add(var6);
               }
            }

            if (var2 == null) {
               continue;
            }
         }

         var10000 = com.c.a(var1);
         Method var17 = com.c.d(206118038016110794L);
         var23 = var10000;
         var18 = null;

         try {
            var17.invoke(var18, var23);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         ((yo_4)com.c.c(571388131590801605L).get(this)).nodeStructureChanged(var1);
         var5 = var4.iterator();
         var15 = var5.hasNext();
         break;
      }

      while (var15) {
         DefaultMutableTreeNode var10 = (DefaultMutableTreeNode)var5.next();
         this.expandPath(new TreePath(var10.getPath()));
         if (var2 != null) {
            break;
         }

         var15 = var5.hasNext();
      }
   }

   public void h() {
      Object[] var10000 = com.c.a(this, false);
      Method var2 = com.c.d(548485169707074459L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      this.expandPath(new TreePath(((DefaultMutableTreeNode)com.c.c(213130010239103238L).get(this)).getPath()));
   }

   void E(DefaultMutableTreeNode var1) {
      String var2 = aA.z();
      nj_2 var10000 = (nj_2)com.c.c(310302490302373526L).get(this);
      if (var2 == null) {
         if (var10000 == null) {
            return;
         }

         var10000 = (nj_2)com.c.c(310302490302373526L).get(this);
      }

      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(149160680229662748L);
      Object[] var10002 = var10001;
      nj_2 var8 = var10000;
      Method var5 = var10003;

      try {
         var10000 = (nj_2)var5.invoke(var8, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var10001 = com.c.a(true);
      var10003 = com.c.d(438941361784812150L);
      var10002 = var10001;
      var10001 = var10000;
      Method var7 = var10003;

      try {
         var7.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   int y(Object var1) {
      String var10000 = aA.z();
      int var3 = 0;
      String var2 = var10000;
      byte var14 = var1.getClass().equals(ck_4.class);
      if (var2 == null) {
         if (var14 != 0) {
            ck_4 var4 = (ck_4)var1;
            Object var10001 = com.c.c(137186759430385204L).get(this);
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
            if (var2 == null) {
               return var3;
            }
         }

         var14 = var1.getClass().equals(tf_4.class);
      }

      if (var2 != null) {
         return var14;
      } else {
         if (var14 != 0) {
            tf_4 var13 = (tf_4)var1;
            Object var27 = com.c.c(137186759430385204L).get(this);
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

   public void V(DefaultMutableTreeNode var1, ck_4 var2) {
      HashMap var10000 = (HashMap)com.c.c(604074053920059872L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(272998330038223631L);
      Object[] var10003 = var10002;
      ck_4 var5 = var2;
      Method var10001 = var10004;

      try {
         var4 = (File)var10001.invoke(var5, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10000.put(var4.getAbsolutePath(), var1);
   }

   public void C(DefaultMutableTreeNode var1, tf_4 var2) {
      HashMap var10000 = (HashMap)com.c.c(604074053920059872L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(543633160597441792L);
      Object[] var10003 = var10002;
      tf_4 var5 = var2;
      Method var10001 = var10004;

      try {
         var4 = (File)var10001.invoke(var5, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10000.put(var4.getAbsolutePath(), var1);
   }

   public void G(String var1) {
      ((HashMap)com.c.c(604074053920059872L).get(this)).remove(var1);
   }

   public void I(tf_4 var1) {
   }

   public boolean o(tf_4 var1) {
      String var10000 = aA.z();
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(543633160597441792L);
      Object[] var10003 = var10002;
      tf_4 var34 = var1;
      Method var10001 = var10004;

      try {
         var25 = (File)var10001.invoke(var34, var10003);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      File var3 = var25;
      String var2 = var10000;
      Object[] var26 = com.c.a(var3);
      Method var39 = com.c.d(349593801287953443L);
      var10002 = var26;
      tf_4 var27 = var1;
      Method var16 = var39;

      try {
         var16.invoke(var27, var10002);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      Object[] var28 = com.c.f();
      Method var40 = com.c.d(369380169373911815L);
      var10002 = var28;
      tf_4 var29 = var1;
      Method var17 = var40;

      try {
         var10000 = (String)var17.invoke(var29, var10002);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      Vector var4 = (Vector)var10000;
      Object[] var30 = com.c.f();
      Method var41 = com.c.d(248698316749304686L);
      var10002 = var30;
      tf_4 var31 = var1;
      Method var19 = var41;

      try {
         var10000 = (String)var19.invoke(var31, var10002);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      Vector var5 = (Vector)var10000;
      boolean var6 = false;
      var10000 = var5;
      if (var2 == null) {
         if (var5.size() > 0) {
            var6 = true;
         }

         var10000 = (List)var4.clone();
      }

      Object var7 = var10000;
      Iterator var8 = var7.iterator();

      while (true) {
         if (var8.hasNext()) {
            tf_4 var9 = (tf_4)var8.next();
            Object[] var32 = com.c.a(var9);
            Method var42 = com.c.d(374559552802805888L);
            var10002 = var32;
            aJ var33 = this;
            Method var22 = var42;

            try {
               var23 = (Boolean)var22.invoke(var33, var10002);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            boolean var10 = var23;
            var24 = var10;
            if (var2 != null) {
               break;
            }

            label71:
            if (var2 == null) {
               if (var10) {
                  var6 = true;
                  if (var2 == null) {
                     break label71;
                  }
               }

               var4.remove(var9);
            }

            if (var2 == null) {
               continue;
            }
         }

         var24 = var6;
         break;
      }

      return var24;
   }

   public void Q(boolean var1) {
      com.c.c(557374830394047111L).setBoolean(this, var1);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(483594750475642076L);
      Object[] var10002 = var10001;
      aJ var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   public void n(tf_4 var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(543633160597441792L);
      Object[] var10002 = var10001;
      tf_4 var107 = var1;
      Method var10000 = var10003;

      try {
         var48 = (File)var10000.invoke(var107, var10002);
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      File var3 = var48;
      String var49 = aA.z();
      var10002 = com.c.a(var3);
      Method var10004 = com.c.d(349593801287953443L);
      Object[] var193 = var10002;
      tf_4 var161 = var1;
      Method var108 = var10004;

      try {
         var108.invoke(var161, var193);
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      String var2 = var49;
      File[] var4 = var3.listFiles();
      Vector var5 = new Vector();
      Vector var6 = new Vector();
      if (var2 == null) {
         if (var4 != null) {
            for (File var10 : var4) {
               if (var2 != null) {
                  return;
               }

               label488: {
                  boolean var50 = var10.isDirectory();
                  if (var2 == null) {
                     if (var50) {
                        tf_4 var11 = new tf_4();
                        var10001 = com.c.a(var10);
                        var10003 = com.c.d(349593801287953443L);
                        var10002 = var10001;
                        tf_4 var110 = var11;
                        var10000 = var10003;

                        try {
                           var10000.invoke(var110, var10002);
                        } catch (InvocationTargetException var41) {
                           throw var41.getTargetException();
                        }

                        boolean var12;
                        label469: {
                           var12 = false;
                           boolean var52 = com.c.c(557374830394047111L).getBoolean(this);
                           if (var2 == null) {
                              if (var52) {
                                 Object[] var53 = com.c.f();
                                 var10000 = com.c.d(270389152141252877L);
                                 var10002 = var53;
                                 var10001 = null;

                                 try {
                                    var55 = var10000.invoke(var10001, var10002);
                                 } catch (InvocationTargetException var40) {
                                    throw var40.getTargetException();
                                 }

                                 var10001 = com.c.f();
                                 var10003 = com.c.d(410905379772103887L);
                                 var10002 = var10001;
                                 var10001 = (Object[])var55;
                                 var10000 = var10003;

                                 try {
                                    var57 = var10000.invoke(var10001, var10002);
                                 } catch (InvocationTargetException var39) {
                                    throw var39.getTargetException();
                                 }

                                 var10001 = com.c.a(var10.getName());
                                 var10003 = com.c.d(133273064107181210L);
                                 var10002 = var10001;
                                 var10001 = (Object[])var57;
                                 var10000 = var10003;

                                 try {
                                    var59 = (lO_3)var10000.invoke(var10001, var10002);
                                 } catch (InvocationTargetException var38) {
                                    throw var38.getTargetException();
                                 }

                                 label491: {
                                    lO_3 var13 = var59;
                                    lO_3 var60 = var13;
                                    if (var2 == null) {
                                       if (var13 == null) {
                                          break label491;
                                       }

                                       var60 = var13;
                                    }

                                    Object[] var61 = com.c.a(var60);
                                    var10000 = com.c.d(366543685241882690L);
                                    var10002 = var61;
                                    var10001 = null;

                                    try {
                                       var63 = (Boolean)var10000.invoke(var10001, var10002);
                                    } catch (InvocationTargetException var37) {
                                       throw var37.getTargetException();
                                    }

                                    if (var2 == null) {
                                       var63 = !var63;
                                    }

                                    var12 = var63;
                                 }

                                 if (var2 == null) {
                                    break label469;
                                 }
                              }

                              var52 = true;
                           }

                           var12 = var52;
                        }

                        label492: {
                           if (var2 == null) {
                              if (!var12) {
                                 break label492;
                              }

                              var5.add(var11);
                           }

                           var10001 = com.c.a(var11);
                           var10003 = com.c.d(593150792091308133L);
                           var10002 = var10001;
                           aJ var120 = this;
                           var10000 = var10003;

                           try {
                              var10000.invoke(var120, var10002);
                           } catch (InvocationTargetException var36) {
                              throw var36.getTargetException();
                           }
                        }

                        if (var2 == null) {
                           break label488;
                        }
                     }

                     var50 = var10.isFile();
                  }

                  if (var2 == null) {
                     if (!var50) {
                        break label488;
                     }

                     var50 = var10.getName().endsWith(a(11172, 14353));
                  }

                  if (var50) {
                     ck_4 var44 = new ck_4();
                     var10001 = com.c.a(var10);
                     var10003 = com.c.d(325634526741383265L);
                     var10002 = var10001;
                     ck_4 var122 = var44;
                     var10000 = var10003;

                     try {
                        var10000.invoke(var122, var10002);
                     } catch (InvocationTargetException var35) {
                        throw var35.getTargetException();
                     }

                     Object[] var66 = com.c.f();
                     var10000 = com.c.d(270389152141252877L);
                     var10002 = var66;
                     var10001 = null;

                     try {
                        var68 = var10000.invoke(var10001, var10002);
                     } catch (InvocationTargetException var34) {
                        throw var34.getTargetException();
                     }

                     var10001 = com.c.f();
                     var10003 = com.c.d(410905379772103887L);
                     var10002 = var10001;
                     var10001 = (Object[])var68;
                     var10000 = var10003;

                     try {
                        var70 = var10000.invoke(var10001, var10002);
                     } catch (InvocationTargetException var33) {
                        throw var33.getTargetException();
                     }

                     var10001 = com.c.a(var10.getAbsolutePath());
                     var10003 = com.c.d(489768706953623433L);
                     var10002 = var10001;
                     var10001 = (Object[])var70;
                     var10000 = var10003;

                     try {
                        var72 = (lv_4)var10000.invoke(var10001, var10002);
                     } catch (InvocationTargetException var32) {
                        throw var32.getTargetException();
                     }

                     lv_4 var45;
                     boolean var47;
                     label435: {
                        var45 = var72;
                        var47 = false;
                        boolean var73 = com.c.c(557374830394047111L).getBoolean(this);
                        if (var2 == null) {
                           if (var73) {
                              Object[] var74 = com.c.a(var45);
                              var10000 = com.c.d(366543685241882690L);
                              var10002 = var74;
                              var10001 = null;

                              try {
                                 var76 = (Boolean)var10000.invoke(var10001, var10002);
                              } catch (InvocationTargetException var31) {
                                 throw var31.getTargetException();
                              }

                              if (var2 == null) {
                                 var76 = !var76;
                              }

                              var47 = var76;
                              if (var2 == null) {
                                 break label435;
                              }
                           }

                           var73 = true;
                        }

                        var47 = var73;
                     }

                     label428:
                     if (var47) {
                        label426: {
                           label425: {
                              label496: {
                                 String var77 = (String)com.c.c(119358758450406151L).get(this);
                                 if (var2 == null) {
                                    if (var77 == null) {
                                       break label496;
                                    }

                                    var77 = (String)com.c.c(119358758450406151L).get(this);
                                 }

                                 boolean var78 = var77.equals("");
                                 if (var2 != null) {
                                    break label425;
                                 }

                                 if (!var78) {
                                    break label426;
                                 }
                              }

                              var6.add(var44);
                           }

                           if (var2 == null) {
                              break label428;
                           }
                        }

                        if (var45 == null) {
                           return;
                        }

                        StringBuilder var79 = new StringBuilder();
                        var10002 = com.c.f();
                        var10004 = com.c.d(255354522009994316L);
                        Object[] var201 = var10002;
                        lv_4 var178 = var45;
                        Method var131 = var10004;

                        try {
                           var132 = (Integer)var131.invoke(var178, var201);
                        } catch (InvocationTargetException var30) {
                           throw var30.getTargetException();
                        }

                        String var14 = var79.append(var132).append("").toString();
                        Object[] var80 = com.c.f();
                        var10000 = com.c.d(270389152141252877L);
                        var10002 = var80;
                        var10001 = null;

                        try {
                           var82 = var10000.invoke(var10001, var10002);
                        } catch (InvocationTargetException var29) {
                           throw var29.getTargetException();
                        }

                        var10001 = com.c.f();
                        var10003 = com.c.d(306266403902896148L);
                        var10002 = var10001;
                        var10001 = (Object[])var82;
                        var10000 = var10003;

                        try {
                           var84 = var10000.invoke(var10001, var10002);
                        } catch (InvocationTargetException var28) {
                           throw var28.getTargetException();
                        }

                        var10001 = com.c.f();
                        var10003 = com.c.d(512419353738146707L);
                        var10002 = var10001;
                        var10001 = (Object[])var84;
                        var10000 = var10003;

                        try {
                           var86 = (Integer)var10000.invoke(var10001, var10002);
                        } catch (InvocationTargetException var27) {
                           throw var27.getTargetException();
                        }

                        label410: {
                           byte var16;
                           label497: {
                              int var15 = var86;
                              var16 = 0;
                              var87 = var15;
                              int var139 = com.c.c(304719506057429442L).getInt(null);
                              if (var2 == null) {
                                 if (var15 == var139) {
                                    var10001 = com.c.f();
                                    var10003 = com.c.d(380415140795833934L);
                                    var10002 = var10001;
                                    lv_4 var141 = var45;
                                    var10000 = var10003;

                                    try {
                                       var89 = (String)var10000.invoke(var141, var10002);
                                    } catch (InvocationTargetException var26) {
                                       throw var26.getTargetException();
                                    }

                                    var90 = var89.toLowerCase().contains((String)com.c.c(119358758450406151L).get(this));
                                    label404:
                                    if (var2 == null) {
                                       if (var90 == 0) {
                                          var10001 = com.c.f();
                                          var10003 = com.c.d(286931176286176762L);
                                          var10002 = var10001;
                                          lv_4 var143 = var45;
                                          var10000 = var10003;

                                          try {
                                             var92 = (String)var10000.invoke(var143, var10002);
                                          } catch (InvocationTargetException var25) {
                                             throw var25.getTargetException();
                                          }

                                          var90 = var92.toLowerCase().contains((String)com.c.c(119358758450406151L).get(this));
                                          if (var2 != null) {
                                             break label404;
                                          }

                                          if (var90 == 0) {
                                             var10001 = com.c.f();
                                             var10003 = com.c.d(255973732097233937L);
                                             var10002 = var10001;
                                             lv_4 var145 = var45;
                                             var10000 = var10003;

                                             try {
                                                var94 = (String)var10000.invoke(var145, var10002);
                                             } catch (InvocationTargetException var24) {
                                                throw var24.getTargetException();
                                             }

                                             var90 = var94.toLowerCase().contains((String)com.c.c(119358758450406151L).get(this));
                                             if (var2 != null) {
                                                break label404;
                                             }

                                             if (var90 == 0) {
                                                var90 = var14.toLowerCase().contains((String)com.c.c(119358758450406151L).get(this));
                                                if (var2 != null) {
                                                   break label404;
                                                }

                                                if (var90 == 0) {
                                                   var10001 = com.c.f();
                                                   var10003 = com.c.d(218711337515318169L);
                                                   var10002 = var10001;
                                                   lv_4 var147 = var45;
                                                   var10000 = var10003;

                                                   try {
                                                      var96 = (String)var10000.invoke(var147, var10002);
                                                   } catch (InvocationTargetException var23) {
                                                      throw var23.getTargetException();
                                                   }

                                                   var87 = var96.contains((String)com.c.c(119358758450406151L).get(this));
                                                   if (var2 != null) {
                                                      break label410;
                                                   }

                                                   if (var87 == 0) {
                                                      break label497;
                                                   }
                                                }
                                             }
                                          }
                                       }

                                       var90 = 1;
                                    }

                                    var16 = var90;
                                    if (var2 == null) {
                                       break label497;
                                    }
                                 }

                                 var87 = var15;
                                 var139 = com.c.c(387101562873018885L).getInt(null);
                              }

                              if (var2 == null) {
                                 if (var87 == var139) {
                                    var10001 = com.c.f();
                                    var10003 = com.c.d(286931176286176762L);
                                    var10002 = var10001;
                                    lv_4 var149 = var45;
                                    var10000 = var10003;

                                    try {
                                       var98 = (String)var10000.invoke(var149, var10002);
                                    } catch (InvocationTargetException var22) {
                                       throw var22.getTargetException();
                                    }

                                    var87 = var98.toLowerCase().contains((String)com.c.c(119358758450406151L).get(this));
                                    if (var2 != null) {
                                       break label410;
                                    }

                                    if (var87 == 0) {
                                       break label497;
                                    }

                                    var16 = 1;
                                    if (var2 == null) {
                                       break label497;
                                    }
                                 }

                                 var87 = var15;
                                 var139 = com.c.c(243306902745055487L).getInt(null);
                              }

                              if (var2 == null) {
                                 if (var87 == var139) {
                                    var10001 = com.c.f();
                                    var10003 = com.c.d(380415140795833934L);
                                    var10002 = var10001;
                                    lv_4 var151 = var45;
                                    var10000 = var10003;

                                    try {
                                       var100 = (String)var10000.invoke(var151, var10002);
                                    } catch (InvocationTargetException var21) {
                                       throw var21.getTargetException();
                                    }

                                    var87 = var100.toLowerCase().contains((String)com.c.c(119358758450406151L).get(this));
                                    if (var2 != null) {
                                       break label410;
                                    }

                                    if (var87 == 0) {
                                       break label497;
                                    }

                                    var16 = 1;
                                    if (var2 == null) {
                                       break label497;
                                    }
                                 }

                                 var87 = var15;
                                 var139 = com.c.c(346595405273673113L).getInt(null);
                              }

                              if (var2 == null) {
                                 if (var87 == var139) {
                                    var87 = var14.toLowerCase().contains((String)com.c.c(119358758450406151L).get(this));
                                    if (var2 != null) {
                                       break label410;
                                    }

                                    if (var87 == 0) {
                                       break label497;
                                    }

                                    var16 = 1;
                                    if (var2 == null) {
                                       break label497;
                                    }
                                 }

                                 var87 = var15;
                                 var139 = com.c.c(238917600523772047L).getInt(null);
                              }

                              if (var2 == null) {
                                 if (var87 == var139) {
                                    var10001 = com.c.f();
                                    var10003 = com.c.d(218711337515318169L);
                                    var10002 = var10001;
                                    lv_4 var153 = var45;
                                    var10000 = var10003;

                                    try {
                                       var102 = (String)var10000.invoke(var153, var10002);
                                    } catch (InvocationTargetException var20) {
                                       throw var20.getTargetException();
                                    }

                                    var87 = var102.toLowerCase().contains((String)com.c.c(119358758450406151L).get(this));
                                    if (var2 != null) {
                                       break label410;
                                    }

                                    if (var87 == 0) {
                                       break label497;
                                    }

                                    var16 = 1;
                                    if (var2 == null) {
                                       break label497;
                                    }
                                 }

                                 var87 = var15;
                                 if (var2 != null) {
                                    break label410;
                                 }

                                 var139 = com.c.c(478586759941923574L).getInt(null);
                              }

                              if (var87 == var139) {
                                 var10001 = com.c.f();
                                 var10003 = com.c.d(255973732097233937L);
                                 var10002 = var10001;
                                 lv_4 var155 = var45;
                                 var10000 = var10003;

                                 try {
                                    var104 = (String)var10000.invoke(var155, var10002);
                                 } catch (InvocationTargetException var19) {
                                    throw var19.getTargetException();
                                 }

                                 var87 = var104.toLowerCase().contains((String)com.c.c(119358758450406151L).get(this));
                                 if (var2 != null) {
                                    break label410;
                                 }

                                 if (var87 != 0) {
                                    var16 = 1;
                                 }
                              }
                           }

                           var87 = var16;
                        }

                        if (var2 == null && var87 != 0) {
                           var6.add(var44);
                        }
                     }
                  }
               }

               if (var2 != null) {
                  break;
               }
            }
         }

         var10001 = com.c.a(var5);
         var10003 = com.c.d(407744580579201251L);
         var10002 = var10001;
         tf_4 var157 = var1;
         var10000 = var10003;

         try {
            var10000.invoke(var157, var10002);
         } catch (InvocationTargetException var18) {
            throw var18.getTargetException();
         }

         var10001 = com.c.a(var6);
         var10003 = com.c.d(486938477933204520L);
         var10002 = var10001;
         tf_4 var159 = var1;
         var10000 = var10003;

         try {
            var10000.invoke(var159, var10002);
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }
      }
   }

   public void p(TreeNode var1) {
      ((yo_4)com.c.c(571388131590801605L).get(this)).removeNodeFromParent((MutableTreeNode)var1);
   }

   @Override
   public int getClosestRowForLocation(int var1, int var2) {
      return this.getRowForPath(this.getClosestPathForLocation(var1, var2));
   }

   int v$int() {
      aJ var1 = this;
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
      aJ var2 = this;
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

   private void j(File var1) {
      File[] var3 = var1.listFiles();
      File[] var4 = var3;
      int var5 = var3.length;
      String var10000 = aA.z();
      int var6 = 0;
      String var2 = var10000;

      while (var6 < var5) {
         File var7 = var4[var6];
         if (var7.isDirectory()) {
         }

         var6++;
         if (var2 != null) {
            break;
         }
      }
   }

   private void i() {
   }

   @Override
   public JComponent K() {
      return null;
   }

   static void o(aJ var0) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(459754285193734469L);
      Object[] var10002 = var10001;
      aJ var2 = var0;
      Method var10000 = var10003;

      try {
         var10000.invoke(var2, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   private static Exception a(Exception var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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

   private static String a(int var0, int var1) {
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

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14360;
      if (i[var3] == null) {
         i[var3] = (int)(f[var3] ^ var1);
      }

      return i[var3];
   }
}





