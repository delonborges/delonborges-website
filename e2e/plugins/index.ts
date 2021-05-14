/// <reference types="cypress" />
// ***********************************************************
// This example plugins/index.js can be used to load plugins
//
// You can change the location of this file or turn off loading
// the plugins file with the 'pluginsFile' configuration option.
//
// You can read more here:
// https://on.cypress.io/plugins-guide
// ***********************************************************

/**
 * @type {Cypress.PluginConfig}
 */
export default (
  on: Cypress.PluginEvents,
  config: Cypress.PluginConfigOptions
) => {
  on("task", {});

  return Object.assign({}, config, {
    fixturesFolder: "e2e/fixtures",
    integrationFolder: "e2e/tests",
    screenshotsFolder: "e2e/screenshots",
    videosFolder: "e2e/videos",
    supportFile: "e2e/support/index.ts",
  });
};
