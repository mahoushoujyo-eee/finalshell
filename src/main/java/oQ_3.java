import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class oQ_3 implements MouseListener {
   long B;
   final nj_2 r;
   final boolean F;
   final aJ L;
   private static final long[] a;
   private static final Long[] b;

   oQ_3(aJ var1, nj_2 var2, boolean var3) {
      this.L = var1;
      this.r = var2;
      this.F = var3;
      com.c.c(343665629204695331L).setLong(this, 0L);
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
      String var2 = aA.z();
      int var10000 = var1.getClickCount();
      if (var2 == null) {
         boolean var5 = var10000 == 2;
      }

      Object[] var6 = com.c.f();
      Method var7 = com.c.d(454647487873911743L);
      Object[] var11 = var6;
      Object var10 = null;

      try {
         var10000 = (Boolean)var7.invoke(var10, var11);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      if (var2 == null) {
         if (var10000 == 0) {
            return;
         }

         long var12;
         var10000 = (var12 = System.currentTimeMillis() - com.c.c(343665629204695331L).getLong(this) - a(880, 8800055089297986574L)) == 0L
            ? 0
            : (var12 < 0L ? -1 : 1);
      }

      if (var2 == null) {
         boolean var9 = var10000 < 0;
      }

      com.c.c(343665629204695331L).setLong(this, System.currentTimeMillis());
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String var10000 = aA.z();
      int var3 = ((aJ)com.c.c(593306439561595691L).get(com.c.c(414214645141473905L).get(this))).getRowForLocation(var1.getX(), var1.getY());
      com.c.c(231686721816212635L)
         .set(
            com.c.c(414214645141473905L).get(this),
            ((aJ)com.c.c(593306439561595691L).get(com.c.c(414214645141473905L).get(this))).getPathForLocation(var1.getX(), var1.getY())
         );
      String var2 = var10000;
      int var7 = var3;
      byte var10001 = -1;
      if (var2 == null) {
         if (var3 != -1) {
            if (var1.getClickCount() != 1) {
               return;
            }

            label36: {
               long var4 = System.currentTimeMillis() - com.c.c(159470416555914823L).getLong(com.c.c(414214645141473905L).get(this));
               long var9;
               int var8 = (var9 = var4 - a(9273, 9088079100375348038L)) == 0L ? 0 : (var9 < 0L ? -1 : 1);
               if (var2 == null) {
                  if (var8 <= 0) {
                     break label36;
                  }

                  var8 = ((aJ)com.c.c(593306439561595691L).get(com.c.c(414214645141473905L).get(this))).getSelectionCount();
               }

               int var6 = var8;
               if (var6 == 1) {
                  com.c.c(137395258222385003L).setBoolean(com.c.c(414214645141473905L).get(this), true);
               }
            }

            if (var2 == null) {
               return;
            }
         }

         var7 = var1.getButton();
         var10001 = 1;
      }

      if (var2 == null) {
         if (var7 == var10001) {
            ((aJ)com.c.c(414214645141473905L).get(this)).getSelectionModel().clearSelection();
         }

         var7 = var1.getButton();
         var10001 = 3;
      }

      if (var7 == var10001) {
      }
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String var10000 = aA.z();
      Method var10001 = (Method)com.c.c(259251831013725374L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(149160680229662748L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var54 = (KQ)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      KQ var3 = var54;
      var10002 = com.c.f();
      var10004 = com.c.d(249886410317960768L);
      var10003 = var10002;
      KQ var82 = var3;
      var10001 = var10004;

      try {
         var56 = (U)var10001.invoke(var82, var10003);
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      U var4 = var56;
      aJ var5 = (aJ)var1.getSource();
      var10001 = (Method)com.c.c(414214645141473905L).get(this);
      var10002 = com.c.a(var1.getPoint());
      var10004 = com.c.d(379754982100791858L);
      var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var59 = (Integer)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }

      String var2;
      int var6;
      int var7;
      label209: {
         var6 = var59;
         var7 = 0;
         var2 = var10000;
         int var30 = var6;
         if (var2 == null) {
            if (var6 != 0) {
               break label209;
            }

            var30 = 1;
         }

         var7 = var30;
      }

      Object[] var60 = com.c.a(var6);
      Method var96 = com.c.d(313360281912871059L);
      var10002 = var60;
      aJ var61 = var5;
      Method var31 = var96;

      try {
         var32 = (DefaultMutableTreeNode)var31.invoke(var61, var10002);
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      label213: {
         label214: {
            DefaultMutableTreeNode var8;
            TreePath var9;
            label215: {
               var8 = var32;
               var9 = null;
               if (var6 > -1) {
                  Object[] var62 = com.c.a(var8);
                  Method var97 = com.c.d(263865946362642439L);
                  var10002 = var62;
                  aJ var63 = var5;
                  Method var33 = var97;

                  try {
                     var34 = (TreePath)var33.invoke(var63, var10002);
                  } catch (InvocationTargetException var23) {
                     throw var23.getTargetException();
                  }

                  var9 = var34;
                  var35 = var1.getButton();
                  var64 = 1;
                  if (var2 != null) {
                     break label215;
                  }

                  label196:
                  if (var35 == 1) {
                     var10000 = var8;
                     if (var2 == null) {
                        if (var8 == null) {
                           break label196;
                        }

                        var10000 = (String)var8.getUserObject();
                     }

                     label189: {
                        var37 = var10000.getClass().equals(ck_4.class);
                        if (var2 == null) {
                           if (var37 != 0) {
                              ck_4 var10 = (ck_4)var8.getUserObject();
                              var37 = var1.getClickCount();
                              var65 = 2;
                              if (var2 != null) {
                                 break label189;
                              }

                              if (var37 == 2) {
                                 Object[] var66 = com.c.f();
                                 Method var98 = com.c.d(303756590022481369L);
                                 var10002 = var66;
                                 U var67 = var4;
                                 Method var38 = var98;

                                 try {
                                    var10000 = (String)var38.invoke(var67, var10002);
                                 } catch (InvocationTargetException var22) {
                                    throw var22.getTargetException();
                                 }

                                 Object[] var68 = com.c.f();
                                 Method var99 = com.c.d(194560825135347400L);
                                 var10002 = var68;
                                 var10001 = var10000;
                                 Method var40 = var99;

                                 try {
                                    var10000 = (String)var40.invoke(var10001, var10002);
                                 } catch (InvocationTargetException var21) {
                                    throw var21.getTargetException();
                                 }

                                 Object[] var70 = com.c.f();
                                 Method var100 = com.c.d(424156930953488367L);
                                 var10002 = var70;
                                 var10001 = var10000;
                                 Method var42 = var100;

                                 try {
                                    var43 = (F8)var42.invoke(var10001, var10002);
                                 } catch (InvocationTargetException var20) {
                                    throw var20.getTargetException();
                                 }

                                 F8 var11 = var43;
                                 SwingUtilities.invokeLater(new gO(this, var11, var10, var4));
                              }
                           }

                           var37 = var1.getClickCount();
                        }

                        var65 = 1;
                     }

                     if (var37 == var65) {
                     }
                  }
               }

               var35 = var1.getButton();
               if (var2 != null) {
                  break label214;
               }

               var64 = 3;
            }

            if (var35 == var64) {
               var10000 = (String)com.c.c(414214645141473905L).get(this);
               Object[] var72 = com.c.f();
               Method var101 = com.c.d(213918959370705943L);
               var10002 = var72;
               var10001 = var10000;
               Method var45 = var101;

               try {
                  var10000 = (String)var45.invoke(var10001, var10002);
               } catch (InvocationTargetException var19) {
                  throw var19.getTargetException();
               }

               Object[] var74 = com.c.f();
               Method var102 = com.c.d(196767746087547704L);
               var10002 = var74;
               var10001 = var10000;
               Method var47 = var102;

               try {
                  var48 = (Tv_2)var47.invoke(var10001, var10002);
               } catch (InvocationTargetException var18) {
                  throw var18.getTargetException();
               }

               var48.setVisible(false);
               DefaultMutableTreeNode var28 = var8;
               if (var2 == null) {
                  if (var8 == null) {
                     var28 = (DefaultMutableTreeNode)com.c.c(213130010239103238L).get(com.c.c(414214645141473905L).get(this));
                     var7 = 1;
                  }

                  com.c.c(486701759580007258L)
                     .set(com.c.c(414214645141473905L).get(this), new l5_2(var5, var28, var3, (boolean)var7, com.c.c(451929456137016711L).getBoolean(this)));
                  ((l5_2)com.c.c(486701759580007258L).get(com.c.c(414214645141473905L).get(this)))
                     .show((Component)var1.getSource(), var1.getX() + 1, var1.getY() + 1);
                  Object[] var76 = com.c.a(true);
                  Method var103 = com.c.d(438941361784812150L);
                  var10002 = var76;
                  KQ var77 = var3;
                  Method var49 = var103;

                  try {
                     var49.invoke(var77, var10002);
                  } catch (InvocationTargetException var17) {
                     throw var17.getTargetException();
                  }

                  ((l5_2)com.c.c(486701759580007258L).get(com.c.c(414214645141473905L).get(this))).addPopupMenuListener(new tK_3(this, var3));
               }

               Object[] var78 = com.c.f();
               Method var104 = com.c.d(447854232501987193L);
               var10002 = var78;
               aJ var79 = var5;
               Method var50 = var104;

               try {
                  var51 = (List)var50.invoke(var79, var10002);
               } catch (InvocationTargetException var16) {
                  throw var16.getTargetException();
               }

               List var29 = var51;
               DefaultMutableTreeNode var12 = var28;
               int var13 = 0;

               label172: {
                  for (DefaultMutableTreeNode var15 : var29) {
                     var35 = var15.equals(var12);
                     if (var2 != null) {
                        break label172;
                     }

                     label168: {
                        if (var2 == null) {
                           if (var35 == 0) {
                              break label168;
                           }

                           var35 = 1;
                        }

                        var13 = var35;
                        if (var2 == null) {
                           break;
                        }
                     }

                     if (var2 != null) {
                        break;
                     }
                  }

                  var35 = var13;
               }

               if (var2 != null) {
                  break label214;
               }

               if (var35 == 0) {
                  var5.setSelectionPath(var9);
               }
            }

            var52 = (aJ)com.c.c(414214645141473905L).get(this);
            if (var2 != null) {
               break label213;
            }

            var35 = com.c.c(137395258222385003L).getBoolean(var52);
         }

         if (var35 == 0) {
            return;
         }

         var52 = (aJ)com.c.c(414214645141473905L).get(this);
      }

      com.c.c(137395258222385003L).setBoolean(var52, false);
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
      com.c.c(137395258222385003L).setBoolean(com.c.c(414214645141473905L).get(this), false);
   }

   @Override
   public void mouseExited(MouseEvent var1) {
      com.c.c(137395258222385003L).setBoolean(com.c.c(414214645141473905L).get(this), false);
   }

   static {
      long var0 = 9201609407459792327L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u0001\u00adøÊy\u000e¦\u0095\u0005\u0092¼z\\ñ\u0004\u0015";
      int var5 = "\u0001\u00adøÊy\u000e¦\u0095\u0005\u0092¼z\\ñ\u0004\u0015".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
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
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Long[2];
   }

   private static long a(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 6015) & 32767;
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }
}





