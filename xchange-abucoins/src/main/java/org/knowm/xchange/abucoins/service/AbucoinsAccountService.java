package org.knowm.xchange.abucoins.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.abucoins.AbucoinsAdapters;
import org.knowm.xchange.abucoins.dto.account.AbucoinsAccount;
import org.knowm.xchange.currency.Currency;
import org.knowm.xchange.dto.account.AccountInfo;
import org.knowm.xchange.dto.account.FundingRecord;
import org.knowm.xchange.exceptions.NotAvailableFromExchangeException;
import org.knowm.xchange.exceptions.NotYetImplementedForExchangeException;
import org.knowm.xchange.service.account.AccountService;
import org.knowm.xchange.service.trade.params.TradeHistoryParams;
import org.knowm.xchange.service.trade.params.WithdrawFundsParams;

/**
 * Author: bryant_harris
 */

public class AbucoinsAccountService extends AbucoinsAccountServiceRaw implements AccountService {

  /**
   * Constructor
   *
   * @param exchange
   */
  public AbucoinsAccountService(Exchange exchange) {
    super(exchange);
  }

  @Override
  public AccountInfo getAccountInfo() throws IOException {
    AbucoinsAccount[] accounts = getAbucoinsAccounts();
    return AbucoinsAdapters.adaptAccountInfo(accounts);
  }

  @Override
  public String requestDepositAddress(Currency currency, String... arguments) throws IOException {

    throw new NotAvailableFromExchangeException();
  }

  @Override
  public String withdrawFunds(WithdrawFundsParams params) throws IOException {
    throw new NotAvailableFromExchangeException();
  }

  @Override
  public String withdrawFunds(Currency currency, BigDecimal amount, String address) throws IOException {

    throw new NotAvailableFromExchangeException();

  }

  @Override
  public TradeHistoryParams createFundingHistoryParams() {
    throw new NotAvailableFromExchangeException();
  }

  @Override
  public List<FundingRecord> getFundingHistory(
      TradeHistoryParams params) throws IOException {
    throw new NotYetImplementedForExchangeException();
  }
}
