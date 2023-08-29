package ru.netology.cashbackhacker;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void CashbackHackServiceTestFirst() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(1_000, cashbackHackService.remain(0));
    }

    @org.junit.Test
    public void CashbackHackServiceTestSecond() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(999, cashbackHackService.remain(1));
    }

    @org.junit.Test
    public void CashbackHackServiceTestThird() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(524, cashbackHackService.remain(476));
    }

    @org.junit.Test
    public void CashbackHackServiceTestFourth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(1, cashbackHackService.remain(999));
    }

    @org.junit.Test
    /// Баг
    public void CashbackHackServiceTestFifth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(0, cashbackHackService.remain(1_000));
    }

    @org.junit.Test
    public void CashbackHackServiceTestSixth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(999, cashbackHackService.remain(1_001));
    }
}