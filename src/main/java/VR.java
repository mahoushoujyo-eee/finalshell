import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class VR implements tk_4 {
   final m6 i;

   VR(m6 var1) {
      this.i = var1;
   }

   @Override
   public void R(U var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(176356587927714575L);
      Object[] var10002 = var10001;
      U var3 = var1;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }
}





