public class PracticeProblem {

	public static void selectionSortName(String[] names, int[] ages) {
		int smallest, temp2;
		String temp1;
		for (int i = 0; i < names.length - 1; ++i) {
			smallest = i;
			for (int j = i + 1; j < names.length; ++j) {
				if (names[j].toLowerCase().compareTo(names[smallest].toLowerCase()) < 0) smallest = j;
			}
			temp1 = names[i];
			names[i] = names[smallest];
			names[smallest] = temp1;
			temp2 = ages[i];
			ages[i] = ages[smallest];
			ages[smallest] = temp2;
		}
	}

	public static void selectionSortAge(String[] names, int[] ages) {
		int smallest, temp2;
		String temp1;
		for (int i = 0; i < ages.length - 1; ++i) {
			smallest = i;
			for (int j = i + 1; j < ages.length; ++j) {
				if (ages[j] < ages[smallest]) smallest = j;
			}
			temp2 = ages[i];
			ages[i] = ages[smallest];
			ages[smallest] = temp2;
			temp1 = names[i];
			names[i] = names[smallest];
			names[smallest] = temp1;
		}
	}

}
