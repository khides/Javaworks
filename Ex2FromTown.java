import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Ex2FromTown {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        // 登録済みの予定
        List<Date> existingStartTimes = new ArrayList<>();
        List<Date> existingEndTimes = new ArrayList<>();

        existingStartTimes.add(parseDate("2022-10-15T09:30:00"));
        existingEndTimes.add(parseDate("2022-10-15T11:00:00"));
        existingStartTimes.add(parseDate("2022-10-15T10:30:00"));
        existingEndTimes.add(parseDate("2022-10-15T12:00:00"));
        existingStartTimes.add(parseDate("2022-10-15T12:30:00"));
        existingEndTimes.add(parseDate("2022-10-15T13:30:00"));
        existingStartTimes.add(parseDate("2022-10-15T15:30:00"));
        existingEndTimes.add(parseDate("2022-10-15T16:30:00"));
        existingStartTimes.add(parseDate("2022-10-15T16:00:00"));
        existingEndTimes.add(parseDate("2022-10-15T17:00:00"));

        Date startTime = parseDate("2022-10-15T09:00:00");
        Date endTime = parseDate("2022-10-15T18:00:00");

        List<Date> availableStartTimes = new ArrayList<>();
        List<Date> availableEndTimes = new ArrayList<>();

        // 空き時間を探す
        for (int i = 0; i < existingStartTimes.size() - 1; i++) {
            Date currentEnd = existingEndTimes.get(i);
            Date nextStart = existingStartTimes.get(i + 1);

            if (nextStart.getTime() - currentEnd.getTime() >= 3600000) { // 1時間以上の空き時間
                availableStartTimes.add(new Date(currentEnd.getTime()));
                availableEndTimes.add(new Date(nextStart.getTime()));
            }
        }

        // 結果を出力
        for (int i = 0; i < availableStartTimes.size(); i++) {
            System.out.println(dateFormat.format(availableStartTimes.get(i)) + " - " + dateFormat.format(availableEndTimes.get(i)));
        }
    }

    private static Date parseDate(String dateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        try {
            return dateFormat.parse(dateStr);
        } catch (Exception e) {
            return null;
        }
    }
}
