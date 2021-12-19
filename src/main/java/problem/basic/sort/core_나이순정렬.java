package problem.basic.sort;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class core_나이순정렬 {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/10814
		 */
		Map<String, Integer> members = new HashMap();
		members.put("a", 20);
		members.put("b", 20);
		members.put("c", 30);
		members.put("d", 19);
		sortByAge(new LinkedList<>(members.entrySet()));
		sortByAge2(List.of(new Member("a", 20), new Member("b", 20), new Member("c", 30), new Member("d", 19)));
	}

	public static void sortByAge(List<Map.Entry<String, Integer>> members) {
		List<Map.Entry<String, Integer>> membersCopy = new LinkedList<>(members);
		membersCopy.sort(Map.Entry.comparingByValue());

		System.out.println(membersCopy);
	}

	public static void sortByAge2(List<Member> members) {
		List<Member> sortedMembers = new ArrayList<>(members);
		sortedMembers.sort(Comparator.naturalOrder());
		System.out.println(sortedMembers);
	}
}

class Member implements Comparable<Member> {
	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "=" + age;
	}

	@Override
	public int compareTo(@NotNull Member o) {
		return Integer.compare(this.age, o.age);
	}
}
