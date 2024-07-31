package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import GenericUtils.BaseClass;  //no need to intit BaseClass

public class BasePage {
	@FindBy(partialLinkText = "Register") //we can't write dynamic 
	private WebElement registerLink; //this is WebElement so need to give datatype
	
	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;

	@FindBy(partialLinkText = "Shopping cart")
	private WebElement shoppingCartLink;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishListLink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computersLink;
	
	@FindBy(partialLinkText = "ELECTRONICS")  //
	private WebElement electronicsLink;
	
	@FindBy(partialLinkText = "APPAREL & SHOES") 
	private WebElement apparelAndShoesLink;
	
	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement digitaldownloadsLink;
	
	@FindBy(partialLinkText = "JEWELRY")
	private WebElement jewelryLink;
	
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftcardsLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchBox;
	
	@FindBy(id = "Password")
	private WebElement passwordLink;
	
	
	@FindBy(partialLinkText = "Log out")
	private WebElement logoutLink;

	
	@FindBy(id = "//input[@value='Search']")
	private WebElement searchButton;
		/**
	 *
	 *Getters 
	 */
			/**
			 *  this method is used to access registerLink
			 * 
			*/
	
	public WebElement getRegisterLink() 
	{
		return registerLink;
	}

	public WebElement getLoginLink()
	{
		return loginLink;
	}
	public WebElement getLogoutLink()
	{
		return logoutLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishListLink() 
	{
		return wishListLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public WebElement getDigitaldownloadsLink() {
		return digitaldownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}


	public WebElement getGiftcardsLink() {
		return giftcardsLink;
	}
	public WebElement getSearchBox() {
		return searchBox;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getPasswordLink()
	{
		return passwordLink;
	}
	
	//constructor
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
}
