import { NativeModules } from 'react-native';

type AtolKktModuleType = {
  multiply(a: number, b: number): Promise<number>;
};

const { AtolKktModule } = NativeModules;

export default AtolKktModule as AtolKktModuleType;
