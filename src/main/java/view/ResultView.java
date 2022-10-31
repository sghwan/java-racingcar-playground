package view;

import domain.CarDto;

import java.util.List;

public class ResultView {
    public void printMoment(List<CarDto> carDtos) {
        for (CarDto carDto : carDtos) {
            System.out.printf("%5s : %s\n", carDto.getName(), drawPosition(carDto.getPosition()));
        }
        System.out.println();
    }

    private String drawPosition(int position) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < position; i++) {
            sb.append("-");
        }

        return sb.toString();
    }

    public void printResult(List<String> result) {
        String[] names = result.toArray(new String[0]);
        System.out.println(String.join(",", names) + "가 최종 우승했습니다.");
    }
}
