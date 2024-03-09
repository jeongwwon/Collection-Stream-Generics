package Collection.Queue;

import Collection.Object.Message;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//array list는 배열에 객체를 저장, Linked list는 객체를 체인으로 연결
public class queue {
    public static void main(String args[]){
        Queue<Message> messageQueue = new LinkedList<>();
        messageQueue.offer(new Message("sendMail","홍길동"));
        messageQueue.offer(new Message("sendSMS","신용권"));
        messageQueue.offer(new Message("sendKakaotalk","감자바"));

        while (!messageQueue.isEmpty()){
            Message message=messageQueue.poll();
            switch (message.command){
                case "sendMail":
                    System.out.println(message.to+"님에게 메일을 보냅니다");
                    break;
                case "sendSMS":
                    System.out.println(message.to+"님에게 sms를 보냅니다");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to+"님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
