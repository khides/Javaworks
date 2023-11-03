import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class ExistingDateTimes{
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
    // 登録済みの予定を格納するプロパティ
    LocalDateTime[] startTimes ;
    LocalDateTime[] endTimes ;

    // コンストラクタで予定を登録する
    ExistingDateTimes(String ... dateTimes){
        startTimes = new LocalDateTime[dateTimes.length];
        endTimes = new LocalDateTime[dateTimes.length];
        for (int i = 0; i < dateTimes.length; i++) {
            String[] parts = dateTimes[i].split(",");
            startTimes[i] = LocalDateTime.parse(parts[0], formatter);
            endTimes[i] = LocalDateTime.parse(parts[1], formatter);
        }
    }
    // 登録済みの予定と重複するか判定
    public boolean isOverlapping(LocalDateTime newStartTime, LocalDateTime newEndTime) {
        for (int i = 0; i < startTimes.length; i++) {
            if (newStartTime.isBefore(this.endTimes[i]) && newEndTime.isAfter(this.startTimes[i])) {
                return true; // 重複している
            }
        }
        return false; // 重複していない
    }
}


class Ex1FromTown {
    public static void main(String[] args) {
        // 予定を登録する
        ExistingDateTimes existingDateTimes = new ExistingDateTimes(
                "2022-10-15T09:30:00,2022-10-15T11:00:00",
                "2022-10-15T10:30:00,2022-10-15T12:00:00",
                "2022-10-15T12:30:00,2022-10-15T13:30:00",
                "2022-10-15T15:30:00,2022-10-15T16:30:00",
                "2022-10-15T16:00:00,2022-10-15T17:00:00",
                "2022-10-16T10:00:00,2022-10-16T11:00:00",
                "2022-10-16T10:30:00,2022-10-16T11:30:00"
                );
        // 新たな予定が登録済みの予定と重複しているか判定
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                LocalDateTime startTime = LocalDateTime.parse(parts[0], ExistingDateTimes.formatter);
                LocalDateTime endTime = LocalDateTime.parse(parts[1], ExistingDateTimes.formatter);

                if (existingDateTimes.isOverlapping(startTime, endTime)) {
                    System.out.println(line + " は重複しています");
                } else {
                    System.out.println(line + " は重複しません");
                }
            }
        }
    }
}
