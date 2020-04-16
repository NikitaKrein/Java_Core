package task_4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Reflection reflection = new Reflection();
        reflection.printMethod(Track.class);
        reflection.printFields(Track.class);

        Class<Rap> rapClass = Rap.class;
        Track rapTrack = null;
        Class[] arg = {String.class, String.class, int.class};
        try {
            rapTrack = rapClass.getConstructor(arg).newInstance("dsv", "sdv", 45);
            rapTrack.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(rapTrack);

        reflection.setField(rapClass, rapTrack, "author", "Nik");
        reflection.setField(rapClass, rapTrack, "name", "Track");
        reflection.setField(rapClass, rapTrack, "lengthOfTrack", 270);
        System.out.println(rapTrack);

        //спросить
        System.out.println(rapTrack.getCostOfSong(77));
        try {
            Method method = rapClass.getDeclaredMethod("getCostOfSong", int.class);
            method.setAccessible(true);
            method.invoke(rapTrack, 77);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println(rapTrack.getCostOfSong(22));
    }
}
