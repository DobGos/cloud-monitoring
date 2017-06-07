import { CmonWebPage } from './app.po';

describe('cmon-web App', () => {
  let page: CmonWebPage;

  beforeEach(() => {
    page = new CmonWebPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
