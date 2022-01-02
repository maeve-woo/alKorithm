package problem.level.two;

import java.util.ArrayList;
import java.util.List;

public class 참고관리 {
	public static void main(String[] args) {
//		System.out.println(solution(List.of(1.4F, 1.991F, 1.01F, 1.32F)));
//		System.out.println(solution(List.of(1.4F, 1.01F, 2.4F, 1.01F, 1.01F)));
		System.out.println(solution(List.of(2.02F, 2.95F, 1.14F, 2.13F, 1.86F, 1.45F, 1.5F, 2.77F, 1.55F, 1.49F, 1.2F, 2.89F, 2F, 1.75F, 2.56F, 2.05F, 2.19F, 1.11F, 1.81F, 2.45F, 1.37F, 2.67F, 1.63F, 1.89F, 1.76F, 2.05F, 2.98F, 2.53F, 2.15F, 1.21F, 2.43F, 2.21F, 2.15F, 2.85F, 1.28F, 2.17F, 1.52F, 1.33F, 2.14F, 2.93F, 1.39F, 2.83F, 1.19F, 1.21F, 1.09F, 1.77F, 2.93F, 2.53F, 1.4F, 2.49F, 2.81F, 2.05F, 2.48F, 2.47F, 1.95F, 1.41F, 2.12F, 2.45F, 1.68F, 1.57F, 1.66F, 1.69F, 1.68F, 2.93F, 1.27F, 1.77F, 2.97F, 1.89F, 2.15F, 1.37F, 1.35F, 2.05F, 1.12F, 1.37F, 2.89F, 2.05F, 1.11F, 2.23F, 2.6F, 1.33F, 1.42F, 1.31F, 1.89F, 2.33F, 1.94F, 1.47F, 2.29F, 2.61F, 2.92F, 2.45F, 1.89F, 1.49F, 2.34F, 2.63F, 1.82F, 2.53F, 1.59F, 2.03F, 1.92F, 1.65F, 2.17F, 2.67F, 1.43F, 1.17F, 1.61F, 2.51F, 2.48F, 2.25F, 1.56F, 2.39F, 2.12F, 2.61F, 2.76F, 1.93F, 1.71F, 2.57F, 2.77F, 2.47F, 2.36F, 2.05F, 1.5F, 1.25F, 1.98F, 1.41F, 1.46F, 1.63F, 2.67F, 1.57F, 2.25F, 1.31F, 1.41F, 2.45F, 1.47F, 2.93F, 1.46F, 1.73F, 1.82F, 2.07F, 1.86F, 1.05F, 2.29F, 1.35F, 1.98F, 1.97F, 2.4F, 1.53F, 2.65F, 2.29F, 1.12F, 1.35F, 1.45F, 2.77F, 2.61F, 2.63F, 1.96F, 2.25F, 2.14F, 1.87F, 1.94F, 2.93F, 2.88F, 2.19F, 2.02F, 2.53F, 1.38F, 1.27F, 2.11F, 1.49F, 2.2F, 1.83F, 1.32F, 2.25F, 1.65F, 2.37F, 2.57F, 2.29F, 2.29F, 1.09F, 2.99F, 1.01F, 1.73F, 1.89F, 2.47F, 1.09F, 2.69F, 2.71F, 2.73F, 1.69F, 1.31F, 1.23F, 2.36F, 2.29F, 1.1F, 1.99F, 1.44F, 2.89F, 1.32F, 1.93F, 1.72F, 1.17F)));
	}

	public static int solution(List<Float> weight) {
		final float MAX_WEIGHT = 3.0F;
		int weightSize = weight.size();
		boolean[] two = new boolean[weight.size()];
		int canTwo = 0;

		for (int i = 0; i < weightSize; i++) {
			float max = 0;
			int index = 0;
			for (int j = i + 1; j < weightSize; j++) {
				if (two[j] || two[i]) {
					continue;
				}
				float total = weight.get(i) + weight.get(j);
				if (total <= MAX_WEIGHT && total > max) {
					max = total;
					index = j;
					if (total == MAX_WEIGHT) {
						break;
					}
				}
			}
			if (index != 0) {
				two[index] = true;
				canTwo += 1;
			}
		}
		return weightSize - canTwo;
	}
}
