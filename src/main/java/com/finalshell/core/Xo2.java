package com.finalshell.core;

import com.finalshell.ui.model.US;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

public class Xo2 {
   @NotNull
   public final StringBuffer x;
   public int f;
   public static String a;

   public Xo2(@NotNull StringBuffer var1, int var2) {
      this.x = var1;
      this.f = var2;
   }

   @NotNull
   public Xo2 k() {
      return new Xo2(new StringBuffer(this.x), this.f);
   }

   @Override
   public boolean equals(Object var1) {
      String[] var2 = Wq2_2.y();
      Object var10000 = this;
      if (var2 == null) {
         if (this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if (var2 == null) {
         if (!(var10000 instanceof Xo2)) {
            return false;
         }

         var10000 = var1;
      }

      Xo2 var3 = (Xo2)var10000;
      int var4 = this.f;
      if (var2 == null) {
         if (this.f != var3.f) {
            return 0 != 0;
         }

         var4 = (this.x.toString().stripTrailing().equals(var3.x.toString().stripTrailing())) ? 1 : 0;
      }

      if (var2 != null) {
         return var4 != 0;
      } else {
         return (boolean)(var4 != 0 ? 1 : 0);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.x, this.f);
   }

   void X(boolean var1, US var2) {
      label16: {
         String[] var3 = Wq2_2.y();
         if (var3 == null) {
            switch (WI_2.f[var2.ordinal()]) {
               case 1:
               default:
                  this.M(var1);
                  break;
               case 2:
                  break label16;
            }
         }

         if (var3 == null) {
            return;
         }
      }

      this.A(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void A(boolean var1) {
      String var3 = this.x.toString();
      String[] var10000 = Wq2_2.y();
      String var4 = a;
      String[] var2 = var10000;
      int var5 = (var1) ? 1 : 0;
      if (var2 == null) {
         if (var1 == 0) {
            this.f--;

            label78:
            while (true) {
               int var10;
               if (this.f >= 0) {
                  var10 = (Character.isLetterOrDigit(var3.charAt(this.f))) ? 1 : 0;
                  if (var2 == null && var2 == null) {
                     if (var10 == 0) {
                        var10 = var4.indexOf(var3.charAt(this.f));
                        if (var2 == null) {
                           if (var10 == -1) {
                              this.f--;
                              if (var2 == null) {
                                 continue;
                              }
                           }

                           var10 = this.f;
                        }
                     } else {
                        var10 = this.f;
                     }
                  }
               } else {
                  var10 = this.f;
               }

               while (true) {
                  if (var10 < 0) {
                     break label78;
                  }

                  byte var11 = (Character.isLetterOrDigit(var3.charAt(this.f))) ? 1 : 0;
                  if (var2 == null ? var11 == 0 && var4.indexOf(var3.charAt(this.f)) == -1 : var11 == -1) {
                     break label78;
                  }

                  this.f--;
                  if (var2 != null) {
                     break label78;
                  }

                  var10 = this.f;
               }
            }

            this.f++;
            return;
         }

         var5 = this.f;
      }

      while (true) {
         int var6;
         int var10001;
         if (var5 < var3.length()) {
            var6 = (Character.isLetterOrDigit(var3.charAt(this.f))) ? 1 : 0;
            label151:
            if (var2 == null) {
               label160: {
                  if (var2 == null) {
                     if (var6 != 0) {
                        this.f++;
                        if (var2 == null) {
                           var5 = this.f;
                           continue;
                        }
                        break label160;
                     }

                     var6 = var4.indexOf(var3.charAt(this.f));
                  }

                  var10001 = -1;
                  if (var2 != null) {
                     break label151;
                  }

                  if (var6 != -1) {
                     this.f++;
                     if (var2 == null) {
                        var5 = this.f;
                        continue;
                     }
                  }
               }

               var6 = this.f;
               var10001 = var3.length();
            } else {
               var10001 = var3.length();
            }
         } else {
            var6 = this.f;
            var10001 = var3.length();
         }

         while (var6 < var10001) {
            int var7 = (Character.isLetterOrDigit(var3.charAt(this.f))) ? 1 : 0;
            if (var2 == null) {
               if (var7 != 0) {
                  return;
               }

               var7 = var4.indexOf(var3.charAt(this.f));
            }

            if (var7 != -1) {
               return;
            }

            this.f++;
            if (var2 != null) {
               this.f--;

               label66:
               while (true) {
                  int var8;
                  if (this.f >= 0) {
                     var8 = (Character.isLetterOrDigit(var3.charAt(this.f))) ? 1 : 0;
                     if (var2 == null && var2 == null) {
                        if (var8 == 0) {
                           var8 = var4.indexOf(var3.charAt(this.f));
                           if (var2 == null) {
                              if (var8 == -1) {
                                 this.f--;
                                 if (var2 == null) {
                                    continue;
                                 }
                              }

                              var8 = this.f;
                           }
                        } else {
                           var8 = this.f;
                        }
                     }
                  } else {
                     var8 = this.f;
                  }

                  while (true) {
                     if (var8 < 0) {
                        break label66;
                     }

                     byte var9 = (Character.isLetterOrDigit(var3.charAt(this.f))) ? 1 : 0;
                     if (var2 == null ? var9 == 0 && var4.indexOf(var3.charAt(this.f)) == -1 : var9 == -1) {
                        break label66;
                     }

                     this.f--;
                     if (var2 != null) {
                        break label66;
                     }

                     var8 = this.f;
                  }
               }

               this.f++;
               return;
            }

            var6 = this.f;
            var10001 = var3.length();
         }

         return;
      }
   }

   public void M(boolean var1) {
      String[] var10000 = Wq2_2.y();
      String var3 = this.x.toString();
      String[] var2 = var10000;
      byte var6 = (var1) ? 1 : 0;
      if (var2 == null) {
         if (var1 == 0) {
            this.f--;
         }

         var6 = 0;
      }

      byte var4 = var6;

      while (true) {
         label58:
         if (this.f >= 0) {
            var7 = this.f;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               if (this.f >= var3.length()) {
                  return;
               }

               var7 = var3.charAt(this.f);
            }

            label55: {
               int var5 = var7;
               byte var8 = (Character.isLetterOrDigit((char)var5)) ? 1 : 0;
               if (var2 == null) {
                  if (var8 != 0) {
                     var4 = 1;
                     if (var2 == null) {
                        break label55;
                     }
                  }

                  var8 = var4;
               }

               if (var8 != 0 && var2 == null) {
                  break label58;
               }
            }

            int var10002 = (var1) ? 1 : 0;
            if (var2 == null) {
               var10002 = var1 != 0 ? 1 : -1;
            }

            this.f += var10002;
            if (var2 == null) {
      int var7;
      int var7;
               continue;
            }
         }

         var7 = var1;
         break;
      }

      if (var7 == 0) {
         this.f++;
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "L\f\u0000\u007fap=\u0018\u000eptt\nCB\u0016\u0001zfP\u001dZ\r".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 93;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 93;
         var10006 = var0;
      } else {
         var6 = 93;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 93;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 59;
               break;
            case 1:
               var23 = 110;
               break;
            case 2:
               var23 = 2;
               break;
            case 3:
               var23 = 15;
               break;
            case 4:
               var23 = 18;
               break;
            case 5:
               var23 = 118;
               break;
            default:
               var23 = 61;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}






