package service;

import dao.Special;
import dao.Vehicle;
import dto.AbstractPersistent;
import dto.DataPersistence;

public final class IncentiveApiImpl implements IncentiveApi {

    private final AbstractPersistent dao = new DataPersistence();

    @Override
    /**
     * case 2
     */
    public Vehicle showSpecialPrice(Vehicle vehicle) {
        // read incentive from dao


        // find a certain incentive rule: today is between startdate and enddate


        // check vehicleFilter


        // calc special price


        // vehicleVO setter -> change price


        return vehicle; // do not have special price in vehicleVO
    }

    @Override
    /**
     * UI for case6(pop-up)
     */
    public Special showIncentive(String id) {
        // read incentiveVO from dao(database)
        return new Special();
    }
}
