package by.tc.task01.entity.criteria;

public final class SearchCriteria {
	/**
	 * Search criteria for oven entities
	 */
	public static enum Oven{
		POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH
	}

	/**
	 * Search criteria for laptop entities
	 */
	public static enum Laptop{
		BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHES
	}

	/**
	 * Search criteria for refrigerator entities
	 */
	public static enum Refrigerator{
		POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH
	}

	/**
	 * Search criteria for vacuum cleaner entities
	 */
	public static enum VacuumCleaner{
		POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH
	}

	/**
	 * Search criteria for tablet PC entities
	 */
	public static enum TabletPC{
		BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR		
	}

	/**
	 * Search criteria for speakers entities
	 */
	public static enum Speakers{
		POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH
	}
	
	private SearchCriteria() {}
}

