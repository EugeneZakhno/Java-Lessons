/*
import sun.plugin2.message.Message;

import java.nio.channels.Channel;
import java.util.Date;
//import java.util.function.Function;

/*
*  Что такое функциональное программирование?
*  Функциональное программирование делает что бы состояние объекта не менялось
***********************************************************************************************
*   Функциональное программирование убирает  скрытые параметры (sie effects = побочные эффекты),
*   Чтобы избавится вот от таких side effects в java были введены лямбда выражения
*
*
* */

/*
public class FunctionalProgrammingLesson {
    public static void main(String[] args) {

    }
    public int square(int x){ // Здесь два входных параметра и два выходных параметра
        return x*x;           // Просто по умолчанию входным параметром по умолчанию
    }                         // у нас является состояние объекта
    public void processNext(){
        Message message = InboxQueue.popMessage();
        if (message != null){
            process(message);
        }
    }

    public boolean processMessage(Channel channel){
        //..
        return true||false;
    }
               // Для примера показано, но так делать нельзя
    public Program getCurrentProgram(TVGuide guide, int channel){ // 1 параметр, 2 параметр
           Schedule schedule = guide.getSchedule(channel);
           Program current = schedule.programAt(new Date());// 3 параметр
           return current;
    }

               // ТЕперь перепишем по новому, с 3-мя параметрами в аргументах метода
    public Program getProgramAt(TVGuide guide, int channel, Date when){
        Schedule schedule = guide.getSchedule(channel);
        Program program = schedule.programAt(when);
        return program;
    }

    Function <Integer, Integer> add1 = x -> x * x;

    void process(Message message){

    }

}
*/
