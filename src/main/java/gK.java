import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class gK implements MouseMotionListener {
   final aM V;
   final Bq_2 Q;
   private static final long a;

   gK(Bq_2 var1, aM var2) {
      this.Q = var1;
      this.V = var2;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      com.c.c(444246150125769098L).setLong(com.c.c(523286601714712427L).get(this), System.currentTimeMillis());
      Method var10000 = (Method)com.c.c(523286601714712427L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(356550171956632315L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10000 = (Method)com.c.c(523286601714712427L).get(this);
      var10001 = com.c.f();
      var10003 = com.c.d(259809416276946956L);
      var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      String[] var10000 = aM.s();
      Method var10001 = (Method)com.c.c(523286601714712427L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(259809416276946956L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      String[] var2 = var10000;
      var10000 = (String[])com.c.c(519266586727171533L).get(this);
      Object[] var59 = com.c.f();
      Method var111 = com.c.d(318524088468974674L);
      var10002 = var59;
      var10001 = var10000;
      Method var26 = var111;

      try {
         var27 = (Boolean)var26.invoke(var10001, var10002);
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      label231: {
         if (var2 == null) {
            if (!var27) {
               return;
            }

            var28 = (Bq_2)com.c.c(523286601714712427L).get(this);
            if (var2 != null) {
               break label231;
            }

            Object[] var61 = com.c.f();
            Method var112 = com.c.d(127314456327634796L);
            var10002 = var61;
            Bq_2 var62 = var28;
            Method var29 = var112;

            try {
               var27 = (Boolean)var29.invoke(var62, var10002);
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }
         }

         if (!var27) {
            return;
         }

         var28 = (Bq_2)com.c.c(523286601714712427L).get(this);
      }

      Object[] var63 = com.c.f();
      Method var113 = com.c.d(581509655726891390L);
      var10002 = var63;
      Bq_2 var64 = var28;
      Method var30 = var113;

      try {
         var30.invoke(var64, var10002);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      Object[] var31 = com.c.f();
      Method var32 = com.c.d(299368763907830673L);
      var10002 = var31;
      var10001 = null;

      try {
         var33 = (Jc_2)var32.invoke(var10001, var10002);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      Jc_2 var3 = var33;
      Object[] var67 = com.c.a(true);
      Method var114 = com.c.d(555622091513386681L);
      var10002 = var67;
      Jc_2 var68 = var3;
      Method var34 = var114;

      try {
         var34.invoke(var68, var10002);
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Object[] var69 = com.c.f();
      Method var115 = com.c.d(386124335143120314L);
      var10002 = var69;
      Jc_2 var70 = var3;
      Method var35 = var115;

      try {
         var36 = (Integer)var35.invoke(var70, var10002);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      int var4;
      label212: {
         var4 = var36;
         int var37 = var4;
         if (var2 == null) {
            if (var4 == com.c.c(299739253213373636L).getInt(null)) {
               break label212;
            }

            var10000 = (String[])com.c.c(519266586727171533L).get(this);
            Object[] var71 = com.c.f();
            Method var116 = com.c.d(308510891685223410L);
            var10002 = var71;
            var10001 = var10000;
            Method var39 = var116;

            try {
               var37 = (Boolean)var39.invoke(var10001, var10002);
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }
         }

         if (var37 == 0) {
            return;
         }
      }

      Point var5 = var1.getLocationOnScreen();
      int var40 = var4;
      int var73 = com.c.c(299739253213373636L).getInt(null);
      if (var2 == null) {
         if (var4 == var73) {
            label236: {
               label237: {
                  long var6 = System.currentTimeMillis() - com.c.c(265947950920722185L).getLong(com.c.c(523286601714712427L).get(this));
                  long var124;
                  int var41 = (var124 = var6 - a) == 0L ? 0 : (var124 < 0L ? -1 : 1);
                  if (var2 == null) {
                     if (var41 <= 0) {
                        break label236;
                     }

                     var42 = (Bq_2)com.c.c(523286601714712427L).get(this);
                     if (var2 != null) {
                        break label237;
                     }

                     var41 = com.c.c(308935006170094327L).getInt(var42);
                  }

                  if (var41 != 1) {
                     break label236;
                  }

                  com.c.c(613636876466420761L).setBoolean(com.c.c(523286601714712427L).get(this), true);
                  var42 = (Bq_2)com.c.c(523286601714712427L).get(this);
               }

               Object[] var74 = com.c.a(
                  com.c.c(158293829082319616L).get(com.c.c(523286601714712427L).get(this)), var5, com.c.c(519266586727171533L).get(this), false
               );
               var10001 = com.c.d(334508177020329919L);
               var10003 = var74;
               var10002 = null;

               try {
                  var76 = (Integer)var10001.invoke(var10002, var10003);
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }

               com.c.c(198114728363002908L).setInt(var42, var76);
               var10000 = (String[])com.c.c(519266586727171533L).get(this);
               Object[] var77 = com.c.f();
               Method var119 = com.c.d(311724385945399618L);
               var10002 = var77;
               var10001 = var10000;
               Method var44 = var119;

               try {
                  var45 = (tH_3)var44.invoke(var10001, var10002);
               } catch (InvocationTargetException var14) {
                  throw var14.getTargetException();
               }

               var45.setVisible(true);
            }

            if (var2 == null) {
               return;
            }
         }

         var40 = var4;
         var73 = com.c.c(489009438537732568L).getInt(null);
      }

      if (var2 == null) {
         if (var40 == var73) {
            Object[] var79 = com.c.f();
            Method var120 = com.c.d(404411013658768945L);
            var10002 = var79;
            Jc_2 var80 = var3;
            Method var46 = var120;

            try {
               var47 = (aM)var46.invoke(var80, var10002);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            aM var24 = var47;
            Object[] var81 = com.c.f();
            Method var121 = com.c.d(308510891685223410L);
            var10002 = var81;
            aM var82 = var24;
            Method var48 = var121;

            try {
               var49 = (Boolean)var48.invoke(var82, var10002);
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            if (var2 == null) {
               if (var49 == 0) {
                  return;
               }

               Object[] var50 = com.c.a(com.c.c(158293829082319616L).get(com.c.c(523286601714712427L).get(this)), var5, var24, false);
               Method var51 = com.c.d(334508177020329919L);
               var10002 = var50;
               var10001 = null;

               try {
                  var49 = (Integer)var51.invoke(var10001, var10002);
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }
            }

            int var7 = var49;
            Object[] var85 = com.c.a(var7);
            Method var122 = com.c.d(468727106235330106L);
            var10002 = var85;
            aM var86 = var24;
            Method var52 = var122;

            try {
               var52.invoke(var86, var10002);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            var10000 = (String[])com.c.c(519266586727171533L).get(this);
            Object[] var87 = com.c.f();
            Method var123 = com.c.d(311724385945399618L);
            var10002 = var87;
            var10001 = var10000;
            Method var54 = var123;

            try {
               var55 = (tH_3)var54.invoke(var10001, var10002);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }

            var55.setVisible(true);
            if (var2 == null) {
               return;
            }
         }

         var40 = var4;
         var73 = com.c.c(581124220784366544L).getInt(null);
      }

      label241: {
         if (var2 == null) {
            if (var40 == var73) {
               break label241;
            }

            var40 = var4;
            var73 = com.c.c(617945104086657545L).getInt(null);
         }

         if (var2 == null) {
            if (var40 == var73) {
               break label241;
            }

            var40 = var4;
            var73 = com.c.c(470891030811937041L).getInt(null);
         }

         if (var40 != var73) {
            return;
         }
      }

      Object[] var56 = com.c.a(com.c.c(158293829082319616L).get(com.c.c(523286601714712427L).get(this)), var5, com.c.c(519266586727171533L).get(this));
      Method var57 = com.c.d(300591266421964145L);
      var10002 = var56;
      var10001 = null;

      try {
         var57.invoke(var10001, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }
   }

   static {
      long var0 = 8285475901048755521L;
      long var10002 = 8285475901048755571L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





