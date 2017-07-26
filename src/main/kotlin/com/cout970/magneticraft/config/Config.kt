package com.cout970.magneticraft.config

/**
 * Created by cout970 on 16/05/2016.
 */

const val CATEGORY_GENERAL = "general"
const val CATEGORY_ORES = CATEGORY_GENERAL + ".ores"
const val CATEGORY_ENERGY = CATEGORY_GENERAL + ".energy"
const val CATEGORY_GUI = CATEGORY_GENERAL + ".gui"
const val CATEGORY_PC = CATEGORY_GENERAL + ".pc"
const val CATEGORY_MACHINES = CATEGORY_GENERAL + ".machines"

object Config {

    @ConfigValue(category = CATEGORY_ORES, comment = "Copper ore")
    var copperOre = OreConfig(11, 8, 70, 10)

    @ConfigValue(category = CATEGORY_ORES, comment = "Lead ore")
    var leadOre = OreConfig(10, 8, 80, 2)

    @ConfigValue(category = CATEGORY_ORES, comment = "Tungsten ore")
    var tungstenOre = OreConfig(8, 8, 60, 20)

    @ConfigValue(category = CATEGORY_ORES, comment = "Tungsten ore")
    var pyriteOre = OreConfig(9, 9, 100, 30)

    @ConfigValue(category = CATEGORY_ORES, comment = "Limestone")
    var limestone = GaussOreConfig(0, 5, 0.9f, 3, 50, 64, 16)

    @ConfigValue(category = CATEGORY_GENERAL, comment = "Set players on fire when processing blaze" +
                                                        " rods in the crushing table")
    var crushingTableCausesFire = true

    @ConfigValue(category = CATEGORY_GENERAL, comment = "Unit of Heat to display, Celsius or Fahrenheit")
    var heatUnitCelsius = true

    @ConfigValue(category = CATEGORY_GUI, comment = "Allow players to use the gui of the combustion generator")
    var allowCombustionChamberGui = true

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Conversion ratio between Watts and Forge Energy, " +
                                                       "NOTE: all the values in the config about energy are in Watts")
    var wattsToFE = 1.0

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Incendiary Generator Energy Production")
    var incendiaryGeneratorMaxProduction = 40.0

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Electric Heater Max Consumption")
    var electricHeaterMaxConsumption = 20.0

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Electric Furnace Max Consumption")
    var electricFurnaceMaxConsumption = 20.0

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Airlock: maintenance cost per Air Bubble every " +
                                                       "40 ticks (2 sec)")
    var airlockBubbleCost = 1.0

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Airlock: cost of removing a water block")
    var airlockAirCost = 2.0

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Hydraulic Press Consumption")
    var hydraulicPressConsumption = 40.0

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Grinder Consumption")
    var grinderConsumption = 40.0

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Grinder Consumption")
    var sifterConsumption = 10.0

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Solar Panel Production")
    var solarPanelMaxProduction = 160.0

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Item Low Battery Capacity")
    var batteryItemLowCapacity: Int = 250000

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Item Medium Battery Capacity")
    var batteryItemMediumCapacity: Int = 2500000

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Battery Block Capacity")
    var blockBatteryCapacity: Int = 1000000

    @ConfigValue(category = CATEGORY_ENERGY, comment = "Battery Block Item charge and discharge " +
                                                       "speed in Joules/tick (Watts)")
    var blockBatteryTransferRate: Int = 500

    @ConfigValue(category = CATEGORY_MACHINES, comment = "Amount of water generated by a Water generator every tick")
    var waterGeneratorPerTickWater: Int = 20

    @ConfigValue(category = CATEGORY_PC, comment = "Allow TCP connections in PCs")
    var allowTcpConnections: Boolean = true

    @ConfigValue(category = CATEGORY_PC, comment = "Max TCP connections in all PCs")
    var maxTcpConnections: Int = 8

}