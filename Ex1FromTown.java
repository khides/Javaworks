import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex1FromTown {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                LocalDateTime startTime = LocalDateTime.parse(parts[0], formatter);
                LocalDateTime endTime = LocalDateTime.parse(parts[1], formatter);

                if (isOverlapping(startTime, endTime)) {
                    System.out.println(line + " は重複しています");
                } else {
                    System.out.println(line + " は重複しません");
                }
            }
        }
    }

    // 登録済みの予定と重複するか判定
    private static boolean isOverlapping(LocalDateTime newStartTime, LocalDateTime newEndTime) {
        // 登録済みの予定
        LocalDateTime[] existingStartTimes = {
            LocalDateTime.parse("2022-10-15T09:30:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")),
            LocalDateTime.parse("2022-10-15T10:30:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")),
            LocalDateTime.parse("2022-10-15T12:30:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")),
            LocalDateTime.parse("2022-10-15T15:30:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")),
            LocalDateTime.parse("2022-10-15T16:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")),
            LocalDateTime.parse("2022-10-16T10:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")),
            LocalDateTime.parse("2022-10-16T10:30:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"))
        };
        LocalDateTime[] existingEndTimes = {
            LocalDateTime.parse("2022-10-15T11:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")),
            LocalDateTime.parse("2022-10-15T12:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")),
            LocalDateTime.parse("2022-10-15T13:30:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")),
            LocalDateTime.parse("2022-10-15T16:30:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")),
            LocalDateTime.parse("2022-10-15T17:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")),
            LocalDateTime.parse("2022-10-16T11:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")),
            LocalDateTime.parse("2022-10-16T11:30:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"))
        };

        for (int i = 0; i < existingStartTimes.length; i++) {
            LocalDateTime existingStartTime = existingStartTimes[i];
            LocalDateTime existingEndTime = existingEndTimes[i];

            if (newStartTime.isBefore(existingEndTime) && newEndTime.isAfter(existingStartTime)) {
                return true; // 重複している
            }
        }

        return false; // 重複していない
    }
}
