import java.util.Comparator;

public class OrderBrandToName implements Comparator<Brand> {

	@Override
	public int compare(Brand o1, Brand o2) {
		return o1.getBrandName().compareTo(o2.getBrandName());
	}

}
