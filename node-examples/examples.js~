const program = require('commander');

// Require logic.js file and extract controller functions using JS destructuring assignment
const { f1, f2 } = require('./logic');

program
  .version('0.0.1')
  .description('test system');

program
  .command('f1 <param1>')
  .alias('1')
  .description('Function 1')
  .action(param1 => {
      f1(param1);
  });

program
  .command('f2 <param2> [param3]')
  .alias('2')
  .description('Function 2')
    .action((param2, param3) => f2(param2,param3));

program.parse(process.argv);
