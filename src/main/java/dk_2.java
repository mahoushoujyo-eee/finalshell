import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Dk_2 {
   Km_2 r;

   Dk_2(Km_2 var1) {
      com.c.c(491511652548502544L).set(this, var1);
   }

   public void K(KeyEvent var1) {
      String var2 = Km_2.U();
      if (var1.getModifiers() <= 0) {
         String var3 = (var1.getKeyChar() + "").toLowerCase();
         Method var10000 = (Method)com.c.c(491511652548502544L).get(this);
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(565315838989287146L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var32 = (kl_4)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         kl_4 var4 = var32;
         int var33 = var3.length();
         if (var2 == null) {
            if (var33 != 1) {
               return;
            }

            var33 = ((Km_2)com.c.c(491511652548502544L).get(this)).getRowCount();
         }

         int var5 = var33;
         int var6 = ((Km_2)com.c.c(491511652548502544L).get(this)).getSelectedRow();
         byte var7 = 0;
         int var8 = var6 + 1;

         label175: {
            while (var8 < var5) {
               int var9 = ((Km_2)com.c.c(491511652548502544L).get(this)).convertRowIndexToModel(var8);
               var10001 = com.c.a(var9);
               var10003 = com.c.d(291710787850444005L);
               var10002 = var10001;
               kl_4 var54 = var4;
               var10000 = var10003;

               try {
                  var10000 = (Method)var10000.invoke(var54, var10002);
               } catch (InvocationTargetException var17) {
                  throw var17.getTargetException();
               }

               Object var10 = var10000;
               String var11 = "";
               var36 = var10.getClass().equals(ck_4.class);
               if (var2 != null) {
                  break label175;
               }

               label190: {
                  label191: {
                     label192: {
                        if (var2 == null) {
                           if (var36 != 0) {
                              ck_4 var12 = (ck_4)var10;
                              var10001 = com.c.f();
                              var10003 = com.c.d(396085629172753019L);
                              var10002 = var10001;
                              ck_4 var56 = var12;
                              var10000 = var10003;

                              try {
                                 var38 = (String)var10000.invoke(var56, var10002);
                              } catch (InvocationTargetException var20) {
                                 throw var20.getTargetException();
                              }

                              var11 = var38;
                              if (var2 == null) {
                                 break label192;
                              }
                           }

                           var36 = var10.getClass().equals(tf_4.class);
                        }

                        if (var2 != null) {
                           break label191;
                        }

                        if (var36 != 0) {
                           tf_4 var28 = (tf_4)var10;
                           var10001 = com.c.f();
                           var10003 = com.c.d(179612178163941306L);
                           var10002 = var10001;
                           tf_4 var58 = var28;
                           var10000 = var10003;

                           try {
                              var40 = (String)var10000.invoke(var58, var10002);
                           } catch (InvocationTargetException var19) {
                              throw var19.getTargetException();
                           }

                           var11 = var40;
                        }
                     }

                     var11 = var11.toLowerCase();
                     if (var2 != null) {
                        break label190;
                     }

                     var36 = var11.startsWith(var3);
                  }

                  if (var36 != 0) {
                     var10000 = (Method)com.c.c(491511652548502544L).get(this);
                     var10001 = com.c.a(var8);
                     var10003 = com.c.d(374989845389634076L);
                     var10002 = var10001;
                     var10001 = var10000;
                     var10000 = var10003;

                     try {
                        var10000.invoke(var10001, var10002);
                     } catch (InvocationTargetException var18) {
                        throw var18.getTargetException();
                     }

                     var7 = 1;
                     if (var2 == null) {
                        break;
                     }
                  }

                  var8++;
               }

               if (var2 != null) {
                  break;
               }
            }

            var36 = var7;
         }

         if (var2 == null) {
            if (var36 != 0) {
               return;
            }

            var36 = 0;
         }

         var8 = var36;

         while (var8 < var5) {
            int var23 = ((Km_2)com.c.c(491511652548502544L).get(this)).convertRowIndexToModel(var8);
            var10001 = com.c.a(var23);
            var10003 = com.c.d(291710787850444005L);
            var10002 = var10001;
            kl_4 var62 = var4;
            var10000 = var10003;

            try {
               var10000 = (Method)var10000.invoke(var62, var10002);
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }

            label197: {
               label198: {
                  String var26;
                  label199: {
                     Object var24 = var10000;
                     var26 = "";
                     var45 = var24.getClass().equals(ck_4.class);
                     if (var2 == null) {
                        if (var45) {
                           ck_4 var29 = (ck_4)var24;
                           var10001 = com.c.f();
                           var10003 = com.c.d(396085629172753019L);
                           var10002 = var10001;
                           ck_4 var64 = var29;
                           var10000 = var10003;

                           try {
                              var47 = (String)var10000.invoke(var64, var10002);
                           } catch (InvocationTargetException var15) {
                              throw var15.getTargetException();
                           }

                           var26 = var47;
                           if (var2 == null) {
                              break label199;
                           }
                        }

                        var45 = var24.getClass().equals(tf_4.class);
                     }

                     if (var2 != null) {
                        break label198;
                     }

                     if (var45) {
                        tf_4 var30 = (tf_4)var24;
                        var10001 = com.c.f();
                        var10003 = com.c.d(179612178163941306L);
                        var10002 = var10001;
                        tf_4 var66 = var30;
                        var10000 = var10003;

                        try {
                           var49 = (String)var10000.invoke(var66, var10002);
                        } catch (InvocationTargetException var14) {
                           throw var14.getTargetException();
                        }

                        var26 = var49;
                     }
                  }

                  var26 = var26.toLowerCase();
                  if (var2 != null) {
                     break label197;
                  }

                  var45 = var26.startsWith(var3);
               }

               if (var45) {
                  var10000 = (Method)com.c.c(491511652548502544L).get(this);
                  var10001 = com.c.a(var8);
                  var10003 = com.c.d(374989845389634076L);
                  var10002 = var10001;
                  var10001 = var10000;
                  var10000 = var10003;

                  try {
                     var10000.invoke(var10001, var10002);
                  } catch (InvocationTargetException var13) {
                     throw var13.getTargetException();
                  }

                  if (var2 == null) {
                     break;
                  }
               }

               var8++;
            }

            if (var2 != null) {
               break;
            }
         }
      }
   }
}





